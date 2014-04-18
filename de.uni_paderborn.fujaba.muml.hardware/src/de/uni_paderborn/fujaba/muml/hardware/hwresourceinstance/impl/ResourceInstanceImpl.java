/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceImpl#getHwports <em>Hwports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceImpl#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceInstanceImpl extends NamedElementImpl implements ResourceInstance {
	/**
	 * The cached value of the '{@link #getHwports() <em>Hwports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwports()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPort> hwports;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected Resource resourceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourceinstancePackage.Literals.RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPort> getHwports() {
		if (hwports == null) {
			hwports = new EObjectContainmentWithInverseEList<HWPort>(HWPort.class, this, HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS, HwresourcePackage.HW_PORT__PARENT_RESOURCE);
		}
		return hwports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResourceType() {
		if (resourceType != null && resourceType.eIsProxy()) {
			InternalEObject oldResourceType = (InternalEObject)resourceType;
			resourceType = (Resource)eResolveProxy(oldResourceType);
			if (resourceType != oldResourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwresourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE, oldResourceType, resourceType));
			}
		}
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(Resource newResourceType) {
		Resource oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE, oldResourceType, resourceType));
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHwports()).basicAdd(otherEnd, msgs);
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS:
				return ((InternalEList<?>)getHwports()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS:
				return getHwports();
			case HwresourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				if (resolve) return getResourceType();
				return basicGetResourceType();
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS:
				getHwports().clear();
				getHwports().addAll((Collection<? extends HWPort>)newValue);
				return;
			case HwresourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				setResourceType((Resource)newValue);
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS:
				getHwports().clear();
				return;
			case HwresourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				setResourceType((Resource)null);
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS:
				return hwports != null && !hwports.isEmpty();
			case HwresourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				return resourceType != null;
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
		if (baseClass == Resource.class) {
			switch (derivedFeatureID) {
				case HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS: return HwresourcePackage.RESOURCE__HWPORTS;
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
		if (baseClass == Resource.class) {
			switch (baseFeatureID) {
				case HwresourcePackage.RESOURCE__HWPORTS: return HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ResourceInstanceImpl
