/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractAPIMappingLanguageJavaValidator extends org.muml.pim.actionlanguage.xtext.validation.ActionLanguageJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/psm/portapimapping/0.4.0/"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/psm/0.4.0/"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/0.3.1"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/psm/apiexpressions/0.4.0/"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/behavior/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/actionlanguage/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/valuetype/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/common/0.3.1"));
		return result;
	}

}
