/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getHardwarePorts <em>Hardware Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getDeployedInstances <em>Deployed Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareNodeImpl extends EObjectImpl implements HardwareNode {
	/**
	 * The cached value of the '{@link #getHardwarePorts() <em>Hardware Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePort> hardwarePorts;

	/**
	 * The cached value of the '{@link #getDeployedInstances() <em>Deployed Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> deployedInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HARDWARE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (eContainerFeatureID() != DeploymentPackage.HARDWARE_NODE__DEPLOYMENT) return null;
		return (Deployment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeployment, DeploymentPackage.HARDWARE_NODE__DEPLOYMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != eInternalContainer() || (eContainerFeatureID() != DeploymentPackage.HARDWARE_NODE__DEPLOYMENT && newDeployment != null)) {
			if (EcoreUtil.isAncestor(this, newDeployment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject)newDeployment).eInverseAdd(this, DeploymentPackage.DEPLOYMENT__HARDWARE_NODES, Deployment.class, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_NODE__DEPLOYMENT, newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePort> getHardwarePorts() {
		if (hardwarePorts == null) {
			hardwarePorts = new EObjectContainmentWithInverseEList<HardwarePort>(HardwarePort.class, this, DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS, DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE);
		}
		return hardwarePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getDeployedInstances() {
		if (deployedInstances == null) {
			deployedInstances = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES);
		}
		return deployedInstances;
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeployment((Deployment)otherEnd, msgs);
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHardwarePorts()).basicAdd(otherEnd, msgs);
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return ((InternalEList<?>)getHardwarePorts()).basicRemove(otherEnd, msgs);
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return eInternalContainer().eInverseRemove(this, DeploymentPackage.DEPLOYMENT__HARDWARE_NODES, Deployment.class, msgs);
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return getDeployment();
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return getHardwarePorts();
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				return getDeployedInstances();
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				setDeployment((Deployment)newValue);
				return;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				getHardwarePorts().clear();
				getHardwarePorts().addAll((Collection<? extends HardwarePort>)newValue);
				return;
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				getDeployedInstances().clear();
				getDeployedInstances().addAll((Collection<? extends ComponentInstance>)newValue);
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				setDeployment((Deployment)null);
				return;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				getHardwarePorts().clear();
				return;
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				getDeployedInstances().clear();
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return getDeployment() != null;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return hardwarePorts != null && !hardwarePorts.isEmpty();
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				return deployedInstances != null && !deployedInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareNodeImpl
