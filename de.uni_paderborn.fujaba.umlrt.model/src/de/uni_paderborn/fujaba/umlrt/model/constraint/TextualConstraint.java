/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.constraint;

import org.storydriven.modeling.expressions.TextualExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint#getTextualExpression <em>Textual Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getTextualConstraint()
 * @model
 * @generated
 */
public interface TextualConstraint extends VerifiableConstraint {
	/**
	 * Returns the value of the '<em><b>Textual Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual Expression</em>' containment reference.
	 * @see #setTextualExpression(TextualExpression)
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getTextualConstraint_TextualExpression()
	 * @model containment="true"
	 * @generated
	 */
	TextualExpression getTextualExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint#getTextualExpression <em>Textual Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textual Expression</em>' containment reference.
	 * @see #getTextualExpression()
	 * @generated
	 */
	void setTextualExpression(TextualExpression value);

} // TextualConstraint
