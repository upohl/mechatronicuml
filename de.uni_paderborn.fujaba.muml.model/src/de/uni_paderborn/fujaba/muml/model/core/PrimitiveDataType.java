/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This data type represents a primitive data type and refers to the PrimitiveDataType enumeration for specifying the concrete primitive type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.PrimitiveDataType#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The default value is <code>"PrimitiveTypes.VOID"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.core.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the primitive data type as defined by the PrimitiveDataType enumeration. It defines the actual type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.core.PrimitiveTypes
	 * @see #setPrimitiveType(PrimitiveTypes)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getPrimitiveDataType_PrimitiveType()
	 * @model default="PrimitiveTypes.VOID" required="true"
	 * @generated
	 */
	PrimitiveTypes getPrimitiveType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.PrimitiveDataType#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.core.PrimitiveTypes
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveTypes value);

} // PrimitiveDataType
