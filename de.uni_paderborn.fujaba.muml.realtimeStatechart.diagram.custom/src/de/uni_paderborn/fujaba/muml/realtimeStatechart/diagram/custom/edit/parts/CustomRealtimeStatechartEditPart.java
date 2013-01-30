package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart;

public class CustomRealtimeStatechartEditPart extends
		RealtimeStatechartEditPart {

	public CustomRealtimeStatechartEditPart(View view) {
		super(view);
	}

	@Override
	public void activate() {
		super.activate();
		RealtimeStatechart statechart = (RealtimeStatechart) getNotationView()
				.getElement();
		updateHistory(statechart.isHistory());
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (RealtimestatechartPackage.Literals.REALTIME_STATECHART__HISTORY
				.equals(feature)) {
			updateHistory(notification.getNewBooleanValue());
		}
		super.handleNotificationEvent(notification);
	}

	private void updateHistory(boolean history) {
		getPrimaryShape().getFigureHistoryFigure().setVisible(history);
	}

}
