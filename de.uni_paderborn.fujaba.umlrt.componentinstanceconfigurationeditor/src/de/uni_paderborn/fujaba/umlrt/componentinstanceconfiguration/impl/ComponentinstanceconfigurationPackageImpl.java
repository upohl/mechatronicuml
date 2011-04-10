/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfigurationDiagram;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentinstanceconfigurationFactory;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentinstanceconfigurationPackage;

import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentinstanceconfigurationPackageImpl extends EPackageImpl implements ComponentinstanceconfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceConfigurationDiagramEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentinstanceconfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentinstanceconfigurationPackageImpl() {
		super(eNS_URI, ComponentinstanceconfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComponentinstanceconfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentinstanceconfigurationPackage init() {
		if (isInited) return (ComponentinstanceconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentinstanceconfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ComponentinstanceconfigurationPackageImpl theComponentinstanceconfigurationPackage = (ComponentinstanceconfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentinstanceconfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentinstanceconfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BehaviorPackage.eINSTANCE.eClass();
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgifacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentinstanceconfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theComponentinstanceconfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentinstanceconfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentinstanceconfigurationPackage.eNS_URI, theComponentinstanceconfigurationPackage);
		return theComponentinstanceconfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstanceConfigurationDiagram() {
		return componentInstanceConfigurationDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceConfigurationDiagram_ComponentInstances() {
		return (EReference)componentInstanceConfigurationDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentinstanceconfigurationFactory getComponentinstanceconfigurationFactory() {
		return (ComponentinstanceconfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInstanceConfigurationDiagramEClass = createEClass(COMPONENT_INSTANCE_CONFIGURATION_DIAGRAM);
		createEReference(componentInstanceConfigurationDiagramEClass, COMPONENT_INSTANCE_CONFIGURATION_DIAGRAM__COMPONENT_INSTANCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(componentInstanceConfigurationDiagramEClass, ComponentInstanceConfigurationDiagram.class, "ComponentInstanceConfigurationDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceConfigurationDiagram_ComponentInstances(), theInstancePackage.getComponentInstance(), null, "componentInstances", null, 0, -1, ComponentInstanceConfigurationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentinstanceconfigurationPackageImpl
