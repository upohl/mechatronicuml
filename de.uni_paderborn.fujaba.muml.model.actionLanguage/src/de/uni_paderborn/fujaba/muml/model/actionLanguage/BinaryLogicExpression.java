/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Logic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents binary, logic expressions like a AND b and a OR b.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getBinaryLogicExpression()
 * @model
 * @generated
 */
public interface BinaryLogicExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the expression's logic operator, e.g. AND, OR, or XOR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator
	 * @see #setOperator(LogicOperator)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getBinaryLogicExpression_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogicOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicOperator value);

} // BinaryLogicExpression
