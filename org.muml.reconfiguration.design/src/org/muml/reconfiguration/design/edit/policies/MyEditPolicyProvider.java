package org.muml.reconfiguration.design.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

public class MyEditPolicyProvider extends AbstractEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		EObject element = getSemanticElement(editPart);
//		if (element instanceof PortVariable) {
//			editPart.installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE,
//					new PortVariableEditPolicy());
//		}
	}

	private EObject getSemanticElement(EditPart editPart) {
		Object model = editPart.getModel();
		if (model instanceof View) {
			View view = (View) model;
			EObject element = view.getElement();
			if (element instanceof DSemanticDecorator) {
				element = ((DSemanticDecorator) element).getTarget();
			}
			return element;
		}
		return null;
	}

	DiagramDescription findDiagramDescription(EditPart editPart) {
		if (editPart.getModel() instanceof View) {
			View view = (View) editPart.getModel();
			if (view.getElement() instanceof AbstractDNode) {
				AbstractDNode node = (AbstractDNode) view.getElement();
				if (node != null) {
					DDiagram diagram = node.getParentDiagram();
					if (diagram != null) {
						return diagram.getDescription();
					}
				}
			}
		}
		return null;
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			CreateEditPoliciesOperation castedOperation = (CreateEditPoliciesOperation) operation;
			EditPart editPart = castedOperation.getEditPart();

			// check if I am responsible for this edit part
			DiagramDescription diagramDescription = findDiagramDescription(editPart);
			if (diagramDescription != null) {
				if ("org.muml.reconfiguration.componentstoryrule.diagram".equals(diagramDescription.getName())) {
					EObject element = getSemanticElement(editPart);
//					if (element instanceof PortVariable) {
//						return true;
//					}
//					if (element instanceof ComponentVariable) {
//						return true;
//					}
				}
			}
		}
		return false;
	}

}