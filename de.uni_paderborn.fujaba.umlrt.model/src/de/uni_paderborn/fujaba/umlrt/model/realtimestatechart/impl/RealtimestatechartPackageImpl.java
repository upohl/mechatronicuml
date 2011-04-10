/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.umlrt.model.behavior.impl.BehaviorPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.umlrt.model.component.impl.ComponentPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MsgifacePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.umlrt.model.pattern.impl.PatternPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Prioritizable;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.HelperPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.calls.CallsPackage;

import org.storydriven.modeling.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartPackageImpl extends EPackageImpl implements RealtimestatechartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlInterfaceStatechartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatSwitchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statechartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryOrExitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RealtimestatechartPackageImpl() {
		super(eNS_URI, RealtimestatechartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RealtimestatechartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RealtimestatechartPackage init() {
		if (isInited) return (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Obtain or create and register package
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RealtimestatechartPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SDMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		ReconfPackageImpl theReconfPackage = (ReconfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI) instanceof ReconfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI) : ReconfPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);

		// Create package meta-data objects
		theRealtimestatechartPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theReconfPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();

		// Initialize created meta-data
		theRealtimestatechartPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theReconfPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRealtimestatechartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RealtimestatechartPackage.eNS_URI, theRealtimestatechartPackage);
		return theRealtimestatechartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadline() {
		return deadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeadline_UpperBound() {
		return (EReference)deadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeadline_LowerBound() {
		return (EReference)deadlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteDeadline() {
		return absoluteDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteDeadline_UMLRealtimeTransition() {
		return (EReference)absoluteDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteDeadline_UMLClock() {
		return (EReference)absoluteDeadlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeDeadline() {
		return relativeDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeDeadline_UMLRealtimeTransition() {
		return (EReference)relativeDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClock() {
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Id() {
		return (EAttribute)clockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClock_AbsoluteDeadlines() {
		return (EReference)clockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClock_Statechart() {
		return (EReference)clockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClock_Resets() {
		return (EReference)clockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClock_ClockConstraints() {
		return (EReference)clockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__ToString() {
		return clockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Clone__Statechart_Clock() {
		return clockEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Regions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoAction() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExitAction() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EntryAction() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ReconfDiagram() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InterfacedStates() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InterfaceState() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Invariants() {
		return (EReference)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Committed() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Channels() {
		return (EReference)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__Clone__Statechart_State() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLInterfaceStatechart() {
		return umlInterfaceStatechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLInterfaceStatechart_UMLRealtimeStatechart() {
		return (EReference)umlInterfaceStatechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Id() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Wcet() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Blocking() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_UMLRealtimeTransition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Resets() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_WCETSpecifiedByUser() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Clone__Statechart_Action() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeEvent() {
		return realtimeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeEvent_TriggeredUMLRealtimeTransition() {
		return (EReference)realtimeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeEvent_RaisedUMLRealtimeTransition() {
		return (EReference)realtimeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeEvent_Instance() {
		return (EAttribute)realtimeEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeEvent_Name() {
		return (EAttribute)realtimeEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealtimeEvent_FullEventName() {
		return (EAttribute)realtimeEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealtimeEvent__Clone__Statechart_RealtimeEvent() {
		return realtimeEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealtimeEvent__ToString() {
		return realtimeEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadingFunction() {
		return fadingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadingFunction_Function() {
		return (EAttribute)fadingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFadingFunction_UMLRealtimeTransitions() {
		return (EReference)fadingFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadingFunction_MinDuration() {
		return (EAttribute)fadingFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadingFunction_MaxDuration() {
		return (EAttribute)fadingFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadingFunction_Spline1() {
		return (EAttribute)fadingFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadingFunction_Spline2() {
		return (EAttribute)fadingFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadingFunction_PolynomDegree() {
		return (EAttribute)fadingFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFadingFunction_PortsByComponentInstance() {
		return (EReference)fadingFunctionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFadingFunction__GetBreakpoint() {
		return fadingFunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatSwitching() {
		return flatSwitchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatSwitching_UMLRealtimeTransitions() {
		return (EReference)flatSwitchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatSwitching_MinDuration() {
		return (EAttribute)flatSwitchingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatSwitching_MaxDuration() {
		return (EAttribute)flatSwitchingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatSwitching_Spline1() {
		return (EAttribute)flatSwitchingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatSwitching_Spline2() {
		return (EAttribute)flatSwitchingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatSwitching_PolynomDegree() {
		return (EAttribute)flatSwitchingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatSwitching_PortInstToPortInstMapEntry() {
		return (EAttribute)flatSwitchingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlatSwitching__GetBreakpoint() {
		return flatSwitchingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialState_UMLRealtimeStartStateRev() {
		return (EReference)initialStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialState__GetNextState() {
		return initialStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialState__Clone__Statechart_InitialState() {
		return initialStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_OutgoingTransitions() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_IncomingTransitions() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Statechart() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__GetLongName() {
		return vertexEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__GetRootRealtimeStatechart() {
		return vertexEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatechart() {
		return statechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatechart_EventQueueSize() {
		return (EAttribute)statechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatechart_WcetDocument() {
		return (EAttribute)statechartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatechart_SecurityLevel() {
		return (EAttribute)statechartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatechart_SystemWcetMap() {
		return (EAttribute)statechartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatechart_Utilisation() {
		return (EAttribute)statechartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatechart_ScheduleDocument() {
		return (EAttribute)statechartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_UMLRealtimeStartState() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_UMLComplexRealtimeState() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_Transitions() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_Vertices() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_EClass() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_UMLInterfaceStatechart() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_BehavioralElement() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_ProvidedMsgIFace() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_RequiredMsgIFace() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatechart_IsEmbedded() {
		return (EAttribute)statechartEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_Clocks() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatechart_EmbeddingRegion() {
		return (EReference)statechartEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__GetHighestParentStatechart() {
		return statechartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__AddAllUMLRealtimeStates__Set_boolean() {
		return statechartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__AddComplexUMLRealtimeStates__Set() {
		return statechartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__AddAllUMLRealtimeTransitions__Set() {
		return statechartEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__IteratorOfAllUMLClocks__boolean() {
		return statechartEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__AddAllUMLClocks__Set_boolean() {
		return statechartEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__ToString() {
		return statechartEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatechart__Clone() {
		return statechartEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__Clone__Statechart_FinalState() {
		return finalStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_UMLRealtimeTransitionMappingVector() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_SendSynchronization() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_ReceiveSynchronization() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_SideEffect() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Statechart() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Resets() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_UMLRealtimeFlatSwitching() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_UMLRealtimeFadingFunction() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_TriggerEvents() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RaisedEvents() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Timeguard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_AbsoluteDeadlines() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RelativeDeadline() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Urgent() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__CalculateWorstCaseDeadlineAsNaturalNumber() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__GetDefaultName() {
		return transitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Clone__Statechart_Transition() {
		return transitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationChannel() {
		return synchronizationChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationChannel_State() {
		return (EReference)synchronizationChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSynchronizationChannel__Clone__Statechart_SynchronizationChannel() {
		return synchronizationChannelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockConstraint() {
		return clockConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockConstraint_Bound() {
		return (EReference)clockConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockConstraint_Clock() {
		return (EReference)clockConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockConstraint_Operator() {
		return (EAttribute)clockConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClockConstraint__Clone__Statechart_ClockConstraint() {
		return clockConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryState() {
		return historyStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryState_Kind() {
		return (EAttribute)historyStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoEvent() {
		return doEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoEvent_Action() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoEvent_DoActionRev() {
		return (EReference)doEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoEvent_PeriodLower() {
		return (EAttribute)doEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoEvent_PeriodUpper() {
		return (EAttribute)doEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryOrExitEvent() {
		return entryOrExitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_Resets() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_EntryActionRev() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_ExitActionRev() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOrExitEvent_UMLRealtimeAction() {
		return (EReference)entryOrExitEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_SendSyncRev() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_ReceiveSyncRev() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritizable() {
		return prioritizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizable_Priority() {
		return (EAttribute)prioritizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Statechart() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_ParentState() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryKind() {
		return historyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartFactory getRealtimestatechartFactory() {
		return (RealtimestatechartFactory)getEFactoryInstance();
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
		deadlineEClass = createEClass(DEADLINE);
		createEReference(deadlineEClass, DEADLINE__UPPER_BOUND);
		createEReference(deadlineEClass, DEADLINE__LOWER_BOUND);

		absoluteDeadlineEClass = createEClass(ABSOLUTE_DEADLINE);
		createEReference(absoluteDeadlineEClass, ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION);
		createEReference(absoluteDeadlineEClass, ABSOLUTE_DEADLINE__UML_CLOCK);

		relativeDeadlineEClass = createEClass(RELATIVE_DEADLINE);
		createEReference(relativeDeadlineEClass, RELATIVE_DEADLINE__UML_REALTIME_TRANSITION);

		clockEClass = createEClass(CLOCK);
		createEAttribute(clockEClass, CLOCK__ID);
		createEReference(clockEClass, CLOCK__ABSOLUTE_DEADLINES);
		createEReference(clockEClass, CLOCK__STATECHART);
		createEReference(clockEClass, CLOCK__RESETS);
		createEReference(clockEClass, CLOCK__CLOCK_CONSTRAINTS);
		createEOperation(clockEClass, CLOCK___TO_STRING);
		createEOperation(clockEClass, CLOCK___CLONE__STATECHART_CLOCK);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__REGIONS);
		createEReference(stateEClass, STATE__DO_ACTION);
		createEReference(stateEClass, STATE__EXIT_ACTION);
		createEReference(stateEClass, STATE__ENTRY_ACTION);
		createEReference(stateEClass, STATE__RECONF_DIAGRAM);
		createEReference(stateEClass, STATE__INTERFACED_STATES);
		createEReference(stateEClass, STATE__INTERFACE_STATE);
		createEReference(stateEClass, STATE__INVARIANTS);
		createEAttribute(stateEClass, STATE__COMMITTED);
		createEReference(stateEClass, STATE__CHANNELS);
		createEOperation(stateEClass, STATE___CLONE__STATECHART_STATE);

		umlInterfaceStatechartEClass = createEClass(UML_INTERFACE_STATECHART);
		createEReference(umlInterfaceStatechartEClass, UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ID);
		createEAttribute(actionEClass, ACTION__WCET);
		createEAttribute(actionEClass, ACTION__BLOCKING);
		createEReference(actionEClass, ACTION__UML_REALTIME_TRANSITION);
		createEReference(actionEClass, ACTION__RESETS);
		createEAttribute(actionEClass, ACTION__WCET_SPECIFIED_BY_USER);
		createEOperation(actionEClass, ACTION___CLONE__STATECHART_ACTION);

		realtimeEventEClass = createEClass(REALTIME_EVENT);
		createEReference(realtimeEventEClass, REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION);
		createEReference(realtimeEventEClass, REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION);
		createEAttribute(realtimeEventEClass, REALTIME_EVENT__INSTANCE);
		createEAttribute(realtimeEventEClass, REALTIME_EVENT__NAME);
		createEAttribute(realtimeEventEClass, REALTIME_EVENT__FULL_EVENT_NAME);
		createEOperation(realtimeEventEClass, REALTIME_EVENT___CLONE__STATECHART_REALTIMEEVENT);
		createEOperation(realtimeEventEClass, REALTIME_EVENT___TO_STRING);

		fadingFunctionEClass = createEClass(FADING_FUNCTION);
		createEAttribute(fadingFunctionEClass, FADING_FUNCTION__FUNCTION);
		createEReference(fadingFunctionEClass, FADING_FUNCTION__UML_REALTIME_TRANSITIONS);
		createEAttribute(fadingFunctionEClass, FADING_FUNCTION__MIN_DURATION);
		createEAttribute(fadingFunctionEClass, FADING_FUNCTION__MAX_DURATION);
		createEAttribute(fadingFunctionEClass, FADING_FUNCTION__SPLINE1);
		createEAttribute(fadingFunctionEClass, FADING_FUNCTION__SPLINE2);
		createEAttribute(fadingFunctionEClass, FADING_FUNCTION__POLYNOM_DEGREE);
		createEReference(fadingFunctionEClass, FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE);
		createEOperation(fadingFunctionEClass, FADING_FUNCTION___GET_BREAKPOINT);

		flatSwitchingEClass = createEClass(FLAT_SWITCHING);
		createEReference(flatSwitchingEClass, FLAT_SWITCHING__UML_REALTIME_TRANSITIONS);
		createEAttribute(flatSwitchingEClass, FLAT_SWITCHING__MIN_DURATION);
		createEAttribute(flatSwitchingEClass, FLAT_SWITCHING__MAX_DURATION);
		createEAttribute(flatSwitchingEClass, FLAT_SWITCHING__SPLINE1);
		createEAttribute(flatSwitchingEClass, FLAT_SWITCHING__SPLINE2);
		createEAttribute(flatSwitchingEClass, FLAT_SWITCHING__POLYNOM_DEGREE);
		createEAttribute(flatSwitchingEClass, FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY);
		createEOperation(flatSwitchingEClass, FLAT_SWITCHING___GET_BREAKPOINT);

		initialStateEClass = createEClass(INITIAL_STATE);
		createEReference(initialStateEClass, INITIAL_STATE__UML_REALTIME_START_STATE_REV);
		createEOperation(initialStateEClass, INITIAL_STATE___GET_NEXT_STATE);
		createEOperation(initialStateEClass, INITIAL_STATE___CLONE__STATECHART_INITIALSTATE);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__OUTGOING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__INCOMING_TRANSITIONS);
		createEReference(vertexEClass, VERTEX__STATECHART);
		createEOperation(vertexEClass, VERTEX___GET_LONG_NAME);
		createEOperation(vertexEClass, VERTEX___GET_ROOT_REALTIME_STATECHART);

		statechartEClass = createEClass(STATECHART);
		createEAttribute(statechartEClass, STATECHART__EVENT_QUEUE_SIZE);
		createEAttribute(statechartEClass, STATECHART__WCET_DOCUMENT);
		createEAttribute(statechartEClass, STATECHART__SECURITY_LEVEL);
		createEAttribute(statechartEClass, STATECHART__SYSTEM_WCET_MAP);
		createEAttribute(statechartEClass, STATECHART__UTILISATION);
		createEAttribute(statechartEClass, STATECHART__SCHEDULE_DOCUMENT);
		createEReference(statechartEClass, STATECHART__UML_REALTIME_START_STATE);
		createEReference(statechartEClass, STATECHART__UML_COMPLEX_REALTIME_STATE);
		createEReference(statechartEClass, STATECHART__TRANSITIONS);
		createEReference(statechartEClass, STATECHART__VERTICES);
		createEReference(statechartEClass, STATECHART__ECLASS);
		createEReference(statechartEClass, STATECHART__UML_INTERFACE_STATECHART);
		createEReference(statechartEClass, STATECHART__BEHAVIORAL_ELEMENT);
		createEReference(statechartEClass, STATECHART__PROVIDED_MSG_IFACE);
		createEReference(statechartEClass, STATECHART__REQUIRED_MSG_IFACE);
		createEAttribute(statechartEClass, STATECHART__IS_EMBEDDED);
		createEReference(statechartEClass, STATECHART__CLOCKS);
		createEReference(statechartEClass, STATECHART__EMBEDDING_REGION);
		createEOperation(statechartEClass, STATECHART___GET_HIGHEST_PARENT_STATECHART);
		createEOperation(statechartEClass, STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN);
		createEOperation(statechartEClass, STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET);
		createEOperation(statechartEClass, STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET);
		createEOperation(statechartEClass, STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN);
		createEOperation(statechartEClass, STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN);
		createEOperation(statechartEClass, STATECHART___TO_STRING);
		createEOperation(statechartEClass, STATECHART___CLONE);

		finalStateEClass = createEClass(FINAL_STATE);
		createEOperation(finalStateEClass, FINAL_STATE___CLONE__STATECHART_FINALSTATE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR);
		createEReference(transitionEClass, TRANSITION__SEND_SYNCHRONIZATION);
		createEReference(transitionEClass, TRANSITION__RECEIVE_SYNCHRONIZATION);
		createEReference(transitionEClass, TRANSITION__SIDE_EFFECT);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__STATECHART);
		createEReference(transitionEClass, TRANSITION__RESETS);
		createEReference(transitionEClass, TRANSITION__UML_REALTIME_FLAT_SWITCHING);
		createEReference(transitionEClass, TRANSITION__UML_REALTIME_FADING_FUNCTION);
		createEReference(transitionEClass, TRANSITION__TRIGGER_EVENTS);
		createEReference(transitionEClass, TRANSITION__RAISED_EVENTS);
		createEReference(transitionEClass, TRANSITION__TIMEGUARD);
		createEReference(transitionEClass, TRANSITION__ABSOLUTE_DEADLINES);
		createEReference(transitionEClass, TRANSITION__RELATIVE_DEADLINE);
		createEAttribute(transitionEClass, TRANSITION__URGENT);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEOperation(transitionEClass, TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER);
		createEOperation(transitionEClass, TRANSITION___GET_DEFAULT_NAME);
		createEOperation(transitionEClass, TRANSITION___CLONE__STATECHART_TRANSITION);

		synchronizationChannelEClass = createEClass(SYNCHRONIZATION_CHANNEL);
		createEReference(synchronizationChannelEClass, SYNCHRONIZATION_CHANNEL__STATE);
		createEOperation(synchronizationChannelEClass, SYNCHRONIZATION_CHANNEL___CLONE__STATECHART_SYNCHRONIZATIONCHANNEL);

		clockConstraintEClass = createEClass(CLOCK_CONSTRAINT);
		createEReference(clockConstraintEClass, CLOCK_CONSTRAINT__BOUND);
		createEReference(clockConstraintEClass, CLOCK_CONSTRAINT__CLOCK);
		createEAttribute(clockConstraintEClass, CLOCK_CONSTRAINT__OPERATOR);
		createEOperation(clockConstraintEClass, CLOCK_CONSTRAINT___CLONE__STATECHART_CLOCKCONSTRAINT);

		historyStateEClass = createEClass(HISTORY_STATE);
		createEAttribute(historyStateEClass, HISTORY_STATE__KIND);

		doEventEClass = createEClass(DO_EVENT);
		createEReference(doEventEClass, DO_EVENT__ACTION);
		createEReference(doEventEClass, DO_EVENT__DO_ACTION_REV);
		createEAttribute(doEventEClass, DO_EVENT__PERIOD_LOWER);
		createEAttribute(doEventEClass, DO_EVENT__PERIOD_UPPER);

		entryOrExitEventEClass = createEClass(ENTRY_OR_EXIT_EVENT);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__RESETS);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV);
		createEReference(entryOrExitEventEClass, ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEReference(synchronizationEClass, SYNCHRONIZATION__SEND_SYNC_REV);
		createEReference(synchronizationEClass, SYNCHRONIZATION__RECEIVE_SYNC_REV);

		prioritizableEClass = createEClass(PRIORITIZABLE);
		createEAttribute(prioritizableEClass, PRIORITIZABLE__PRIORITY);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__STATECHART);
		createEReference(regionEClass, REGION__PARENT_STATE);

		// Create enums
		historyKindEEnum = createEEnum(HISTORY_KIND);
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
		ReconfPackage theReconfPackage = (ReconfPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI);
		HelperPackage theHelperPackage = (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		SDMPackage theSDMPackage = (SDMPackage)EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		org.storydriven.modeling.calls.expressions.ExpressionsPackage theExpressionsPackage_1 = (org.storydriven.modeling.calls.expressions.ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		CallsPackage theCallsPackage = (CallsPackage)EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theReconfPackage);
		getESubpackages().add(theHelperPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		absoluteDeadlineEClass.getESuperTypes().add(this.getDeadline());
		relativeDeadlineEClass.getESuperTypes().add(this.getDeadline());
		clockEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		umlInterfaceStatechartEClass.getESuperTypes().add(this.getStatechart());
		actionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		realtimeEventEClass.getESuperTypes().add(theExpressionsPackage_1.getMethodCallExpression());
		initialStateEClass.getESuperTypes().add(this.getVertex());
		vertexEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		statechartEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		statechartEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		finalStateEClass.getESuperTypes().add(this.getVertex());
		transitionEClass.getESuperTypes().add(this.getPrioritizable());
		transitionEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
		synchronizationChannelEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		synchronizationChannelEClass.getESuperTypes().add(theCallsPackage.getCallable());
		historyStateEClass.getESuperTypes().add(this.getVertex());
		synchronizationEClass.getESuperTypes().add(theCallsPackage.getInvocation());
		regionEClass.getESuperTypes().add(this.getPrioritizable());

		// Initialize classes, features, and operations; add parameters
		initEClass(deadlineEClass, Deadline.class, "Deadline", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeadline_UpperBound(), theCorePackage.getNaturalNumber(), null, "upperBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeadline_LowerBound(), theCorePackage.getNaturalNumber(), null, "lowerBound", null, 0, 1, Deadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteDeadlineEClass, AbsoluteDeadline.class, "AbsoluteDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteDeadline_UMLRealtimeTransition(), this.getTransition(), this.getTransition_AbsoluteDeadlines(), "uMLRealtimeTransition", null, 1, 1, AbsoluteDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbsoluteDeadline_UMLClock(), this.getClock(), this.getClock_AbsoluteDeadlines(), "uMLClock", null, 1, 1, AbsoluteDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeDeadlineEClass, RelativeDeadline.class, "RelativeDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelativeDeadline_UMLRealtimeTransition(), this.getTransition(), this.getTransition_RelativeDeadline(), "uMLRealtimeTransition", null, 0, 1, RelativeDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClock_Id(), ecorePackage.getEString(), "id", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClock_AbsoluteDeadlines(), this.getAbsoluteDeadline(), this.getAbsoluteDeadline_UMLClock(), "absoluteDeadlines", null, 0, -1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClock_Statechart(), this.getStatechart(), this.getStatechart_Clocks(), "statechart", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClock_Resets(), this.getClock(), null, "resets", null, 0, -1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClock_ClockConstraints(), this.getClockConstraint(), this.getClockConstraint_Clock(), "clockConstraints", null, 0, -1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getClock__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getClock__Clone__Statechart_Clock(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClock(), "newClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Regions(), this.getRegion(), this.getRegion_ParentState(), "regions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_DoAction(), this.getDoEvent(), this.getDoEvent_DoActionRev(), "doAction", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ExitAction(), this.getEntryOrExitEvent(), this.getEntryOrExitEvent_ExitActionRev(), "exitAction", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_EntryAction(), this.getEntryOrExitEvent(), this.getEntryOrExitEvent_EntryActionRev(), "entryAction", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ReconfDiagram(), theReconfPackage.getReconfDiagram(), null, "reconfDiagram", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_InterfacedStates(), this.getState(), null, "interfacedStates", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_InterfaceState(), this.getState(), null, "interfaceState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Invariants(), this.getClockConstraint(), null, "invariants", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Committed(), theEcorePackage.getEBoolean(), "committed", "false", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Channels(), this.getSynchronizationChannel(), this.getSynchronizationChannel_State(), "channels", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getState__Clone__Statechart_State(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "newComplexState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(umlInterfaceStatechartEClass, UMLInterfaceStatechart.class, "UMLInterfaceStatechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLInterfaceStatechart_UMLRealtimeStatechart(), this.getStatechart(), null, "uMLRealtimeStatechart", null, 0, 1, UMLInterfaceStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Id(), ecorePackage.getEString(), "id", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Wcet(), ecorePackage.getELongObject(), "wcet", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Blocking(), ecorePackage.getELong(), "blocking", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_UMLRealtimeTransition(), this.getTransition(), this.getTransition_SideEffect(), "uMLRealtimeTransition", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Resets(), this.getClock(), null, "resets", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_WCETSpecifiedByUser(), theEcorePackage.getEBoolean(), "wCETSpecifiedByUser", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAction__Clone__Statechart_Action(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "newAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(realtimeEventEClass, RealtimeEvent.class, "RealtimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeEvent_TriggeredUMLRealtimeTransition(), this.getTransition(), null, "triggeredUMLRealtimeTransition", null, 0, 1, RealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeEvent_RaisedUMLRealtimeTransition(), this.getTransition(), null, "raisedUMLRealtimeTransition", null, 0, 1, RealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealtimeEvent_Instance(), ecorePackage.getEString(), "instance", null, 0, 1, RealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealtimeEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, RealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealtimeEvent_FullEventName(), ecorePackage.getEString(), "fullEventName", null, 0, 1, RealtimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRealtimeEvent__Clone__Statechart_RealtimeEvent(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRealtimeEvent(), "newEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRealtimeEvent__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fadingFunctionEClass, FadingFunction.class, "FadingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFadingFunction_Function(), ecorePackage.getEString(), "function", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFadingFunction_UMLRealtimeTransitions(), this.getTransition(), this.getTransition_UMLRealtimeFadingFunction(), "uMLRealtimeTransitions", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFadingFunction_MinDuration(), ecorePackage.getEFloat(), "minDuration", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFadingFunction_MaxDuration(), ecorePackage.getEFloat(), "maxDuration", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFadingFunction_Spline1(), ecorePackage.getEString(), "spline1", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFadingFunction_Spline2(), ecorePackage.getEString(), "spline2", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFadingFunction_PolynomDegree(), ecorePackage.getEInt(), "polynomDegree", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFadingFunction_PortsByComponentInstance(), theInstancePackage.getPortInstance(), null, "portsByComponentInstance", null, 0, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFadingFunction__GetBreakpoint(), ecorePackage.getEBoolean(), "getBreakpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flatSwitchingEClass, FlatSwitching.class, "FlatSwitching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlatSwitching_UMLRealtimeTransitions(), this.getTransition(), null, "uMLRealtimeTransitions", null, 0, -1, FlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatSwitching_MinDuration(), ecorePackage.getEFloat(), "minDuration", null, 0, 1, FlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatSwitching_MaxDuration(), ecorePackage.getEFloat(), "maxDuration", null, 0, 1, FlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatSwitching_Spline1(), ecorePackage.getEString(), "spline1", null, 0, 1, FlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatSwitching_Spline2(), ecorePackage.getEString(), "spline2", null, 0, 1, FlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatSwitching_PolynomDegree(), ecorePackage.getEInt(), "polynomDegree", null, 0, 1, FlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theHelperPackage.getMyMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getFlatSwitching_PortInstToPortInstMapEntry(), g1, "portInstToPortInstMapEntry", null, 0, 1, FlatSwitching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFlatSwitching__GetBreakpoint(), ecorePackage.getEBoolean(), "getBreakpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialState_UMLRealtimeStartStateRev(), this.getStatechart(), this.getStatechart_UMLRealtimeStartState(), "uMLRealtimeStartStateRev", null, 0, 1, InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInitialState__GetNextState(), this.getVertex(), "getNextState", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialState__Clone__Statechart_InitialState(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInitialState(), "newStartState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_OutgoingTransitions(), this.getTransition(), null, "outgoingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_IncomingTransitions(), this.getTransition(), null, "incomingTransitions", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_Statechart(), this.getStatechart(), null, "statechart", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVertex__GetLongName(), theEcorePackage.getEString(), "getLongName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVertex__GetRootRealtimeStatechart(), this.getStatechart(), "getRootRealtimeStatechart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statechartEClass, Statechart.class, "Statechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatechart_EventQueueSize(), ecorePackage.getEInt(), "eventQueueSize", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatechart_WcetDocument(), ecorePackage.getEString(), "wcetDocument", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatechart_SecurityLevel(), ecorePackage.getEInt(), "securityLevel", "0", 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatechart_SystemWcetMap(), theHelperPackage.getMap(), "systemWcetMap", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatechart_Utilisation(), ecorePackage.getEDouble(), "utilisation", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatechart_ScheduleDocument(), ecorePackage.getEString(), "scheduleDocument", "\\\"schedule.xml\\\"", 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_UMLRealtimeStartState(), this.getInitialState(), this.getInitialState_UMLRealtimeStartStateRev(), "uMLRealtimeStartState", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_UMLComplexRealtimeState(), this.getState(), null, "uMLComplexRealtimeState", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_Vertices(), this.getVertex(), null, "vertices", null, 0, -1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_UMLInterfaceStatechart(), this.getUMLInterfaceStatechart(), null, "uMLInterfaceStatechart", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_BehavioralElement(), theCorePackage.getBehavioralElement(), null, "behavioralElement", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_ProvidedMsgIFace(), theHelperPackage.getStringToEClass(), null, "providedMsgIFace", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_RequiredMsgIFace(), theHelperPackage.getStringToEClass(), null, "requiredMsgIFace", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatechart_IsEmbedded(), theEcorePackage.getEBoolean(), "isEmbedded", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_Clocks(), this.getClock(), this.getClock_Statechart(), "clocks", null, 0, -1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatechart_EmbeddingRegion(), this.getRegion(), this.getRegion_Statechart(), "embeddingRegion", null, 0, 1, Statechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStatechart__GetHighestParentStatechart(), this.getStatechart(), "getHighestParentStatechart", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStatechart__AddAllUMLRealtimeStates__Set_boolean(), null, "addAllUMLRealtimeStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getVertex());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusiveStartStates", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStatechart__AddComplexUMLRealtimeStates__Set(), null, "addComplexUMLRealtimeStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStatechart__AddAllUMLRealtimeTransitions__Set(), null, "addAllUMLRealtimeTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getTransition());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStatechart__IteratorOfAllUMLClocks__boolean(), theHelperPackage.getIterator(), "iteratorOfAllUMLClocks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "excludeNoClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStatechart__AddAllUMLClocks__Set_boolean(), null, "addAllUMLClocks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(this.getClock());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "excludeNoClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatechart__ToString(), theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatechart__Clone(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFinalState__Clone__Statechart_FinalState(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFinalState(), "newStopState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_UMLRealtimeTransitionMappingVector(), theHelperPackage.getVector(), "uMLRealtimeTransitionMappingVector", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_SendSynchronization(), this.getSynchronization(), this.getSynchronization_SendSyncRev(), "sendSynchronization", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ReceiveSynchronization(), this.getSynchronization(), this.getSynchronization_ReceiveSyncRev(), "receiveSynchronization", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_SideEffect(), this.getAction(), this.getAction_UMLRealtimeTransition(), "sideEffect", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getVertex(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getVertex(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Statechart(), this.getStatechart(), null, "statechart", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Resets(), this.getClock(), null, "resets", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_UMLRealtimeFlatSwitching(), this.getFlatSwitching(), null, "uMLRealtimeFlatSwitching", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_UMLRealtimeFadingFunction(), this.getFadingFunction(), this.getFadingFunction_UMLRealtimeTransitions(), "uMLRealtimeFadingFunction", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TriggerEvents(), this.getRealtimeEvent(), null, "triggerEvents", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_RaisedEvents(), this.getRealtimeEvent(), null, "raisedEvents", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Timeguard(), this.getClockConstraint(), null, "timeguard", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_AbsoluteDeadlines(), this.getAbsoluteDeadline(), this.getAbsoluteDeadline_UMLRealtimeTransition(), "absoluteDeadlines", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_RelativeDeadline(), this.getRelativeDeadline(), this.getRelativeDeadline_UMLRealtimeTransition(), "relativeDeadline", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Urgent(), theEcorePackage.getEBoolean(), "urgent", "true", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guard(), theExpressionsPackage.getExpression(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition__CalculateWorstCaseDeadlineAsNaturalNumber(), theCorePackage.getNaturalNumber(), "calculateWorstCaseDeadlineAsNaturalNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransition__GetDefaultName(), theEcorePackage.getEString(), "getDefaultName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__Clone__Statechart_Transition(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransition(), "newTransition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(synchronizationChannelEClass, SynchronizationChannel.class, "SynchronizationChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationChannel_State(), this.getState(), this.getState_Channels(), "state", null, 0, 1, SynchronizationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSynchronizationChannel__Clone__Statechart_SynchronizationChannel(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSynchronizationChannel(), "newChannel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clockConstraintEClass, ClockConstraint.class, "ClockConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockConstraint_Bound(), theCorePackage.getNaturalNumber(), null, "bound", null, 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockConstraint_Clock(), this.getClock(), this.getClock_ClockConstraints(), "clock", null, 0, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockConstraint_Operator(), theExpressionsPackage.getComparingOperator(), "operator", "ComparingOperator.LESS_OR_EQUAL", 1, 1, ClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getClockConstraint__Clone__Statechart_ClockConstraint(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatechart(), "rtsc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClockConstraint(), "newAtom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyStateEClass, HistoryState.class, "HistoryState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoryState_Kind(), this.getHistoryKind(), "kind", null, 0, 1, HistoryState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doEventEClass, DoEvent.class, "DoEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoEvent_Action(), this.getAction(), null, "action", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoEvent_DoActionRev(), this.getState(), this.getState_DoAction(), "doActionRev", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoEvent_PeriodLower(), theEcorePackage.getEInt(), "periodLower", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoEvent_PeriodUpper(), theEcorePackage.getEInt(), "periodUpper", null, 0, 1, DoEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryOrExitEventEClass, EntryOrExitEvent.class, "EntryOrExitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryOrExitEvent_Resets(), this.getClock(), null, "resets", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_EntryActionRev(), this.getState(), this.getState_EntryAction(), "entryActionRev", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_ExitActionRev(), this.getState(), this.getState_ExitAction(), "exitActionRev", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOrExitEvent_UMLRealtimeAction(), this.getAction(), null, "uMLRealtimeAction", null, 0, 1, EntryOrExitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronization_SendSyncRev(), this.getTransition(), this.getTransition_SendSynchronization(), "sendSyncRev", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronization_ReceiveSyncRev(), this.getTransition(), this.getTransition_ReceiveSynchronization(), "receiveSyncRev", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritizableEClass, Prioritizable.class, "Prioritizable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritizable_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Prioritizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Statechart(), this.getStatechart(), this.getStatechart_EmbeddingRegion(), "statechart", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_ParentState(), this.getState(), this.getState_Regions(), "parentState", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(historyKindEEnum, HistoryKind.class, "HistoryKind");
		addEEnumLiteral(historyKindEEnum, HistoryKind.DEEP);
		addEEnumLiteral(historyKindEEnum, HistoryKind.SHALLOW);

		// Create resource
		createResource(eNS_URI);
	}

} //RealtimestatechartPackageImpl
