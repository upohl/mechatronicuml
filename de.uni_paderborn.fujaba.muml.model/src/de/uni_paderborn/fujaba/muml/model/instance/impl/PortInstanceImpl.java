/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getBehaviorInstance <em>Behavior Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getBehavioralElementType <em>Behavioral Element Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getIncomingConnectorInstances <em>Incoming Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getOutgoingConnectorInstances <em>Outgoing Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl#getConnectorInstances <em>Connector Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortInstanceImpl extends NamedElementImpl implements PortInstance {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviorInstance() <em>Behavior Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorInstance> behaviorInstance;

	/**
	 * The cached value of the '{@link #getBehavioralElementType() <em>Behavioral Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElementType()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behavioralElementType;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected Port portType;

	/**
	 * The cached value of the '{@link #getIncomingConnectorInstances() <em>Incoming Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> incomingConnectorInstances;

	/**
	 * The cached value of the '{@link #getOutgoingConnectorInstances() <em>Outgoing Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> outgoingConnectorInstances;

	/**
	 * The cached setting delegate for the '{@link #getConnectorInstances() <em>Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTOR_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.PORT_INSTANCE__CONNECTOR_INSTANCES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PortInstanceImpl() {
		super();

//		// Install a notification adapter that informs the
//		// requiredMessageInterfaceDerived-reference, whenever one of the dependent
//		// features
//		// was modified
//		DerivedAttributeAdapter requiredMessageInterfaceDerived = new DerivedAttributeAdapter(
//				this,
//				InstancePackage.Literals.PORT_INSTANCE__SENDER_MESSAGE_INTERFACE);
//		requiredMessageInterfaceDerived.addNavigatedDependency(
//				InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE,
//				ComponentPackage.Literals.PORT__SENDER_MESSAGE_INTERFACE);
//
//		// Install a notification adapter that informs the
//		// providedMessageInterfaceDerived-reference, whenever one of the dependent
//		// features
//		// was modified
//		DerivedAttributeAdapter providedMessageInterfaceDerived = new DerivedAttributeAdapter(
//				this,
//				InstancePackage.Literals.PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE);
//		providedMessageInterfaceDerived.addNavigatedDependency(
//				InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE,
//				ComponentPackage.Literals.PORT__RECEIVER_MESSAGE_INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorInstance> getBehaviorInstance() {
		if (behaviorInstance == null) {
			behaviorInstance = new EObjectContainmentWithInverseEList<BehaviorInstance>(BehaviorInstance.class, this, InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE, InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE);
		}
		return behaviorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement getBehavioralElementType() {
		if (behavioralElementType != null && behavioralElementType.eIsProxy()) {
			InternalEObject oldBehavioralElementType = (InternalEObject)behavioralElementType;
			behavioralElementType = (BehavioralElement)eResolveProxy(oldBehavioralElementType);
			if (behavioralElementType != oldBehavioralElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
			}
		}
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement basicGetBehavioralElementType() {
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElementType(BehavioralElement newBehavioralElementType) {
		BehavioralElement oldBehavioralElementType = behavioralElementType;
		behavioralElementType = newBehavioralElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortType() {
		if (portType != null && portType.eIsProxy()) {
			InternalEObject oldPortType = (InternalEObject)portType;
			portType = (Port)eResolveProxy(oldPortType);
			if (portType != oldPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.PORT_INSTANCE__PORT_TYPE, oldPortType, portType));
			}
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(Port newPortType) {
		Port oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (eContainerFeatureID() != InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE) return null;
		return (ComponentInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstance(ComponentInstance newComponentInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentInstance, InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		if (newComponentInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE && newComponentInstance != null)) {
			if (EcoreUtil.isAncestor(this, newComponentInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentInstance != null)
				msgs = ((InternalEObject)newComponentInstance).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES, ComponentInstance.class, msgs);
			msgs = basicSetComponentInstance(newComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE, newComponentInstance, newComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getIncomingConnectorInstances() {
		if (incomingConnectorInstances == null) {
			incomingConnectorInstances = new EObjectWithInverseResolvingEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, InstancePackage.CONNECTOR_INSTANCE__TARGET);
		}
		return incomingConnectorInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getOutgoingConnectorInstances() {
		if (outgoingConnectorInstances == null) {
			outgoingConnectorInstances = new EObjectWithInverseResolvingEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, InstancePackage.CONNECTOR_INSTANCE__SOURCE);
		}
		return outgoingConnectorInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectorInstance> getConnectorInstances() {
		return (EList<ConnectorInstance>)CONNECTOR_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehaviorInstance()).basicAdd(otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentInstance((ComponentInstance)otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnectorInstances()).basicAdd(otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnectorInstances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE:
				return ((InternalEList<?>)getBehaviorInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return basicSetComponentInstance(null, msgs);
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getIncomingConnectorInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getOutgoingConnectorInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES, ComponentInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.PORT_INSTANCE__COMMENT:
				return getComment();
			case InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE:
				return getBehaviorInstance();
			case InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				if (resolve) return getBehavioralElementType();
				return basicGetBehavioralElementType();
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance();
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return getIncomingConnectorInstances();
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return getOutgoingConnectorInstances();
			case InstancePackage.PORT_INSTANCE__CONNECTOR_INSTANCES:
				return getConnectorInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancePackage.PORT_INSTANCE__COMMENT:
				setComment((String)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE:
				getBehaviorInstance().clear();
				getBehaviorInstance().addAll((Collection<? extends BehaviorInstance>)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				setPortType((Port)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				getIncomingConnectorInstances().clear();
				getIncomingConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				getOutgoingConnectorInstances().clear();
				getOutgoingConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case InstancePackage.PORT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				getConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstancePackage.PORT_INSTANCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE:
				getBehaviorInstance().clear();
				return;
			case InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)null);
				return;
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				setPortType((Port)null);
				return;
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				getIncomingConnectorInstances().clear();
				return;
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				getOutgoingConnectorInstances().clear();
				return;
			case InstancePackage.PORT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.PORT_INSTANCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE:
				return behaviorInstance != null && !behaviorInstance.isEmpty();
			case InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				return behavioralElementType != null;
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				return portType != null;
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance() != null;
			case InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES:
				return incomingConnectorInstances != null && !incomingConnectorInstances.isEmpty();
			case InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES:
				return outgoingConnectorInstances != null && !outgoingConnectorInstances.isEmpty();
			case InstancePackage.PORT_INSTANCE__CONNECTOR_INSTANCES:
				return CONNECTOR_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case InstancePackage.PORT_INSTANCE__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == BehavioralElementInstance.class) {
			switch (derivedFeatureID) {
				case InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE: return InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE;
				case InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return InstancePackage.PORT_INSTANCE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == BehavioralElementInstance.class) {
			switch (baseFeatureID) {
				case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE: return InstancePackage.PORT_INSTANCE__BEHAVIOR_INSTANCE;
				case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.PORT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //PortInstanceImpl
