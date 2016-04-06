package org.muml.pim.pattern.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DiscreteInteractionEndpointReceiverMessageBufferReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public DiscreteInteractionEndpointReceiverMessageBufferReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof org.muml.pim.connector.DiscreteInteractionEndpoint) {
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
		if (!(oldEnd instanceof org.muml.pim.connector.MessageBuffer
				&& newEnd instanceof org.muml.pim.connector.DiscreteInteractionEndpoint)) {
			return false;
		}
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDiscreteInteractionEndpointReceiverMessageBuffer_4003(getNewSource(),
						getOldTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDiscreteInteractionEndpointReceiverMessageBuffer_4003(getNewSource(),
							getOldTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.muml.pim.connector.MessageBuffer
				&& newEnd instanceof org.muml.pim.connector.MessageBuffer)) {
			return false;
		}
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDiscreteInteractionEndpointReceiverMessageBuffer_4003(getOldSource(),
						getNewTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDiscreteInteractionEndpointReceiverMessageBuffer_4003(getOldSource(),
							getNewTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy.showMessage(targetView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
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

		// Enhancement for MUML-BUG #446
		if (getOldSource().getReceiverMessageBuffer().size() > 1) {
			getOldSource().getReceiverMessageBuffer().remove(getOldTarget());
		}
		getNewSource().getReceiverMessageBuffer().add(getOldTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {

		// Enhancement for MUML-BUG #446
		if (getOldSource().getReceiverMessageBuffer().size() > 1) {
			getOldSource().getReceiverMessageBuffer().remove(getOldTarget());
		}
		getOldSource().getReceiverMessageBuffer().add(getNewTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected org.muml.pim.connector.DiscreteInteractionEndpoint getOldSource() {
		return (org.muml.pim.connector.DiscreteInteractionEndpoint) referenceOwner;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.connector.DiscreteInteractionEndpoint getNewSource() {
		return (org.muml.pim.connector.DiscreteInteractionEndpoint) newEnd;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.connector.MessageBuffer getOldTarget() {
		return (org.muml.pim.connector.MessageBuffer) oldEnd;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.connector.MessageBuffer getNewTarget() {
		return (org.muml.pim.connector.MessageBuffer) newEnd;
	}

	/**
	* @generated
	*/
	protected int getReorientDirection() {
		return reorientDirection;
	}
}