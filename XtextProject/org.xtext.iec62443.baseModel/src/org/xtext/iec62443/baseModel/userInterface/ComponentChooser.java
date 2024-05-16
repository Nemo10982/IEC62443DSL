package org.xtext.iec62443.baseModel.userInterface;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import org.eclipse.xtext.EcoreUtil2;
import org.xtext.iec62443.baseModel.mIEC.Application;
import org.xtext.iec62443.baseModel.mIEC.Component;
import org.xtext.iec62443.baseModel.mIEC.Device;
import org.xtext.iec62443.baseModel.mIEC.Model;

public class ComponentChooser {
	 private Component selectedComponent;

	    public void showDialog(java.awt.Component parentComponent, Model m, boolean restricted) {
	    	List<Component> CompList;
	    	if (restricted) {

		    	List<Device> CompListUnfiltered = EcoreUtil2.getAllContentsOfType(m, Device.class);
		    	CompList = new ArrayList<>();
		    	for (Device d :CompListUnfiltered) {
		    		if (d.getName().contains("PLC")){
		    			CompList.add(d);
		    		}
		    	}
		    	System.out.println(CompList.size());
		    	
	    	}
	    	else {
	    		CompList = EcoreUtil2.getAllContentsOfType(m, Component.class);
	    	}
	    	List<GComponent> gListPrec = new ArrayList<GComponent>();
	        for (int i = 0; i < CompList.size(); i++) {
	        	Component c = CompList.get(i);
	        	if (c.getProperty("attacked") == null) {
	        		gListPrec.add(new GComponent(c));
	        	}
	        }
	    	Object[] gList = gListPrec.toArray();
	        JComboBox<Object> ComponentComboBox = new JComboBox<>(gList);
	        ComponentComboBox.setSelectedIndex(0);

	        int result = JOptionPane.showConfirmDialog(
	                parentComponent,
	                ComponentComboBox,
	                "Choose a Component to mark as attacked",
	                JOptionPane.OK_CANCEL_OPTION,
	                JOptionPane.PLAIN_MESSAGE
	        );

	        if (result == JOptionPane.OK_OPTION) {
	        	if (ComponentComboBox.getSelectedItem() == null) {
	        		selectedComponent = null;
	        	}
	        	else {
		        	selectedComponent = ((GComponent) ComponentComboBox.getSelectedItem()).c;
	        	}
	        } else {
	        	selectedComponent = null;
	        }
	    }

	    public Component getSelectedComponent() {
	        return selectedComponent;
	    }
	    
	    
	    private class GComponent {
	    	Component c;
    	
    	
	    	public GComponent(Component c) {
	    		this.c = c;
	    	}
    	
	    	@Override
	    	public String toString() {
	    		String res = c.getName() + " in zone " + c.getZone().getName() ;
	    		switch(c.getType()) {
	    		case Component.APPLICATION:
	    			res = "Application " + res;
	    			if (((Application)c).getExecutedOn() == null) {
	    				res += " in safe mode";
	    			}
	    			else {
	    				res += " executed on " + ((Application)c).getExecutedOn().getName();
	    				if (((Application)c).getProperty("state") != null && (((Application)c).getProperty("state").getValue().getStringValue() == "1")){
	    					res += " in degraded mode";
	    				}
	    			}
	    			break;
	    		case Component.DEVICE:
	    			res = "Device  " + res ;
	    			List<Application> executes = ((Device)c).getRunning();
	    			if (executes.size() != 0) {
	    				res += " running apps: ";
	    				boolean start = true;
	    				for (Application a:  executes) {
	    					if (start) {
	    						res+= a.getName();
	    						start = false;
	    					}
	    					else res+= ", " + a.getName();
	    				}
	    				
	    			}
	    			break;
	    		case Component.SYSTEM:
	    			res = "System " + res;
	    			break;
	    		}
	    		
	    		return res;
	    	}
	    }
	    
}





