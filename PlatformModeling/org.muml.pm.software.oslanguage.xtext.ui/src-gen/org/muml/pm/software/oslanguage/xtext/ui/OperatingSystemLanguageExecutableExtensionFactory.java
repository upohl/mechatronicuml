/*
 * generated by Xtext
 */
package org.muml.pm.software.oslanguage.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.muml.pm.software.oslanguage.xtext.ui.internal.OperatingSystemLanguageActivator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OperatingSystemLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return OperatingSystemLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return OperatingSystemLanguageActivator.getInstance().getInjector(OperatingSystemLanguageActivator.ORG_MUML_PM_SOFTWARE_OSLANGUAGE_OPERATINGSYSTEMLANGUAGE);
	}
	
}