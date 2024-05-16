package org.xtext.iec62443.baseModel.evaluation;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
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
import org.xtext.iec62443.baseModel.mIEC.*;
import org.xtext.iec62443.baseModel.mIEC.Component;
import org.xtext.iec62443.baseModel.mIEC.Device;
import org.xtext.iec62443.baseModel.mIEC.MIECFactory;
import org.xtext.iec62443.baseModel.mIEC.Model;
import org.xtext.iec62443.baseModel.mIEC.Value;
import org.xtext.iec62443.baseModel.mIEC.impl.MIECFactoryImpl;
import org.xtext.iec62443.baseModel.MiecStandaloneSetup;
import org.xtext.iec62443.baseModel.transformation.Reconfiguration;
import org.xtext.iec62443.baseModel.transformation.SecurityRequirements;
import org.xtext.iec62443.baseModel.userInterface.ComponentChooser;
import org.xtext.iec62443.baseModel.userInterface.FunctionalityChooser;

public class EvalReconfiguration {

	public static void main(String[] args) {

    	Injector injector = new MiecStandaloneSetup().createInjectorAndDoEMFRegistration();
    	EvalReconfiguration main = injector.getInstance(EvalReconfiguration.class);
    	main.run();
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void run() {
		
		// evaluate by creating mroe and more device sand applications
		
		HashMap<Integer,Long> map = new HashMap<>();

		ResourceSet set = resourceSetProvider.get();
		MIECFactory factory = MIECFactoryImpl.eINSTANCE;
		for (int i =4; i <= 100; i++) {
		
			// Create the resource
			Resource resource = set.createResource(URI.createFileURI("blank_ " + i + ".miec"));
			resource.getContents().add(factory.createModel());
			Model m = (Model) resource.getAllContents().next();
			
			// add a zone
			ClassicalZone z = factory.createClassicalZone();
			z.setName("TestZone");
			z.setTarget(factory.createSecurityLevels());
			m.getZones().add(z);
			
			
			// Keep a reference to the first device
			Device first = null;
			
			// add i devices and i applications
			for (int j = 0; j < i; j++) {
				// create the device
				Device d = factory.createDevice();
				d.setName("device_" + j);
				d.setCapability(factory.createSecurityLevels());
				// The first one is kept
				if (j==0) first = d;
				
				// Create a property indicating a capacity of 10, except for the last one
				IntegerValue v = factory.createIntegerValue();
				v.setValue(10);
				if (j == i-1) v.setValue(20);
				Property p = factory.createProperty();
				p.setName("capacity");
				p.setValue(v);
				d.getProperties().add(p);
				
				// create the application running on the device
				Application a = factory.createApplication();
				a.setName("app_" + j);
				a.setCapability(factory.createSecurityLevels());
				a.setExecutedOn(d);
				
				// Create properties indicating a size of 10, and a score of 1
				IntegerValue score = factory.createIntegerValue();
				score.setValue(1);

				IntegerValue size = factory.createIntegerValue();
				size.setValue(10);
				
				Property p1 = factory.createProperty();
				p1.setName("size");
				p1.setValue(size);
				Property p2 = factory.createProperty();
				p2.setName("score");
				p2.setValue(score);
				
				a.getProperties().add(p1);
				a.getProperties().add(p2);
				
				
				// add them to the zone
				
				z.getComponents().add(d);
				z.getComponents().add(a);

			}
			java.lang.System.out.println(z.getComponents());
			
			final long startTime = java.lang.System.currentTimeMillis();
			
			Reconfiguration.reconfigureWithout(first, m);

			final long endTime = java.lang.System.currentTimeMillis();
			
			map.put(i, endTime-startTime);
			
	
	
			
		}
		java.lang.System.out.println(map);
		
		File f = new File("./EvaluationResults/results.tsv");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("nb"+"\t"+"time");
			for (int i = 5; i <= 30; i++) {
				fw.write(i+"\t"+map.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
