package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RoleConnectorItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleConnectorItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.RoleConnector_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
