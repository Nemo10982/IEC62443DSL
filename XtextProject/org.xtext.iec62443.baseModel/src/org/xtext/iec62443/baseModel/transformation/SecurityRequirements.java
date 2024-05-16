package org.xtext.iec62443.baseModel.transformation;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.xtext.iec62443.baseModel.mIEC.*;
import org.xtext.iec62443.baseModel.mIEC.System;


class Pair{
	int Slevel;
	String name;
	
	public Pair(int slevel, String name) {
		Slevel = slevel;
		this.name = name;
	}
	
}


class Triple{
	
	
	int Slevel;
	int kind;
	String name;
	
	public Triple(int slevel, int kind, String name) {
		Slevel = slevel;
		this.name = name;
	}
	
}

public class SecurityRequirements {

static final int EMBEDDED = 1;
static final int NETWORK = 2;
static final int HOST = 4;
static final int SOFTWARE = 8;
static final int ALL = 0;

private static int indent = 0;

	static private HashMap<String,String> StringDictionnary = null;
	static private List<Pair>[] sLevelToSR = null;
	static private List<Triple>[] sLevelToCR = null;
	
	private static void incrIndent() {
		indent+=1;
	}
	
	private static void decrIndent() {
		indent-=1;
	}
	

	private static void printIndent(FileWriter f) throws IOException {
		for (int i = 0; i < indent; i++) {
			f.write("\t");
		}
	}
	
	public static void securityRequirements(Model e, FileWriter f) throws IOException {
		
		if (StringDictionnary == null){
			CreateDictionnary();
		}
		
		if (sLevelToSR == null) {
			createCorrespondenceTables();
		}
		
		// print security requirements for the different zones
		for (Zone z : e.getZones()) {
			securityRequirements(z, f);
		}
		
		// print security requirements for the conduits
		for (Conduit c : e.getConduits()) {
			securityRequirements(c, f);
		}
		
		f.flush();
		
	}

	@SuppressWarnings("unchecked")
	private static void createCorrespondenceTables() {

		sLevelToSR = new List[7];
		sLevelToCR = new List[7];
		for (int i = 0; i < 7; i++) {
			sLevelToSR[i] = new ArrayList<>();
		}
		for (int i = 0; i < 7; i++) {
			sLevelToCR[i] = new ArrayList<>();
		}
		
		// FR 1
		sLevelToSR[0].add(new Pair(1,"1.1"));
		sLevelToSR[0].add(new Pair(2,"1.1.RE1"));
		sLevelToSR[0].add(new Pair(3,"1.1.RE2"));
		sLevelToSR[0].add(new Pair(4,"1.1.RE3"));
		sLevelToSR[0].add(new Pair(2,"1.2"));
		sLevelToSR[0].add(new Pair(3,"1.2.RE1"));
		sLevelToSR[0].add(new Pair(1,"1.3"));
		sLevelToSR[0].add(new Pair(3,"1.3.RE1"));
		sLevelToSR[0].add(new Pair(1,"1.4"));
		sLevelToSR[0].add(new Pair(1,"1.5"));
		sLevelToSR[0].add(new Pair(3,"1.5"));
		sLevelToSR[0].add(new Pair(1,"1.6"));
		sLevelToSR[0].add(new Pair(2,"1.6.RE1"));
		sLevelToSR[0].add(new Pair(1,"1.7"));
		sLevelToSR[0].add(new Pair(3,"1.7.RE1"));
		sLevelToSR[0].add(new Pair(4,"1.7.RE2"));
		sLevelToSR[0].add(new Pair(2,"1.8"));
		sLevelToSR[0].add(new Pair(2,"1.9"));
		sLevelToSR[0].add(new Pair(3,"1.9.RE1"));
		sLevelToSR[0].add(new Pair(1,"1.10"));
		sLevelToSR[0].add(new Pair(1,"1.11"));
		sLevelToSR[0].add(new Pair(1,"1.12"));
		sLevelToSR[0].add(new Pair(1,"1.13"));
		sLevelToSR[0].add(new Pair(2,"1.13.RE1"));

		sLevelToCR[0].add(new Triple(1, ALL, "1.1"));
		sLevelToCR[0].add(new Triple(2, ALL, "1.1.RE1"));
		sLevelToCR[0].add(new Triple(3, ALL, "1.1C.RE2"));
		sLevelToCR[0].add(new Triple(2, ALL, "1.2"));
		sLevelToCR[0].add(new Triple(3, ALL, "1.2.RE1"));
		sLevelToCR[0].add(new Triple(1, ALL, "1.3"));
		sLevelToCR[0].add(new Triple(1, ALL, "1.4"));
		sLevelToCR[0].add(new Triple(1, ALL, "1.5"));
		sLevelToCR[0].add(new Triple(3, ALL, "1.5C.RE1"));
		sLevelToCR[0].add(new Triple(1, NETWORK, "1.6"));
		sLevelToCR[0].add(new Triple(2, NETWORK, "1.6.RE1"));
		sLevelToCR[0].add(new Triple(1, ALL, "1.7"));
		sLevelToCR[0].add(new Triple(3, ALL, "1.7.RE1"));
		sLevelToCR[0].add(new Triple(4, ALL, "1.7.RE2"));
		sLevelToCR[0].add(new Triple(2, ALL, "1.8"));
		sLevelToCR[0].add(new Triple(2, ALL, "1.9"));
		sLevelToCR[0].add(new Triple(3, ALL, "1.9.RE1"));
		sLevelToCR[0].add(new Triple(1, ALL, "1.10"));
		sLevelToCR[0].add(new Triple(1, ALL, "1.11"));
		sLevelToCR[0].add(new Triple(1, ALL, "1.12"));
		sLevelToCR[0].add(new Triple(1, NETWORK, "1.13"));
		sLevelToCR[0].add(new Triple(3, NETWORK, "1.13.RE1"));
		sLevelToCR[0].add(new Triple(2, ALL, "1.14"));
		sLevelToCR[0].add(new Triple(3, ALL, "1.14.RE1"));
		
		// FR 2

		sLevelToSR[1].add(new Pair(1,"2.1"));
		sLevelToSR[1].add(new Pair(2,"2.1.RE1"));
		sLevelToSR[1].add(new Pair(2,"2.1.RE2"));
		sLevelToSR[1].add(new Pair(3,"2.1.RE3"));
		sLevelToSR[1].add(new Pair(4,"2.1.RE4"));
		sLevelToSR[1].add(new Pair(1,"2.2"));
		sLevelToSR[1].add(new Pair(3,"2.2.RE1"));
		sLevelToSR[1].add(new Pair(1,"2.3"));
		sLevelToSR[1].add(new Pair(3,"2.3.RE1"));
		sLevelToSR[1].add(new Pair(1,"2.4"));
		sLevelToSR[1].add(new Pair(3,"2.4.RE1"));
		sLevelToSR[1].add(new Pair(1,"2.5"));
		sLevelToSR[1].add(new Pair(2,"2.6"));
		sLevelToSR[1].add(new Pair(3,"2.7"));
		sLevelToSR[1].add(new Pair(1,"2.8"));
		sLevelToSR[1].add(new Pair(3,"2.8.RE1"));
		sLevelToSR[1].add(new Pair(1,"2.9"));
		sLevelToSR[1].add(new Pair(3,"2.9.RE1"));
		sLevelToSR[1].add(new Pair(1,"2.10"));
		sLevelToSR[1].add(new Pair(2,"2.11"));
		sLevelToSR[1].add(new Pair(3,"2.11.RE1"));
		sLevelToSR[1].add(new Pair(4,"2.11.RE2"));
		sLevelToSR[1].add(new Pair(3,"2.12"));
		sLevelToSR[1].add(new Pair(4,"2.12.RE1"));

		sLevelToCR[1].add(new Triple(1, ALL, "2.1"));
		sLevelToCR[1].add(new Triple(2, ALL, "2.1.RE1"));
		sLevelToCR[1].add(new Triple(2, ALL, "2.1.RE2"));
		sLevelToCR[1].add(new Triple(3, ALL, "2.1.RE3"));
		sLevelToCR[1].add(new Triple(4, ALL, "2.1.RE4"));
		sLevelToCR[1].add(new Triple(1, ALL, "2.2"));
		sLevelToCR[1].add(new Triple(5, ALL, "2.3")); // No corresponding component requirement
		sLevelToCR[1].add(new Triple(1, SOFTWARE | EMBEDDED | HOST | NETWORK, "2.4"));
		sLevelToCR[1].add(new Triple(2, SOFTWARE | EMBEDDED | HOST | NETWORK, "2.4.RE1"));
		sLevelToCR[1].add(new Triple(1, ALL, "2.5"));
		sLevelToCR[1].add(new Triple(2, ALL, "2.6"));
		sLevelToCR[1].add(new Triple(3, ALL, "2.7"));
		sLevelToCR[1].add(new Triple(1, ALL, "2.8"));
		sLevelToCR[1].add(new Triple(1, ALL, "2.9"));
		sLevelToCR[1].add(new Triple(3, ALL, "2.9.RE1"));
		sLevelToCR[1].add(new Triple(1, ALL, "2.10"));
		sLevelToCR[1].add(new Triple(1, ALL, "2.11"));
		sLevelToCR[1].add(new Triple(2, ALL, "2.11.RE1"));
		sLevelToCR[1].add(new Triple(4, ALL, "2.11.RE2"));
		sLevelToCR[1].add(new Triple(1, ALL, "2.12"));
		sLevelToCR[1].add(new Triple(4, ALL, "2.12.RE1"));
		sLevelToCR[1].add(new Triple(2, EMBEDDED | HOST | NETWORK, "2.13"));
		sLevelToCR[1].add(new Triple(3, EMBEDDED | HOST | NETWORK, "2.13.RE1"));
		
		// FR 3
		sLevelToSR[2].add(new Pair(1,"3.1"));
		sLevelToSR[2].add(new Pair(3,"3.1C.RE1"));
		sLevelToSR[2].add(new Pair(1,"3.2"));
		sLevelToSR[2].add(new Pair(2,"3.2.RE1"));
		sLevelToSR[2].add(new Pair(3,"3.2.RE2"));
		sLevelToSR[2].add(new Pair(1,"3.3"));
		sLevelToSR[2].add(new Pair(3,"3.3.RE1"));
		sLevelToSR[2].add(new Pair(4,"3.3.RE2"));
		sLevelToSR[2].add(new Pair(2,"3.4"));
		sLevelToSR[2].add(new Pair(3,"3.4.RE1"));
		sLevelToSR[2].add(new Pair(1,"3.5"));
		sLevelToSR[2].add(new Pair(1,"3.6"));
		sLevelToSR[2].add(new Pair(2,"3.7"));
		sLevelToSR[2].add(new Pair(2,"3.8"));
		sLevelToSR[2].add(new Pair(3,"3.8.RE1"));
		sLevelToSR[2].add(new Pair(3,"3.8.RE2"));
		sLevelToSR[2].add(new Pair(4,"3.8.RE3"));
		sLevelToSR[2].add(new Pair(2,"3.9"));
		sLevelToSR[2].add(new Pair(4,"3.9.RE1"));

		sLevelToCR[2].add(new Triple(1, ALL, "3.1"));
		sLevelToCR[2].add(new Triple(2, ALL, "3.1.RE1"));
		sLevelToCR[2].add(new Triple(1, SOFTWARE | EMBEDDED | HOST | NETWORK, "3.2"));
		sLevelToCR[2].add(new Triple(2, HOST, "3.2C.RE1"));
		sLevelToCR[2].add(new Triple(1, ALL, "3.3"));
		sLevelToCR[2].add(new Triple(4, ALL, "3.3.RE2")); // Corresponds to SR re2
		sLevelToCR[2].add(new Triple(1, ALL, "3.4"));
		sLevelToCR[2].add(new Triple(2, ALL, "3.4C.RE1"));
		sLevelToCR[2].add(new Triple(3, ALL, "3.4C.RE2"));
		sLevelToCR[2].add(new Triple(1, ALL, "3.5"));
		sLevelToCR[2].add(new Triple(1, ALL, "3.6"));
		sLevelToCR[2].add(new Triple(1, ALL, "3.7"));
		sLevelToCR[2].add(new Triple(2, ALL, "3.8"));
		sLevelToCR[2].add(new Triple(2, ALL, "3.9"));
		sLevelToCR[2].add(new Triple(4, ALL, "3.9.RE1"));
		sLevelToCR[2].add(new Triple(1, EMBEDDED | HOST | NETWORK, "3.10"));
		sLevelToCR[2].add(new Triple(2, EMBEDDED | HOST | NETWORK, "3.10.RE1"));
		sLevelToCR[2].add(new Triple(2, EMBEDDED | HOST | NETWORK, "3.11"));
		sLevelToCR[2].add(new Triple(3, EMBEDDED | HOST | NETWORK, "3.11.RE1"));
		sLevelToCR[2].add(new Triple(2, HOST | NETWORK, "3.12"));
		sLevelToCR[2].add(new Triple(2, EMBEDDED | HOST | NETWORK, "3.13"));
		sLevelToCR[2].add(new Triple(1, EMBEDDED | HOST | NETWORK, "3.14"));
		sLevelToCR[2].add(new Triple(2, EMBEDDED | HOST | NETWORK, "3.14.RE1"));
		
		// FR 4
		sLevelToSR[3].add(new Pair(1,"4.1"));
		sLevelToSR[3].add(new Pair(2,"4.1.RE1"));
		sLevelToSR[3].add(new Pair(4,"4.1.RE2"));
		sLevelToSR[3].add(new Pair(2,"4.2"));
		sLevelToSR[3].add(new Pair(3,"4.2.RE1"));
		sLevelToSR[3].add(new Pair(1,"4.3"));

		sLevelToCR[3].add(new Triple(1, ALL, "4.1"));
		sLevelToCR[3].add(new Triple(2, ALL, "4.2"));
		sLevelToCR[3].add(new Triple(3, ALL, "4.2.RE1"));
		sLevelToCR[3].add(new Triple(3, ALL, "4.2.RE2"));
		sLevelToCR[3].add(new Triple(1, ALL, "4.3"));
		
		// FR 5
		sLevelToSR[4].add(new Pair(1,"5.1"));
		sLevelToSR[4].add(new Pair(2,"5.1.RE1"));
		sLevelToSR[4].add(new Pair(3,"5.1.RE2"));
		sLevelToSR[4].add(new Pair(4,"5.1.RE3"));
		sLevelToSR[4].add(new Pair(1,"5.2"));
		sLevelToSR[4].add(new Pair(2,"5.2.RE1"));
		sLevelToSR[4].add(new Pair(3,"5.2.RE2"));
		sLevelToSR[4].add(new Pair(3,"5.2.RE3"));
		sLevelToSR[4].add(new Pair(1,"5.3"));
		sLevelToSR[4].add(new Pair(3,"5.3.RE1"));
		sLevelToSR[4].add(new Pair(1,"5.4"));

		sLevelToCR[4].add(new Triple(1, ALL, "5.1"));
		sLevelToCR[4].add(new Triple(1, NETWORK, "5.2"));
		sLevelToCR[4].add(new Triple(2, NETWORK, "5.2.RE1"));
		sLevelToCR[4].add(new Triple(3, NETWORK, "5.2.RE2"));
		sLevelToCR[4].add(new Triple(3, NETWORK, "5.2.RE3"));
		sLevelToCR[4].add(new Triple(1, NETWORK, "5.3"));
		
		// FR 6
		sLevelToSR[5].add(new Pair(1,"6.1"));
		sLevelToSR[5].add(new Pair(3,"6.1.RE1"));
		sLevelToSR[5].add(new Pair(2,"6.2"));

		sLevelToCR[5].add(new Triple(1, ALL, "6.1"));
		sLevelToCR[5].add(new Triple(1, ALL, "6.1.RE1"));
		sLevelToCR[5].add(new Triple(1, ALL, "6.2"));
		
		// FR 7
		sLevelToSR[6].add(new Pair(1,"7.1"));
		sLevelToSR[6].add(new Pair(2,"7.1.RE1"));
		sLevelToSR[6].add(new Pair(3,"7.1.RE2"));
		sLevelToSR[6].add(new Pair(1,"7.2"));
		sLevelToSR[6].add(new Pair(1,"7.3"));
		sLevelToSR[6].add(new Pair(2,"7.3.RE1"));
		sLevelToSR[6].add(new Pair(3,"7.3.RE2"));
		sLevelToSR[6].add(new Pair(1,"7.4"));
		sLevelToSR[6].add(new Pair(1,"7.5"));
		sLevelToSR[6].add(new Pair(1,"7.6"));
		sLevelToSR[6].add(new Pair(3,"7.6.RE1"));
		sLevelToSR[6].add(new Pair(1,"7.7"));
		sLevelToSR[6].add(new Pair(2,"7.8"));

		sLevelToCR[6].add(new Triple(1, ALL, "7.1"));
		sLevelToCR[6].add(new Triple(2, ALL, "7.1C.RE1"));
		sLevelToCR[6].add(new Triple(1, ALL, "7.2"));
		sLevelToCR[6].add(new Triple(1, ALL, "7.3"));
		sLevelToCR[6].add(new Triple(2, ALL, "7.3C.RE1"));
		sLevelToCR[6].add(new Triple(1, ALL, "7.4"));
		sLevelToCR[6].add(new Triple(5, ALL, "7.5")); // No corresponding component requirement
		sLevelToCR[6].add(new Triple(1, ALL, "7.6"));
		sLevelToCR[6].add(new Triple(3, ALL, "7.6.RE1"));
		sLevelToCR[6].add(new Triple(1, ALL, "7.7"));
		sLevelToCR[6].add(new Triple(1, ALL, "7.8"));
		
		
	}

	private static void CreateDictionnary() {
		// Fill the hashMap with all strings used to display the SR.
		StringDictionnary = new HashMap<>();

		// FR1 Identification and authentication control
		
		// SR 1.1
		StringDictionnary.put("1.1", "Human user identification and authentication");
		StringDictionnary.put("1.1.RE1", "Unique identification and authentication");
		StringDictionnary.put("1.1.RE2", "Multifactor authentication for untrusted networks");
		StringDictionnary.put("1.1.RE3", "Multifactor authentication for all networks");

		StringDictionnary.put("1.1C.RE2", "Multifactor authentication for all interfaces");
		
		// SR 1.2
		StringDictionnary.put("1.2", "Software process and device identification and authentication");
		StringDictionnary.put("1.2.RE1", "Unique identification and authentication");
		
		// SR 1.3
		StringDictionnary.put("1.3", "Account management");
		StringDictionnary.put("1.3.RE1", "Unified account management");
		
		// SR 1.4
		StringDictionnary.put("1.4", "Identifier management");
		
		// SR 1.5
		StringDictionnary.put("1.5", "Authenticator management");
		StringDictionnary.put("1.5.RE1", "Hardware security for software process identity credentials");
		
		StringDictionnary.put("1.5C.RE1", "Hardware security for authenticators");

		
		// SR 1.6
		StringDictionnary.put("1.6", "Wireless access management");
		StringDictionnary.put("1.6.RE1", "Unique identification and authentication");
		
		
		// SR 1.7
		StringDictionnary.put("1.7", "Strength of password-based authentication");
		StringDictionnary.put("1.7.RE1", "Password generation and lifetime restrictions for human users");
		StringDictionnary.put("1.7.RE2", "Password lifetime restrictions for all users");

		// SR 1.8
		StringDictionnary.put("1.8", "Public key infrastructure (PKI) certificates");
		
		// SR 1.9
		StringDictionnary.put("1.9", "Strength of public key authentication");
		StringDictionnary.put("1.9.RE1", "Hardware security for public key authentication");

		// SR 1.10
		StringDictionnary.put("1.10", "Authenticator feedback");

		// SR 1.11
		StringDictionnary.put("1.11", "Unsuccessful login attempts");
		
		// SR 1.12
		StringDictionnary.put("1.12", "System use notification");
		
		// SR 1.13
		StringDictionnary.put("1.13", "Access via untrusted networks");
		StringDictionnary.put("1.13.RE1", "Explicit access request approval");
		
		// CR 1.14
		StringDictionnary.put("1.14", "Strength of symmetric key-based authentication");
		StringDictionnary.put("1.14.RE1", "Hardware security for symmetric key-based authentication");

		// FR 2 – Use control
		
		// SR 2.1
		StringDictionnary.put("2.1", "Authorization enforcement");
		StringDictionnary.put("2.1.RE1", "Authorization enforcement for all users");
		StringDictionnary.put("2.1.RE2", "Permission mapping to roles");
		StringDictionnary.put("2.1.RE3", "Supervisor override");
		StringDictionnary.put("2.1.RE4", "Dual approval");
		
		// SR 2.2
		StringDictionnary.put("2.2", "Wireless use control");
		StringDictionnary.put("2.2.RE1", "Identify and report unauthorized wireless devices");

		// SR 2.3
		StringDictionnary.put("2.3", "Use control for portable and mobile devices");
		StringDictionnary.put("2.3.RE1", "Enforcement of security status of portable and mobile devices");

		// SR 2.4
		StringDictionnary.put("2.4", "Mobile code");
		StringDictionnary.put("2.4.RE1", "Mobile code integrity check");
		
		// SR 2.5
		StringDictionnary.put("2.5", "Session lock");
		
		// SR 2.6
		StringDictionnary.put("2.6", "Remote session termination");
		
		// SR 2.7
		StringDictionnary.put("2.7", "Concurrent session control");

		// SR 2.8
		StringDictionnary.put("2.8", "Auditable events");
		StringDictionnary.put("2.8.RE1", "Centrally managed, system-wide audit trail");
		
		// SR 2.9
		StringDictionnary.put("2.9", "Audit storage capacity");
		StringDictionnary.put("2.9.RE1", "Warn when audit record storage capacity threshold reached");
		
		// SR 2.10
		StringDictionnary.put("2.10", "Response to audit processing failures");
		
		// SR 2.11
		StringDictionnary.put("2.11", "Timestamps");
		StringDictionnary.put("2.11.RE1", "Time synchronization");
		StringDictionnary.put("2.11.RE2", "Protection of time source integrity");
		
		// SR 2.12
		StringDictionnary.put("2.12", "Non-repudiation");
		StringDictionnary.put("2.12.RE1", "Non-repudiation for all users");
		
		// CR 2.13
		StringDictionnary.put("2.13", "Use of physical diagnostic and test interfaces");
		StringDictionnary.put("2.13.RE1", "Active monitoring");
		
		
		// FR 3 – System integrity
		
		// SR 3.1
		StringDictionnary.put("3.1", "Communication integrity");
		StringDictionnary.put("3.1.RE1", "Cryptographic integrity protection");
		
		StringDictionnary.put("3.1C.RE1", "Communication authentication");

		// SR 3.2
		StringDictionnary.put("3.2", "Malicious code protection");
		StringDictionnary.put("3.2.RE1", "Malicious code protection on entry and exit points");
		StringDictionnary.put("3.2.RE2", "Central management and reporting for malicious code protection");

		StringDictionnary.put("3.2C.RE1", "Report version of code protection");
		// SR 3.3
		StringDictionnary.put("3.3", "Security functionality verification");
		StringDictionnary.put("3.3.RE1", "Automated mechanisms for security functionality verification");
		StringDictionnary.put("3.3.RE2", "Security functionality verification during normal operation");

		// SR 3.4
		StringDictionnary.put("3.4", "Software and information integrity");
		StringDictionnary.put("3.4.RE1", "Automated notification about integrity violations");
		StringDictionnary.put("3.4C.RE1", "Authenticity of software and information");
		StringDictionnary.put("3.4C.RE2", "Automated notification about integrity violations");

		// SR 3.5
		StringDictionnary.put("3.5", "Input validation");
		
		// SR 3.6
		StringDictionnary.put("3.6", "Deterministic output");
		
		// SR 3.7
		StringDictionnary.put("3.7", "Error handling");
		
		// SR 3.8
		StringDictionnary.put("3.8", "Session integrity");
		StringDictionnary.put("3.8.RE1", "Invalidation of session IDs after session termination");
		StringDictionnary.put("3.8.RE2", "Unique session ID generation");
		StringDictionnary.put("3.8.RE3", "Randomness of session IDs");
	
		// SR 3.9
		StringDictionnary.put("3.9", "Protection of audit information");
		StringDictionnary.put("3.9.RE1", "Audit records on write-once media");
		
		// CR 3.10
		StringDictionnary.put("3.10", "Support for updates");
		StringDictionnary.put("3.10.RE1", "Update authenticity and integrity");
		
		// CR 3.11
		StringDictionnary.put("3.11", "Physical tamper resistance and detection");
		StringDictionnary.put("3.11.RE1", "Notification of a tempering attempt");
		
		// CR 3.12
		StringDictionnary.put("3.12", "Provisioning product supplier roots of trust");
		
		// CR 3.13
		StringDictionnary.put("3.13", "Provisioning asset owner roots of trust");
		
		// CR 3.14
		StringDictionnary.put("3.14", "Integrity of the boot process");
		StringDictionnary.put("3.14.RE1", "Authenticity of the boot process");

		// FR 4 – Data confidentiality
		

		// SR 4.1
		StringDictionnary.put("4.1", "Information confidentiality");
		StringDictionnary.put("4.1.RE1", "Protection of confidentiality at rest or in transit via untrusted networks");
		StringDictionnary.put("4.1.RE2", "Protection of confidentiality across zone boundaries");

		// SR 4.2
		StringDictionnary.put("4.2", "Information persistence");
		StringDictionnary.put("4.2.RE1", "Purging of shared memory resources");
		StringDictionnary.put("4.2.RE2", "Erase verification");
		
		// SR 4.3
		StringDictionnary.put("4.3", "Use of cryptography");
		
		// FR 5 – Restricted data flow
		
		// SR 5.1
		StringDictionnary.put("5.1", "Network segmentation");
		StringDictionnary.put("5.1.RE1", "Physical network segmentation");
		StringDictionnary.put("5.1.RE2", "Independence from non-control system networks");
		StringDictionnary.put("5.1.RE3", "Logical and physical isolation of critical networks");

		// SR 5.2
		StringDictionnary.put("5.2", "Zone boundary protection");
		StringDictionnary.put("5.2.RE1", "Deny by default, allow by exception");
		StringDictionnary.put("5.2.RE2", "Island mode");
		StringDictionnary.put("5.2.RE3", "Fail close");
		
		// SR 5.3
		StringDictionnary.put("5.3", "General purpose person-to-person communication restrictions");
		StringDictionnary.put("5.3.RE1", "Prohibit all general purpose person-to-person communications");
		
		// SR 5.4
		StringDictionnary.put("5.4", "Application partitioning");
		
		// FR 6 - Timely response to events 
		
		// SR 6.1
		StringDictionnary.put("6.1", "Audit log accessibility");
		StringDictionnary.put("6.1.RE1", "Programmatic access to audit logs");
		
		// SR 6.2
		StringDictionnary.put("6.2", "Continuous monitoring");
		
		// FR 7 – Resource availability
		
		// SR 7.1
		StringDictionnary.put("7.1", "Denial of service protection");
		StringDictionnary.put("7.1.RE1", "Manage communication loads");
		StringDictionnary.put("7.1.RE2", "Limit DoS effects to other systems or networks");
		StringDictionnary.put("7.1C.RE1", "Manage communication loads from component");

		// SR 7.2
		StringDictionnary.put("7.2", "Resource management");
		
		// SR 7.3
		StringDictionnary.put("7.3", "Control system backup");
		StringDictionnary.put("7.3.RE1", "Backup verification");
		StringDictionnary.put("7.3.RE2", "Backup automation");
		StringDictionnary.put("7.3C.RE1", "Backup integrity verification");
		
		// SR 7.4
		StringDictionnary.put("7.4", "Control system recovery and reconstitution");

		// SR 7.5
		StringDictionnary.put("7.5", "Emergency power");
		
		// SR 7.6
		StringDictionnary.put("7.6", "Network and security configuration settings");
		StringDictionnary.put("7.6.RE1", "Machine-readable reporting of current security settings");
		
		// SR 7.7
		StringDictionnary.put("7.7", "Least functionality");
		
		// SR 7.8
		StringDictionnary.put("7.8", "Control system component inventory");

		
		
		
	}

	private static void securityRequirements(Zone z, FileWriter f) throws IOException {
		printIndent(f);
		f.write("***** Zone " + z.getName() + " *****\n");
		incrIndent();
		printIndent(f);
		f.write("Zone-wise requirements:\n");
		incrIndent();
		securityRequirements(z.getTarget(), f);
		decrIndent();

		f.write("\n");
		printIndent(f);
		f.write("Component-wise requirements:\n");
		incrIndent();
		for (Component c: z.getComponents()) {
			securityRequirements(f, c);
		}
		decrIndent();
		decrIndent();
		
	}

	private static void securityRequirements(FileWriter f, Component c) throws IOException {

		// For components, security requirements are to be implemented at the conception level.
		// Thus, they concern the capability
		
		SecurityLevels capability  = c.getCapability();
		
		if (c.getType() == Component.SYSTEM) {
			for (Device d: ((System)c).getDevices()) {
				securityRequirements(f,  d);
			}
		}
		else {
			int type;
			if (c.getType() == Component.APPLICATION) {
				type = SOFTWARE;
			}
			else {
				Device d = (Device) c;
				type = (d.isEmbedded() ? EMBEDDED : 0) | (d.isHost() ? HOST : 0)| (d.isNetwork() ? NETWORK : 0);
			}
			// Component not concerned by component-wise security measures
			if (type == 0) {
				return;
			}
			f.write("\n");
			printIndent(f);
			f.write("** Component " + c.getName() + " **\n");
			incrIndent();
			securityRequirements(capability, f, type);
			decrIndent();
			
		}
		
	}

	private static void securityRequirements(SecurityLevels sl, FileWriter f, int type) throws IOException {
		
		Integer[] securityLevels = {0,0,0,0,0,0,0};
		for (int i = 0; i <7; i++) {
			securityLevels[i] = sl.getSecurityLevel(i).getValue();
		}
		
		// Gives security requirements that needs to be implemented for each "fundamental requirement"
		securityRequirementsAuthentication(securityLevels[0], f, type);
		securityRequirementsUseControl(securityLevels[1], f, type);
		securityRequirementsSystemIntegrity(securityLevels[2], f, type);
		securityRequirementsDataConfidentiality(securityLevels[3], f, type);
		securityRequirementsRestrictedDataFlow(securityLevels[4], f, type);
		securityRequirementsTimelyResponse(securityLevels[5], f, type);
		securityRequirementsResourceAvailability(securityLevels[6], f, type);
	}



	private static void securityRequirementsAuthentication(int slevel, FileWriter f, int type) throws IOException {
		if (slevel >= 1) {
			printIndent(f);
			f.write("Recommendations regarding Identification and authentication control:\n");
			incrIndent();
			printSecurityRequirements(slevel, f, 0, type);
			f.write("\n");
			decrIndent();
		}
	}

	private static void securityRequirementsUseControl(int slevel, FileWriter f, int type) throws IOException {
		if (slevel >= 1) {
			printIndent(f);
			f.write("Recommendations regarding Use control:\n");
			incrIndent();
			printSecurityRequirements(slevel, f, 1, type);
			f.write("\n");
			decrIndent();
		}
		
	}

	private static void securityRequirementsSystemIntegrity(int slevel, FileWriter f, int type) throws IOException {
		if (slevel >= 1) {
			printIndent(f);
			f.write("Recommendations regarding System integrity:\n");
			incrIndent();
			printSecurityRequirements(slevel, f, 2, type);
			f.write("\n");
			decrIndent();
		}
		
	}

	private static void securityRequirementsDataConfidentiality(int slevel, FileWriter f, int type) throws IOException {
		if (slevel >= 1) {
			printIndent(f);
			f.write("Recommendations regarding Data confidentiality:\n");
			incrIndent();
			printSecurityRequirements(slevel, f, 3, type);
			f.write("\n");
			decrIndent();
		}
		
	}

	private static void securityRequirementsRestrictedDataFlow(int slevel, FileWriter f, int type) throws IOException {
		if (slevel >= 1) {
			printIndent(f);
			f.write("Recommendations regarding Restricted data flow:\n");
			incrIndent();
			printSecurityRequirements(slevel, f, 4, type);
			f.write("\n");
			decrIndent();
		}
		
	}

	private static void securityRequirementsTimelyResponse(int slevel, FileWriter f, int type) throws IOException {
		if (slevel >= 1) {
			printIndent(f);
			f.write("Recommendations regarding Timely response to events:\n");
			incrIndent();
			printSecurityRequirements(slevel, f, 5, type);
			f.write("\n");
			decrIndent();
		}
		
	}

	private static void securityRequirementsResourceAvailability(int slevel, FileWriter f, int type) throws IOException {
		if (slevel >= 1) {
			printIndent(f);
			f.write("Recommendations regarding Resource availability:\n");
			incrIndent();
			printSecurityRequirements(slevel, f, 6, type);
			f.write("\n");
			decrIndent();
		}
		
	}

	private static void securityRequirements(Conduit c, FileWriter f) throws IOException {
		f.write("\n");
		printIndent(f);
		f.write("***** Conduit " + c.getName() + " *****\n");
		incrIndent();
		printIndent(f);
		f.write("Conduit-wise requirements:\n");
		incrIndent();
		securityRequirements(c.getTarget(), f);
		decrIndent();
		
		f.write("\n");
		printIndent(f);
		f.write("Component-wise requirements:\n");
		incrIndent();
		for (Component c2: c.getComponents()) {
			securityRequirements(f, c2);
		}
		decrIndent();
		decrIndent();
		
	}

	private static void securityRequirements(SecurityLevels sl, FileWriter f) throws IOException {
		
		Integer[] securityLevels = {0,0,0,0,0,0,0};
		for (int i = 0; i <7; i++) {
			securityLevels[i] = sl.getSecurityLevel(i).getValue();
		}
		
		// Gives security requirements that needs to be implemented for each "fundamental requirement"
		securityRequirementsAuthentication(securityLevels[0], f, -1);
		securityRequirementsUseControl(securityLevels[1], f, -1);
		securityRequirementsSystemIntegrity(securityLevels[2], f, -1);
		securityRequirementsDataConfidentiality(securityLevels[3], f, -1);
		securityRequirementsRestrictedDataFlow(securityLevels[4], f, -1);
		securityRequirementsTimelyResponse(securityLevels[5], f, -1);
		securityRequirementsResourceAvailability(securityLevels[6], f, -1);
	}
	
	private static void printSecurityRequirements(int slevel, FileWriter f, int FR_NB, int type) throws IOException {
		// SR
		if (type == -1) {

			for (Pair p: sLevelToSR[FR_NB]) {
				if (p.Slevel <= slevel) {
					printIndent(f);
					if (p.name.contains("RE")) {
						f.write("\t");
					}
					else {
						f.write("- ");
					}
					try {
						f.write(StringDictionnary.get(p.name) + "\n");
					}
					catch (Exception e){
						java.lang.System.out.println("Failed to load security requirement "  + p.name);
						java.lang.System.exit(1);
					}
				}
			}
		}
		
		else {

			for (Triple p: sLevelToCR[FR_NB]) {
				if (p.Slevel <= slevel && (p.kind == 0 && type !=0 || (p.kind & type) != 0)) {
					printIndent(f);
					if (p.name.contains("RE")) {
						f.write("\t");
					}
					else {
						f.write("- ");
					}
					try {
						f.write(StringDictionnary.get(p.name) + "\n");
					}
					catch (Exception e){
						java.lang.System.out.println("Failed to load security requirement "  + p.name);
						java.lang.System.exit(1);
					}
				}
			}
		}
		
		
	}

	
	
	
	
}



