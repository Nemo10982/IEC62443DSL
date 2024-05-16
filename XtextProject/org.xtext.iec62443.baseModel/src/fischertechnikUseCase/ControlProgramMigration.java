package fischertechnikUseCase;

import java.io.IOException;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.xtext.iec62443.baseModel.mIEC.Application;
import org.xtext.iec62443.baseModel.mIEC.Model;

import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;

public class ControlProgramMigration {
	Model originalConf;
	Model curConf;
	Model preConf;
	
	final static String PLC1Addr = "192.168.1.1";

	final static String PLC2Addr = "192.168.1.2";

	final static String m340Addr = "192.168.1.3";

	final static String PLC3Addr = "192.168.1.4";

	final static String PLC4Addr = "192.168.1.5";

	final static int NBPLC = 4 ;

	final static int NBTASK = 4 ;

	// These are booleans, but we do not want to edit them at the same time

	final static int Task1Addr = 797;

	final static int Task2Addr = 798;

	final static int Task3Addr = 799;

	final static int Task4Addr = 800;



	// 16 bit Integers representing location (1-4 -> plc 1 to 4, 5 -> Safe)

	final static int Task1Target = 801;

	final static int Task2Target = 802;

	final static int Task3Target = 803 ;

	final static int Task4Target = 804;

	final static int Task1Loc =    805;

	final static int Task2Loc =    806;

	final static int Task3Loc =    807;

	final static int Task4Loc =    808;

	final static int m340Safe =    10;

	final static int SafeModes =   11; // Read on the m340 for now
	
	
	
    int nothingExecuted[]  = {5,5,5,5,5,5,5,5};

    int resetExecution[]  = {5,5,5,5,1,2,3,4};
    
    
    int curLocs[] = {1,2,3,4};

	ModbusClient PLCClients[], M340Client;

	public ControlProgramMigration(Model conf, ModbusClient pLC1Client, ModbusClient pLC2Client,
			ModbusClient pLC3Client, ModbusClient pLC4Client, ModbusClient m340Client) {
		curConf = conf;
		preConf = null;
		originalConf = conf;
		PLCClients = new ModbusClient[4];
		PLCClients[0]=pLC1Client;
		PLCClients[1]=pLC2Client;
		PLCClients[2]=pLC3Client;
		PLCClients[3]=pLC4Client;
		M340Client = m340Client;
	}
	
	public String convertTaskNumberToName(int nb) {
		switch(nb) {
		case 1:
			return "MPOProgram";
		case 2:
			return "HBWProgram";
		case 3:
			return "GripperProgram";
		case 4:
			return "SorterProgram";
		}
		return "";
	}

	public int convertPLCNameToNb(String name) {
		switch(name) {
		case "PLCA1":
			return 1;
		case "PLCB1":
			return 2;
		case "PLCC1":
			return 3;
		case "PLCD1":
			return 4;
		}
		return 0;
	}

	public int convertAppNameToNb(String name) {
		switch(name) {
		case "MPOProgram":
			return 1;
		case "HBWProgram":
			return 2;
		case "GripperProgram":
			return 3;
		case "SorterProgram":
			return 4;
		}
		return 0;
	}
	
	
	
	
	
	public void applyNewConf(Model newConf) throws UnknownHostException, SocketException, ModbusException, IOException, InterruptedException{
		preConf = curConf;
		curConf = newConf;

		
		if (newConf == null) {
			// put all tasks in safe mode
			List<Integer> ilist = new ArrayList<>();
			for (int i = 0; i <=NBPLC; i++) ilist.add(i);
			
			ilist.parallelStream().forEach(i->{
				try {
					if (i == NBPLC) {
						M340Client.WriteSingleRegister(m340Safe, 1);
					}
					else PLCClients[i].WriteMultipleRegisters(Task1Target, nothingExecuted);
				} catch (ModbusException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		else {
			List<Application> applications = EcoreUtil2.getAllContentsOfType(newConf, Application.class);
			applications.parallelStream().forEach(a->{
				int appNb = convertAppNameToNb(a.getName());
				int oldLoc = curLocs[appNb-1];
				int newLoc = a.getExecutedOn()==null ? -1 : convertPLCNameToNb(a.getExecutedOn().getName());

				try {
					if (oldLoc != newLoc) {
						// Put program in safe mode
						if (newLoc == -1) {
							System.out.println("Stopping task number" + appNb + " on PLC" + oldLoc );
							if (appNb == 4){
								// M340 should be put in fallback mode
								M340Client.WriteSingleRegister(m340Safe, 1);
								
							}
							// tell every plc that the task is in safe mode
		
							for (int i = 0; i< NBPLC; i++) {
								PLCClients[i].WriteSingleRegister(Task1Loc + (appNb-1), 5);
							}
							curLocs[appNb-1] = -1;
						}
						// Move program to a new PLC
						else {
	
							System.out.println("Sending task number" + appNb + " from PLC" + oldLoc + " to PLC" + newLoc );
							// send target to old location
							PLCClients[oldLoc-1].WriteSingleRegister(Task1Target + (appNb-1), newLoc);
							
							
							if (appNb == 4){
								// M340 should be put in fallback mode temporarily
								M340Client.WriteSingleRegister(m340Safe, 1);
								
							}
							
							// Update the location for each PLC
		
							for (int i = 0; i< NBPLC; i++) {
								PLCClients[i].WriteSingleRegister(Task1Loc + (appNb-1), newLoc);
							}
		
							if (appNb == 4){
								// M340 should be put back in operational mode
								M340Client.WriteSingleRegister(m340Safe, 0);
								
							}
							
							curLocs[appNb-1] = newLoc;
							
						}
					}

				} catch (ModbusException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
//			for (Application a: applications) {
//				int appNb = convertAppNameToNb(a.getName());
//				int oldLoc = curLocs[appNb-1];
//				int newLoc = a.getExecutedOn()==null ? -1 : convertPLCNameToNb(a.getExecutedOn().getName());
//				if (oldLoc != newLoc) {
//					
//					// Put program in safe mode
//					if (newLoc == -1) {
//						System.out.println("Stopping task number" + appNb + " on PLC" + oldLoc );
//						if (appNb == 4){
//							// M340 should be put in fallback mode
//							M340Client.WriteSingleRegister(m340Safe, 1);
//							
//						}
//						// tell every plc that the task is in safe mode
//	
//						for (int i = 0; i< NBPLC; i++) {
//							PLCClients[i].WriteSingleRegister(Task1Loc + (appNb-1), 5);
//						}
//						curLocs[appNb-1] = -1;
//					}
//					// Move program to a new PLC
//					else {
//
//						System.out.println("Sending task number" + appNb + " from PLC" + oldLoc + " to PLC" + newLoc );
//						// send target to old location
//						PLCClients[oldLoc-1].WriteSingleRegister(Task1Target + (appNb-1), newLoc);
//						
//						
//						if (appNb == 4){
//							// M340 should be put in fallback mode temporarily
//							M340Client.WriteSingleRegister(m340Safe, 1);
//							
//						}
//						
//						// Update the location for each PLC
//	
//						for (int i = 0; i< NBPLC; i++) {
//							PLCClients[i].WriteSingleRegister(Task1Loc + (appNb-1), newLoc);
//						}
//	
//						if (appNb == 4){
//							// M340 should be put back in operational mode
//							M340Client.WriteSingleRegister(m340Safe, 0);
//							
//						}
//						
//						curLocs[appNb-1] = newLoc;
//						
//					}
//				}
//			}
		}
		
	}
	
	// Restore every plc and programs to their initial states, and return the original reconfiguration
	public Model resetAllPLC() throws UnknownHostException, SocketException, ModbusException, IOException, InterruptedException {
		curConf = originalConf;
		
		for (int i = 0; i < NBTASK; i++) {
			curLocs[i] = i+1;
		}
		
		// Put m340 in safe mode
		M340Client.WriteSingleRegister(m340Safe, 1);

		// put all tasks in safe mode
		
		for (int i = 0; i< NBPLC; i++) {
			PLCClients[i].WriteMultipleRegisters(Task1Target, nothingExecuted);
		}
	      
		Thread.sleep(1000); // wait for previous commands to be executed
		
	    // put m340 in active mode and remove its safe values
	    int prep_value[] = {0,0}; 
	      

		M340Client.WriteMultipleRegisters(m340Safe, prep_value);
	    // reset all tasks
	    for (int i = 0; i< NBPLC; i++){
	    	PLCClients[i].WriteMultipleRegisters(Task1Target, resetExecution);
	    }

	    Thread.sleep(1); // wait for previous commands to be executed
		return curConf;
	}
	
}
