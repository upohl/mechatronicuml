package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * Base edit policy for all HWPorts that uses the CustomHWPortFigure.
 *  Provides handling model notifications and updating the hwport figure accordingly. 
 * 
 * @author adann
 * 
 */
public class MultiHWPortTypeEditPolicy extends HWPortTypeEditPolicy {
	
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		
		if(feature==ValuetypePackage.Literals.CARDINALITY__UPPER_BOUND){
			refreshHWPortFigure();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected boolean isMultiHWPort() {
		
		return getHWPort().isMultiHWPort();
	}
	
	@Override
	protected void addListeners(DiagramEventBroker broker) {
		super.addListeners(broker);
		// in case getPort() != getSemanticElement() because getPort() was
		// overridden
		broker.addNotificationListener(getHWPort().getCardinality(), this);
	}

	@Override
	protected void removeListeners(DiagramEventBroker broker) {
		super.removeListeners(broker);
		// in case getPort() != getSemanticElement() because getPort() was
		// overridden
		broker.removeNotificationListener(getHWPort().getCardinality(), this);
	}


}
