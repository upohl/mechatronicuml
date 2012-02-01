/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector. Assembly connectors connect the port parts of two component parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getTo <em>To</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getFrom <em>From</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getToDiscretePort <em>To Discrete Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getFromDiscretePort <em>From Discrete Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoSelfAssembliesForSinglePorts ValidContinuousPortDirections AssemblyBetweenDiscretePortsRequiresCoordinationPattern AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern AssemblyBetweenDiscretePortsRequiresDifferentRoles AssemblyBetweenDiscretePortsSameMessageInterfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoSelfAssembliesForSinglePorts='self.fromPort.cardinality.upperBound.value <= 1\r\nimplies\r\nself.fromPort <> self.toPort' ValidContinuousPortDirections='not self.fromPort.oclIsUndefined() and self.fromPort.oclIsKindOf(component::ContinuousPort) and\nnot self.toPort.oclIsUndefined() and self.toPort.oclIsKindOf(component::ContinuousPort)\nimplies\nself.fromPort.oclAsType(component::ContinuousPort).kind <> self.toPort.oclAsType(component::ContinuousPort).kind' AssemblyBetweenDiscretePortsRequiresCoordinationPattern='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- assembly between two discrete ports requires a coordination pattern\n\tnot self.coordinationPattern.oclIsUndefined()\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same pattern\n\t\tself.fromDiscretePort.refines.coordinationPattern = self.toDiscretePort.refines.coordinationPattern\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsRequiresDifferentRoles='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have different roles (unless the pattern has only one role)\n\t\t(self.fromDiscretePort.refines.coordinationPattern.roles->size() = 2 implies (self.fromDiscretePort.refines.name <> self.toDiscretePort.refines.name))\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsSameMessageInterfaces='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- message interfaces must be compatible\n\tself.fromDiscretePort.senderMessageInterface = self.toDiscretePort.receiverMessageInterface\n\tand\n\tself.fromDiscretePort.receiverMessageInterface = self.toDiscretePort.senderMessageInterface\nelse\n\ttrue\nendif'"
 * @generated
 */
public interface Assembly extends BehavioralConnector {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getToRev <em>To Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component part of the port part to which this assembly leads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_To()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getToRev
	 * @model opposite="toRev" required="true"
	 * @generated
	 */
	ComponentPart getTo();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getFromRev <em>From Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component part of the port part from which this assembly originates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_From()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getFromRev
	 * @model opposite="fromRev" required="true"
	 * @generated
	 */
	ComponentPart getFrom();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern that defines the protocol of this assembly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_CoordinationPattern()
	 * @model required="true"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getCoordinationPattern <em>Coordination Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

	/**
	 * Returns the value of the '<em><b>To Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the toPort as a DiscretePort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Discrete Port</em>' reference.
	 * @see #setToDiscretePort(DiscretePort)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_ToDiscretePort()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.toPort.oclIsUndefined() and self.toPort.oclIsKindOf(component::DiscretePort) then\n\tself.toPort.oclAsType(component::DiscretePort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	DiscretePort getToDiscretePort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getToDiscretePort <em>To Discrete Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Discrete Port</em>' reference.
	 * @see #getToDiscretePort()
	 * @generated
	 */
	void setToDiscretePort(DiscretePort value);

	/**
	 * Returns the value of the '<em><b>From Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the fromPort as a DiscretePort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Discrete Port</em>' reference.
	 * @see #setFromDiscretePort(DiscretePort)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_FromDiscretePort()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.fromPort.oclIsUndefined() and self.toPort.oclIsKindOf(component::DiscretePort) then\n\tself.fromPort.oclAsType(component::DiscretePort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	DiscretePort getFromDiscretePort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getFromDiscretePort <em>From Discrete Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Discrete Port</em>' reference.
	 * @see #getFromDiscretePort()
	 * @generated
	 */
	void setFromDiscretePort(DiscretePort value);

} // Assembly
