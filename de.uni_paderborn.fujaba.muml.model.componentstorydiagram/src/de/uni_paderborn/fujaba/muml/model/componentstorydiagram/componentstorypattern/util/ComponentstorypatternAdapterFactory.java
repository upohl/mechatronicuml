/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.util;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.Call;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage
 * @generated
 */
public class ComponentstorypatternAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentstorypatternPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorypatternAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentstorypatternPackage.eINSTANCE;
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
	protected ComponentstorypatternSwitch<Adapter> modelSwitch =
		new ComponentstorypatternSwitch<Adapter>() {
			@Override
			public Adapter caseComponentStoryPattern(ComponentStoryPattern object) {
				return createComponentStoryPatternAdapter();
			}
			@Override
			public Adapter caseComponentStoryPatternVariable(ComponentStoryPatternVariable object) {
				return createComponentStoryPatternVariableAdapter();
			}
			@Override
			public Adapter caseComponentVariable(ComponentVariable object) {
				return createComponentVariableAdapter();
			}
			@Override
			public Adapter casePortVariable(PortVariable object) {
				return createPortVariableAdapter();
			}
			@Override
			public Adapter casePartVariable(PartVariable object) {
				return createPartVariableAdapter();
			}
			@Override
			public Adapter caseConnectorVariable(ConnectorVariable object) {
				return createConnectorVariableAdapter();
			}
			@Override
			public Adapter caseAssemblyVariable(AssemblyVariable object) {
				return createAssemblyVariableAdapter();
			}
			@Override
			public Adapter caseDelegationVariable(DelegationVariable object) {
				return createDelegationVariableAdapter();
			}
			@Override
			public Adapter caseCall(Call object) {
				return createCallAdapter();
			}
			@Override
			public Adapter caseFadingFunction(FadingFunction object) {
				return createFadingFunctionAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern
	 * @generated
	 */
	public Adapter createComponentStoryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable <em>Component Story Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable
	 * @generated
	 */
	public Adapter createComponentStoryPatternVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable <em>Component Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable
	 * @generated
	 */
	public Adapter createComponentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable <em>Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable
	 * @generated
	 */
	public Adapter createPortVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable <em>Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable
	 * @generated
	 */
	public Adapter createPartVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable <em>Connector Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable
	 * @generated
	 */
	public Adapter createConnectorVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable <em>Assembly Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable
	 * @generated
	 */
	public Adapter createAssemblyVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable <em>Delegation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable
	 * @generated
	 */
	public Adapter createDelegationVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.Call
	 * @generated
	 */
	public Adapter createCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction <em>Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction
	 * @generated
	 */
	public Adapter createFadingFunctionAdapter() {
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

} //ComponentstorypatternAdapterFactory
