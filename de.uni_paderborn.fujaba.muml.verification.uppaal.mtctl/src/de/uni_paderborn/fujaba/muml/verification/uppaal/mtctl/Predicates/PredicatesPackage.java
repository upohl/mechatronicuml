/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory
 * @model kind="package"
 * @generated
 */
public interface PredicatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Predicates";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Predicates";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Predicates";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PredicatesPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicateExprImpl <em>Predicate Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicateExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getPredicateExpr()
	 * @generated
	 */
	int PREDICATE_EXPR = 8;

	/**
	 * The number of structural features of the '<em>Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DynamicPredicateExprImpl <em>Dynamic Predicate Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DynamicPredicateExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getDynamicPredicateExpr()
	 * @generated
	 */
	int DYNAMIC_PREDICATE_EXPR = 9;

	/**
	 * The number of structural features of the '<em>Dynamic Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT = PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT = PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DeadlockExprImpl <em>Deadlock Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DeadlockExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getDeadlockExpr()
	 * @generated
	 */
	int DEADLOCK_EXPR = 0;

	/**
	 * The number of structural features of the '<em>Deadlock Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deadlock Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.BufferOverflowExprImpl <em>Buffer Overflow Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.BufferOverflowExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getBufferOverflowExpr()
	 * @generated
	 */
	int BUFFER_OVERFLOW_EXPR = 1;

	/**
	 * The number of structural features of the '<em>Buffer Overflow Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Buffer Overflow Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.ComparisonExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonExpr()
	 * @generated
	 */
	int COMPARISON_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__LHS = PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__OP = PREDICATE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__RHS = PREDICATE_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR_FEATURE_COUNT = PREDICATE_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR_OPERATION_COUNT = PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInBufferExprImpl <em>Message In Buffer Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInBufferExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInBufferExpr()
	 * @generated
	 */
	int MESSAGE_IN_BUFFER_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR__BUFFER = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR__MESSAGE = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message In Buffer Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message In Buffer Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInTransitExprImpl <em>Message In Transit Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInTransitExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInTransitExpr()
	 * @generated
	 */
	int MESSAGE_IN_TRANSIT_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR__MESSAGE = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message In Transit Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message In Transit Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StateActiveExprImpl <em>State Active Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StateActiveExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getStateActiveExpr()
	 * @generated
	 */
	int STATE_ACTIVE_EXPR = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR__STATE = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Active Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Active Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StaticPredicateExprImpl <em>Static Predicate Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StaticPredicateExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getStaticPredicateExpr()
	 * @generated
	 */
	int STATIC_PREDICATE_EXPR = 10;

	/**
	 * The number of structural features of the '<em>Static Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR_FEATURE_COUNT = PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR_OPERATION_COUNT = PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.SubstateOfExprImpl <em>Substate Of Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.SubstateOfExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getSubstateOfExpr()
	 * @generated
	 */
	int SUBSTATE_OF_EXPR = 6;

	/**
	 * The feature id for the '<em><b>Superstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR__SUPERSTATE = STATIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR__STATE = STATIC_PREDICATE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substate Of Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR_FEATURE_COUNT = STATIC_PREDICATE_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Substate Of Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR_OPERATION_COUNT = STATIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TransitionFiringExprImpl <em>Transition Firing Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TransitionFiringExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getTransitionFiringExpr()
	 * @generated
	 */
	int TRANSITION_FIRING_EXPR = 7;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR__TRANSITION = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Firing Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition Firing Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TrueExprImpl <em>True Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TrueExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getTrueExpr()
	 * @generated
	 */
	int TRUE_EXPR = 11;

	/**
	 * The number of structural features of the '<em>True Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_EXPR_FEATURE_COUNT = STATIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>True Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_EXPR_OPERATION_COUNT = STATIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.FalseExprImpl <em>False Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.FalseExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getFalseExpr()
	 * @generated
	 */
	int FALSE_EXPR = 12;

	/**
	 * The number of structural features of the '<em>False Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_EXPR_FEATURE_COUNT = STATIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>False Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_EXPR_OPERATION_COUNT = STATIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp <em>Comparison Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonOp()
	 * @generated
	 */
	int COMPARISON_OP = 13;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr <em>Deadlock Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadlock Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr
	 * @generated
	 */
	EClass getDeadlockExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.BufferOverflowExpr <em>Buffer Overflow Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Overflow Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.BufferOverflowExpr
	 * @generated
	 */
	EClass getBufferOverflowExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr <em>Comparison Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr
	 * @generated
	 */
	EClass getComparisonExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr#getLhs()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EReference getComparisonExpr_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr#getOp()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EAttribute getComparisonExpr_Op();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr#getRhs()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EReference getComparisonExpr_Rhs();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr <em>Message In Buffer Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message In Buffer Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr
	 * @generated
	 */
	EClass getMessageInBufferExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr#getBuffer()
	 * @see #getMessageInBufferExpr()
	 * @generated
	 */
	EReference getMessageInBufferExpr_Buffer();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr#getMessage()
	 * @see #getMessageInBufferExpr()
	 * @generated
	 */
	EReference getMessageInBufferExpr_Message();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr <em>Message In Transit Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message In Transit Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr
	 * @generated
	 */
	EClass getMessageInTransitExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr#getMessage()
	 * @see #getMessageInTransitExpr()
	 * @generated
	 */
	EReference getMessageInTransitExpr_Message();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr <em>State Active Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Active Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr
	 * @generated
	 */
	EClass getStateActiveExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr#getState()
	 * @see #getStateActiveExpr()
	 * @generated
	 */
	EReference getStateActiveExpr_State();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr <em>Substate Of Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substate Of Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr
	 * @generated
	 */
	EClass getSubstateOfExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr#getSuperstate <em>Superstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Superstate</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr#getSuperstate()
	 * @see #getSubstateOfExpr()
	 * @generated
	 */
	EReference getSubstateOfExpr_Superstate();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr#getState()
	 * @see #getSubstateOfExpr()
	 * @generated
	 */
	EReference getSubstateOfExpr_State();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr <em>Transition Firing Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Firing Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr
	 * @generated
	 */
	EClass getTransitionFiringExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr#getTransition()
	 * @see #getTransitionFiringExpr()
	 * @generated
	 */
	EReference getTransitionFiringExpr_Transition();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicateExpr <em>Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicateExpr
	 * @generated
	 */
	EClass getPredicateExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DynamicPredicateExpr <em>Dynamic Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Predicate Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DynamicPredicateExpr
	 * @generated
	 */
	EClass getDynamicPredicateExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StaticPredicateExpr <em>Static Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Predicate Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StaticPredicateExpr
	 * @generated
	 */
	EClass getStaticPredicateExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TrueExpr <em>True Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TrueExpr
	 * @generated
	 */
	EClass getTrueExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.FalseExpr <em>False Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.FalseExpr
	 * @generated
	 */
	EClass getFalseExpr();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp <em>Comparison Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Op</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp
	 * @generated
	 */
	EEnum getComparisonOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PredicatesFactory getPredicatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DeadlockExprImpl <em>Deadlock Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DeadlockExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getDeadlockExpr()
		 * @generated
		 */
		EClass DEADLOCK_EXPR = eINSTANCE.getDeadlockExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.BufferOverflowExprImpl <em>Buffer Overflow Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.BufferOverflowExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getBufferOverflowExpr()
		 * @generated
		 */
		EClass BUFFER_OVERFLOW_EXPR = eINSTANCE.getBufferOverflowExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.ComparisonExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonExpr()
		 * @generated
		 */
		EClass COMPARISON_EXPR = eINSTANCE.getComparisonExpr();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPR__LHS = eINSTANCE.getComparisonExpr_Lhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_EXPR__OP = eINSTANCE.getComparisonExpr_Op();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPR__RHS = eINSTANCE.getComparisonExpr_Rhs();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInBufferExprImpl <em>Message In Buffer Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInBufferExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInBufferExpr()
		 * @generated
		 */
		EClass MESSAGE_IN_BUFFER_EXPR = eINSTANCE.getMessageInBufferExpr();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_IN_BUFFER_EXPR__BUFFER = eINSTANCE.getMessageInBufferExpr_Buffer();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_IN_BUFFER_EXPR__MESSAGE = eINSTANCE.getMessageInBufferExpr_Message();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInTransitExprImpl <em>Message In Transit Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.MessageInTransitExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInTransitExpr()
		 * @generated
		 */
		EClass MESSAGE_IN_TRANSIT_EXPR = eINSTANCE.getMessageInTransitExpr();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_IN_TRANSIT_EXPR__MESSAGE = eINSTANCE.getMessageInTransitExpr_Message();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StateActiveExprImpl <em>State Active Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StateActiveExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getStateActiveExpr()
		 * @generated
		 */
		EClass STATE_ACTIVE_EXPR = eINSTANCE.getStateActiveExpr();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_ACTIVE_EXPR__STATE = eINSTANCE.getStateActiveExpr_State();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.SubstateOfExprImpl <em>Substate Of Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.SubstateOfExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getSubstateOfExpr()
		 * @generated
		 */
		EClass SUBSTATE_OF_EXPR = eINSTANCE.getSubstateOfExpr();

		/**
		 * The meta object literal for the '<em><b>Superstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATE_OF_EXPR__SUPERSTATE = eINSTANCE.getSubstateOfExpr_Superstate();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATE_OF_EXPR__STATE = eINSTANCE.getSubstateOfExpr_State();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TransitionFiringExprImpl <em>Transition Firing Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TransitionFiringExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getTransitionFiringExpr()
		 * @generated
		 */
		EClass TRANSITION_FIRING_EXPR = eINSTANCE.getTransitionFiringExpr();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_FIRING_EXPR__TRANSITION = eINSTANCE.getTransitionFiringExpr_Transition();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicateExprImpl <em>Predicate Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicateExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getPredicateExpr()
		 * @generated
		 */
		EClass PREDICATE_EXPR = eINSTANCE.getPredicateExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DynamicPredicateExprImpl <em>Dynamic Predicate Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.DynamicPredicateExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getDynamicPredicateExpr()
		 * @generated
		 */
		EClass DYNAMIC_PREDICATE_EXPR = eINSTANCE.getDynamicPredicateExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StaticPredicateExprImpl <em>Static Predicate Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.StaticPredicateExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getStaticPredicateExpr()
		 * @generated
		 */
		EClass STATIC_PREDICATE_EXPR = eINSTANCE.getStaticPredicateExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TrueExprImpl <em>True Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.TrueExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getTrueExpr()
		 * @generated
		 */
		EClass TRUE_EXPR = eINSTANCE.getTrueExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.FalseExprImpl <em>False Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.FalseExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getFalseExpr()
		 * @generated
		 */
		EClass FALSE_EXPR = eINSTANCE.getFalseExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp <em>Comparison Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonOp()
		 * @generated
		 */
		EEnum COMPARISON_OP = eINSTANCE.getComparisonOp();

	}

} //PredicatesPackage
