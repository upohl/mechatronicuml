/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getHwPortType <em>Hw Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getConnectedNetworkConnectorInstances <em>Connected Network Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#isIsNetworkInterface <em>Is Network Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance()
 * @model
 * @generated
 */
public interface HWPortInstance extends ConnectorEndpointInstance, HWPort {
	/**
	 * Returns the value of the '<em><b>Hw Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstance from which this HWPortPart is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hw Port Type</em>' reference.
	 * @see #setHwPortType(CommunicationResource)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_HwPortType()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.type.oclIsUndefined()) then\n\tnull\nelse\n\tself.type.oclAsType(hwplatform::HWPortPart).communicationResource\nendif'"
	 * @generated
	 */
	CommunicationResource getHwPortType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getHwPortType <em>Hw Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Port Type</em>' reference.
	 * @see #getHwPortType()
	 * @generated
	 */
	void setHwPortType(CommunicationResource value);

	/**
	 * Returns the value of the '<em><b>Connected Network Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication media to which this HWPortPart is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Network Connector Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_ConnectedNetworkConnectorInstances()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorInstances->select(c|c.oclIsKindOf(NetworkConnectorInstance)).oclAsType(NetworkConnectorInstance)->asOrderedSet()'"
	 * @generated
	 */
	EList<NetworkConnectorInstance> getConnectedNetworkConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used protocol of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_Protocol()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.hwPortType.oclIsUndefined()) then\n\tnull \nelse\n self.hwPortType.protocol\n endif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this HWPort is  a bus or a link port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind
	 * @see #setPortKind(CommunicationKind)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_PortKind()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.hwPortType.oclIsUndefined()) then\r\n hwresource::CommunicationKind::BUS\r\nelse\r\n self.hwPortType.portKind\r\nendif\r\n'"
	 * @generated
	 */
	CommunicationKind getPortKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(CommunicationKind value);

	/**
	 * Returns the value of the '<em><b>Is Network Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Network Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Network Interface</em>' attribute.
	 * @see #setIsNetworkInterface(boolean)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_IsNetworkInterface()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.protocol.oclIsUndefined()) then\n\tfalse\nelse self.protocol.isNetworkingProtocol\nendif'"
	 * @generated
	 */
	boolean isIsNetworkInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#isIsNetworkInterface <em>Is Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Network Interface</em>' attribute.
	 * @see #isIsNetworkInterface()
	 * @generated
	 */
	void setIsNetworkInterface(boolean value);

} // HWPortInstance
