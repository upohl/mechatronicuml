package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.SDMPackage;

/**
 * @generated
 */
public class RealtimeStatechartParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5005Parser() {
		if (stateName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			stateName_5005Parser = parser;
		}
		return stateName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser clockNameId_5014Parser;

	/**
	 * @generated
	 */
	private IParser getClockNameId_5014Parser() {
		if (clockNameId_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SDMPackage.eINSTANCE.getNamedElement_Name(),
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClock_Id() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			clockNameId_5014Parser = parser;
		}
		return clockNameId_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser entryEventEventExpr_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEntryEventEventExpr_5010Parser() {
		if (entryEventEventExpr_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getEntryOrExitEvent_EventExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			entryEventEventExpr_5010Parser = parser;
		}
		return entryEventEventExpr_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser doEventEventExpr_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDoEventEventExpr_5006Parser() {
		if (doEventEventExpr_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getDoEvent_EventExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			doEventEventExpr_5006Parser = parser;
		}
		return doEventEventExpr_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitEventEventExpr_5011Parser;

	/**
	 * @generated
	 */
	private IParser getExitEventEventExpr_5011Parser() {
		if (exitEventEventExpr_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getEntryOrExitEvent_EventExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			exitEventEventExpr_5011Parser = parser;
		}
		return exitEventEventExpr_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser clockConstraintClockConstraintExpr_5012Parser;

	/**
	 * @generated
	 */
	private IParser getClockConstraintClockConstraintExpr_5012Parser() {
		if (clockConstraintClockConstraintExpr_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_ClockConstraintExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			clockConstraintClockConstraintExpr_5012Parser = parser;
		}
		return clockConstraintClockConstraintExpr_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser synchronizationChannelSynchroChannelExpr_5013Parser;

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelSynchroChannelExpr_5013Parser() {
		if (synchronizationChannelSynchroChannelExpr_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getSynchronizationChannel_SynchroChannelExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			synchronizationChannelSynchroChannelExpr_5013Parser = parser;
		}
		return synchronizationChannelSynchroChannelExpr_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionPriority_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionPriority_6001Parser() {
		if (transitionPriority_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizable_Priority() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionPriority_6001Parser = parser;
		}
		return transitionPriority_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionClockResetExpr_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionClockResetExpr_6002Parser() {
		if (transitionClockResetExpr_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_ClockResetExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionClockResetExpr_6002Parser = parser;
		}
		return transitionClockResetExpr_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionDeadlineExpr_6003Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionDeadlineExpr_6003Parser() {
		if (transitionDeadlineExpr_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_DeadlineExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionDeadlineExpr_6003Parser = parser;
		}
		return transitionDeadlineExpr_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionEventExpr_6004Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionEventExpr_6004Parser() {
		if (transitionEventExpr_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_EventExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionEventExpr_6004Parser = parser;
		}
		return transitionEventExpr_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionGuardExpr_6005Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionGuardExpr_6005Parser() {
		if (transitionGuardExpr_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_GuardExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionGuardExpr_6005Parser = parser;
		}
		return transitionGuardExpr_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionSideEffectExpr_6006Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionSideEffectExpr_6006Parser() {
		if (transitionSideEffectExpr_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_SideEffectExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionSideEffectExpr_6006Parser = parser;
		}
		return transitionSideEffectExpr_6006Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTimeGuardExpr_6007Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTimeGuardExpr_6007Parser() {
		if (transitionTimeGuardExpr_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_TimeGuardExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionTimeGuardExpr_6007Parser = parser;
		}
		return transitionTimeGuardExpr_6007Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionSafetyTransition_6008Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionSafetyTransition_6008Parser() {
		if (transitionSafetyTransition_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_SafetyTransition() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionSafetyTransition_6008Parser = parser;
		}
		return transitionSafetyTransition_6008Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionSynchroExpr_6009Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionSynchroExpr_6009Parser() {
		if (transitionSynchroExpr_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_SynchroExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionSynchroExpr_6009Parser = parser;
		}
		return transitionSynchroExpr_6009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
			return getStateName_5005Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockNameIdEditPart.VISUAL_ID:
			return getClockNameId_5014Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventActionExprEditPart.VISUAL_ID:
			return getEntryEventEventExpr_5010Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventPeriodLowerPeriodUpperEditPart.VISUAL_ID:
			return getDoEventEventExpr_5006Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventActionExprEditPart.VISUAL_ID:
			return getExitEventEventExpr_5011Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintClockConstraintExprEditPart.VISUAL_ID:
			return getClockConstraintClockConstraintExpr_5012Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelSynchroChannelExprEditPart.VISUAL_ID:
			return getSynchronizationChannelSynchroChannelExpr_5013Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID:
			return getTransitionPriority_6001Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetExprEditPart.VISUAL_ID:
			return getTransitionClockResetExpr_6002Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionDeadlineExprEditPart.VISUAL_ID:
			return getTransitionDeadlineExpr_6003Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventExprEditPart.VISUAL_ID:
			return getTransitionEventExpr_6004Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart.VISUAL_ID:
			return getTransitionGuardExpr_6005Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSideEffectExprEditPart.VISUAL_ID:
			return getTransitionSideEffectExpr_6006Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTimeGuardExprEditPart.VISUAL_ID:
			return getTransitionTimeGuardExpr_6007Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionEditPart.VISUAL_ID:
			return getTransitionSafetyTransition_6008Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart.VISUAL_ID:
			return getTransitionSynchroExpr_6009Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
