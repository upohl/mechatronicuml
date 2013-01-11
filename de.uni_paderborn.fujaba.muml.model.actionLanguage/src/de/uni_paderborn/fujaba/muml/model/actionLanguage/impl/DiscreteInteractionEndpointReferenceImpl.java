/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Interaction Endpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DiscreteInteractionEndpointReferenceImpl#getTypedNamedElementExpression <em>Typed Named Element Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DiscreteInteractionEndpointReferenceImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteInteractionEndpointReferenceImpl extends ExpressionImpl implements DiscreteInteractionEndpointReference {
	/**
	 * The cached value of the '{@link #getTypedNamedElementExpression() <em>Typed Named Element Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedNamedElementExpression()
	 * @generated
	 * @ordered
	 */
	protected TypedNamedElementExpression typedNamedElementExpression;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionSelector position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteInteractionEndpointReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionLanguagePackage.Literals.DISCRETE_INTERACTION_ENDPOINT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedElementExpression getTypedNamedElementExpression() {
		return typedNamedElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedNamedElementExpression(TypedNamedElementExpression newTypedNamedElementExpression, NotificationChain msgs) {
		TypedNamedElementExpression oldTypedNamedElementExpression = typedNamedElementExpression;
		typedNamedElementExpression = newTypedNamedElementExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION, oldTypedNamedElementExpression, newTypedNamedElementExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedNamedElementExpression(TypedNamedElementExpression newTypedNamedElementExpression) {
		if (newTypedNamedElementExpression != typedNamedElementExpression) {
			NotificationChain msgs = null;
			if (typedNamedElementExpression != null)
				msgs = ((InternalEObject)typedNamedElementExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION, null, msgs);
			if (newTypedNamedElementExpression != null)
				msgs = ((InternalEObject)newTypedNamedElementExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION, null, msgs);
			msgs = basicSetTypedNamedElementExpression(newTypedNamedElementExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION, newTypedNamedElementExpression, newTypedNamedElementExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSelector getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PositionSelector newPosition, NotificationChain msgs) {
		PositionSelector oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PositionSelector newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION:
				return basicSetTypedNamedElementExpression(null, msgs);
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION:
				return basicSetPosition(null, msgs);
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
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION:
				return getTypedNamedElementExpression();
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION:
				return getPosition();
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
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION:
				setTypedNamedElementExpression((TypedNamedElementExpression)newValue);
				return;
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION:
				setPosition((PositionSelector)newValue);
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
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION:
				setTypedNamedElementExpression((TypedNamedElementExpression)null);
				return;
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION:
				setPosition((PositionSelector)null);
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
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION:
				return typedNamedElementExpression != null;
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscreteInteractionEndpointReferenceImpl
