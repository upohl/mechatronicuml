package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.Port2ItemSemanticEditPolicy;

/**
 * A customized Port2ItemSemanticEditPolicy. We create our customized Delegation
 * and Assembly-CreateCommands here.
 * 
 * @author bingo
 * 
 */
public class CustomPort2ItemSemanticEditPolicy extends
		Port2ItemSemanticEditPolicy {

	/**
	 * We delegate all logic that is common between
	 * CustomPortItemSemanticEditPolicy and CustomPort2ItemSemanticEditPolicy.
	 */
	private CustomPortItemSemanticDelegation delegation;

	/**
	 * Activates this EditPolicy. We create the CustomPortItemSemanticDelegation
	 * instance to delegate logic.
	 */
	@Override
	public void activate() {
		super.activate();
		delegation = new CustomPortItemSemanticDelegation();
	}

	/**
	 * Deactivates this EditPolicy.
	 */
	@Override
	public void deactivate() {
		super.deactivate();
		delegation = null;
	}

	/**
	 * Delegates to the CustomPortItemSemanticDelegation.
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (delegation != null) {
			EditElementCommand command = delegation
					.getCreateRelationshipCommand(req, getHost());
			if (command != null) {
				return getGEFWrapper(command);
			}
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * Deleting a PartPort also deletes the Port on Type-Layer. So we forbid
	 * deleting this model element; instead only the view object will be
	 * deleted.
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

}
