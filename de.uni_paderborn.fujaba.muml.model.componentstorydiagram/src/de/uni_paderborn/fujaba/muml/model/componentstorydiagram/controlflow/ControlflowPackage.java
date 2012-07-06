/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

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
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowFactory
 * @model kind="package"
 * @generated
 */
public interface ControlflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controlflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/componentstorydiagram/controlflow/0.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controlflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlflowPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryRuleImpl <em>Component Story Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryRuleImpl
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryRule()
	 * @generated
	 */
	int COMPONENT_STORY_RULE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__ANNOTATION = ReconfigurationPackage.RECONFIGURATION_RULE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__EXTENSION = ReconfigurationPackage.RECONFIGURATION_RULE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__NAME = ReconfigurationPackage.RECONFIGURATION_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__COMMENT = ReconfigurationPackage.RECONFIGURATION_RULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__PARAMETERS = ReconfigurationPackage.RECONFIGURATION_RULE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__RETURN_PARAMETERS = ReconfigurationPackage.RECONFIGURATION_RULE__RETURN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__ACTIVITY = ReconfigurationPackage.RECONFIGURATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Story Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE_FEATURE_COUNT = ReconfigurationPackage.RECONFIGURATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl <em>Component Story Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryNode()
	 * @generated
	 */
	int COMPONENT_STORY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__ANNOTATION = ActivitiesPackage.ACTIVITY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__EXTENSION = ActivitiesPackage.ACTIVITY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__NAME = ActivitiesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__COMMENT = ActivitiesPackage.ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OUTGOING = ActivitiesPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OWNING_ACTIVITY = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__INCOMING = ActivitiesPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Component Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Story Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl <em>Controller Exchange Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getControllerExchangeNode()
	 * @generated
	 */
	int CONTROLLER_EXCHANGE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__ANNOTATION = ActivitiesPackage.ACTIVITY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__EXTENSION = ActivitiesPackage.ACTIVITY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__NAME = ActivitiesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__COMMENT = ActivitiesPackage.ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__OUTGOING = ActivitiesPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__OWNING_ACTIVITY = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__INCOMING = ActivitiesPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__DEADLINE = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controller Exchange Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fading Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Controller Exchange Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy <em>Controller Exchange Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getControllerExchangeStrategy()
	 * @generated
	 */
	int CONTROLLER_EXCHANGE_STRATEGY = 3;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule <em>Component Story Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule
	 * @generated
	 */
	EClass getComponentStoryRule();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule#getActivity()
	 * @see #getComponentStoryRule()
	 * @generated
	 */
	EReference getComponentStoryRule_Activity();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode <em>Component Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode
	 * @generated
	 */
	EClass getComponentStoryNode();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode#getComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode#getComponentStoryPattern()
	 * @see #getComponentStoryNode()
	 * @generated
	 */
	EReference getComponentStoryNode_ComponentStoryPattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode <em>Controller Exchange Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Exchange Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode
	 * @generated
	 */
	EClass getControllerExchangeNode();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getDeadline()
	 * @see #getControllerExchangeNode()
	 * @generated
	 */
	EReference getControllerExchangeNode_Deadline();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getComponentStoryPattern()
	 * @see #getControllerExchangeNode()
	 * @generated
	 */
	EReference getControllerExchangeNode_ComponentStoryPattern();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getControllerExchangeStrategy <em>Controller Exchange Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller Exchange Strategy</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getControllerExchangeStrategy()
	 * @see #getControllerExchangeNode()
	 * @generated
	 */
	EAttribute getControllerExchangeNode_ControllerExchangeStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getFadingFunctions <em>Fading Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fading Functions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getFadingFunctions()
	 * @see #getControllerExchangeNode()
	 * @generated
	 */
	EReference getControllerExchangeNode_FadingFunctions();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy <em>Controller Exchange Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Controller Exchange Strategy</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy
	 * @generated
	 */
	EEnum getControllerExchangeStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlflowFactory getControlflowFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryRuleImpl <em>Component Story Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryRuleImpl
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryRule()
		 * @generated
		 */
		EClass COMPONENT_STORY_RULE = eINSTANCE.getComponentStoryRule();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STORY_RULE__ACTIVITY = eINSTANCE.getComponentStoryRule_Activity();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl <em>Component Story Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryNode()
		 * @generated
		 */
		EClass COMPONENT_STORY_NODE = eINSTANCE.getComponentStoryNode();

		/**
		 * The meta object literal for the '<em><b>Component Story Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN = eINSTANCE.getComponentStoryNode_ComponentStoryPattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl <em>Controller Exchange Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getControllerExchangeNode()
		 * @generated
		 */
		EClass CONTROLLER_EXCHANGE_NODE = eINSTANCE.getControllerExchangeNode();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_EXCHANGE_NODE__DEADLINE = eINSTANCE.getControllerExchangeNode_Deadline();

		/**
		 * The meta object literal for the '<em><b>Component Story Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN = eINSTANCE.getControllerExchangeNode_ComponentStoryPattern();

		/**
		 * The meta object literal for the '<em><b>Controller Exchange Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY = eINSTANCE.getControllerExchangeNode_ControllerExchangeStrategy();

		/**
		 * The meta object literal for the '<em><b>Fading Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS = eINSTANCE.getControllerExchangeNode_FadingFunctions();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy <em>Controller Exchange Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getControllerExchangeStrategy()
		 * @generated
		 */
		EEnum CONTROLLER_EXCHANGE_STRATEGY = eINSTANCE.getControllerExchangeStrategy();

	}

} //ControlflowPackage
