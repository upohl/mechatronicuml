package pattern.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import pattern.diagram.part.Pattern2VisualIDRegistry;

/**
 * @generated
 */
public class Pattern2EditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Pattern2VisualIDRegistry.getVisualID(view)) {

			case ModelElementCategoryEditPart.VISUAL_ID:
				return new ModelElementCategoryEditPart(view);

			case CoordinationPatternEditPart.VISUAL_ID:
				return new CoordinationPatternEditPart(view);

			case CoordinationPattern2EditPart.VISUAL_ID:
				return new CoordinationPattern2EditPart(view);

			case CoordinationPatternNameEditPart.VISUAL_ID:
				return new CoordinationPatternNameEditPart(view);

			case RoleEditPart.VISUAL_ID:
				return new RoleEditPart(view);

			case RoleNameEditPart.VISUAL_ID:
				return new RoleNameEditPart(view);

			case CoordinationPatternCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
				return new CoordinationPatternCoordinationProtocolContainerCompartmentEditPart(
						view);

			case RoleCoordinationProtocolEditPart.VISUAL_ID:
				return new RoleCoordinationProtocolEditPart(view);

			case RoleConnectorEditPart.VISUAL_ID:
				return new RoleConnectorEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
