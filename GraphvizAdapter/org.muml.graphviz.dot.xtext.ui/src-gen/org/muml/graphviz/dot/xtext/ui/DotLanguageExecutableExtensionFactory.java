/*
 * generated by Xtext
 */
package org.muml.graphviz.dot.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.muml.graphviz.dot.xtext.ui.internal.DotLanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DotLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DotLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DotLanguageActivator.getInstance().getInjector(DotLanguageActivator.ORG_MUML_GRAPHVIZ_DOT_XTEXT_DOTLANGUAGE);
	}
	
}