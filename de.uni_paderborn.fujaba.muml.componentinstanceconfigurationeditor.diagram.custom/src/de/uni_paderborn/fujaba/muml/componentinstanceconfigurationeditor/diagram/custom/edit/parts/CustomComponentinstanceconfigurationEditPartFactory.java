package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationEditPartFactory extends
		MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case DiscreteMultiPortInstanceEditPart.VISUAL_ID:

			case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
				return new CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart(
						view);

			case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
				return new CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart(
						view);

			case StructuredComponentInstanceEditPart.VISUAL_ID:
				return new CustomStructuredComponentInstanceEditPart(view);

			case AtomicComponentInstanceEditPart.VISUAL_ID:
				return new CustomAtomicComponentInstanceEditPart(view);

			case StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
				return new CustomStructuredComponentInstanceComponentInstanceContentsCompartmentEditPart(
						view);

			case StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
				return new CustomStructuredComponentInstanceComponentInstanceContentsCompartment2EditPart(
						view);
			}
		}
		return super.createEditPart(context, model);
	}

}
