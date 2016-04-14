/*
 * generated by Xtext
 */
package org.muml.graphviz.dot.xtext;

import org.muml.graphviz.dot.xtext.conversion.DotIDValueConverter;
import org.muml.graphviz.dot.xtext.service.DotLanguageValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DotLanguageRuntimeModule extends org.muml.graphviz.dot.xtext.AbstractDotLanguageRuntimeModule {
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return DotLanguageValueConverterService.class;
	}
	
	public Class<? extends DotIDValueConverter> bindDOTSTRINGValueConverter() {
		return DotIDValueConverter.class;
	}
}