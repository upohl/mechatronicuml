/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.literals;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage#getLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Literal