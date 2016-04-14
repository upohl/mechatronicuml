/**
 */
package platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.pim.types.impl.DataTypeImpl;

import platform.EnumerationDataType;
import platform.EnumerationValue;
import platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.EnumerationDataTypeImpl#getEnumerationValues <em>Enumeration Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationDataTypeImpl extends DataTypeImpl implements EnumerationDataType {
	/**
	 * The cached value of the '{@link #getEnumerationValues() <em>Enumeration Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationValue> enumerationValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.ENUMERATION_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationValue> getEnumerationValues() {
		if (enumerationValues == null) {
			enumerationValues = new EObjectContainmentWithInverseEList<EnumerationValue>(EnumerationValue.class, this, PlatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES, PlatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE);
		}
		return enumerationValues;
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
			case PlatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerationValues()).basicAdd(otherEnd, msgs);
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
			case PlatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES:
				return ((InternalEList<?>)getEnumerationValues()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES:
				return getEnumerationValues();
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
			case PlatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES:
				getEnumerationValues().clear();
				getEnumerationValues().addAll((Collection<? extends EnumerationValue>)newValue);
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
			case PlatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES:
				getEnumerationValues().clear();
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
			case PlatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES:
				return enumerationValues != null && !enumerationValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationDataTypeImpl