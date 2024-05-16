package org.xtext.iec62443.baseModel.userInterface;


import javax.swing.JComboBox;
import javax.swing.JOptionPane;




public class FunctionalityChooser {

	final public static String RECONFIGURATION = "Try reconfiguration";
	final public static String RECONFIGURATION_COUNTERMEASURES = "Try reconfiguration with countermeasures";
	final public static String REQUIREMENTS = "Print requirements";
	
	
	private String selectedOption;

    public void showDialog(java.awt.Component parentComponent) {
    	String[] optionList = {RECONFIGURATION,RECONFIGURATION_COUNTERMEASURES,REQUIREMENTS};
        JComboBox<Object> ComponentComboBox = new JComboBox<>(optionList);
        ComponentComboBox.setSelectedIndex(0);

        int result = JOptionPane.showConfirmDialog(
                parentComponent,
                ComponentComboBox,
                "What do you want to do ?",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
        	if (ComponentComboBox.getSelectedItem() == null) {
        		selectedOption = null;
        	}
        	else {
        		selectedOption = ((String) ComponentComboBox.getSelectedItem());
        	}
        } else {
        	selectedOption = null;
        }
    }

    public String getSelectedOption() {
        return selectedOption;
    }
}
