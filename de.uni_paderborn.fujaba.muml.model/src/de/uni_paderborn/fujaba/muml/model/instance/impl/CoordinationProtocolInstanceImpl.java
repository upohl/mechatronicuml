/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Protocol Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl#getCoordinationProtocolOccurrence <em>Coordination Protocol Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationProtocolInstanceImpl extends NamedElementImpl implements CoordinationProtocolInstance {
	/**
	 * The cached value of the '{@link #getPortInstances() <em>Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> portInstances;

	/**
	 * The cached value of the '{@link #getCoordinationProtocolOccurrence() <em>Coordination Protocol Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocolOccurrence()
	 * @generated
	 * @ordered
	 */
	protected CoordinationProtocolOccurrence coordinationProtocolOccurrence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationProtocolInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COORDINATION_PROTOCOL_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getPortInstances() {
		if (portInstances == null) {
			portInstances = new EObjectResolvingEList<PortInstance>(PortInstance.class, this, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES);
		}
		return portInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOccurrence getCoordinationProtocolOccurrence() {
		if (coordinationProtocolOccurrence != null && coordinationProtocolOccurrence.eIsProxy()) {
			InternalEObject oldCoordinationProtocolOccurrence = (InternalEObject)coordinationProtocolOccurrence;
			coordinationProtocolOccurrence = (CoordinationProtocolOccurrence)eResolveProxy(oldCoordinationProtocolOccurrence);
			if (coordinationProtocolOccurrence != oldCoordinationProtocolOccurrence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE, oldCoordinationProtocolOccurrence, coordinationProtocolOccurrence));
			}
		}
		return coordinationProtocolOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOccurrence basicGetCoordinationProtocolOccurrence() {
		return coordinationProtocolOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationProtocolOccurrence(CoordinationProtocolOccurrence newCoordinationProtocolOccurrence) {
		CoordinationProtocolOccurrence oldCoordinationProtocolOccurrence = coordinationProtocolOccurrence;
		coordinationProtocolOccurrence = newCoordinationProtocolOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE, oldCoordinationProtocolOccurrence, coordinationProtocolOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				return getPortInstances();
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				if (resolve) return getCoordinationProtocolOccurrence();
				return basicGetCoordinationProtocolOccurrence();
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				getPortInstances().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				setCoordinationProtocolOccurrence((CoordinationProtocolOccurrence)newValue);
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				return;
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				setCoordinationProtocolOccurrence((CoordinationProtocolOccurrence)null);
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				return coordinationProtocolOccurrence != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationProtocolInstanceImpl
