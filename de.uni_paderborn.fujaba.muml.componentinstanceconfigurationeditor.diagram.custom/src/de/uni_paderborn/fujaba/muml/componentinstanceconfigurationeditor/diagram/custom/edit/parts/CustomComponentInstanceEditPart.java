package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;



/**
 * A customized EditPart for ComponentInstances. A customized Figure will be used,
 * which underlines the text.
 * 
 * @author bingo
 * 
 */
public class CustomComponentInstanceEditPart extends ComponentInstanceEditPart {

	public CustomComponentInstanceEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomComponentFigure();
	}
	
	@Override
	public void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass() == ComponentInstance.class) {
				int featureID = notification.getFeatureID(ComponentInstance.class);
				//TODO: it was COMPONENT_INSTANCE__CONNECTOR_INSTANCES
				if (featureID == InstancePackage.COMPONENT_INSTANCE__EMBEDDED_CIC) {
					// ((CanonicalEditPolicy)getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE)).refresh();
					List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
							.getRegisteredEditPolicies(this.getDiagramView()
									.getElement());
					for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
							.hasNext();) {
						CanonicalEditPolicy nextEditPolicy = it.next();
						nextEditPolicy.refresh();
					}
				}
			}
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure plate = super.createNodePlate();
		plate.setMinimumSize(new Dimension(0, 0));
		return plate;
	}

	public class CustomComponentFigure extends StructuredComponentFigure {
		public CustomComponentFigure() {
			super();
			this.getFigureComponentNameFigure().setTextUnderline(true);
		}
	}

}
