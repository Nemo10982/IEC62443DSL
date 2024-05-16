package org.xtext.iec62443.baseModel.userInterface;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import org.xtext.iec62443.baseModel.transformation.Solution;

public class SolutionChooser {
	 private Solution selectedSolution;
	 
	 
	 
	 	private String htmlLineBreak(String s) {
	 		String res = "<html>" + s;
	 		res = res.replace("\n", "<br/>");
	 		return res;
	 	}

	    public void showDialog(java.awt.Component parent, List<Solution> solutions) {
	    	Collections.sort(solutions);
	    	// Define the set of solutions
	    	List<GraphicalSolution> graphicalSolutions = new ArrayList<>();
	    	
	    	for (int i = 0; i < solutions.size(); i++) {
	    		graphicalSolutions.add(new GraphicalSolution(solutions.get(i), "Solution " + (i+1) + " moves " + solutions.get(i).getNbMoved()));
	    	}
	    	
	    	
	    	
	    	Object[] gList = graphicalSolutions.toArray();
	        JComboBox<Object> SolutionComboBox = new JComboBox<>(gList);
	        
	    	
	        SolutionComboBox.setSelectedIndex(0);
	        
	    	// Show the solution content when chosen
	    	JLabel solutionContent = new JLabel();
	    	
	    	SolutionComboBox.addActionListener(new ActionListener() {
	    		@Override
	    		public void actionPerformed(ActionEvent event) {
	    			JComboBox<Object> origin = (JComboBox<Object>) event.getSource();
	    			GraphicalSolution gSol = (GraphicalSolution) origin.getSelectedItem();
	                solutionContent.setText(htmlLineBreak(gSol.s.toString()));
	            }
	    	});
	    	// Start with the first solution shown
			GraphicalSolution gSol = (GraphicalSolution) SolutionComboBox.getSelectedItem();
            solutionContent.setText(htmlLineBreak(gSol.s.toString()));
	    	
            // create a container for the label

            JPanel containerLabel = new JPanel() {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(800, 240);
                }
            };	
            

            containerLabel.setLayout(new GridBagLayout());
            containerLabel.add(solutionContent);
            Border blackline = BorderFactory.createLineBorder(Color.black);
            containerLabel.setBorder(blackline);
            
	    	// create a container for both fields
            
            JPanel container = new JPanel() {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(800, 320);
                }
            };

            
            container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
            container.add(SolutionComboBox);
            container.add(containerLabel);

	        int result = JOptionPane.showConfirmDialog(
	                null,
	                container,
	                "Choose a Solution",
	                JOptionPane.OK_CANCEL_OPTION,
	                JOptionPane.PLAIN_MESSAGE
	        );

	        if (result == JOptionPane.OK_OPTION) {
	        	if (SolutionComboBox.getSelectedItem() == null) {
	        		selectedSolution = null;
	        	}
	        	else {
		        	selectedSolution = ((GraphicalSolution) SolutionComboBox.getSelectedItem()).s;
	        	}
	        } else {
	        	selectedSolution = null;
	        }
	    }

	    public Solution getSelectedSolution() {
	        return selectedSolution;
	    }
	    
	    class GraphicalSolution {
	    	Solution s;
	    	String name;
	    	
	    	GraphicalSolution(Solution s, String name){
	    		this.s = s;
	    		this.name = name;
	    	}
	    	
	    	@Override
	    	public String toString() {
	    		return name;
	    	}
	    }
	    
}





