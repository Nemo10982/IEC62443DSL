package org.xtext.iec62443.baseModel.transformation;


import org.eclipse.xtext.EcoreUtil2;
import org.xtext.iec62443.baseModel.mIEC.Component;
import org.xtext.iec62443.baseModel.mIEC.CounterMeasure;
import org.xtext.iec62443.baseModel.mIEC.Model;
import org.xtext.iec62443.baseModel.mIEC.SecurityLevel;
import org.xtext.iec62443.baseModel.mIEC.SecurityLevels;
import org.xtext.iec62443.baseModel.mIEC.Zone;

//Now directly supported by the model
@Deprecated
public class ComputeAchieved {
	
	public static void ComputeAchievedSecurityLevel(Model m) {
		for (Zone z: EcoreUtil2.getAllContentsOfType(m, Zone.class)) {
			for (Component c : z.getComponents()){
				SecurityLevels slevelZ = z.getAchieved();
				SecurityLevels slevelC = c.getCapability();
				for (int i = 0; i < 7; i++) {
					slevelZ.setSecurityLevel(i, SecurityLevel.get(Math.min(slevelZ.getSecurityLevel(i).getValue(), slevelC.getSecurityLevel(i).getValue())));
				}
			}
			
			for (CounterMeasure c : z.getCountermeasures()){
				SecurityLevels slevelZ = z.getAchieved();
				SecurityLevels slevelC = c.getCapability();
				for (int i = 0; i < 7; i++) {
					slevelZ.setSecurityLevel(i, SecurityLevel.get(Math.max(slevelZ.getSecurityLevel(i).getValue(), slevelC.getSecurityLevel(i).getValue())));
				}
			}
		}
	}
}
