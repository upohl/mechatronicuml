/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.storydriven.core.CommentableElement;

import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each ManagerSpecificationEntry defines the reaction of the manager to a reconfiguration message which has either been sent by an embedded child or which is received from the executor as part of a hierarchical reconfiguration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isTreat <em>Treat</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isPropagate <em>Propagate</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getStructuralCondition <em>Structural Condition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isInvokePlanner <em>Invoke Planner</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getTimeForPlanning <em>Time For Planning</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isBlockable <em>Blockable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NotTreatAndPropagate InvokePlannerOnlyForTreatedMessage TimeForPlanningRequiresToInvokePlanner OnlyBlockTreatedMessage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NotTreatAndPropagate='not(self.treat and self.propagate)' InvokePlannerOnlyForTreatedMessage='self.invokePlanner implies self.treat' TimeForPlanningRequiresToInvokePlanner='(not self.timeForPlanning.oclIsUndefined()) implies self.invokePlanner' OnlyBlockTreatedMessage='self.blockable implies self.treat'"
 * @generated
 */
public interface ManagerSpecificationEntry extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Treat</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treat</em>' attribute.
	 * @see #setTreat(boolean)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Treat()
	 * @model default="true"
	 * @generated
	 */
	boolean isTreat();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isTreat <em>Treat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treat</em>' attribute.
	 * @see #isTreat()
	 * @generated
	 */
	void setTreat(boolean value);

	/**
	 * Returns the value of the '<em><b>Propagate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagate</em>' attribute.
	 * @see #setPropagate(boolean)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Propagate()
	 * @model default="false"
	 * @generated
	 */
	boolean isPropagate();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isPropagate <em>Propagate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagate</em>' attribute.
	 * @see #isPropagate()
	 * @generated
	 */
	void setPropagate(boolean value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' container reference.
	 * @see #setManager(Manager)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Manager()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getSpecificationEntries
	 * @model opposite="specificationEntries" required="true" transient="false"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' container reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_MessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Structural Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Condition</em>' reference.
	 * @see #setStructuralCondition(StructuralCondition)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_StructuralCondition()
	 * @model
	 * @generated
	 */
	StructuralCondition getStructuralCondition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getStructuralCondition <em>Structural Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Condition</em>' reference.
	 * @see #getStructuralCondition()
	 * @generated
	 */
	void setStructuralCondition(StructuralCondition value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #setReconfigurationRule(ReconfigurationRule)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_ReconfigurationRule()
	 * @model
	 * @generated
	 */
	ReconfigurationRule getReconfigurationRule();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	void setReconfigurationRule(ReconfigurationRule value);

	/**
	 * Returns the value of the '<em><b>Invoke Planner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoke Planner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Planner</em>' attribute.
	 * @see #setInvokePlanner(boolean)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_InvokePlanner()
	 * @model
	 * @generated
	 */
	boolean isInvokePlanner();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isInvokePlanner <em>Invoke Planner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Planner</em>' attribute.
	 * @see #isInvokePlanner()
	 * @generated
	 */
	void setInvokePlanner(boolean value);

	/**
	 * Returns the value of the '<em><b>Time For Planning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Planning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time For Planning</em>' containment reference.
	 * @see #setTimeForPlanning(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_TimeForPlanning()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getTimeForPlanning();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getTimeForPlanning <em>Time For Planning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Planning</em>' containment reference.
	 * @see #getTimeForPlanning()
	 * @generated
	 */
	void setTimeForPlanning(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Blockable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockable</em>' attribute.
	 * @see #setBlockable(boolean)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Blockable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBlockable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isBlockable <em>Blockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockable</em>' attribute.
	 * @see #isBlockable()
	 * @generated
	 */
	void setBlockable(boolean value);

} // ManagerSpecificationEntry
