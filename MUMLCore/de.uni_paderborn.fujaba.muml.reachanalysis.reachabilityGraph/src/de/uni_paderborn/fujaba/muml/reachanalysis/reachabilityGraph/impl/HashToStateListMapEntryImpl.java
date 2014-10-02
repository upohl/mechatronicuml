/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateList;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hash To State List Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.impl.HashToStateListMapEntryImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.impl.HashToStateListMapEntryImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HashToStateListMapEntryImpl extends EObjectImpl implements BasicEMap.Entry<Long,HashToStateList> {
	/**
	 * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected static final Long KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected Long key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected HashToStateList value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashToStateListMapEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReachabilityGraphPackage.Literals.HASH_TO_STATE_LIST_MAP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(Long newKey) {
		Long oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashToStateList getTypedValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (HashToStateList)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashToStateList basicGetTypedValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(HashToStateList newValue) {
		HashToStateList oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__KEY:
				return getTypedKey();
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__VALUE:
				if (resolve) return getTypedValue();
				return basicGetTypedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__KEY:
				setTypedKey((Long)newValue);
				return;
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__VALUE:
				setTypedValue((HashToStateList)newValue);
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
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__KEY:
				setTypedKey(KEY_EDEFAULT);
				return;
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__VALUE:
				setTypedValue((HashToStateList)null);
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
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Long key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashToStateList getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashToStateList setValue(HashToStateList value) {
		HashToStateList oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<Long, HashToStateList> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<Long, HashToStateList>)container.eGet(eContainmentFeature());
	}

} //HashToStateListMapEntryImpl
