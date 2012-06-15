/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.util;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;

import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;

import de.uni_paderborn.fujaba.muml.model.core.DataType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage
 * @generated
 */
public class ReconfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReconfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReconfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationSwitch<Adapter> modelSwitch =
		new ReconfigurationSwitch<Adapter>() {
			@Override
			public Adapter caseReconfigurableStructuredComponent(ReconfigurableStructuredComponent object) {
				return createReconfigurableStructuredComponentAdapter();
			}
			@Override
			public Adapter caseReconfigurationPort(ReconfigurationPort object) {
				return createReconfigurationPortAdapter();
			}
			@Override
			public Adapter caseReconfigurationController(ReconfigurationController object) {
				return createReconfigurationControllerAdapter();
			}
			@Override
			public Adapter caseManager(Manager object) {
				return createManagerAdapter();
			}
			@Override
			public Adapter caseExecutor(Executor object) {
				return createExecutorAdapter();
			}
			@Override
			public Adapter caseReconfigurationRule(ReconfigurationRule object) {
				return createReconfigurationRuleAdapter();
			}
			@Override
			public Adapter casePartDataType(PartDataType object) {
				return createPartDataTypeAdapter();
			}
			@Override
			public Adapter casePortDataType(PortDataType object) {
				return createPortDataTypeAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseConstrainableElement(ConstrainableElement object) {
				return createConstrainableElementAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseStructuredComponent(StructuredComponent object) {
				return createStructuredComponentAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent <em>Reconfigurable Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent
	 * @generated
	 */
	public Adapter createReconfigurableStructuredComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPort
	 * @generated
	 */
	public Adapter createReconfigurationPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController
	 * @generated
	 */
	public Adapter createReconfigurationControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor
	 * @generated
	 */
	public Adapter createExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule
	 * @generated
	 */
	public Adapter createReconfigurationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType <em>Part Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType
	 * @generated
	 */
	public Adapter createPartDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType <em>Port Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType
	 * @generated
	 */
	public Adapter createPortDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement
	 * @generated
	 */
	public Adapter createConstrainableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent
	 * @generated
	 */
	public Adapter createStructuredComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.component.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.core.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.core.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReconfigurationAdapterFactory
