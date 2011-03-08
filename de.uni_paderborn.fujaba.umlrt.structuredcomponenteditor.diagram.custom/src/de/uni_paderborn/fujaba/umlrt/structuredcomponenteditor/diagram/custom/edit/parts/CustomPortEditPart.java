package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.common.edit.parts.PortBehavior;
import de.uni_paderborn.fujaba.umlrt.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies.CustomPortGraphicalNodeEditPolicy;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies.CustomPortItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart;

/**
 * A customized PortEditPart. It is responsible for ports around
 * StructuredComponents.
 * 
 * @author bingo
 * 
 */
public class CustomPortEditPart extends PortEditPart {

	/**
	 * All logic that is common between CustomPortEditPart and
	 * CustomPort2EditPart is delegated, to reduce duplicate code.
	 */
	private PortBehavior delegation;

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomPortEditPart(View view) {
		super(view);

	}

	/**
	 * Creates the custom figure.
	 */
	@Override
	protected IFigure createNodeShape() {
		CustomPortFigure portFigure = new CustomPortFigure(getMapMode());
		primaryShape = portFigure;
		getDelegation().setPortFigure(portFigure);
		return primaryShape;
	}

	@Override
	protected NodeFigure createNodePlate() {
		return getDelegation().createNodePlate();
	}

	private PortBehavior getDelegation() {
		if (delegation == null) {
			delegation = new PortBehavior(this);
		}
		return delegation;
	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		getDelegation().handleNotificationEvent(notification);
		super.handleNotificationEvent(notification);
	}

	/**
	 * Initializes this EditPart, when it is activated.
	 */
	@Override
	public void activate() {
		getDelegation().activate();

		EditPart parentEditPart = getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			getDelegation().addPortContainerLayoutListener(portContainerFigure);
		}

		super.activate();
	}

	/**
	 * Cleanup this EditPart.
	 */
	@Override
	public void deactivate() {
		EditPart parentEditPart = getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			getDelegation().removePortContainerLayoutListener(
					portContainerFigure);
		}
		getDelegation().deactivate();
		super.deactivate();
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new CustomPortGraphicalNodeEditPolicy());

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomPortItemSemanticEditPolicy());

	}

}
