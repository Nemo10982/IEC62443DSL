package MIEC.project.design;

import org.eclipse.emf.ecore.EObject;
import org.xtext.iec62443.baseModel.mIEC.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public Model reconfigure(Model self, Component arg) {
	self.reconfigureWithout(arg);
    return self;
    }
}
