package org.xtext.iec62443.baseModel.transformation;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.xtext.iec62443.baseModel.mIEC.*;
import org.xtext.iec62443.baseModel.mIEC.System;
import org.xtext.iec62443.baseModel.mIEC.Constraint;
import org.xtext.iec62443.baseModel.mIEC.impl.DeviceImpl;
import org.xtext.iec62443.baseModel.userInterface.FunctionalityChooser;
import org.xtext.iec62443.baseModel.userInterface.SolutionChooser;

import com.google.ortools.Loader;
import com.google.ortools.sat.*;

public class ReconfigurationConstraintOld { 
	
	/*
	 * Several device properties and constraints have a special meaning in the reconfiguration process:
	 * 
	 * Component properties:
	 *  
	 * attacked: boolean value set when the device is attacked. // set automatically
	 * 
	 * Device Properties:
	 * 
	 * capacity: Integer value for devices, infinite if not present. Denote the capacity of device
	 * 
	 * Application properties:
	 * 
	 * state: 0 if nominal, 1 if degraded, 2 if stopped. Added if not present when a reconfiguration process is started, assuming nominal.
	 * needed_sl : String value, follow the [SLx,SLx,Slx,Slx,Slx,Slx,SLx) format. Minimum target security level of the zone it's in. // No longer a property
	 * critical_section: Boolean value, if true, can't move location without stopping // not used for now
	 * size: Integer value, 0 if not present.
	 * degraded_size:  Integer value, won't be used if not present // Not used for now
	 * score: integer value, the total score across all running applications is what we want to maximize
	 * score_d: Score when any of the aforementioned optional_ properties are false.
	 * 
	 * Constraints:
	 * 
	 * Optional constraints are understood as needed for nominal state.
	 * 
	 * We assume that channels can be created on the fly within conduits.
	 * 
	 * 
	 * */
	
	
	
	@Deprecated
	private static Integer[] getSLFromString(String s) {
		Integer[] res = new Integer[7];
		try {
			if (s.startsWith("[") && s.endsWith("]")) {
				String[] slevelList = s.split(",");
				if(slevelList.length != 7) {
					return null;
				}
				int i = 0;
				for (String sl: slevelList) {
					sl = sl.strip().replace("[", "").replace("]", "");
					if(sl.length() != 3 || !sl.startsWith("SL") || !Character.isDigit(sl.charAt(2)) ) {
					    java.lang.System.out.println((sl));
						return null;
					}
					int slevel = Integer.parseInt(String.valueOf(sl.charAt(2)));
					if (slevel < 0 || slevel > 4) {
						return null;
					}
					res[i] = slevel;
					i+=1;
					;
				}
				return res;
			}
			return null;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	private static Integer[] getSLFromClass(SecurityLevels SLs) {
		Integer[] res = new Integer[7];
		for (int i = 0; i < 7; i++) {
			res[i] = SLs.getSecurityLevel(i).getValue();
		}
		return res;
	}
	
	private static Integer[] getSLFromCountermeasures(List<CounterMeasure> cnts) {
		Integer[] res = {0,0,0,0,0,0,0};
		for (int i = 0; i < 7; i++) {
			for (CounterMeasure cnt: cnts) {
				res[i] = Math.max(res[i], cnt.getCapability().getSecurityLevel(i).getValue());
			}
		}
		return res;
		
	}

	// Check that the application can be allocated to device d.
	private static int isTotallyCompatibleWith(Application a, Device d, HashMap<String,HashMap<String,Integer>> adjacencyMap) {

		int retVal = 0;
		
		// Check target security levels
		Integer[] slevelA = getSLFromClass(a.getCapability());
		Integer[] slevelCnts = getSLFromCountermeasures(d.getZone().getCountermeasures());
		Integer[] slevelTarget = getSLFromClass(d.getZone().getTarget());
		for (int i = 0; i < 7; i++) {
			if (slevelA[i] < slevelTarget[i] && slevelCnts[i] < slevelTarget[i]) {
				return 2;
			}
		}
		
		
//		// Check potential needed security levels (deprecated, used a property)
//		if (a.getProperty("needed_sl")!=null) {
//			String SLString = a.getProperty("needed_sl").getValue().getStringValue();
//			Integer[] slevelANeeded = getSLFromString(SLString);
//			for (int i = 0; i < 7; i++) {
//				if (slevelANeeded[i] > slevelTarget[i] ) {
//					return 2;
//				}
//			}
//		}
		
		
		// Check potential needed security levels
		if (a.getSLevelConstraint() != null) {
			Integer[] slevelANeeded = getSLFromClass(a.getSLevelConstraint());
			for (int i = 0; i < 7; i++) {
				if (slevelANeeded[i] > slevelTarget[i] ) {
					return 2;
				}
			}
		}
		
		// Check constraints
		retVal = isCompatible(a,d);
		if (retVal == 2) return retVal;
		
		// Check static dependencies
		for (Component c: a.getCommunicatesWith()) {
			if (c.getType()!=Component.APPLICATION) {
				if (!communicates(c, d, adjacencyMap)) {
					return 2;
				}
			}
		}
		return retVal;
	}
	
	
	
	// Defined here, as it only has to to with the CP solver
	static class SolutionEnumerator extends CpSolverSolutionCallback{

		HashMap<String,IntVar> stateVars;
		HashMap<String,HashMap<String,IntVar>> runningVars;
		private LinearExpr toMax;
		  private int solutionCount;
		  private double curMax = 0.0;
		  private List<Solution> solutions;
		  private Model m;
		  private IntVar nbMoved;

		
		  public SolutionEnumerator(HashMap<String,HashMap<String,IntVar>> runningVars, HashMap<String,IntVar> stateVars, LinearExpr toMax, Model m, IntVar NbMoved) {
		    this.stateVars = stateVars;
		    this.runningVars = runningVars;
		    solutions = new ArrayList<>();
		    this.toMax = toMax;
		    this.m = m;
		    nbMoved = NbMoved;
		  }

		@Override
		  public void onSolutionCallback() {
			HashMap<String, HashMap<String, Long>> allocation = new HashMap<>();
			HashMap<String, Long> state = new HashMap<>();
			
//		    java.lang.System.out.printf("Solution #%d: time = %.02f s%n", solutionCount, wallTime());
		    for (String keyA: runningVars.keySet()) {
		    	allocation.put(keyA, new HashMap<String, Long>());
		    	state.put(keyA, value(stateVars.get(keyA)));
		    	for (String keyD: runningVars.get(keyA).keySet()) {
		    		allocation.get(keyA).put(keyD, value(runningVars.get(keyA).get(keyD)));
//		    		if (value(runningVars.get(keyA).get(keyD)) != 0) {
//		    			java.lang.System.out.println("App " + keyA + " assigned to " + keyD);
//		    		}
		    	}
		    }
//		    java.lang.System.out.println("moved: " + value(nbMoved) + " score " + value(toMax));
		    if (curMax == value(toMax)) {
		    	Solution toAdd = new Solution(allocation, state, value(toMax), m);
		    	if (!solutions.contains(toAdd)){
				    solutions.add(toAdd);
				    solutionCount++;
		    	}
		    }
		    else if (curMax < value(toMax)) {

			    curMax = value(toMax);
			    solutions.clear();
			    solutions.add(new Solution(allocation, state, value(toMax),m));
			    solutionCount = 1;
		    }
		  }

		  public int getSolutionCount() {
		    return solutionCount;
		  }

	}
	
	
	private static int isCompatible(Application a, Device d) {
		int retVal = 0;
		
		// Check every constraint , and note if any optional ones are broken
		for (Constraint cs: a.getConstraints()) {
			retVal = Math.max(retVal, checkConstraint(cs, d));
			// Stop immediately if a non-optional rule is broken.
			if (retVal == 2) return retVal;
		}
		
		return retVal;
	}
	
	private static int checkConstraint(Constraint  cs, Device d) {
		Property interestingP = null;
		boolean found = false;
		for (Property p: d.getProperties()) {
			if (p.getName().equals(cs.getPropertyName())) {
				found = true;
				interestingP = p;
				break;
			}
		}
		if (!found) {
			if (cs.isOptional()) {

				return 1;
			}
			else {
				return 2;
				
			}
		}
		// If the constraint is an operation
		if (cs.getTypeConstraint() == Constraint.OPERATION) {
			OperationConstraint csOp = (OperationConstraint) cs;
			// Differentiate constraints based on direct values, and constraints based on referenced values
			Value val = null;
			if (csOp.getValue().getRefType()>0) {
				val = ((Reference) csOp.getValue()).getValue(d);
			}
			else {
				val = ((Value) csOp.getValue());
			}
				
			int type = val.getType();
			int type2  = interestingP.getValue().getType();
			if (type != type2) {
				if (cs.isOptional()) {
					return 1;
					
				}
				else {
					return 2;
					
				}
			}
			Operation op = csOp.getOperation();
			boolean res = Value.compare(interestingP.getValue(), op, val);
			if (!res) {
				if (cs.isOptional()) {
					return 1;
				}
				else {
					return 2;
					
				}
			}
		}
		return 0;
	}
	
	private static HashMap<String,HashMap<String,Integer>> getZoneDistanceMatrix(List<Zone> zones, List<Conduit> conduits){
		
		HashMap<String,HashMap<String,Integer>> res = new HashMap<>();
		for (Zone z : zones) {
			HashMap<String,Integer> curHash = new HashMap<>();
			res.put(z.getName(), curHash);
			List<Zone> adjacents = new ArrayList<>();
			adjacents.add(z);
			// Compute adjacent zones
			for (Conduit c : conduits) {
				if (c.getConnects().contains(z)){
					for (Zone z2: c.getConnects()) {
						if (!adjacents.contains(z2)){
							adjacents.add(z2);
						}
					}
					adjacents.add(c);
				}
			}
			
			for (Zone z2: zones) {
				int value;
				if (EcoreUtil.equals(z2, z)) value = 0;
				else if (adjacents.contains(z2)) value = 1;
				else value = 2;
				curHash.put(z2.getName(), value);
			}
		}
		return res;
	}
	
	
	private static void addStateProperty(Application a) {
		Property p = MIECFactory.eINSTANCE.createProperty();
		IntegerValue v = MIECFactory.eINSTANCE.createIntegerValue();
		v.setValue(0);
		p.setName("state");
		p.setValue(v);
		a.getProperties().add(p);
		
	}
	
	
	private static void addAttackedProperty(Component c) {
		Property p = MIECFactory.eINSTANCE.createProperty();
		BooleanValue v = MIECFactory.eINSTANCE.createBooleanValue();
		v.setValue(true);
		p.setName("attacked");
		p.setValue(v);
		c.getProperties().add(p);
		
	}
	
	private static boolean communicates(Component c, Device d, HashMap<String,HashMap<String,Integer>> map) {
		Zone z1 = d.getZone();
		Zone z2 = c.getZone();
		
		if (map.get(z1.getName()).get(z2.getName()) <=1) {
			return true;
		}
		return false;
	}
	
	private static int getScoreExecutedOn(Application a, Device d ) {
		if (a.getScoreExpr() != null) {
			return a.getScoreOnDevice(d);
		}
		return a.getScore(isCompatible(a,d));
	}
	
	
	// Try to find all new valid configurations for the model m, where the component c is compromised, while maximizing the score.
	// return a modified copy of m if such a configuration is found, and chosen by the user.
	// return null if the user refuses to choose a configuration.
	// If askForConfirmation is true, try to compute all the best solutions, and ask the user to choose one.
	// If it is false, return the first best solution found.
	public static Model reconfigureWithout(Component c, Model m, boolean askForConfirmation) {
		java.lang.System.out.println("Starting reconfiguration without: " + c.getName());
		
		Loader.loadNativeLibraries();
		java.lang.System.out.println("Loaded native libraries");
		Model originalM = m;
		// Copy the model to avoid changing the original
		m = EcoreUtil.copy(m);
		
		// Obtain the corresponding component in the copy
		Component OriginalC = c;
		for (Component c2 : EcoreUtil2.getAllContentsOfType(m, Component.class)) {
			if (c2.getName().equals(c.getName())) {
				c = c2;
				break;
			}
		}
		
		List<Zone> zones = EcoreUtil2.getAllContentsOfType(m, Zone.class);
		List<Conduit> conduits = EcoreUtil2.getAllContentsOfType(m, Conduit.class);
		List<Application> applications = EcoreUtil2.getAllContentsOfType(m, Application.class);
		List<Device> devices = EcoreUtil2.getAllContentsOfType(m, Device.class);

		
		List<Application> appToRem = new ArrayList<>();
		
		// For all applications, add a property managing their states if its not present
		for (Application a: applications) {
			if (a.getProperty("state") == null) {
				addStateProperty(a);
			}
			else if (a.getProperty("state").getValue().getType() != Value.INTEGER) {
				// A state property is not integer => Stop everything
				java.lang.System.out.println("Error: an application had a non-integer state");
				return originalM;
			}
			// Remove applications that are safe (stopped)
			if (((IntegerValue)a.getProperty("state").getValue()).getValue() == 2 && ! appToRem.contains(a)) {
				appToRem.add(a);
			}
		}
		for (Application a: appToRem ) {
			applications.remove(a);

			java.lang.System.out.println("application " + a.getName() + " removed");
		}
		
		// Remove previously attacked devices
		List<Device> dToRem = new ArrayList<>();
		for (Device d: devices) {
			if (d.getProperty("attacked") != null) {
				dToRem.add(d);
			}
		}
		
		
		// Remove already attacked 
		for (Device d: dToRem ) {
			devices.remove(d);
		}
		
		HashMap<String,HashMap<String,Integer>> dMatrix = getZoneDistanceMatrix(zones, conduits);
		
		// In any case, any application that depends on the removed component is stopped, recursively

		List<Application> toStop = new ArrayList<>();
		if (c.getType() == Component.APPLICATION) {
			toStop.add((Application)c);
		}
		int precLen;
		do {
			precLen = toStop.size();
			for (Application a : applications) {
				if ((!Collections.disjoint(a.getCommunicatesWith(), toStop) || a.getCommunicatesWith().contains(c)) && (!toStop.contains(a))) {
					toStop.add(a);
				}
			}
		}
		while(precLen != toStop.size());
		
		// Remove those applications from the devices that executes them, and put them in stop mode. 
		// At this point, each of them has a state property.
		
		applications.removeAll(toStop);
		for (Application a: toStop) {
			a.setExecutedOn(null);
			((IntegerValue)a.getProperty("state").getValue()).setValue(2);
		}
		
		// Remove the affected devices from the system
		// For the concerned components, add the attacked property
		
		if (c.getProperty("attacked") == null) {
			addAttackedProperty(c);
			if (c instanceof Application) {
				((IntegerValue) c.getProperty("state").getValue()).setValue(2);
				applications.remove((Application) c);
			}
		}
		
		List<Device> ToRem = new ArrayList<>();
		
		if (c instanceof Device) {
			ToRem.add((Device) c);
			
		}
		else if (c instanceof System) {
			ToRem.addAll(((System) c).getDevices());
			addAttackedProperty(c);
		}
		
		for (Device d : ToRem) {
			if (d.getProperty("attacked") == null) {
				addAttackedProperty(d);
			}
			devices.remove(d);
			if (d instanceof Application) {
				((IntegerValue) d.getProperty("state").getValue()).setValue(2);
			}
			
		}
		
		// Proceed to the actual reconfiguration by constructing a constraint program

		
		long infinity = Long.MAX_VALUE;
		CpModel model = new CpModel();
		// Ignore the whole process if no applications are left
		if (applications.size() == 0) {
			java.lang.System.out.println("Every application is stopped prior to reconfiguration");
			return null;
		}
		
//		long coefficientMovement = (applications.size() + 1);
		
		// Start by defining all the different variables, stored in hashmaps, usin gthe name of the corresponding application, devices or zones as keys.

		HashMap<String,IntVar> noneVars = new HashMap<>();
		HashMap<String,IntVar> stateVars = new HashMap<>();
		HashMap<String,HashMap<String,IntVar>> runningVars = new HashMap<>();
		HashMap<String,HashMap<String,IntVar>> inVars = new HashMap<>();
		
		// Additional variables to get some info at the end of the reconfiguration
		IntVar NumberMoved = model.newIntVar(0, applications.size(), "how_many_moved");
		HashMap<String,IntVar> movedVars = new HashMap<>();
		
		// Also  defines useful coefficients
		
		HashMap<String,HashMap<String,Long>> scoreCoeffAD =  new HashMap<>();
		HashMap<String,HashMap<String,Long>> stateCoeffAD =  new HashMap<>();
		HashMap<String,Long> sizeCoeff =  new HashMap<>();
		HashMap<String,Long> CapacityCoeff =  new HashMap<>();
		
		// get the capacity for each device
		
		for (Device d : devices) {
			String dName = d.getName();
			
			CapacityCoeff.put(dName, (long)d.getCapacity());
		}
		
		// For every applications in the model (not only potentially running ones), define the moved variable.
		
		for (Application a : EcoreUtil2.getAllContentsOfType(m, Application.class)) {
			String aName = a.getName();
			// additional
			movedVars.put(aName, model.newIntVar(0, 1, aName + "_moved"));
		}
		
		for (Application a : applications) {
			String aName = a.getName();
			//vars
			runningVars.put(aName, new HashMap<String,IntVar>());
			inVars.put(aName, new HashMap<String,IntVar>());
			noneVars.put(aName, model.newIntVar(0, 1, aName + "_not_executed"));
			stateVars.put(aName, model.newIntVar(0, 2, aName + "_state"));
			
			//Coefficients
			scoreCoeffAD.put(aName, new HashMap<String,Long>());
			stateCoeffAD.put(aName, new HashMap<String,Long>());
			sizeCoeff.put(aName, (long)a.getSize());
			
			
			for (Device d : devices) {
				String dName = d.getName();
				//vars
				runningVars.get(aName).put(dName, model.newIntVar(0, 1, aName + "_running_in_" + dName));
				
				//Coefficients
				
				scoreCoeffAD.get(aName).put(dName, (long)getScoreExecutedOn(a, d));
				
				stateCoeffAD.get(aName).put(dName, (long)isCompatible(a, d));
				
			}
			for (Zone z : zones) {
				String zName = z.getName();
				//vars
				inVars.get(aName).put(zName, model.newIntVar(0, 1, aName + "_in_zone_" + zName));
				
				//Coefficients
			}
			
		}
		
		// Proceed to adapt every linear equation into a constraint
		
		// Objective (without the moved applications for now, as we want to give multiple solutions)
		List<Long> AllScores = new ArrayList<>();
		List<IntVar> AllRunning = new ArrayList<>();
		
		
		for (Application a : applications) {
			for (Device d : devices) {
				AllScores.add(scoreCoeffAD.get(a.getName()).get(d.getName()));
				AllRunning.add(runningVars.get(a.getName()).get(d.getName()));
			}
		}
		long[] scoresArray = Arrays.stream(AllScores.toArray(new Long[0])).mapToLong(Long::longValue).toArray();
		LinearExpr valueToMaximize = LinearExpr.weightedSum(AllRunning.toArray(new IntVar[0]),scoresArray);
		model.maximize(valueToMaximize);
		
		// At most one run location, and only compatible devices
		for ( Application a : applications) {

			List<IntVar> varsList = new ArrayList<>();
			
			for (Device d : devices) {
				// Only compatible devices
				if (isTotallyCompatibleWith(a, d, dMatrix) < 2) {
					varsList.add(runningVars.get(a.getName()).get(d.getName()));
				}
				// Disallow incompatible devices
				else {
					model.addEquality(runningVars.get(a.getName()).get(d.getName()), 0);
				}
			}
			varsList.add(noneVars.get(a.getName()));
			
			
			// MIP version, more or less
			model.addEquality(LinearExpr.sum(varsList.toArray(new IntVar[0])), 1);
		}
		
		// The total size never exceeds the capacity

		List<Long> sizeList = new ArrayList<>();
		
		for (Application a : applications) {
			sizeList.add(sizeCoeff.get(a.getName()));
		}
		
		long[] sizeArray =  Arrays.stream(sizeList.toArray(new Long[0])).mapToLong(Long::longValue).toArray();
		
		for (Device d : devices) {

			List<IntVar> varsList = new ArrayList<>();
			
			for (Application a : applications) {
				varsList.add(runningVars.get(a.getName()).get(d.getName()));
			}
			if (CapacityCoeff.get(d.getName()) != -1) {
				model.addLessOrEqual(LinearExpr.weightedSum((IntVar[])varsList.toArray(new IntVar[0]), sizeArray), CapacityCoeff.get(d.getName()));
			}
			
			
		}
		
		// Defines being in a zone as running on a device it contains
		
		for (Zone z : zones) {
			for (Application a: applications) {
				
				List<IntVar> varsList = new ArrayList<>();

				List<Long> CoefficientList = new ArrayList<>();
				
				for (Component c2: z.getComponents()) {
					if (c2.getType() == Component.DEVICE){
						Device d = (Device) c2;
						IntVar toAdd = runningVars.get(a.getName()).get(d.getName());
						if (toAdd == null) {
							continue;
						}
						varsList.add(toAdd);
						CoefficientList.add((long) -1);
					}
					if (c2.getType() == Component.SYSTEM) {
						for (Device d: ((System)c2).getDevices() ) {
							IntVar toAdd = runningVars.get(a.getName()).get(d.getName());
							if (toAdd == null) {
								continue;
							}
							varsList.add(toAdd);
							CoefficientList.add((long) -1);
						}
					}
				}
				varsList.add(inVars.get(a.getName()).get(z.getName()));
				CoefficientList.add((long) 1);
				
				long[] coefArray = Arrays.stream((Long[])CoefficientList.toArray(new Long[0])).mapToLong(Long::longValue).toArray();
				
				model.addEquality(LinearExpr.weightedSum((IntVar[])varsList.toArray(new IntVar[0]), coefArray), 0);
			}
		}
		
		// Defines the state for each application
		
		for (Application a: applications) {

			List<IntVar> varsList = new ArrayList<>();
			List<Long> CoefficientList = new ArrayList<>();
			
			for (Device d: devices) {
				varsList.add(runningVars.get(a.getName()).get(d.getName()));
				CoefficientList.add(stateCoeffAD.get(a.getName()).get(d.getName()));
			}
			varsList.add(noneVars.get(a.getName()));
			CoefficientList.add((long) 2);
			
			long[] coefArray = Arrays.stream((Long[])CoefficientList.toArray(new Long[0])).mapToLong(Long::longValue).toArray();
			
			model.addEquality(LinearExpr.weightedSum((IntVar[])varsList.toArray(new IntVar[0]), coefArray), stateVars.get(a.getName()));
		}
		
		// Must be near dependencies
		
		for (Application a : applications) {
			for (Component c2 : a.getCommunicatesWith()) {
				if (c2.getType() == Component.APPLICATION) {
					Application a2 = (Application)c2;
					
					for (Zone z: zones) {
						for (Zone z2: zones) {
							if (dMatrix.get(z.getName()).get(z2.getName()) > 1) {
								IntVar[] twoIns = {inVars.get(a.getName()).get(z.getName()), inVars.get(a2.getName()).get(z2.getName())};
								model.addLessOrEqual(LinearExpr.sum(twoIns), 1);
							}
						}
					}
				}
			}
		}
		
		// Must be stopped if dependency stopped

		
		for (Application a : applications) {
			
			for (Component c2 : a.getCommunicatesWith()) {
				if (c2.getType() == Component.APPLICATION) {
					Application a2 = (Application)c2;
					
					model.addLessOrEqual(noneVars.get(a2.getName()), noneVars.get(a.getName()));
					
				}
			}
		}
		
		// Define the number of applications that moved, to inspect afterwards
		
		List<IntVar> movedVarsList = new ArrayList<>();
		
		for (Application a : applications) {
			movedVarsList.add(movedVars.get(a.getName()));

			// Can't move if already stopped
			if (a.getExecutedOn() == null) {
				model.addEquality(movedVars.get(a.getName()), 0);
			}
			// if it ran on a device than was compromised, it has to move
			else if (!devices.contains(a.getExecutedOn())) {
				model.addEquality(movedVars.get(a.getName()), 1);
			}
			else {
				for (Device d: devices) {
						if (a.getExecutedOn().getName().equals(d.getName())) {
							// Else, the application moved if it does not run on its previous device.
							model.addDifferent(runningVars.get(a.getName()).get(d.getName()), movedVars.get(a.getName()));
						}
				}
			}
			
			// If application was not stopped before (as in: every applications in our list), stopping it is moving it.
			model.addLessOrEqual(noneVars.get(a.getName()),  movedVars.get(a.getName()));
		}
		
		// Compute the total number of applications that moved
		
		model.addEquality(LinearExpr.sum(movedVarsList.toArray(new IntVar[0])), NumberMoved);
		

		SolutionEnumerator enumerator =  new SolutionEnumerator(runningVars, stateVars, valueToMaximize, m, NumberMoved);
		
		
		CpSolver solver = new CpSolver();
		solver.getParameters().setEnumerateAllSolutions(true);
		CpSolverStatus status = solver.solve(model, enumerator);
		
		
		// use this first result to search other if confirmation is asked
		
		if (!askForConfirmation && (status == CpSolverStatus.OPTIMAL || status == CpSolverStatus.FEASIBLE)) {
        	java.lang.System.out.println("Found Solution: \n " + enumerator.solutions.get(0).toString());
            Model mRes = enumerator.solutions.get(0).applyTo(m);
            return mRes;
		}
		
		if (askForConfirmation && (status == CpSolverStatus.OPTIMAL || status == CpSolverStatus.FEASIBLE)) {
			model.addEquality(valueToMaximize, Math.round(solver.objectiveValue()));
			model.clearObjective();
			solver.getParameters().setEnumerateAllSolutions(true);
			java.lang.System.out.println("Results from the solution enumerator:");

			status = solver.solve(model, enumerator);
			java.lang.System.out.println(enumerator.solutionCount + " solutions");
			
			if (status == CpSolverStatus.OPTIMAL || status == CpSolverStatus.FEASIBLE) {
				
				
				// if there is any solution, choose one or cancel to refuse the reconfiguration
				if (enumerator.solutionCount >= 1) {
					SolutionChooser solutionChooser =  new SolutionChooser();
					solutionChooser.showDialog(null, enumerator.solutions);
					
					Solution selectedSolution = solutionChooser.getSelectedSolution();
			        if (selectedSolution != null) {
			        	java.lang.System.out.println("Selected Solution: \n " + selectedSolution.toString());
			            return selectedSolution.applyTo(m);
			        } else {
			            java.lang.System.out.println("User canceled the selection.");
			            return null;
			        }
				}
				
				

			}
		}
		java.lang.System.out.println("There is no solution to the reconfiguration ");
		java.lang.System.out.println("Which is strange, because all applications stopped should be valid");
		java.lang.System.out.println(model.toString());
		return originalM;
	}

}
