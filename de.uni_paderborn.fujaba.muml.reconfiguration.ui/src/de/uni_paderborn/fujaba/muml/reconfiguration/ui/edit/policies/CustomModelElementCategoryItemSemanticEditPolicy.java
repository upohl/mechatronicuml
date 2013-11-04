package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.ModelElementCategoryItemSemanticEditPolicy;

public class CustomModelElementCategoryItemSemanticEditPolicy extends ModelElementCategoryItemSemanticEditPolicy{
	
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurableStructuredComponent_2076== req
				.getElementType()) {
			//TODO create own CreateCommand
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.commands.ReconfigurableStructuredComponentCreateCommand(
					req));
		}

		return super.getCreateCommand(req);
	}

}
