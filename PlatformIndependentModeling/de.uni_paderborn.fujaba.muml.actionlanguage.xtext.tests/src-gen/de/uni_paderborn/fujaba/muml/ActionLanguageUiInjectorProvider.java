/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ActionLanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator.getInstance().getInjector("de.uni_paderborn.fujaba.muml.ActionLanguage");
	}
	
}
