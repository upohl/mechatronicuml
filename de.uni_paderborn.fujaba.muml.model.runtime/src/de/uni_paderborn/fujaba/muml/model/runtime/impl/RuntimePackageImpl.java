/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeDiscretePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeRoleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeStatechartInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeBehavioralElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaObjectEDataType = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgifacePackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeComponentInstance() {
		return runtimeComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeDiscretePortInstance() {
		return runtimeDiscretePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeRoleInstance() {
		return runtimeRoleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageBuffer() {
		return messageBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageBuffer_Size() {
		return (EAttribute)messageBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuffer_Messages() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuffer_RuntimeBehavioralElement() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeStatechartInstance() {
		return realtimeStatechartInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_RuntimeBehavioralElement() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_InstanceOf() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_Active() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_SubRealtimeStatechartInstances() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_AttributeBindings() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeMessage() {
		return runtimeMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMessage_Parameters() {
		return (EReference)runtimeMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeParameter() {
		return runtimeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeParameter_Message() {
		return (EReference)runtimeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeParameter_Value() {
		return (EAttribute)runtimeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeBinding() {
		return attributeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeBinding_Attribute() {
		return (EReference)attributeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeBinding_Value() {
		return (EAttribute)attributeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeBehavioralElement() {
		return runtimeBehavioralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeBehavioralElement_StatechartInstance() {
		return (EReference)runtimeBehavioralElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeBehavioralElement_MessageBuffer() {
		return (EReference)runtimeBehavioralElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaObject() {
		return javaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory)getEFactoryInstance();
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
		runtimeComponentInstanceEClass = createEClass(RUNTIME_COMPONENT_INSTANCE);

		runtimeDiscretePortInstanceEClass = createEClass(RUNTIME_DISCRETE_PORT_INSTANCE);

		runtimeRoleInstanceEClass = createEClass(RUNTIME_ROLE_INSTANCE);

		messageBufferEClass = createEClass(MESSAGE_BUFFER);
		createEAttribute(messageBufferEClass, MESSAGE_BUFFER__SIZE);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__MESSAGES);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT);

		realtimeStatechartInstanceEClass = createEClass(REALTIME_STATECHART_INSTANCE);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__INSTANCE_OF);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__ACTIVE);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS);

		runtimeMessageEClass = createEClass(RUNTIME_MESSAGE);
		createEReference(runtimeMessageEClass, RUNTIME_MESSAGE__PARAMETERS);

		runtimeParameterEClass = createEClass(RUNTIME_PARAMETER);
		createEReference(runtimeParameterEClass, RUNTIME_PARAMETER__MESSAGE);
		createEAttribute(runtimeParameterEClass, RUNTIME_PARAMETER__VALUE);

		attributeBindingEClass = createEClass(ATTRIBUTE_BINDING);
		createEReference(attributeBindingEClass, ATTRIBUTE_BINDING__ATTRIBUTE);
		createEAttribute(attributeBindingEClass, ATTRIBUTE_BINDING__VALUE);

		runtimeBehavioralElementEClass = createEClass(RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(runtimeBehavioralElementEClass, RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE);
		createEReference(runtimeBehavioralElementEClass, RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER);

		// Create data types
		javaObjectEDataType = createEDataType(JAVA_OBJECT);
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
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		org.storydriven.core.CorePackage theCorePackage_1 = (org.storydriven.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.core.CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getComponentInstance());
		runtimeComponentInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		runtimeDiscretePortInstanceEClass.getESuperTypes().add(theInstancePackage.getDiscretePortInstance());
		runtimeDiscretePortInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		runtimeRoleInstanceEClass.getESuperTypes().add(thePatternPackage.getRole());
		runtimeRoleInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		messageBufferEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());
		realtimeStatechartInstanceEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());
		runtimeMessageEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		runtimeParameterEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		attributeBindingEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());
		runtimeBehavioralElementEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(runtimeComponentInstanceEClass, RuntimeComponentInstance.class, "RuntimeComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeDiscretePortInstanceEClass, RuntimeDiscretePortInstance.class, "RuntimeDiscretePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeRoleInstanceEClass, RuntimeRoleInstance.class, "RuntimeRoleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageBufferEClass, MessageBuffer.class, "MessageBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageBuffer_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageBuffer_Messages(), this.getRuntimeMessage(), null, "messages", null, 0, -1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageBuffer_RuntimeBehavioralElement(), this.getRuntimeBehavioralElement(), this.getRuntimeBehavioralElement_MessageBuffer(), "runtimeBehavioralElement", null, 1, 1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeStatechartInstanceEClass, RealtimeStatechartInstance.class, "RealtimeStatechartInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeStatechartInstance_RuntimeBehavioralElement(), this.getRuntimeBehavioralElement(), this.getRuntimeBehavioralElement_StatechartInstance(), "runtimeBehavioralElement", null, 0, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_InstanceOf(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "instanceOf", null, 1, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_Active(), theRealtimestatechartPackage.getState(), null, "active", null, 1, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_SubRealtimeStatechartInstances(), this.getRealtimeStatechartInstance(), null, "subRealtimeStatechartInstances", null, 0, -1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_AttributeBindings(), this.getAttributeBinding(), null, "attributeBindings", null, 0, -1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeMessageEClass, RuntimeMessage.class, "RuntimeMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeMessage_Parameters(), this.getRuntimeParameter(), this.getRuntimeParameter_Message(), "parameters", null, 0, -1, RuntimeMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeParameterEClass, RuntimeParameter.class, "RuntimeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeParameter_Message(), this.getRuntimeMessage(), this.getRuntimeMessage_Parameters(), "message", null, 1, 1, RuntimeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeParameter_Value(), this.getJavaObject(), "value", null, 0, 1, RuntimeParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeBindingEClass, AttributeBinding.class, "AttributeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeBinding_Attribute(), theCorePackage.getAttribute(), null, "attribute", null, 1, 1, AttributeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBinding_Value(), this.getJavaObject(), "value", null, 0, 1, AttributeBinding.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeBehavioralElementEClass, RuntimeBehavioralElement.class, "RuntimeBehavioralElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeBehavioralElement_StatechartInstance(), this.getRealtimeStatechartInstance(), this.getRealtimeStatechartInstance_RuntimeBehavioralElement(), "statechartInstance", null, 0, 1, RuntimeBehavioralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeBehavioralElement_MessageBuffer(), this.getMessageBuffer(), this.getMessageBuffer_RuntimeBehavioralElement(), "messageBuffer", null, 0, 1, RuntimeBehavioralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(javaObjectEDataType, Object.class, "JavaObject", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimePackageImpl
