/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Misc Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.MiscBlock#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getMiscBlock()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL mustHaveType='not self.type.oclIsUndefined()'"
 * @generated
 */
public interface MiscBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getMiscBlock_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.MiscBlock#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // MiscBlock
