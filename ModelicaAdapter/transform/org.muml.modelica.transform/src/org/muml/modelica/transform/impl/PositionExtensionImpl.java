/**
 */
package org.muml.modelica.transform.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.core.impl.ExtensionImpl;

import org.muml.modelica.transform.PositionExtension;
import org.muml.modelica.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.modelica.transform.impl.PositionExtensionImpl#getEAnnotations <em>EAnnotations</em>}</li>
 *   <li>{@link org.muml.modelica.transform.impl.PositionExtensionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.modelica.transform.impl.PositionExtensionImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.muml.modelica.transform.impl.PositionExtensionImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.muml.modelica.transform.impl.PositionExtensionImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.muml.modelica.transform.impl.PositionExtensionImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionExtensionImpl extends ExtensionImpl implements PositionExtension {
	/**
	 * The cached value of the '{@link #getEAnnotations() <em>EAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList eAnnotations;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EMap details;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList contents;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformPackage.Literals.POSITION_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEAnnotations() {
		if (eAnnotations == null) {
			eAnnotations = new EObjectContainmentWithInverseEList<EAnnotation>(EAnnotation.class, this, TransformPackage.POSITION_EXTENSION__EANNOTATIONS, EcorePackage.EANNOTATION__EMODEL_ELEMENT);
		}
		return eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.POSITION_EXTENSION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getDetails() {
		if (details == null) {
			details = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TransformPackage.POSITION_EXTENSION__DETAILS);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eContainerFeatureID() != TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT) return null;
		return (EModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEModelElement(EModelElement newEModelElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEModelElement, TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		if (newEModelElement != eInternalContainer() || (eContainerFeatureID() != TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT && newEModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newEModelElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEModelElement != null)
				msgs = ((InternalEObject)newEModelElement).eInverseAdd(this, EcorePackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
			msgs = basicSetEModelElement(newEModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT, newEModelElement, newEModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<EObject>(EObject.class, this, TransformPackage.POSITION_EXTENSION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList<EObject>(EObject.class, this, TransformPackage.POSITION_EXTENSION__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getEAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case TransformPackage.POSITION_EXTENSION__EANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEAnnotations()).basicAdd(otherEnd, msgs);
			case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEModelElement((EModelElement)otherEnd, msgs);
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
			case TransformPackage.POSITION_EXTENSION__EANNOTATIONS:
				return ((InternalEList<?>)getEAnnotations()).basicRemove(otherEnd, msgs);
			case TransformPackage.POSITION_EXTENSION__DETAILS:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
			case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT:
				return basicSetEModelElement(null, msgs);
			case TransformPackage.POSITION_EXTENSION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, EcorePackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
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
			case TransformPackage.POSITION_EXTENSION__EANNOTATIONS:
				return getEAnnotations();
			case TransformPackage.POSITION_EXTENSION__SOURCE:
				return getSource();
			case TransformPackage.POSITION_EXTENSION__DETAILS:
				if (coreType) return getDetails();
				else return getDetails().map();
			case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT:
				return getEModelElement();
			case TransformPackage.POSITION_EXTENSION__CONTENTS:
				return getContents();
			case TransformPackage.POSITION_EXTENSION__REFERENCES:
				return getReferences();
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
			case TransformPackage.POSITION_EXTENSION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case TransformPackage.POSITION_EXTENSION__SOURCE:
				setSource((String)newValue);
				return;
			case TransformPackage.POSITION_EXTENSION__DETAILS:
				((EStructuralFeature.Setting)getDetails()).set(newValue);
				return;
			case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case TransformPackage.POSITION_EXTENSION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends EObject>)newValue);
				return;
			case TransformPackage.POSITION_EXTENSION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends EObject>)newValue);
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
			case TransformPackage.POSITION_EXTENSION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case TransformPackage.POSITION_EXTENSION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case TransformPackage.POSITION_EXTENSION__DETAILS:
				getDetails().clear();
				return;
			case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case TransformPackage.POSITION_EXTENSION__CONTENTS:
				getContents().clear();
				return;
			case TransformPackage.POSITION_EXTENSION__REFERENCES:
				getReferences().clear();
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
			case TransformPackage.POSITION_EXTENSION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case TransformPackage.POSITION_EXTENSION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case TransformPackage.POSITION_EXTENSION__DETAILS:
				return details != null && !details.isEmpty();
			case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT:
				return getEModelElement() != null;
			case TransformPackage.POSITION_EXTENSION__CONTENTS:
				return contents != null && !contents.isEmpty();
			case TransformPackage.POSITION_EXTENSION__REFERENCES:
				return references != null && !references.isEmpty();
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
		if (baseClass == EModelElement.class) {
			switch (derivedFeatureID) {
				case TransformPackage.POSITION_EXTENSION__EANNOTATIONS: return EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == EAnnotation.class) {
			switch (derivedFeatureID) {
				case TransformPackage.POSITION_EXTENSION__SOURCE: return EcorePackage.EANNOTATION__SOURCE;
				case TransformPackage.POSITION_EXTENSION__DETAILS: return EcorePackage.EANNOTATION__DETAILS;
				case TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT: return EcorePackage.EANNOTATION__EMODEL_ELEMENT;
				case TransformPackage.POSITION_EXTENSION__CONTENTS: return EcorePackage.EANNOTATION__CONTENTS;
				case TransformPackage.POSITION_EXTENSION__REFERENCES: return EcorePackage.EANNOTATION__REFERENCES;
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
		if (baseClass == EModelElement.class) {
			switch (baseFeatureID) {
				case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS: return TransformPackage.POSITION_EXTENSION__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == EAnnotation.class) {
			switch (baseFeatureID) {
				case EcorePackage.EANNOTATION__SOURCE: return TransformPackage.POSITION_EXTENSION__SOURCE;
				case EcorePackage.EANNOTATION__DETAILS: return TransformPackage.POSITION_EXTENSION__DETAILS;
				case EcorePackage.EANNOTATION__EMODEL_ELEMENT: return TransformPackage.POSITION_EXTENSION__EMODEL_ELEMENT;
				case EcorePackage.EANNOTATION__CONTENTS: return TransformPackage.POSITION_EXTENSION__CONTENTS;
				case EcorePackage.EANNOTATION__REFERENCES: return TransformPackage.POSITION_EXTENSION__REFERENCES;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (baseOperationID) {
				case EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING: return TransformPackage.POSITION_EXTENSION___GET_EANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == EAnnotation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TransformPackage.POSITION_EXTENSION___GET_EANNOTATION__STRING:
				return getEAnnotation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //PositionExtensionImpl
