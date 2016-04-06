/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.language.as.AsPackage
 * @generated
 */
public interface AsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsFactory eINSTANCE = org.muml.psm.allocation.language.as.impl.AsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Qo SDimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SDimension</em>'.
	 * @generated
	 */
	QoSDimension createQoSDimension();

	/**
	 * Returns a new object of class '<em>Location Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Constraint</em>'.
	 * @generated
	 */
	LocationConstraint createLocationConstraint();

	/**
	 * Returns a new object of class '<em>Resource Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Constraint</em>'.
	 * @generated
	 */
	ResourceConstraint createResourceConstraint();

	/**
	 * Returns a new object of class '<em>Required Hardware Resource Instance Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Hardware Resource Instance Constraint</em>'.
	 * @generated
	 */
	RequiredHardwareResourceInstanceConstraint createRequiredHardwareResourceInstanceConstraint();

	/**
	 * Returns a new object of class '<em>Location Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Tuple Descriptor</em>'.
	 * @generated
	 */
	LocationTupleDescriptor createLocationTupleDescriptor();

	/**
	 * Returns a new object of class '<em>Component Resource Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Resource Tuple Descriptor</em>'.
	 * @generated
	 */
	ComponentResourceTupleDescriptor createComponentResourceTupleDescriptor();

	/**
	 * Returns a new object of class '<em>Value Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Tuple Descriptor</em>'.
	 * @generated
	 */
	ValueTupleDescriptor createValueTupleDescriptor();

	/**
	 * Returns a new object of class '<em>Measure Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Function</em>'.
	 * @generated
	 */
	MeasureFunction createMeasureFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AsPackage getAsPackage();

} //AsFactory