/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionBlockDeclaration()
 * @model
 * @generated
 */
public interface FunctionBlockDeclaration extends AbstractFunctionBlockDeclaration {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionBlockDeclaration_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionBlockVariableDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(FunctionBlockBody)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionBlockDeclaration_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBlockBody getBody();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(FunctionBlockBody value);

} // FunctionBlockDeclaration