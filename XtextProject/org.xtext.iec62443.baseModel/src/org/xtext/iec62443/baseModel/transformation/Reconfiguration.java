package org.xtext.iec62443.baseModel.transformation;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
import org.xtext.iec62443.baseModel.mIEC.impl.DeviceImpl;

import com.google.ortools.Loader;
import com.google.ortools.linearsolver.MPConstraint;
import com.google.ortools.linearsolver.MPObjective; 
import com.google.ortools.linearsolver.MPSolver;
import com.google.ortools.linearsolver.MPSolver.ResultStatus; 
import com.google.ortools.linearsolver.MPVariable;
@Deprecated
public class Reconfiguration { 
	
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
	 * needed_sl : String value, follow the [SLx,SLx,Slx,Slx,Slx,Slx,SLx) format. Minimum target security level of the zone it's in. 
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
					sl = sl.strip();
					if(sl.length() != 3 || !sl.startsWith("SL") || !Character.isDigit(sl.charAt(2)) ) {
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
	
	private static boolean communicates(Component c, Application a, HashMap<String,HashMap<String,Integer>> map) {
		Zone z1 = a.getZone();
		Zone z2 = c.getZone();
		
		if (map.get(z1).get(z2) <=1) {
			return true;
		}
		return false;
	}
	
	public static Model reconfigureWithout(Component c, Model m) {
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
		
		// Proceed to the actual reconfiguration using linear programming

		double infinity = MPSolver.infinity();
		MPSolver solver = MPSolver.createSolver("SCIP");
		
		double coefficientMovement = 1.0 / (applications.size() + 1);
		
		MPVariable sum = solver.makeNumVar(0, infinity, "totalScore");
		MPObjective objective = solver.objective();
		objective.setCoefficient(sum, 1);
		objective.setMaximization();
		
		MPConstraint scoreDefinition = solver.makeConstraint(0,0, "scoreDef");
		scoreDefinition.setCoefficient(sum, -1);
		
		// for each application, defines:
		for (Application a : applications) {
			// its state (derived, used only to reconfigure the model afterwards)
			MPVariable applicationState = solver.makeIntVar(0, 2 , "state_app_" + a.getName() );
			MPConstraint applicationStateDefinition = solver.makeConstraint(0,0, "stateDef_app" + a.getName());
			applicationStateDefinition.setCoefficient(applicationState, -1);
			
			// its score 
			MPVariable applicationScore = solver.makeIntVar(0, infinity , "score_app_" + a.getName() );
			MPConstraint applicationScoreDefinition = solver.makeConstraint(0,0, "scoreDef_app_" + a.getName());
			applicationScoreDefinition.setCoefficient(applicationScore, -1);
			
			// apply its score to the total

			scoreDefinition.setCoefficient(applicationScore, 1);
			
			
			// the sum of device/app attribution (at most 1)
			MPConstraint applicationAttributionConstraint = solver.makeConstraint(1,1, "attributionConstraint_app_" + a.getName());
			
			// Variable with value 1 when no attribution is made
			MPVariable noAttribution = solver.makeIntVar(0, 1 , "app_" + a.getName() +"_is_not_running" );
			applicationAttributionConstraint.setCoefficient(noAttribution, 1);

			// If the previous value is equal to 1, the application must be stopped
			applicationStateDefinition.setCoefficient(noAttribution, 2);
			
			
			
			
			
			// manage the zone based constraints
			MPConstraint onlyOneZone = solver.makeConstraint(0, 1 , "app_" + a.getName() + "_in__only_one_zone" );
			for (Zone z : zones) {
				// Zone-application variable
				MPVariable applicationinZone = solver.makeIntVar(0, 1 , "app_" + a.getName() + "_in_zone_" + z.getName() );
				onlyOneZone.setCoefficient(applicationinZone, 1);
				
				
			}

			
			// for each device, add the consequences of an attribution
			
			for (Device d: devices) {
				// Check if the application can run on the given device, potentially on degraded mode
				int compatibility = isCompatible(a, d);
				MPVariable applicationRunOnDevice;
				if (compatibility == 2) {
					applicationRunOnDevice = solver.makeIntVar(0, 0 , "app_" + a.getName() + "_on_" + d.getName() );
				}
				else {
					// Create the attribution variable
					applicationRunOnDevice = solver.makeIntVar(0, 1 , "app_" + a.getName() + "_on_" + d.getName() );
					
					// Add it to the attribution constraint:
					applicationAttributionConstraint.setCoefficient(applicationRunOnDevice, 1);
					
					// Add it to the score calculation
					applicationScoreDefinition.setCoefficient(applicationRunOnDevice, a.getScore(compatibility));
					
					// create the zone association constraint
					Zone z = d.getZone();
					MPConstraint ifOnDeviceInZone = solver.makeConstraint(-infinity, 0 , "app_" + a.getName() + "_in_zone_" + z.getName() + "if_on_device_" + d.getName() );
					ifOnDeviceInZone.setCoefficient(applicationRunOnDevice, 1);
					ifOnDeviceInZone.setCoefficient(solver.lookupVariableOrNull("app_" + a.getName() + "_in_zone_" + z.getName()), -1);
					applicationStateDefinition.setCoefficient(applicationRunOnDevice, compatibility);
					
					// If the device is not executing currently the application, give a negative score to the association
					if (!(a.getExecutedOn()!=null && a.getExecutedOn().getName().equals(d.getName()))){
						scoreDefinition.setCoefficient(applicationRunOnDevice, -coefficientMovement);
					}
					
				}
				
				
			}
		}
		
		// manage the dependencies
		for (Application a: applications) {
			boolean hasAppsAsDependencies = false;
			for (Component com: a.getCommunicatesWith()) {
				if (com instanceof Application) {
					hasAppsAsDependencies = true;
					Application a2 = (Application) com;
					
					for (Zone z : zones) {
						for (Zone z2: zones) {
							MPVariable bothAppsInBothZones = solver.makeIntVar(0, 1 , a.getName() + "_in_" + z.getName() + "_and_" + a2.getName() + "_in_" + z2.getName());
							MPConstraint defineBothAppsInBothZones = solver.makeConstraint(0, 1 , a.getName() + "_in_" + z.getName() + "_and_" + a2.getName() + "_in_" + z2.getName() + "_def" );

							defineBothAppsInBothZones.setCoefficient(solver.lookupVariableOrNull("app_" + a.getName() + "_in_zone_" + z.getName()), 1);
							defineBothAppsInBothZones.setCoefficient(solver.lookupVariableOrNull("app_" + a2.getName() + "_in_zone_" + z2.getName()), 1);
							defineBothAppsInBothZones.setCoefficient(bothAppsInBothZones, -2);
							
							// If the zones are not adjacent, we don't allow allow these two zone attributions
							if (dMatrix.get(z.getName()).get(z2.getName()) > 1) {
								solver.makeConstraint(0, 0).setCoefficient(bothAppsInBothZones, 1);
							}
							
						}
					}
				}
				else {
					Zone z = com.getZone();
					for (Zone z2: zones) {
						// If the zones are not adjacent, we don't allow allow these two zone attributions
						if (dMatrix.get(z.getName()).get(z2.getName()) > 1) {
							solver.makeConstraint(0, 0).setCoefficient(solver.lookupVariableOrNull("app_" + a.getName() + "_in_zone_" + z2.getName()), 1);
						}
					}
				}
			}
			// If the application has other applications as dependencies, it must be stopped when they are stopped
			if (hasAppsAsDependencies) {
				MPConstraint stoppedIfDependencyFail = solver.makeConstraint(0, infinity);
				stoppedIfDependencyFail.setCoefficient(solver.lookupVariableOrNull("app_" + a.getName() +"_is_not_running"), -1);
				for (Component com: a.getCommunicatesWith()) {
					if (com instanceof Application) {
						stoppedIfDependencyFail.setCoefficient(solver.lookupVariableOrNull("app_" + com.getName() +"_is_not_running"), 1);
					}
				}
			}
		}
		
		// Manage the security level for each zones
		
		for (Zone z: zones) {
			// Treat each security levels differently, and assume that the target level is achieved
			Integer[] countermeasuresSL = getSLFromCountermeasures(z.getCountermeasures()); 
			Integer[] targetSL = getSLFromClass(z.getTarget());
			ArrayList<Application> IncompatibleApps = new ArrayList<>();
			for (int i = 0; i < 7; i++) {
				// If there's no sufficient countermeasure 
				if (targetSL[i] > countermeasuresSL[i]) {
					// For each application, if their level is below the target, they can't be added to the zone
					for (Application a: applications) {
						if (a.getCapability().getSecurityLevel(i).getValue() < targetSL[i]){
							IncompatibleApps.add(a);
						}
					}
				}
			}

			// For each application, if they need a certain level of security and the zone does not provide it, they can't be added either
			for (Application a: applications) {
				if (a.getProperty("needed_sl") != null && a.getProperty("needed_sl").getValue().getType()==Value.STRING) {
					Integer[] neededSL = getSLFromString(((StringValue)a.getProperty("needed_sl").getValue()).getValue());
					if (neededSL != null) {
						for (int i = 0; i < 7; i++) {
							if (neededSL[i] > targetSL[i]) {
								if (!IncompatibleApps.contains(a)) IncompatibleApps.add(a);
								break;
							}
						}
					}
				}
			}
			
			// Add a constraint for each incompatible app
			
			for (Application a : IncompatibleApps) {
				solver.makeConstraint(0, 0).setCoefficient(solver.lookupVariableOrNull("app_" + a.getName() + "_in_zone_" + z.getName()), 1);
			}
			
		}
		
		
		// manage the application capacity constraint
		
		for (Device d: devices) {
			int capacity = d.getCapacity();
			if (capacity == -1) continue;
			
			MPConstraint deviceCapacityConstraint = solver.makeConstraint(0,capacity, "capacityConstraint_" + d.getName());
			
			for (Application a: applications) {
				deviceCapacityConstraint.setCoefficient(solver.lookupVariableOrNull("app_" + a.getName() + "_on_" + d.getName()), a.getSize());
			}
		}
		
		ResultStatus res = solver.solve();
		
		if (res == ResultStatus.OPTIMAL) {
			
			java.lang.System.out.println("Score: " + sum.solutionValue());
			
			
			// Apply new locations to all applications
			
			
			for (Application a : EcoreUtil2.getAllContentsOfType(m, Application.class)) {
				// Apply the new states
//				java.lang.System.out.println("application " + a.getName() + ": ");
				MPVariable stateVar = solver.lookupVariableOrNull("state_app_" + a.getName());
				int state;
				if  (stateVar == null) {
					state = 2;
				}
				else {
					state = (int) stateVar.solutionValue();
				}
				((IntegerValue)a.getProperty("state").getValue()).setValue(state);
				if (state == 2) {
					a.setExecutedOn(null);
					java.lang.System.out.println("\t application " + a.getName() + " is stopped (Score 0)");
				}
				else {
					for (Device d: devices) {
						if (solver.lookupVariableOrNull("app_" + a.getName() + "_on_" + d.getName()).solutionValue() != 0) {
							Zone newZ = d.getZone();
							Zone oldZ = a.getZone();
							oldZ.getComponents().remove(a);
							newZ.getComponents().add(a);
							a.setExecutedOn(d);
							java.lang.System.out.println("\t application " + a.getName() + " is executed on " + a.getExecutedOn().getName()  + " (Score " + (int) solver.lookupVariableOrNull("score_app_" + a.getName()).solutionValue() + ")");
						}
					}
				}
			}
			
			
			// For now, remove all channels
			// We assume that they can be produced "at will" within the conduits
			
			for (Conduit cond: conduits) {
				cond.getChannels().clear();
			}

//			java.lang.System.out.println(c);
//			java.lang.System.out.println(c.getProperties());
//			for(EObject e: EcoreUtil2.getAllContentsOfType(m, EObject.class)) {
//				java.lang.System.out.println(e);
//				if (e.getClass() == DeviceImpl.class) {
//					java.lang.System.out.println(((Device) e).getProperties());
//				}
//			}
//			File f = new File("out/lp.txt");
//			try {
//				FileWriter fw = new FileWriter(f);
//				fw.write(solver.exportModelAsLpFormat());
//				fw.flush();
//				fw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

			
			return m;
			
		}
		else {
			java.lang.System.out.println("There is no solution to the reconfiguration ");
			java.lang.System.out.println("Which is strange, because all applications stopped should be valid");
			java.lang.System.out.println(solver.exportModelAsLpFormat());
			return originalM;
		}
	}

}
