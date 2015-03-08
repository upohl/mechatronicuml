/**
 */
package de.uni_paderborn.uppaal.templates;

import de.uni_paderborn.uppaal.core.NamedElement;

import de.uni_paderborn.uppaal.declarations.ParameterContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for ordinary timed automata templates as well as redefined templates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.templates.AbstractTemplate#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.templates.TemplatesPackage#getAbstractTemplate()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueParameterNames='self.parameter->collect(elements)->collect(oclAsType(core::NamedElement))->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames'"
 * @generated
 */
public interface AbstractTemplate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.uppaal.declarations.ParameterContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter declarations of the template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see de.uni_paderborn.uppaal.templates.TemplatesPackage#getAbstractTemplate_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterContainer> getParameter();

} // AbstractTemplate
