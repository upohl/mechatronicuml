/*
 * generated by Xtext
 */
package org.muml.psm.api.apimappinglanguage.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractAPIMappingLanguageJavaValidator extends org.muml.pim.actionlanguage.xtext.validation.ActionLanguageJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/psm/portapimapping/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/psm/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/core/expressions/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/psm/apiexpressions/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pim/behavior/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pim/actionlanguage/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pim/valuetype/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/core/expressions/common/1.0.0"));
		return result;
	}

}
