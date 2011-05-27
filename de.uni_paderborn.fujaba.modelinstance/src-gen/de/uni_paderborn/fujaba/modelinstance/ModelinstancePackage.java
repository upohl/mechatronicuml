/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.modelinstance;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ModelinstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelinstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/modelinstance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelinstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelinstancePackage eINSTANCE = de.uni_paderborn.fujaba.modelinstance.impl.ModelinstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.modelinstance.impl.RootNodeImpl <em>Root Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.modelinstance.impl.RootNodeImpl
	 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelinstancePackageImpl#getRootNode()
	 * @generated
	 */
	int ROOT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE__CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Ecore Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE__ECORE_DATA_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Root Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.modelinstance.impl.ModelElementCategoryImpl <em>Model Element Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelElementCategoryImpl
	 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelinstancePackageImpl#getModelElementCategory()
	 * @generated
	 */
	int MODEL_ELEMENT_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY__KEY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Model Element Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.modelinstance.impl.testImpl <em>test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.modelinstance.impl.testImpl
	 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelinstancePackageImpl#gettest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ANNOTATION = ComponentPackage.COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__EXTENSION = ComponentPackage.COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = ComponentPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__COMMENT = ComponentPackage.COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CONSTRAINT = ComponentPackage.COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PORTS = ComponentPackage.COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ECLASS = ComponentPackage.COMPONENT__ECLASS;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__REFERENCING_COMPONENT_PARTS = ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Must Implement Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__MUST_IMPLEMENT_PROVIDED_INTERFACES = ComponentPackage.COMPONENT__MUST_IMPLEMENT_PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Must Implement Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__MUST_IMPLEMENT_REQUIRED_INTERFACES = ComponentPackage.COMPONENT__MUST_IMPLEMENT_REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__KIND = ComponentPackage.COMPONENT__KIND;

	/**
	 * The number of structural features of the '<em>test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = ComponentPackage.COMPONENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.modelinstance.RootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Node</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.RootNode
	 * @generated
	 */
	EClass getRootNode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.modelinstance.RootNode#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.RootNode#getCategories()
	 * @see #getRootNode()
	 * @generated
	 */
	EReference getRootNode_Categories();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.modelinstance.RootNode#getEcoreDataTypes <em>Ecore Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ecore Data Types</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.RootNode#getEcoreDataTypes()
	 * @see #getRootNode()
	 * @generated
	 */
	EReference getRootNode_EcoreDataTypes();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.modelinstance.ModelElementCategory <em>Model Element Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Category</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.ModelElementCategory
	 * @generated
	 */
	EClass getModelElementCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.modelinstance.ModelElementCategory#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.ModelElementCategory#getModelElements()
	 * @see #getModelElementCategory()
	 * @generated
	 */
	EReference getModelElementCategory_ModelElements();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.modelinstance.ModelElementCategory#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.ModelElementCategory#getKey()
	 * @see #getModelElementCategory()
	 * @generated
	 */
	EAttribute getModelElementCategory_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.modelinstance.ModelElementCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.ModelElementCategory#getName()
	 * @see #getModelElementCategory()
	 * @generated
	 */
	EAttribute getModelElementCategory_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.modelinstance.test <em>test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>test</em>'.
	 * @see de.uni_paderborn.fujaba.modelinstance.test
	 * @generated
	 */
	EClass gettest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelinstanceFactory getModelinstanceFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.modelinstance.impl.RootNodeImpl <em>Root Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.modelinstance.impl.RootNodeImpl
		 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelinstancePackageImpl#getRootNode()
		 * @generated
		 */
		EClass ROOT_NODE = eINSTANCE.getRootNode();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE__CATEGORIES = eINSTANCE.getRootNode_Categories();

		/**
		 * The meta object literal for the '<em><b>Ecore Data Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE__ECORE_DATA_TYPES = eINSTANCE.getRootNode_EcoreDataTypes();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.modelinstance.impl.ModelElementCategoryImpl <em>Model Element Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelElementCategoryImpl
		 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelinstancePackageImpl#getModelElementCategory()
		 * @generated
		 */
		EClass MODEL_ELEMENT_CATEGORY = eINSTANCE.getModelElementCategory();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS = eINSTANCE.getModelElementCategory_ModelElements();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_CATEGORY__KEY = eINSTANCE.getModelElementCategory_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_CATEGORY__NAME = eINSTANCE.getModelElementCategory_Name();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.modelinstance.impl.testImpl <em>test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.modelinstance.impl.testImpl
		 * @see de.uni_paderborn.fujaba.modelinstance.impl.ModelinstancePackageImpl#gettest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.gettest();

	}

} //ModelinstancePackage
