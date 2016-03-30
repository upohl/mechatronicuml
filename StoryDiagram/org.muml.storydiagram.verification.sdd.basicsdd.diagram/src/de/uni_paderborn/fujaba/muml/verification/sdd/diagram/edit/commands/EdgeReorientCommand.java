package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public EdgeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Edge) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Node && newEnd instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Node)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.verification.sdd.Node target = getLink()
				.getTargetNode();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram container = (de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEdge_4001(container, getLink(),
						getNewSource(), target, sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorEdge_4001(container,
							getNewSource(), target, sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Node && newEnd instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Node)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.verification.sdd.Node source = getLink()
				.getSourceNode();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram container = (de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEdge_4001(container, getLink(),
						source, getNewTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorEdge_4001(container, source,
							getNewTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
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

		getLink().setSourceNode(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		getLink().setTargetNode(getNewTarget());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.verification.sdd.Edge getLink() {
		return (de.uni_paderborn.fujaba.muml.verification.sdd.Edge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.verification.sdd.Node getOldSource() {
		return (de.uni_paderborn.fujaba.muml.verification.sdd.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.verification.sdd.Node getNewSource() {
		return (de.uni_paderborn.fujaba.muml.verification.sdd.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.verification.sdd.Node getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.verification.sdd.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.verification.sdd.Node getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.verification.sdd.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
