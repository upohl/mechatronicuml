/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains all classes of the Platform Instance Viewpoint.
 * 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PlatforminstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platforminstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/hardware/platforminstance/1.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platforminstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatforminstancePackage eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl <em>HW Platform Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl#getHWPlatformInstance()
	 * @generated
	 */
	int HW_PLATFORM_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Derived Bridges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__DERIVED_BRIDGES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__DELEGATION_PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__DELEGATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>HW Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceConfigurationImpl <em>HW Platform Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceConfigurationImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl#getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Media</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HW Platform Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance <em>HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance
	 * @generated
	 */
	EClass getHWPlatformInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwplatform Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getHwplatformType()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_HwplatformType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getResourceInstances <em>Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getResourceInstances()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_ResourceInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getCommunicationResources <em>Communication Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Resources</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getCommunicationResources()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_CommunicationResources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getHwplatformInstances <em>Hwplatform Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwplatform Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getHwplatformInstances()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_HwplatformInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDerivedBridges <em>Derived Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Bridges</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDerivedBridges()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_DerivedBridges();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDelegationPorts()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_DelegationPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDelegations <em>Delegations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegations</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDelegations()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_Delegations();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration <em>HW Platform Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration
	 * @generated
	 */
	EClass getHWPlatformInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances <em>Hwplatform Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwplatform Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_HwplatformInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration#getCommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Media</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration#getCommunicationMedia()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_CommunicationMedia();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatforminstanceFactory getPlatforminstanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl <em>HW Platform Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl#getHWPlatformInstance()
		 * @generated
		 */
		EClass HW_PLATFORM_INSTANCE = eINSTANCE.getHWPlatformInstance();

		/**
		 * The meta object literal for the '<em><b>Hwplatform Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE = eINSTANCE.getHWPlatformInstance_HwplatformType();

		/**
		 * The meta object literal for the '<em><b>Resource Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES = eINSTANCE.getHWPlatformInstance_ResourceInstances();

		/**
		 * The meta object literal for the '<em><b>Communication Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES = eINSTANCE.getHWPlatformInstance_CommunicationResources();

		/**
		 * The meta object literal for the '<em><b>Hwplatform Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES = eINSTANCE.getHWPlatformInstance_HwplatformInstances();

		/**
		 * The meta object literal for the '<em><b>Derived Bridges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__DERIVED_BRIDGES = eINSTANCE.getHWPlatformInstance_DerivedBridges();

		/**
		 * The meta object literal for the '<em><b>Delegation Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__DELEGATION_PORTS = eINSTANCE.getHWPlatformInstance_DelegationPorts();

		/**
		 * The meta object literal for the '<em><b>Delegations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__DELEGATIONS = eINSTANCE.getHWPlatformInstance_Delegations();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceConfigurationImpl <em>HW Platform Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceConfigurationImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl#getHWPlatformInstanceConfiguration()
		 * @generated
		 */
		EClass HW_PLATFORM_INSTANCE_CONFIGURATION = eINSTANCE.getHWPlatformInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Hwplatform Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES = eINSTANCE.getHWPlatformInstanceConfiguration_HwplatformInstances();

		/**
		 * The meta object literal for the '<em><b>Communication Media</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA = eINSTANCE.getHWPlatformInstanceConfiguration_CommunicationMedia();

	}

} //PlatforminstancePackage
