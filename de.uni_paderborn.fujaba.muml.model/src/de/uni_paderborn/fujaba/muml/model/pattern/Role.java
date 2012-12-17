/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a role of a coordination pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getIncomingRoleConnector <em>Incoming Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getPort <em>Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getOutgoingRoleConnector <em>Outgoing Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#isIsMultiRole <em>Is Multi Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MultiPortRequiresDefinedOrder RoleHasConnector RoleRequiresBehavior RoleRequiresInterface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MultiPortRequiresDefinedOrder='self.ordered implies (self.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity)' OrderedRequiresIntegerOrderVariable='self.ordered implies (self.orderVariable->notEmpty() implies self.orderVariable.eAttributeType =\'EInt\')' RoleHasConnector='self.incomingRoleConnector->notEmpty() or self.outgoingRoleConnector->notEmpty()' RoleRequiresBehavior='not self.behavior.oclIsUndefined()' RoleRequiresInterface='not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined())'"
 * @generated
 */
public interface Role extends DiscreteInteractionEndpoint, DataType {
	/**
	 * Returns the value of the '<em><b>Incoming Role Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incoming RoleConnector, which connects this role with another role.
	 * Either incomingRoleConnector or outgoingRoleConnector (or both) must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Role Connector</em>' reference.
	 * @see #setIncomingRoleConnector(RoleConnector)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_IncomingRoleConnector()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	RoleConnector getIncomingRoleConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getIncomingRoleConnector <em>Incoming Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Role Connector</em>' reference.
	 * @see #getIncomingRoleConnector()
	 * @generated
	 */
	void setIncomingRoleConnector(RoleConnector value);

	/**
	 * Returns the value of the '<em><b>Role Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Connector</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_RoleConnector()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.incomingConnector -> notEmpty() then\r\n\tself.incomingConnector\r\nelse\r\n\tself.outgoingConnector\r\nendif'"
	 * @generated
	 */
	RoleConnector getRoleConnector();

	/**
	 * Returns the value of the '<em><b>Is Multi Role</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the role is a multi role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Multi Role</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_IsMultiRole()
	 * @model default="" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif'"
	 * @generated
	 */
	boolean isIsMultiRole();

	/**
	 * Returns the value of the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Buffer</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_ReceiverMessageBuffer()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getRole
	 * @model opposite="role" containment="true"
	 * @generated
	 */
	EList<MessageBuffer> getReceiverMessageBuffer();

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern this role belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_CoordinationPattern()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern <em>Coordination Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A role has a cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports this role is assigned to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_Port()
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines
	 * @model opposite="refines"
	 * @generated
	 */
	EList<DiscretePort> getPort();

	/**
	 * Returns the value of the '<em><b>Outgoing Role Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Role Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing RoleConnector, which connects this role with another role.
	 * Either incomingRoleConnector or outgoingRoleConnector (or both) must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Role Connector</em>' reference.
	 * @see #setOutgoingRoleConnector(RoleConnector)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_OutgoingRoleConnector()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource
	 * @model opposite="source"
	 * @generated
	 */
	RoleConnector getOutgoingRoleConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getOutgoingRoleConnector <em>Outgoing Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Role Connector</em>' reference.
	 * @see #getOutgoingRoleConnector()
	 * @generated
	 */
	void setOutgoingRoleConnector(RoleConnector value);

} // Role
