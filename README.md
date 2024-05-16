# IEC62433-DSL

Instructions to open the IDE:
- (Install Java SE 19)
- Install Eclipse IDE for java and DSL developpers
- Install Eclipse DSL Tools
- Import the projects in XtextProject in the workspace, and run IECRuntimeModule (in org.xtext.IEC62443.mydsl)
- If you want to execute the reconfiguration application, add the following libraries to the project:
    - Graphstream Core and Swing UI
    - Ortools, including a native installation relevant to your system. 

The Xtext IDE should start, and .miec files created in it open the xtext textual editor.
Creating a repsentation file from such a file allows access to the sirius graphical editor.

XtextProject contains the DSL description.  
The source project is in org.xtext.IEC62433.baseModel  
The ecore model is found at model/custom/IEC.ecore, and can be visualized as a class diagram.
The grammar is found in miec.xtext

To regenerate the project, in the org.xtext.IEC62433 project:
    - Go to model/custom/MIEC.genmodel, right click, Generate Model code
    - right click src/org.xtext.IEC62433.baseModel/GenerateMiec.mwe2, and run it.



