package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class RoleEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public RoleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.policies.RoleItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new RectangleFigure();
	}

	/**
	 * @generated
	 */
	public RectangleFigure getPrimaryShape() {
		return (RectangleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleNameEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001);
		types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RolePattern_4002);
		types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4003);
		types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RolePattern_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4003);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.Role_2002);
		} else if (relationshipType == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RolePattern_4002) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.CoordinationPattern_2001);
		} else if (relationshipType == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4003) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.TextualConstraint_2003);
		} else if (relationshipType == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.TextualConstraint_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001) {
			types.add(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.Role_2002);
		}
		return types;
	}

}
