/*
* generated by Xtext
*/
package org.muml.psm.api.apimappinglanguage.xtext;

import org.muml.psm.api.apimappinglanguage.xtext.APIMappingLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class APIMappingLanguageStandaloneSetup extends APIMappingLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new APIMappingLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
