/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiscretePortInstanceImpl extends PortInstanceImpl implements DiscretePortInstance {
	/**
	 * The cached setting delegate for the '{@link #getReceiverMessageTypes() <em>Receiver Message Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_MESSAGE_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getSenderMessageTypes() <em>Sender Message Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SENDER_MESSAGE_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES).getSettingDelegate();


	/**
	 * The cached setting delegate for the '{@link #getReceiverMessageBuffer() <em>Receiver Message Buffer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_MESSAGE_BUFFER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REFINES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_PORT_INSTANCE__REFINES).getSettingDelegate();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretePortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DISCRETE_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageType> getReceiverMessageTypes() {
		return (EList<MessageType>)RECEIVER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageType> getSenderMessageTypes() {
		return (EList<MessageType>)SENDER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageBuffer> getReceiverMessageBuffer() {
		return (EList<MessageBuffer>)RECEIVER_MESSAGE_BUFFER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRefines() {
		return (Role)REFINES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRefines() {
		return (Role)REFINES__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES:
				return getReceiverMessageTypes();
			case InstancePackage.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES:
				return getSenderMessageTypes();
			case InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
			case InstancePackage.DISCRETE_PORT_INSTANCE__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES:
				return RECEIVER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES:
				return SENDER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER:
				return RECEIVER_MESSAGE_BUFFER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.DISCRETE_PORT_INSTANCE__REFINES:
				return REFINES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //DiscretePortInstanceImpl
