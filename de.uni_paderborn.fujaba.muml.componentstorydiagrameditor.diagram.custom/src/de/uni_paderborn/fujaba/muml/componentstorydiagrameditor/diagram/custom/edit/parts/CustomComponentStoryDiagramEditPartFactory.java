package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeGuardEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryDiagramEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryRuleEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableOperatorEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableName2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabel2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabel3EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabel4EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabel5EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabelEditPart;

public class CustomComponentStoryDiagramEditPartFactory extends
		ComponentStoryDiagramEditPartFactory {

	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(view)) {
			
			case ComponentStoryRuleEditPart.VISUAL_ID:
				return new CustomComponentStoryRuleEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new CustomActivityEditPart(view);
			case ActivityActivityCompartmentEditPart.VISUAL_ID:
				return new CustomActivityActivityCompartmentEditPart(view);
			case ActivityNameEditPart.VISUAL_ID:
				return new CustomActivityNameEditPart(view);

			case ActivityEdgeGuardEditPart.VISUAL_ID:
				return new CustomActivityEdgeGuardEditPart(view);
			case WrappingLabel4EditPart.VISUAL_ID:
				return new CustomWrappingLabel4EditPart(view);

			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new CustomActivityFinalNodeEditPart(view);

			case ComponentStoryNodeEditPart.VISUAL_ID:
				return new CustomComponentStoryNodeEditPart(view);
			case ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
				return new CustomComponentStoryNodeComponentStoryNodeCompartmentEditPart(
						view);	
			case ComponentStoryPatternEditPart.VISUAL_ID:
				return new CustomComponentStoryPatternEditPart(view);
			case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
				return new CustomComponentStoryPatternComponentStoryPatternCompartmentEditPart(view);

			case ComponentVariableEditPart.VISUAL_ID:
				return new CustomComponentVariableEditPart(view);
			case ComponentVariableOperatorEditPart.VISUAL_ID:
				return new CustomComponentVariableOperatorEditPart(view);
				
			case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new CustomComponentVariableComponentVariableCompartmentEditPart(view);

			case PartVariableEditPart.VISUAL_ID:
				return new CustomPartVariableEditPart(view);
			case WrappingLabel5EditPart.VISUAL_ID:
				return new CustomWrappingLabel5EditPart(view);
			case WrappingLabel2EditPart.VISUAL_ID:
				return new CustomWrappingLabel2EditPart(view);

			case PortVariableEditPart.VISUAL_ID:
				return new CustomPortVariableEditPart(view);
			case PortVariable2EditPart.VISUAL_ID:
				return new CustomPortVariable2EditPart(view);
			case WrappingLabelEditPart.VISUAL_ID:
				return new CustomWrappingLabelEditPart(view);
			case PortVariableNameEditPart.VISUAL_ID:
				return new CustomPortVariableNameEditPart(view);
			case PortVariableName2EditPart.VISUAL_ID:
				return new CustomPortVariableName2EditPart(view);
			case WrappingLabel3EditPart.VISUAL_ID:
				return new CustomWrappingLabel3EditPart(view);

			case AssemblyVariableEditPart.VISUAL_ID:
				return new CustomAssemblyVariableEditPart(view);
			case AssemblyVariableNameEditPart.VISUAL_ID:
				return new CustomAssemblyVariableNameEditPart(view);
			case DelegationVariableEditPart.VISUAL_ID:
				return new CustomDelegationVariableEditPart(view);
			case DelegationVariableNameEditPart.VISUAL_ID:
				return new CustomDelegationVariableNameEditPart(view);

			}
		}
		return super.createEditPart(context, model);

	}
}
