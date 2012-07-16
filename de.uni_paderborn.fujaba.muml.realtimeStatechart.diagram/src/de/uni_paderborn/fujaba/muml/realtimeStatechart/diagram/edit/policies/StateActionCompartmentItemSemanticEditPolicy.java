package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateActionCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateActionCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3017);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryEvent_3018 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.EntryEventCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.DoEvent_3019 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.DoEventCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitEvent_3020 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.ExitEventCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
