/*
 * generated by Xtext
 */
package org.muml.reconfigurationverification.fotctl.xtext.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractFOTCTLJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/reconfigurationverification/fotctl/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/reconfigurationverification/tctl/1.0.0"));
		return result;
	}

}
