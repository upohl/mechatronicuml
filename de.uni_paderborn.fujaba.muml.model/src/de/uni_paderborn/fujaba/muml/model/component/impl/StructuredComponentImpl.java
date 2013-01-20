/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.PortConnector;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl#getEmbeddedParts <em>Embedded Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl#getAllStructuredComponents <em>All Structured Components</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl#getAllAtomicComponents <em>All Atomic Components</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl#getGmfProtocols <em>Gmf Protocols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuredComponentImpl extends ComponentImpl implements StructuredComponent {
	/**
	 * The cached value of the '{@link #getEmbeddedParts() <em>Embedded Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPart> embeddedParts;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConnector> connectors;

	/**
	 * The cached setting delegate for the '{@link #getAllStructuredComponents() <em>All Structured Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllStructuredComponents()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_STRUCTURED_COMPONENTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAtomicComponents() <em>All Atomic Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAtomicComponents()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_ATOMIC_COMPONENTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGmfProtocols() <em>Gmf Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfProtocols()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_PROTOCOLS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.STRUCTURED_COMPONENT__GMF_PROTOCOLS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.STRUCTURED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPart> getEmbeddedParts() {
		if (embeddedParts == null) {
			embeddedParts = new EObjectContainmentWithInverseEList<ComponentPart>(ComponentPart.class, this, ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS, ComponentPackage.COMPONENT_PART__PARENT_COMPONENT);
		}
		return embeddedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConnector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<PortConnector>(PortConnector.class, this, ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS, ComponentPackage.PORT_CONNECTOR__PARENT_COMPONENT);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StructuredComponent> getAllStructuredComponents() {
		return (EList<StructuredComponent>)ALL_STRUCTURED_COMPONENTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllStructuredComponents() {
		return ALL_STRUCTURED_COMPONENTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AtomicComponent> getAllAtomicComponents() {
		return (EList<AtomicComponent>)ALL_ATOMIC_COMPONENTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllAtomicComponents() {
		return ALL_ATOMIC_COMPONENTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CoordinationProtocol> getGmfProtocols() {
		return (EList<CoordinationProtocol>)GMF_PROTOCOLS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedParts()).basicAdd(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return ((InternalEList<?>)getEmbeddedParts()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS:
				return ((InternalEList<?>)getAllStructuredComponents()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS:
				return ((InternalEList<?>)getAllAtomicComponents()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__GMF_PROTOCOLS:
				return ((InternalEList<?>)getGmfProtocols()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return getEmbeddedParts();
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return getConnectors();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS:
				return getAllStructuredComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS:
				return getAllAtomicComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__GMF_PROTOCOLS:
				return getGmfProtocols();
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				getEmbeddedParts().clear();
				getEmbeddedParts().addAll((Collection<? extends ComponentPart>)newValue);
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends PortConnector>)newValue);
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__GMF_PROTOCOLS:
				getGmfProtocols().clear();
				getGmfProtocols().addAll((Collection<? extends CoordinationProtocol>)newValue);
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				getEmbeddedParts().clear();
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				getConnectors().clear();
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__GMF_PROTOCOLS:
				getGmfProtocols().clear();
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return embeddedParts != null && !embeddedParts.isEmpty();
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS:
				return isSetAllStructuredComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS:
				return isSetAllAtomicComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__GMF_PROTOCOLS:
				return GMF_PROTOCOLS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		return "Structured_Component_" + getName();
	}

} //StructuredComponentImpl
