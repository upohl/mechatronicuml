/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.scClockConstr2sfGuard;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Clock Constr2sf Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scClockConstr2sfGuardImpl#getScClockConstr <em>Sc Clock Constr</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scClockConstr2sfGuardImpl#getScBound <em>Sc Bound</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scClockConstr2sfGuardImpl#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scClockConstr2sfGuardImpl#getSfClockGuard <em>Sf Clock Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class scClockConstr2sfGuardImpl extends AbstractContainerCorrespondenceNodeImpl implements scClockConstr2sfGuard {
	/**
	 * The cached value of the '{@link #getScClockConstr() <em>Sc Clock Constr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScClockConstr()
	 * @generated
	 * @ordered
	 */
	protected ClockConstraint scClockConstr;

	/**
	 * The cached value of the '{@link #getScBound() <em>Sc Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScBound()
	 * @generated
	 * @ordered
	 */
	protected TimeValue scBound;

	/**
	 * The cached value of the '{@link #getScClock() <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScClock()
	 * @generated
	 * @ordered
	 */
	protected Clock scClock;

	/**
	 * The cached value of the '{@link #getSfClockGuard() <em>Sf Clock Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfClockGuard()
	 * @generated
	 * @ordered
	 */
	protected Action sfClockGuard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scClockConstr2sfGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_CLOCK_CONSTR2SF_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint getScClockConstr() {
		if (scClockConstr != null && scClockConstr.eIsProxy()) {
			InternalEObject oldScClockConstr = (InternalEObject)scClockConstr;
			scClockConstr = (ClockConstraint)eResolveProxy(oldScClockConstr);
			if (scClockConstr != oldScClockConstr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR, oldScClockConstr, scClockConstr));
			}
		}
		return scClockConstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint basicGetScClockConstr() {
		return scClockConstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScClockConstr(ClockConstraint newScClockConstr) {
		ClockConstraint oldScClockConstr = scClockConstr;
		scClockConstr = newScClockConstr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR, oldScClockConstr, scClockConstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getScBound() {
		if (scBound != null && scBound.eIsProxy()) {
			InternalEObject oldScBound = (InternalEObject)scBound;
			scBound = (TimeValue)eResolveProxy(oldScBound);
			if (scBound != oldScBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND, oldScBound, scBound));
			}
		}
		return scBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue basicGetScBound() {
		return scBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScBound(TimeValue newScBound) {
		TimeValue oldScBound = scBound;
		scBound = newScBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND, oldScBound, scBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getScClock() {
		if (scClock != null && scClock.eIsProxy()) {
			InternalEObject oldScClock = (InternalEObject)scClock;
			scClock = (Clock)eResolveProxy(oldScClock);
			if (scClock != oldScClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK, oldScClock, scClock));
			}
		}
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetScClock() {
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScClock(Clock newScClock) {
		Clock oldScClock = scClock;
		scClock = newScClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK, oldScClock, scClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfClockGuard() {
		if (sfClockGuard != null && ((EObject)sfClockGuard).eIsProxy()) {
			InternalEObject oldSfClockGuard = (InternalEObject)sfClockGuard;
			sfClockGuard = (Action)eResolveProxy(oldSfClockGuard);
			if (sfClockGuard != oldSfClockGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD, oldSfClockGuard, sfClockGuard));
			}
		}
		return sfClockGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfClockGuard() {
		return sfClockGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfClockGuard(Action newSfClockGuard) {
		Action oldSfClockGuard = sfClockGuard;
		sfClockGuard = newSfClockGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD, oldSfClockGuard, sfClockGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR:
				if (resolve) return getScClockConstr();
				return basicGetScClockConstr();
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND:
				if (resolve) return getScBound();
				return basicGetScBound();
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK:
				if (resolve) return getScClock();
				return basicGetScClock();
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD:
				if (resolve) return getSfClockGuard();
				return basicGetSfClockGuard();
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
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR:
				setScClockConstr((ClockConstraint)newValue);
				return;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND:
				setScBound((TimeValue)newValue);
				return;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK:
				setScClock((Clock)newValue);
				return;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD:
				setSfClockGuard((Action)newValue);
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
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR:
				setScClockConstr((ClockConstraint)null);
				return;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND:
				setScBound((TimeValue)null);
				return;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK:
				setScClock((Clock)null);
				return;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD:
				setSfClockGuard((Action)null);
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
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR:
				return scClockConstr != null;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND:
				return scBound != null;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK:
				return scClock != null;
			case Behavior_modelPackage.SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD:
				return sfClockGuard != null;
		}
		return super.eIsSet(featureID);
	}

} //scClockConstr2sfGuardImpl
