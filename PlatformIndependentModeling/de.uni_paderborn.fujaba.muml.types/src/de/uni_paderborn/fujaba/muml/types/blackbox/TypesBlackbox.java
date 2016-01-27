package de.uni_paderborn.fujaba.muml.types.blackbox;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;

public class TypesBlackbox {
	
	public static URI PREDEFINED_TYPES_URI = URI
			.createURI("platform:/plugin/de.uni_paderborn.fujaba.muml.types/model/predefined.mumltypes");

	/**
	 * Find Predefined Type with specified name by loading the predefined types
	 * Resource within the correct ResourceSet.
	 * 
	 * The ResourceSet is selected using the specified
	 * <code>searchElements</code>.
	 * 
	 * This helper is used in the "PredefinedTypesLibrary.qvto" Library.
	 * 
	 * @param searchElements
	 *            The elements to find the ResourceSet, in which the predefined
	 *            types Resource is loaded (normally the complete transformation
	 *            input can be specified).
	 * @param name
	 *            The name of the Predefined Type to find.
	 * @return The found Predefined Type, or <code>null</code> if none was
	 *         found.
	 * 
	 * @throws IllegalArgumentException
	 *             If searchElements are contained in either multiple
	 *             ResourceSets or not in any ResourceSet at all. Please make
	 *             sure that all searchElements are contained in exactly one
	 *             ResourceSet.
	 *             Also thrown, if <code>searchElements</code> is empty.
	 * 
	 */
	public static PrimitiveDataType findPredefinedType(List<Object> searchElements, String name)
			throws IllegalArgumentException {
		Assert.isLegal(!searchElements.isEmpty(), "[Predefined Types] Make sure that you have a non-empty input to be able to load Predefined Types.");
			
		ResourceSet resourceSet = null;

		for (Object object : searchElements) {
			if (object instanceof EObject) {
				EObject element = (EObject) object;
				if (element.eResource() != null && element.eResource().getResourceSet() != null) {
					Assert.isLegal(resourceSet == null || resourceSet == element.eResource().getResourceSet(),
							"[Predefined Types] Transformation Input must only consist of one ResourceSet.");
					resourceSet = element.eResource().getResourceSet();
				}
			}
		}

		Assert.isLegal(resourceSet != null,
				"[Predefined Types] Transformation Input must be contained in ResourceSet.");

		Resource resource = resourceSet.getResource(
				URI.createURI("platform:/plugin/de.uni_paderborn.fujaba.muml.types/model/predefined.mumltypes"), true);

		// This relies on the fact that the unique-identifier in the xmi file is equal to the name.
		// Please ensure this is always the case in de.uni_paderborn.fujaba.muml.types/model/predefined.mumltypes.
		return (PrimitiveDataType) resource.getEObject(name);
	}

}
