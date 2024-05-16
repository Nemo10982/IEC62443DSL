package org.xtext.iec62443.baseModel.transformation;

import java.util.HashMap;

import org.eclipse.xtext.EcoreUtil2;
import org.xtext.iec62443.baseModel.mIEC.Application;
import org.xtext.iec62443.baseModel.mIEC.Conduit;
import org.xtext.iec62443.baseModel.mIEC.Device;
import org.xtext.iec62443.baseModel.mIEC.IntegerValue;
import org.xtext.iec62443.baseModel.mIEC.Model;
import org.xtext.iec62443.baseModel.mIEC.Zone;

public class Solution implements Comparable<Solution> {
	HashMap<String, HashMap<String, Long>> allocation;
	HashMap<String, Long> state;
	private HashMap<String, Boolean> movedMap;
	double objective;
	int nbMoved = -1;
	Model m;
	
	
	public int getNbMoved() {
		return nbMoved;
	}

	Solution(HashMap<String, HashMap<String, Long>> allocation, HashMap<String, Long> state, double objective, Model m){
		this.state = state;
		this.allocation = allocation;
		this.objective = objective;
		// The model is used to initialize the nbMoved
		this.m = m;
		computeMovement(m);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Solution){
			Solution sol = (Solution) obj;
			return sol.state.equals(state) && sol.allocation.equals(allocation) && sol.objective == objective;
		}
		return false;
	}
	
	// Compute which application moved between the previous configuration and the solution
	// Will only run once per solution
	public void computeMovement(Model m) {
		if (nbMoved != -1) {
			return;
		}
			
		movedMap = new HashMap<>();
		nbMoved = 0;
		
		for (Application a: EcoreUtil2.getAllContentsOfType(m, Application.class)) {
			// Cant move an application that was already stopped
			if (a.getExecutedOn() == null) {
				movedMap.put(a.getName(), false);
			}
			else {
				// if the application does not appear in the list, it was stopped (and thus moved)
				if (!allocation.keySet().contains(a.getName())) {
					movedMap.put(a.getName(), true);
					nbMoved+=1;
				}
				else {
					boolean isAttributed = false;
					for (String d: allocation.get(a.getName()).keySet()) {
						if (allocation.get(a.getName()).get(d) == 1) {
							isAttributed = true;
							// If the two allocations are different, the process moved
							if (!d.equals(a.getExecutedOn().getName())) {
								movedMap.put(a.getName(), true);
								nbMoved+=1;
							}
							// Else, it did not
							else {
								movedMap.put(a.getName(), false);
							}
							// Anyway, we can go to the next application
							break;
						}
					}
					// if the application is not attributed to any device, and was before, it moved
					if (!isAttributed) {
						movedMap.put(a.getName(), true);
						nbMoved+=1;
					}
				}
			}
		}
	}
	
	public Model applyTo(Model m) {
		java.lang.System.out.println("Score: " + objective);
		
		if (objective == 0.0) {

			java.lang.System.out.println("Every application is stopped after reconfiguration");
			return null;
		}
//		 Compute the number and which application moved (if it's necessary)
		computeMovement(m);
		
		// Apply new locations to all applications

		java.lang.System.out.println("Moved " + this.nbMoved + " applications");
		for (Application a : EcoreUtil2.getAllContentsOfType(m, Application.class)) {
			// Apply the new states
//				java.lang.System.out.println("application " + a.getName() + ": ");
			
			
			int state;
			
			if (!this.state.containsKey(a.getName())){
				state = 2;
			}
			else {
				state = this.state.get(a.getName()).intValue();
			}
			
			((IntegerValue)a.getProperty("state").getValue()).setValue(state);
			// Stop the application
			if (state == 2) {
				a.setExecutedOn(null);
				if (!movedMap.get(a.getName())) {
					java.lang.System.out.println("\t application " + a.getName() + " is still stopped (Score 0)");
				}
				else {
					java.lang.System.out.println("\t application " + a.getName() + " is now stopped (Score 0)");
				}
			}
			// Put the new attribution
			else {
				HashMap<String, Long> appAttribution = allocation.get(a.getName());
				for (Device d: EcoreUtil2.getAllContentsOfType(m, Device.class)) {
					if (appAttribution.keySet().contains(d.getName()) && appAttribution.get(d.getName())!=0 ) {
						Zone newZ = d.getZone();
						Zone oldZ = a.getZone();
						oldZ.getComponents().remove(a);
						newZ.getComponents().add(a);
						a.setExecutedOn(d);
						if (!movedMap.get(a.getName())) {
							java.lang.System.out.println("\t application " + a.getName() + " is still executed on " + a.getExecutedOn().getName()  + " (Score " + a.getScoreOnDevice(d ) + ")");
						}
						else {
							java.lang.System.out.println("\t application " + a.getName() + " is now executed on " + a.getExecutedOn().getName()  + " (Score " + a.getScoreOnDevice(d) + ")");
						}
					}
				}
			}
		}
		// clear all conduits, they do not matter in the reconfiguration for now.
		for (Conduit cond: EcoreUtil2.getAllContentsOfType(m, Conduit.class)) {
			cond.getChannels().clear();
		}
		return m;
	}
	
	public void printSolution() {
		System.out.print(this.toString());
	}
	
	@Override
	public String toString() {
		
		String res = "";
		// Compute the movements
		computeMovement(m);
		
		res+="objective value: " + objective + "\n";
		for (String keyA: allocation.keySet()) {
			// Skip parts that did not move
			if (!this.movedMap.get(keyA)) {
				continue;
			}
			if (state.get(keyA) == 2) {
				res+="Application " + keyA + " not executed\n";
			}
			else {
		    	for (String keyD: allocation.get(keyA).keySet()) {
		    		if (allocation.get(keyA).get(keyD) == 1) {
		    			if (state.get(keyA) == 0) {
		    				res+="Application " + keyA + " now executed in nominal mode on device " + keyD+ "\n";
						}
		    			else {
		    				res+="Application " + keyA + " now executed in degraded mode on device " + keyD+ "\n";
		    			}
		    		}
		    	}
			}
	    }
		return res;
	}

	@Override
	public int compareTo(Solution o) {
		return this.nbMoved - o.nbMoved;
	}
	
}
