/*
* generated by Xtext
*/
package de.uni_paderborn.uppaal;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class UppaalXMLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.uni_paderborn.uppaal.ui.internal.UppaalXMLActivator.getInstance().getInjector("de.uni_paderborn.uppaal.UppaalXML");
	}
	
}
