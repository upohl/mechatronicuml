/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import org.muml.pim.behavior.Variable;
import org.muml.pim.types.DataType;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Attribute2sf Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scAttribute2sfData#getScAttribute <em>Sc Attribute</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAttribute2sfData#getSfData <em>Sf Data</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAttribute2sfData#getScType <em>Sc Type</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAttribute2sfData#getScAttrType <em>Sc Attr Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAttribute2sfData()
 * @model
 * @generated
 */
public interface scAttribute2sfData extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Attribute</em>' reference.
	 * @see #setScAttribute(Variable)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAttribute2sfData_ScAttribute()
	 * @model
	 * @generated
	 */
	Variable getScAttribute();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAttribute2sfData#getScAttribute <em>Sc Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Attribute</em>' reference.
	 * @see #getScAttribute()
	 * @generated
	 */
	void setScAttribute(Variable value);

	/**
	 * Returns the value of the '<em><b>Sf Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Data</em>' reference.
	 * @see #setSfData(Data)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAttribute2sfData_SfData()
	 * @model
	 * @generated
	 */
	Data getSfData();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAttribute2sfData#getSfData <em>Sf Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Data</em>' reference.
	 * @see #getSfData()
	 * @generated
	 */
	void setSfData(Data value);

	/**
	 * Returns the value of the '<em><b>Sc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Type</em>' reference.
	 * @see #setScType(DataType)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAttribute2sfData_ScType()
	 * @model
	 * @generated
	 */
	DataType getScType();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAttribute2sfData#getScType <em>Sc Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Type</em>' reference.
	 * @see #getScType()
	 * @generated
	 */
	void setScType(DataType value);

	/**
	 * Returns the value of the '<em><b>Sc Attr Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Attr Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Attr Type</em>' reference.
	 * @see #setScAttrType(DataType)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAttribute2sfData_ScAttrType()
	 * @model
	 * @generated
	 */
	DataType getScAttrType();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAttribute2sfData#getScAttrType <em>Sc Attr Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Attr Type</em>' reference.
	 * @see #getScAttrType()
	 * @generated
	 */
	void setScAttrType(DataType value);

} // scAttribute2sfData
