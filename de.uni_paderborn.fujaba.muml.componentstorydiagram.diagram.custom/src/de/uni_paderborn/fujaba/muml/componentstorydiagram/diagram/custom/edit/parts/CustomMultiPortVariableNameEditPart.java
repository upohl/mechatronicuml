package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableNameEditPart;

public class CustomMultiPortVariableNameEditPart extends
		MultiPortVariableNameEditPart {

	public CustomMultiPortVariableNameEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
//			CsdmUtility.adaptColor(getFigure(), ((MultiPortVariable) ((View) this
//					.getModel()).getElement()).getBindingOperator());
		}
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
//		CsdmUtility.adaptColor(getFigure(), ((MultiPortVariable) ((View) this
//				.getModel()).getElement()).getBindingOperator());
	}

}
