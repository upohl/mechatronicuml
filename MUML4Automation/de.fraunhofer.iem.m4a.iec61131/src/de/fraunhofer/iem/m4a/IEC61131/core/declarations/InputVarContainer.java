/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Var Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer#isRetain <em>Retain</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInputVarContainer()
 * @model
 * @generated
 */
public interface InputVarContainer extends IOVarDeclaration {
	/**
	 * Returns the value of the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retain</em>' attribute.
	 * @see #setRetain(boolean)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInputVarContainer_Retain()
	 * @model
	 * @generated
	 */
	boolean isRetain();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer#isRetain <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retain</em>' attribute.
	 * @see #isRetain()
	 * @generated
	 */
	void setRetain(boolean value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInputVarContainer_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputDeclaration> getDeclarations();

} // InputVarContainer
