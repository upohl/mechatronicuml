package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart;

public class CustomRegionEditPart extends RegionEditPart {

	public CustomRegionEditPart(View view) {
		super(view);
	}

	protected IFigure createNodeShape() {
		RegionFigure regionFigure = (RegionFigure) super.createNodeShape();
		regionFigure.getFigureStatechartVariablesLabel().setAlignment(
				PositionConstants.RIGHT);
		regionFigure.getFigureStatechartVariablesLabel().setTextJustification(
				PositionConstants.RIGHT);

		primaryShape = regionFigure;
		return regionFigure;
	}

	private Region getRegion() {
		return (Region) getNotationView().getElement();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (RealtimestatechartPackage.Literals.REGION__GMF_HISTORY
				.equals(feature)) {
			updateHistory();
		}

		super.handleNotificationEvent(notification);
	}

	@Override
	protected void refreshVisuals() {
		updateHistory();
		super.refreshVisuals();
	}

	private void updateHistory() {
		getPrimaryShape().getFigureHistoryFigure().setVisible(
				getRegion().isGmfHistory());
	}
}
