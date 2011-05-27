package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DelegationInstanceReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	protected final int reorientDirection;

	/**
	 * @generated
	 */
	protected final EObject oldEnd;

	/**
	 * @generated
	 */
	protected final EObject newEnd;

	/**
	 * @generated
	 */
	public DelegationInstanceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.instance.PortInstance && newEnd instanceof de.uni_paderborn.fujaba.muml.model.instance.PortInstance)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.instance.PortInstance target = getLink()
				.getTarget();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationInstance_4004(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.instance.PortInstance && newEnd instanceof de.uni_paderborn.fujaba.muml.model.instance.PortInstance)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.instance.PortInstance source = getLink()
				.getSource();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationInstance_4004(
						container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance getLink() {
		return (de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.instance.PortInstance getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.instance.PortInstance getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.instance.PortInstance getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.instance.PortInstance getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) newEnd;
	}
}
