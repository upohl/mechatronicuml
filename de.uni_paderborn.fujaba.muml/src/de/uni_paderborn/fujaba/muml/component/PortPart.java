/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.protocol.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PortParts are contained in ComponentParts. They represent a 
 * port of a component in the part structure inside a structured component. 
 * PortParts are the endpoints for AssemblyConnectors and DelegationConnectors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getComponentPart <em>Component Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getCoordinationProtocolOccurence <em>Coordination Protocol Occurence</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getRefinedRole <em>Refined Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart()
 * @model
 * @generated
 */
public interface PortPart extends ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port of the component that is represented by this PortPart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(Port)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_PortType()
	 * @model required="true"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(Port value);

	/**
	 * Returns the value of the '<em><b>Component Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.ComponentPart#getPortParts <em>Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component part that contains this PortPart. The port reference by the 
	 * portType reference needs to be contained in the component that is referenced
	 * by this reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Part</em>' container reference.
	 * @see #setComponentPart(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_ComponentPart()
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPart#getPortParts
	 * @model opposite="portParts" required="true" transient="false"
	 * @generated
	 */
	ComponentPart getComponentPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getComponentPart <em>Component Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Part</em>' container reference.
	 * @see #getComponentPart()
	 * @generated
	 */
	void setComponentPart(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>Coordination Protocol Occurence</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart#getPortParts <em>Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Protocol Occurence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Protocol Occurence</em>' reference.
	 * @see #setCoordinationProtocolOccurence(CoordinationProtocolPart)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_CoordinationProtocolOccurence()
	 * @see de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart#getPortParts
	 * @model opposite="portParts"
	 * @generated
	 */
	CoordinationProtocolPart getCoordinationProtocolOccurence();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getCoordinationProtocolOccurence <em>Coordination Protocol Occurence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol Occurence</em>' reference.
	 * @see #getCoordinationProtocolOccurence()
	 * @generated
	 */
	void setCoordinationProtocolOccurence(CoordinationProtocolPart value);

	/**
	 * Returns the value of the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a coordination protocol that this partial instance of a port refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined Role</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_RefinedRole()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.portType.oclIsKindOf(DiscretePort)) then\r\nself.portType.oclAsType(DiscretePort).refinedRole\r\nelse\r\nnull\r\nendif'"
	 * @generated
	 */
	Role getRefinedRole();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the port type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_Name()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.name.oclIsUndefined() then\n\tnull\nelse\n\tportType.name\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PortPart
