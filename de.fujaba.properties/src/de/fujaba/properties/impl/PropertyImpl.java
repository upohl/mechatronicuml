/**
 */
package de.fujaba.properties.impl;

import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;
import de.fujaba.properties.PropertyCategory;
import de.fujaba.properties.PropertyEditor;
import de.fujaba.properties.PropertyFilter;
import de.fujaba.properties.PropertyTab;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fujaba.properties.impl.PropertyImpl#getGenFeature <em>Gen Feature</em>}</li>
 *   <li>{@link de.fujaba.properties.impl.PropertyImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link de.fujaba.properties.impl.PropertyImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link de.fujaba.properties.impl.PropertyImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link de.fujaba.properties.impl.PropertyImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link de.fujaba.properties.impl.PropertyImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The cached value of the '{@link #getGenFeature() <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature genFeature;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyFilter> filters;

	/**
	 * The cached value of the '{@link #getTab() <em>Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTab()
	 * @generated
	 * @ordered
	 */
	protected PropertyTab tab;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected PropertyEditor editor;

	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getGenFeature() {
		if (genFeature != null && genFeature.eIsProxy()) {
			InternalEObject oldGenFeature = (InternalEObject)genFeature;
			genFeature = (GenFeature)eResolveProxy(oldGenFeature);
			if (genFeature != oldGenFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY__GEN_FEATURE, oldGenFeature, genFeature));
			}
		}
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetGenFeature() {
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFeature(GenFeature newGenFeature) {
		GenFeature oldGenFeature = genFeature;
		genFeature = newGenFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__GEN_FEATURE, oldGenFeature, genFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<PropertyFilter>(PropertyFilter.class, this, PropertiesPackage.PROPERTY__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab getTab() {
		if (tab != null && tab.eIsProxy()) {
			InternalEObject oldTab = (InternalEObject)tab;
			tab = (PropertyTab)eResolveProxy(oldTab);
			if (tab != oldTab) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY__TAB, oldTab, tab));
			}
		}
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab basicGetTab() {
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTab(PropertyTab newTab) {
		PropertyTab oldTab = tab;
		tab = newTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__TAB, oldTab, tab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEditor getEditor() {
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditor(PropertyEditor newEditor, NotificationChain msgs) {
		PropertyEditor oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__EDITOR, oldEditor, newEditor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(PropertyEditor newEditor) {
		if (newEditor != editor) {
			NotificationChain msgs = null;
			if (editor != null)
				msgs = ((InternalEObject)editor).eInverseRemove(this, PropertiesPackage.PROPERTY_EDITOR__PROPERTY, PropertyEditor.class, msgs);
			if (newEditor != null)
				msgs = ((InternalEObject)newEditor).eInverseAdd(this, PropertiesPackage.PROPERTY_EDITOR__PROPERTY, PropertyEditor.class, msgs);
			msgs = basicSetEditor(newEditor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__EDITOR, newEditor, newEditor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.fujaba.properties.Class getClazz() {
		if (eContainerFeatureID() != PropertiesPackage.PROPERTY__CLAZZ) return null;
		return (de.fujaba.properties.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClazz(de.fujaba.properties.Class newClazz, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClazz, PropertiesPackage.PROPERTY__CLAZZ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(de.fujaba.properties.Class newClazz) {
		if (newClazz != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.PROPERTY__CLAZZ && newClazz != null)) {
			if (EcoreUtil.isAncestor(this, newClazz))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClazz != null)
				msgs = ((InternalEObject)newClazz).eInverseAdd(this, PropertiesPackage.CLASS__PROPERTIES, de.fujaba.properties.Class.class, msgs);
			msgs = basicSetClazz(newClazz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CLAZZ, newClazz, newClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY__EDITOR:
				if (editor != null)
					msgs = ((InternalEObject)editor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY__EDITOR, null, msgs);
				return basicSetEditor((PropertyEditor)otherEnd, msgs);
			case PropertiesPackage.PROPERTY__CLAZZ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClazz((de.fujaba.properties.Class)otherEnd, msgs);
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
			case PropertiesPackage.PROPERTY__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.PROPERTY__EDITOR:
				return basicSetEditor(null, msgs);
			case PropertiesPackage.PROPERTY__CLAZZ:
				return basicSetClazz(null, msgs);
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
			case PropertiesPackage.PROPERTY__CLAZZ:
				return eInternalContainer().eInverseRemove(this, PropertiesPackage.CLASS__PROPERTIES, de.fujaba.properties.Class.class, msgs);
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
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				if (resolve) return getGenFeature();
				return basicGetGenFeature();
			case PropertiesPackage.PROPERTY__FILTERS:
				return getFilters();
			case PropertiesPackage.PROPERTY__TAB:
				if (resolve) return getTab();
				return basicGetTab();
			case PropertiesPackage.PROPERTY__EDITOR:
				return getEditor();
			case PropertiesPackage.PROPERTY__TOOLTIP:
				return getTooltip();
			case PropertiesPackage.PROPERTY__CLAZZ:
				return getClazz();
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
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				setGenFeature((GenFeature)newValue);
				return;
			case PropertiesPackage.PROPERTY__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends PropertyFilter>)newValue);
				return;
			case PropertiesPackage.PROPERTY__TAB:
				setTab((PropertyTab)newValue);
				return;
			case PropertiesPackage.PROPERTY__EDITOR:
				setEditor((PropertyEditor)newValue);
				return;
			case PropertiesPackage.PROPERTY__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case PropertiesPackage.PROPERTY__CLAZZ:
				setClazz((de.fujaba.properties.Class)newValue);
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
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				setGenFeature((GenFeature)null);
				return;
			case PropertiesPackage.PROPERTY__FILTERS:
				getFilters().clear();
				return;
			case PropertiesPackage.PROPERTY__TAB:
				setTab((PropertyTab)null);
				return;
			case PropertiesPackage.PROPERTY__EDITOR:
				setEditor((PropertyEditor)null);
				return;
			case PropertiesPackage.PROPERTY__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case PropertiesPackage.PROPERTY__CLAZZ:
				setClazz((de.fujaba.properties.Class)null);
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
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				return genFeature != null;
			case PropertiesPackage.PROPERTY__FILTERS:
				return filters != null && !filters.isEmpty();
			case PropertiesPackage.PROPERTY__TAB:
				return tab != null;
			case PropertiesPackage.PROPERTY__EDITOR:
				return editor != null;
			case PropertiesPackage.PROPERTY__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case PropertiesPackage.PROPERTY__CLAZZ:
				return getClazz() != null;
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
		result.append(" (tooltip: ");
		result.append(tooltip);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
