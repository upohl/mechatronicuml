package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPattern2EditPart;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternCoordinationPatternContainerCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry;

/**
 * Our customized EditPartFactory, which makes sure our overridden
 * EditPart-Classes are instantiated.
 * 
 * @author bingo
 * 
 */
public class CustomPatternEditPartFactory extends MumlEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case ModelElementCategoryEditPart.VISUAL_ID:
				return new CustomModelElementCategoryEditPart(view);
			case CoordinationPatternCoordinationPatternContainerCompartmentEditPart.VISUAL_ID:
				return new CustomCoordinationPatternCoordinationPatternContainerCompartmentEditPart(view);
			case RoleEditPart.VISUAL_ID:
				return new CustomRoleEditPart(view);
			case CoordinationPattern2EditPart.VISUAL_ID:
				return new CustomCoordination2PatternEditPart(view);
//			case ConstrainableElementConstraintEditPart.VISUAL_ID:
//				return new CustomTextualConstraintEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}
}
