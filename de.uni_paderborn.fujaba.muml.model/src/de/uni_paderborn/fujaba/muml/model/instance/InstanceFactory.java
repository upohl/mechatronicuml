/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstanceFactory eINSTANCE = de.uni_paderborn.fujaba.muml.model.instance.impl.InstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Instance</em>'.
	 * @generated
	 */
	ConnectorInstance createConnectorInstance();

	/**
	 * Returns a new object of class '<em>Assembly Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Instance</em>'.
	 * @generated
	 */
	AssemblyInstance createAssemblyInstance();

	/**
	 * Returns a new object of class '<em>Delegation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Instance</em>'.
	 * @generated
	 */
	DelegationInstance createDelegationInstance();

	/**
	 * Returns a new object of class '<em>Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Configuration</em>'.
	 * @generated
	 */
	ComponentInstanceConfiguration createComponentInstanceConfiguration();

	/**
	 * Returns a new object of class '<em>Continuous Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Port Instance</em>'.
	 * @generated
	 */
	ContinuousPortInstance createContinuousPortInstance();

	/**
	 * Returns a new object of class '<em>Hybrid Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Port Instance</em>'.
	 * @generated
	 */
	HybridPortInstance createHybridPortInstance();

	/**
	 * Returns a new object of class '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Single Port Instance</em>'.
	 * @generated
	 */
	DiscreteSinglePortInstance createDiscreteSinglePortInstance();

	/**
	 * Returns a new object of class '<em>Discrete Multi Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Multi Port Instance</em>'.
	 * @generated
	 */
	DiscreteMultiPortInstance createDiscreteMultiPortInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstancePackage getInstancePackage();

} //InstanceFactory
