/**
 */
package mtctl.Predicates;

import mtctl.MtctlPackage;

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
 * @see mtctl.Predicates.PredicatesFactory
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
	PredicatesPackage eINSTANCE = mtctl.Predicates.impl.PredicatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.PredicateExprImpl <em>Predicate Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.PredicateExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getPredicateExpr()
	 * @generated
	 */
	int PREDICATE_EXPR = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR__ANNOTATION = MtctlPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR__EXTENSION = MtctlPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR__COMMENT = MtctlPackage.EXPRESSION__COMMENT;

	/**
	 * The number of structural features of the '<em>Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ECLASS = MtctlPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___EIS_PROXY = MtctlPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ERESOURCE = MtctlPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ECONTAINER = MtctlPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ECONTAINING_FEATURE = MtctlPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ECONTAINMENT_FEATURE = MtctlPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ECONTENTS = MtctlPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___EALL_CONTENTS = MtctlPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ECROSS_REFERENCES = MtctlPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = MtctlPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST = MtctlPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___GET_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___GET_ANNOTATION__STRING = MtctlPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING = MtctlPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.DynamicPredicateExprImpl <em>Dynamic Predicate Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.DynamicPredicateExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getDynamicPredicateExpr()
	 * @generated
	 */
	int DYNAMIC_PREDICATE_EXPR = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR__ANNOTATION = PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR__EXTENSION = PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR__COMMENT = PREDICATE_EXPR__COMMENT;

	/**
	 * The number of structural features of the '<em>Dynamic Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT = PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ECLASS = PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___EIS_PROXY = PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ERESOURCE = PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ECONTAINER = PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ECONTAINING_FEATURE = PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE = PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ECONTENTS = PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___EALL_CONTENTS = PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ECROSS_REFERENCES = PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST = PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS = PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS = PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___GET_ANNOTATION__STRING = PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING = PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Dynamic Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT = PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.DeadlockExprImpl <em>Deadlock Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.DeadlockExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getDeadlockExpr()
	 * @generated
	 */
	int DEADLOCK_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR__ANNOTATION = DYNAMIC_PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR__EXTENSION = DYNAMIC_PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR__COMMENT = DYNAMIC_PREDICATE_EXPR__COMMENT;

	/**
	 * The number of structural features of the '<em>Deadlock Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ECLASS = DYNAMIC_PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___EIS_PROXY = DYNAMIC_PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ERESOURCE = DYNAMIC_PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ECONTAINER = DYNAMIC_PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ECONTAINING_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ECONTAINMENT_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ECONTENTS = DYNAMIC_PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___EALL_CONTENTS = DYNAMIC_PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ECROSS_REFERENCES = DYNAMIC_PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___EGET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = DYNAMIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___EIS_SET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___EUNSET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___EINVOKE__EOPERATION_ELIST = DYNAMIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___GET_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___PROVIDE_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___GET_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR___PROVIDE_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Deadlock Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.BufferOverflowExprImpl <em>Buffer Overflow Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.BufferOverflowExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getBufferOverflowExpr()
	 * @generated
	 */
	int BUFFER_OVERFLOW_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR__ANNOTATION = DYNAMIC_PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR__EXTENSION = DYNAMIC_PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR__COMMENT = DYNAMIC_PREDICATE_EXPR__COMMENT;

	/**
	 * The number of structural features of the '<em>Buffer Overflow Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR_FEATURE_COUNT = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ECLASS = DYNAMIC_PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___EIS_PROXY = DYNAMIC_PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ERESOURCE = DYNAMIC_PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ECONTAINER = DYNAMIC_PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ECONTAINING_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ECONTAINMENT_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ECONTENTS = DYNAMIC_PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___EALL_CONTENTS = DYNAMIC_PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ECROSS_REFERENCES = DYNAMIC_PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___EGET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = DYNAMIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___EIS_SET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___EUNSET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___EINVOKE__EOPERATION_ELIST = DYNAMIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___GET_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___PROVIDE_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___GET_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR___PROVIDE_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Buffer Overflow Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OVERFLOW_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.ComparisonExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonExpr()
	 * @generated
	 */
	int COMPARISON_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__ANNOTATION = PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__EXTENSION = PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__COMMENT = PREDICATE_EXPR__COMMENT;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ECLASS = PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___EIS_PROXY = PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ERESOURCE = PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ECONTAINER = PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ECONTAINING_FEATURE = PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ECONTAINMENT_FEATURE = PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ECONTENTS = PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___EALL_CONTENTS = PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ECROSS_REFERENCES = PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___EGET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___EIS_SET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___EUNSET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___EINVOKE__EOPERATION_ELIST = PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___GET_EXTENSION__ECLASS = PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___PROVIDE_EXTENSION__ECLASS = PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___GET_ANNOTATION__STRING = PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR___PROVIDE_ANNOTATION__STRING = PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Comparison Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR_OPERATION_COUNT = PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.MessageInBufferExprImpl <em>Message In Buffer Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.MessageInBufferExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInBufferExpr()
	 * @generated
	 */
	int MESSAGE_IN_BUFFER_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR__ANNOTATION = DYNAMIC_PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR__EXTENSION = DYNAMIC_PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR__COMMENT = DYNAMIC_PREDICATE_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR__BUFFER = DYNAMIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ECLASS = DYNAMIC_PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___EIS_PROXY = DYNAMIC_PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ERESOURCE = DYNAMIC_PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ECONTAINER = DYNAMIC_PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ECONTAINING_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ECONTAINMENT_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ECONTENTS = DYNAMIC_PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___EALL_CONTENTS = DYNAMIC_PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ECROSS_REFERENCES = DYNAMIC_PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___EGET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = DYNAMIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___EIS_SET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___EUNSET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___EINVOKE__EOPERATION_ELIST = DYNAMIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___GET_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___PROVIDE_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___GET_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR___PROVIDE_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Message In Buffer Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_BUFFER_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.MessageInTransitExprImpl <em>Message In Transit Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.MessageInTransitExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInTransitExpr()
	 * @generated
	 */
	int MESSAGE_IN_TRANSIT_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR__ANNOTATION = DYNAMIC_PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR__EXTENSION = DYNAMIC_PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR__COMMENT = DYNAMIC_PREDICATE_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ECLASS = DYNAMIC_PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___EIS_PROXY = DYNAMIC_PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ERESOURCE = DYNAMIC_PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ECONTAINER = DYNAMIC_PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ECONTAINING_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ECONTAINMENT_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ECONTENTS = DYNAMIC_PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___EALL_CONTENTS = DYNAMIC_PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ECROSS_REFERENCES = DYNAMIC_PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___EGET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = DYNAMIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___EIS_SET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___EUNSET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___EINVOKE__EOPERATION_ELIST = DYNAMIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___GET_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___PROVIDE_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___GET_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR___PROVIDE_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Message In Transit Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_IN_TRANSIT_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.StateActiveExprImpl <em>State Active Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.StateActiveExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getStateActiveExpr()
	 * @generated
	 */
	int STATE_ACTIVE_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR__ANNOTATION = DYNAMIC_PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR__EXTENSION = DYNAMIC_PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR__COMMENT = DYNAMIC_PREDICATE_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ECLASS = DYNAMIC_PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___EIS_PROXY = DYNAMIC_PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ERESOURCE = DYNAMIC_PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ECONTAINER = DYNAMIC_PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ECONTAINING_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ECONTAINMENT_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ECONTENTS = DYNAMIC_PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___EALL_CONTENTS = DYNAMIC_PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ECROSS_REFERENCES = DYNAMIC_PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___EGET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = DYNAMIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___EIS_SET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___EUNSET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___EINVOKE__EOPERATION_ELIST = DYNAMIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___GET_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___PROVIDE_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___GET_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR___PROVIDE_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>State Active Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTIVE_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.StaticPredicateExprImpl <em>Static Predicate Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.StaticPredicateExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getStaticPredicateExpr()
	 * @generated
	 */
	int STATIC_PREDICATE_EXPR = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR__ANNOTATION = PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR__EXTENSION = PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR__COMMENT = PREDICATE_EXPR__COMMENT;

	/**
	 * The number of structural features of the '<em>Static Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR_FEATURE_COUNT = PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ECLASS = PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___EIS_PROXY = PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ERESOURCE = PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ECONTAINER = PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ECONTAINING_FEATURE = PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE = PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ECONTENTS = PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___EALL_CONTENTS = PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ECROSS_REFERENCES = PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE = PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST = PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS = PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS = PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___GET_ANNOTATION__STRING = PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING = PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Static Predicate Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PREDICATE_EXPR_OPERATION_COUNT = PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.SubstateOfExprImpl <em>Substate Of Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.SubstateOfExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getSubstateOfExpr()
	 * @generated
	 */
	int SUBSTATE_OF_EXPR = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR__ANNOTATION = STATIC_PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR__EXTENSION = STATIC_PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR__COMMENT = STATIC_PREDICATE_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Superstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR__SUPERSTATE = STATIC_PREDICATE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ECLASS = STATIC_PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___EIS_PROXY = STATIC_PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ERESOURCE = STATIC_PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ECONTAINER = STATIC_PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ECONTAINING_FEATURE = STATIC_PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ECONTAINMENT_FEATURE = STATIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ECONTENTS = STATIC_PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___EALL_CONTENTS = STATIC_PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ECROSS_REFERENCES = STATIC_PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___EGET__ESTRUCTURALFEATURE = STATIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = STATIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = STATIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___EIS_SET__ESTRUCTURALFEATURE = STATIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___EUNSET__ESTRUCTURALFEATURE = STATIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___EINVOKE__EOPERATION_ELIST = STATIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___GET_EXTENSION__ECLASS = STATIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___PROVIDE_EXTENSION__ECLASS = STATIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___GET_ANNOTATION__STRING = STATIC_PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR___PROVIDE_ANNOTATION__STRING = STATIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Substate Of Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATE_OF_EXPR_OPERATION_COUNT = STATIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.impl.TransitionFiringExprImpl <em>Transition Firing Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.impl.TransitionFiringExprImpl
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getTransitionFiringExpr()
	 * @generated
	 */
	int TRANSITION_FIRING_EXPR = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR__ANNOTATION = DYNAMIC_PREDICATE_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR__EXTENSION = DYNAMIC_PREDICATE_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR__COMMENT = DYNAMIC_PREDICATE_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ECLASS = DYNAMIC_PREDICATE_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___EIS_PROXY = DYNAMIC_PREDICATE_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ERESOURCE = DYNAMIC_PREDICATE_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ECONTAINER = DYNAMIC_PREDICATE_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ECONTAINING_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ECONTAINMENT_FEATURE = DYNAMIC_PREDICATE_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ECONTENTS = DYNAMIC_PREDICATE_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___EALL_CONTENTS = DYNAMIC_PREDICATE_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ECROSS_REFERENCES = DYNAMIC_PREDICATE_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___EGET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = DYNAMIC_PREDICATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = DYNAMIC_PREDICATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___EIS_SET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___EUNSET__ESTRUCTURALFEATURE = DYNAMIC_PREDICATE_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___EINVOKE__EOPERATION_ELIST = DYNAMIC_PREDICATE_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___GET_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___PROVIDE_EXTENSION__ECLASS = DYNAMIC_PREDICATE_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___GET_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR___PROVIDE_ANNOTATION__STRING = DYNAMIC_PREDICATE_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Transition Firing Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FIRING_EXPR_OPERATION_COUNT = DYNAMIC_PREDICATE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Predicates.ComparisonOp <em>Comparison Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Predicates.ComparisonOp
	 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonOp()
	 * @generated
	 */
	int COMPARISON_OP = 11;


	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.DeadlockExpr <em>Deadlock Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadlock Expr</em>'.
	 * @see mtctl.Predicates.DeadlockExpr
	 * @generated
	 */
	EClass getDeadlockExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.BufferOverflowExpr <em>Buffer Overflow Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Overflow Expr</em>'.
	 * @see mtctl.Predicates.BufferOverflowExpr
	 * @generated
	 */
	EClass getBufferOverflowExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.ComparisonExpr <em>Comparison Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Expr</em>'.
	 * @see mtctl.Predicates.ComparisonExpr
	 * @generated
	 */
	EClass getComparisonExpr();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Predicates.ComparisonExpr#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see mtctl.Predicates.ComparisonExpr#getLhs()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EReference getComparisonExpr_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link mtctl.Predicates.ComparisonExpr#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see mtctl.Predicates.ComparisonExpr#getOp()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EAttribute getComparisonExpr_Op();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Predicates.ComparisonExpr#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see mtctl.Predicates.ComparisonExpr#getRhs()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EReference getComparisonExpr_Rhs();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.MessageInBufferExpr <em>Message In Buffer Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message In Buffer Expr</em>'.
	 * @see mtctl.Predicates.MessageInBufferExpr
	 * @generated
	 */
	EClass getMessageInBufferExpr();

	/**
	 * Returns the meta object for the reference '{@link mtctl.Predicates.MessageInBufferExpr#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer</em>'.
	 * @see mtctl.Predicates.MessageInBufferExpr#getBuffer()
	 * @see #getMessageInBufferExpr()
	 * @generated
	 */
	EReference getMessageInBufferExpr_Buffer();

	/**
	 * Returns the meta object for the reference '{@link mtctl.Predicates.MessageInBufferExpr#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see mtctl.Predicates.MessageInBufferExpr#getMessage()
	 * @see #getMessageInBufferExpr()
	 * @generated
	 */
	EReference getMessageInBufferExpr_Message();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.MessageInTransitExpr <em>Message In Transit Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message In Transit Expr</em>'.
	 * @see mtctl.Predicates.MessageInTransitExpr
	 * @generated
	 */
	EClass getMessageInTransitExpr();

	/**
	 * Returns the meta object for the reference '{@link mtctl.Predicates.MessageInTransitExpr#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see mtctl.Predicates.MessageInTransitExpr#getMessage()
	 * @see #getMessageInTransitExpr()
	 * @generated
	 */
	EReference getMessageInTransitExpr_Message();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.StateActiveExpr <em>State Active Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Active Expr</em>'.
	 * @see mtctl.Predicates.StateActiveExpr
	 * @generated
	 */
	EClass getStateActiveExpr();

	/**
	 * Returns the meta object for the reference '{@link mtctl.Predicates.StateActiveExpr#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see mtctl.Predicates.StateActiveExpr#getState()
	 * @see #getStateActiveExpr()
	 * @generated
	 */
	EReference getStateActiveExpr_State();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.SubstateOfExpr <em>Substate Of Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substate Of Expr</em>'.
	 * @see mtctl.Predicates.SubstateOfExpr
	 * @generated
	 */
	EClass getSubstateOfExpr();

	/**
	 * Returns the meta object for the reference '{@link mtctl.Predicates.SubstateOfExpr#getSuperstate <em>Superstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superstate</em>'.
	 * @see mtctl.Predicates.SubstateOfExpr#getSuperstate()
	 * @see #getSubstateOfExpr()
	 * @generated
	 */
	EReference getSubstateOfExpr_Superstate();

	/**
	 * Returns the meta object for the reference '{@link mtctl.Predicates.SubstateOfExpr#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see mtctl.Predicates.SubstateOfExpr#getState()
	 * @see #getSubstateOfExpr()
	 * @generated
	 */
	EReference getSubstateOfExpr_State();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.TransitionFiringExpr <em>Transition Firing Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Firing Expr</em>'.
	 * @see mtctl.Predicates.TransitionFiringExpr
	 * @generated
	 */
	EClass getTransitionFiringExpr();

	/**
	 * Returns the meta object for the reference '{@link mtctl.Predicates.TransitionFiringExpr#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see mtctl.Predicates.TransitionFiringExpr#getTransition()
	 * @see #getTransitionFiringExpr()
	 * @generated
	 */
	EReference getTransitionFiringExpr_Transition();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.PredicateExpr <em>Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Expr</em>'.
	 * @see mtctl.Predicates.PredicateExpr
	 * @generated
	 */
	EClass getPredicateExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.DynamicPredicateExpr <em>Dynamic Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Predicate Expr</em>'.
	 * @see mtctl.Predicates.DynamicPredicateExpr
	 * @generated
	 */
	EClass getDynamicPredicateExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Predicates.StaticPredicateExpr <em>Static Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Predicate Expr</em>'.
	 * @see mtctl.Predicates.StaticPredicateExpr
	 * @generated
	 */
	EClass getStaticPredicateExpr();

	/**
	 * Returns the meta object for enum '{@link mtctl.Predicates.ComparisonOp <em>Comparison Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Op</em>'.
	 * @see mtctl.Predicates.ComparisonOp
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
		 * The meta object literal for the '{@link mtctl.Predicates.impl.DeadlockExprImpl <em>Deadlock Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.DeadlockExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getDeadlockExpr()
		 * @generated
		 */
		EClass DEADLOCK_EXPR = eINSTANCE.getDeadlockExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.BufferOverflowExprImpl <em>Buffer Overflow Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.BufferOverflowExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getBufferOverflowExpr()
		 * @generated
		 */
		EClass BUFFER_OVERFLOW_EXPR = eINSTANCE.getBufferOverflowExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.ComparisonExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonExpr()
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
		 * The meta object literal for the '{@link mtctl.Predicates.impl.MessageInBufferExprImpl <em>Message In Buffer Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.MessageInBufferExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInBufferExpr()
		 * @generated
		 */
		EClass MESSAGE_IN_BUFFER_EXPR = eINSTANCE.getMessageInBufferExpr();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_IN_BUFFER_EXPR__BUFFER = eINSTANCE.getMessageInBufferExpr_Buffer();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_IN_BUFFER_EXPR__MESSAGE = eINSTANCE.getMessageInBufferExpr_Message();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.MessageInTransitExprImpl <em>Message In Transit Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.MessageInTransitExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getMessageInTransitExpr()
		 * @generated
		 */
		EClass MESSAGE_IN_TRANSIT_EXPR = eINSTANCE.getMessageInTransitExpr();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_IN_TRANSIT_EXPR__MESSAGE = eINSTANCE.getMessageInTransitExpr_Message();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.StateActiveExprImpl <em>State Active Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.StateActiveExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getStateActiveExpr()
		 * @generated
		 */
		EClass STATE_ACTIVE_EXPR = eINSTANCE.getStateActiveExpr();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_ACTIVE_EXPR__STATE = eINSTANCE.getStateActiveExpr_State();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.SubstateOfExprImpl <em>Substate Of Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.SubstateOfExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getSubstateOfExpr()
		 * @generated
		 */
		EClass SUBSTATE_OF_EXPR = eINSTANCE.getSubstateOfExpr();

		/**
		 * The meta object literal for the '<em><b>Superstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATE_OF_EXPR__SUPERSTATE = eINSTANCE.getSubstateOfExpr_Superstate();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATE_OF_EXPR__STATE = eINSTANCE.getSubstateOfExpr_State();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.TransitionFiringExprImpl <em>Transition Firing Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.TransitionFiringExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getTransitionFiringExpr()
		 * @generated
		 */
		EClass TRANSITION_FIRING_EXPR = eINSTANCE.getTransitionFiringExpr();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_FIRING_EXPR__TRANSITION = eINSTANCE.getTransitionFiringExpr_Transition();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.PredicateExprImpl <em>Predicate Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.PredicateExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getPredicateExpr()
		 * @generated
		 */
		EClass PREDICATE_EXPR = eINSTANCE.getPredicateExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.DynamicPredicateExprImpl <em>Dynamic Predicate Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.DynamicPredicateExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getDynamicPredicateExpr()
		 * @generated
		 */
		EClass DYNAMIC_PREDICATE_EXPR = eINSTANCE.getDynamicPredicateExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.impl.StaticPredicateExprImpl <em>Static Predicate Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.impl.StaticPredicateExprImpl
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getStaticPredicateExpr()
		 * @generated
		 */
		EClass STATIC_PREDICATE_EXPR = eINSTANCE.getStaticPredicateExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Predicates.ComparisonOp <em>Comparison Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Predicates.ComparisonOp
		 * @see mtctl.Predicates.impl.PredicatesPackageImpl#getComparisonOp()
		 * @generated
		 */
		EEnum COMPARISON_OP = eINSTANCE.getComparisonOp();

	}

} //PredicatesPackage
