/*
 * generated by Xtext 2.32.0
 */
package org.xtext.iec62443.baseModel.generator;

import com.google.inject.Inject;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;

import com.google.inject.Injector;
import com.google.inject.Provider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.iec62443.baseModel.mIEC.Component;
import org.xtext.iec62443.baseModel.mIEC.Device;
import org.xtext.iec62443.baseModel.mIEC.Model;
import org.xtext.iec62443.baseModel.MiecStandaloneSetup;
import org.xtext.iec62443.baseModel.transformation.Reconfiguration;
import org.xtext.iec62443.baseModel.transformation.ReconfigurationConstraintP;
import org.xtext.iec62443.baseModel.transformation.ReconfigurationConstraintPCTM;
import org.xtext.iec62443.baseModel.transformation.SecurityRequirements;
import org.xtext.iec62443.baseModel.userInterface.ComponentChooser;
import org.xtext.iec62443.baseModel.userInterface.FunctionalityChooser;
import org.xtext.iec62443.baseModel.userInterface.GraphStreamVisualization;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Create a JFrame (window) for the file chooser
        JFrame frame = new JFrame("Choose a .miec file to open");
        // Create a JFileChooser
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
        fileChooser.setDialogTitle("Choose a .miec file to open");

        // Show the file chooser dialog
        int returnVal = fileChooser.showOpenDialog(frame);

        // Check if the user selected a file
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("You chose the file: " + selectedFile.getAbsolutePath());

    		Injector injector = new MiecStandaloneSetup().createInjectorAndDoEMFRegistration();
    		Main main = injector.getInstance(Main.class);
    		main.runGenerator(selectedFile.getPath());
        } else {
            System.out.println("User did not choose a valid file.");
        }

        // Dispose the frame
        frame.dispose();
//		if (args.length == 0) {
//			System.err.println("Aborting: no path to EMF resource provided!");
//			return;
//		}
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String string) {
		
		
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(string), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}
		

		Model m = (Model) resource.getAllContents().next();
		
		
		// Ask the user for the next step 
		

		//FunctionalityChooser functionalityChooser = new FunctionalityChooser();
		//functionalityChooser.showDialog(null);

        // String selectedOption = functionalityChooser.getSelectedOption();
		String selectedOption = FunctionalityChooser.RECONFIGURATION_COUNTERMEASURES;
        if(selectedOption == null) {
            System.out.println("No functionality selected");
        	System.exit(0);
        }
        if (selectedOption.equals(FunctionalityChooser.RECONFIGURATION )|| selectedOption.equals(FunctionalityChooser.RECONFIGURATION_COUNTERMEASURES)) {
        	
			
			boolean cont = true;
			Scanner scanner = new Scanner(System.in);
			boolean noSave = false;
			while(cont) {
				
				
//				ComponentChooser componentChooser = new ComponentChooser();
//				componentChooser.showDialog(null, m, false);
//	
//		        Component selectedComponent = componentChooser.getSelectedComponent();
//		        

				java.lang.System.out.println("starting graph research");
				Component selectedComponent = GraphStreamVisualization.showVisualization(m);
				java.lang.System.out.println("selected: " + selectedComponent);

	            System.out.flush();
				
		        if (selectedComponent != null) {
		        	
		            System.out.println("Selected Component: " + selectedComponent.getName());
		            Model m2 ;
		            if (selectedOption.equals(FunctionalityChooser.RECONFIGURATION_COUNTERMEASURES)) {

			            m2 = ReconfigurationConstraintPCTM.reconfigureWithout(selectedComponent, m, false);
		            }
		            else {
		            	m2 = ReconfigurationConstraintP.reconfigureWithout(selectedComponent, m, false);
		            }
					if (m2 == null) {
						noSave = true;
						break;
					}
					m = m2;
		        } else {
		            System.out.println("User canceled the selection.");
		            cont = false;
		        }
				
	//			System.out.println("Give the next component to remove, -1 to stop");
	//			for (Component c : EcoreUtil2.getAllContentsOfType(m, Component.class)) {
	//				System.out.print(c.getName() + ", ");
	//			}
	//			System.out.println();
	//			String input = scanner.nextLine();
	//			input = input.strip();
	//			if (input.equals("-1")) {
	//				break;
	//			}
	//			Component toRem = null;
	//			for (Component c : EcoreUtil2.getAllContentsOfType(m, Component.class)) {
	//				if (c.getName().equals(input)) {
	//					toRem = c;
	//					break;
	//				}
	//			}
	//			if (toRem == null) continue;
				
				
				
			}
			
			if (noSave) {

	            System.out.println("Reconfiguration ended with no application left running, or no solution was chosen");
	            return;
			}
		
			
			// Choose where to save the result
			
//	        JFileChooser fileChooser = new JFileChooser(new File(string).getParent());
//	        fileChooser.setDialogTitle("Choose where to save the resulting .miec file");
//	        int result = fileChooser.showSaveDialog(null);
//	
//	        if (result == JFileChooser.APPROVE_OPTION) {
//	            File selectedFile = fileChooser.getSelectedFile();
//	            String filePath = selectedFile.getAbsolutePath();
//	
//	            try {
//	                // Example: Write some content to the selected file
//	                File toWrite = new File(filePath);
//	                FileOutputStream out = new FileOutputStream(toWrite);
//	
//	                Resource res = resource.getResourceSet().createResource(URI.createFileURI(toWrite.getAbsolutePath()));
//	                res.getContents().add(m);
//	                res.save(out,null);
//	                System.out.println("File saved successfully at: " + filePath);
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        } else {
//	            System.out.println("User canceled the save operation.");
//	        }
	        
        }
        
        if (selectedOption.equals(FunctionalityChooser.REQUIREMENTS)) {
        	

			
	        JFileChooser fileChooser = new JFileChooser(new File(string).getParent());
	        fileChooser.setDialogTitle("Choose where to save the requirement file");
	        int result = fileChooser.showSaveDialog(null);
	        
	        if (result == JFileChooser.APPROVE_OPTION) {
	            File selectedFile = fileChooser.getSelectedFile();
	            String filePath = selectedFile.getAbsolutePath();
	
	            try {
	                // Example: Write some content to the selected file
	                File toWrite = new File(filePath);
	                SecurityRequirements.securityRequirements(m,new FileWriter(toWrite));
	                System.out.println("Requirements printed successfully to: " + filePath);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.out.println("User canceled the save operation.");
	        }
        }

		// Configure and start the generator
//		fileAccess.setOutputPath("src-gen/");
//		GeneratorContext context = new GeneratorContext();
//		context.setCancelIndicator(CancelIndicator.NullImpl);
//		generator.generate(resource, fileAccess, context);
//
//		System.out.println("Code generation finished.");
		
		
	}
}
