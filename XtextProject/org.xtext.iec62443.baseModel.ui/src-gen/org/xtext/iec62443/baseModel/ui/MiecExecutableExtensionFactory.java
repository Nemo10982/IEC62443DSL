/*
 * generated by Xtext 2.32.0
 */
package org.xtext.iec62443.baseModel.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.iec62443.baseModel.ui.internal.BaseModelActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MiecExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(BaseModelActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		BaseModelActivator activator = BaseModelActivator.getInstance();
		return activator != null ? activator.getInjector(BaseModelActivator.ORG_XTEXT_IEC62443_BASEMODEL_MIEC) : null;
	}

}
