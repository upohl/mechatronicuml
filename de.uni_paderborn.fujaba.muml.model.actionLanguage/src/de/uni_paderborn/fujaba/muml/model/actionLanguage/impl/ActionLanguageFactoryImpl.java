/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguageFactory;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.DoWhileLoop;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelectorKind;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.VariableOrParameterExpression;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionLanguageFactoryImpl extends EFactoryImpl implements ActionLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionLanguageFactory init() {
		try {
			ActionLanguageFactory theActionLanguageFactory = (ActionLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/actionlanguage/0.3.14"); 
			if (theActionLanguageFactory != null) {
				return theActionLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActionLanguagePackage.BLOCK: return createBlock();
			case ActionLanguagePackage.WHILE_LOOP: return createWhileLoop();
			case ActionLanguagePackage.DO_WHILE_LOOP: return createDoWhileLoop();
			case ActionLanguagePackage.ASSIGNMENT: return createAssignment();
			case ActionLanguagePackage.FOR_LOOP: return createForLoop();
			case ActionLanguagePackage.IF_STATEMENT: return createIfStatement();
			case ActionLanguagePackage.VARIABLE_OR_PARAMETER_EXPRESSION: return createVariableOrParameterExpression();
			case ActionLanguagePackage.OPERATION_CALL: return createOperationCall();
			case ActionLanguagePackage.RETURN_STATEMENT: return createReturnStatement();
			case ActionLanguagePackage.TRIGGER_MESSAGE_EXPRESSION: return createTriggerMessageExpression();
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE: return createDiscreteInteractionEndpointReference();
			case ActionLanguagePackage.POSITION_SELECTOR: return createPositionSelector();
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT: return createLocalVariableDeclarationStatement();
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION: return createTypedNamedElementExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ActionLanguagePackage.ASSIGN_OPERATOR:
				return createAssignOperatorFromString(eDataType, initialValue);
			case ActionLanguagePackage.INCREMENT_DECREMENT_OPERATOR:
				return createIncrementDecrementOperatorFromString(eDataType, initialValue);
			case ActionLanguagePackage.POSITION_SELECTOR_KIND:
				return createPositionSelectorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ActionLanguagePackage.ASSIGN_OPERATOR:
				return convertAssignOperatorToString(eDataType, instanceValue);
			case ActionLanguagePackage.INCREMENT_DECREMENT_OPERATOR:
				return convertIncrementDecrementOperatorToString(eDataType, instanceValue);
			case ActionLanguagePackage.POSITION_SELECTOR_KIND:
				return convertPositionSelectorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoWhileLoop createDoWhileLoop() {
		DoWhileLoopImpl doWhileLoop = new DoWhileLoopImpl();
		return doWhileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoop createForLoop() {
		ForLoopImpl forLoop = new ForLoopImpl();
		return forLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableOrParameterExpression createVariableOrParameterExpression() {
		VariableOrParameterExpressionImpl variableOrParameterExpression = new VariableOrParameterExpressionImpl();
		return variableOrParameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall createOperationCall() {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerMessageExpression createTriggerMessageExpression() {
		TriggerMessageExpressionImpl triggerMessageExpression = new TriggerMessageExpressionImpl();
		return triggerMessageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteInteractionEndpointReference createDiscreteInteractionEndpointReference() {
		DiscreteInteractionEndpointReferenceImpl discreteInteractionEndpointReference = new DiscreteInteractionEndpointReferenceImpl();
		return discreteInteractionEndpointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSelector createPositionSelector() {
		PositionSelectorImpl positionSelector = new PositionSelectorImpl();
		return positionSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariableDeclarationStatement createLocalVariableDeclarationStatement() {
		LocalVariableDeclarationStatementImpl localVariableDeclarationStatement = new LocalVariableDeclarationStatementImpl();
		return localVariableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedElementExpression createTypedNamedElementExpression() {
		TypedNamedElementExpressionImpl typedNamedElementExpression = new TypedNamedElementExpressionImpl();
		return typedNamedElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignOperator createAssignOperatorFromString(EDataType eDataType, String initialValue) {
		AssignOperator result = AssignOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementDecrementOperator createIncrementDecrementOperatorFromString(EDataType eDataType, String initialValue) {
		IncrementDecrementOperator result = IncrementDecrementOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncrementDecrementOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSelectorKind createPositionSelectorKindFromString(EDataType eDataType, String initialValue) {
		PositionSelectorKind result = PositionSelectorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionSelectorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLanguagePackage getActionLanguagePackage() {
		return (ActionLanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionLanguagePackage getPackage() {
		return ActionLanguagePackage.eINSTANCE;
	}

} //ActionLanguageFactoryImpl
