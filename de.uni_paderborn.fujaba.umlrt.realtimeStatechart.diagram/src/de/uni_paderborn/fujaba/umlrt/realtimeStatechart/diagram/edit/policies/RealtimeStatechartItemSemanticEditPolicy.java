package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class RealtimeStatechartItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RealtimeStatechartItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.UmlrtElementTypes.FujabaRealtimeStatechart_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2020 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.StateCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2021 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.State2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2022 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.State3CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.UmlrtElementTypes.HistoryState_2023 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.HistoryStateCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.UmlrtElementTypes.Clock_2024 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.ClockCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
