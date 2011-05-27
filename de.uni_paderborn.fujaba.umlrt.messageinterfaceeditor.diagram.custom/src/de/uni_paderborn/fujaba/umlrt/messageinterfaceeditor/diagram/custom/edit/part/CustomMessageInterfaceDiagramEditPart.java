package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.edit.part;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart;

public class CustomMessageInterfaceDiagramEditPart extends MessageInterfaceDiagramEditPart {

	public CustomMessageInterfaceDiagramEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
	}	

}
