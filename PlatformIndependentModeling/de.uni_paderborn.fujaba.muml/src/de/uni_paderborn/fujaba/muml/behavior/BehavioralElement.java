/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all elements that have a behavior.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.behavior.BehavioralElement#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage#getBehavioralElement()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.behavior.Behavior#getBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior of this behavioral element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage#getBehavioralElement_Behavior()
	 * @see de.uni_paderborn.fujaba.muml.behavior.Behavior#getBehavioralElement
	 * @model opposite="behavioralElement"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.behavior.BehavioralElement#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // BehavioralElement
