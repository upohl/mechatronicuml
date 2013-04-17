package de.uni_paderborn.fujaba.muml.common.edit.policies.ports;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.swt.graphics.Color;

import de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyUtils;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DirectedTypedPort;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortDirectionKind;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

public class PortTypeEditPolicy extends PortBaseEditPolicy {

	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		EClass containingClass = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}
		if (feature != null) {
			containingClass = feature.getEContainingClass();
		}
		
		if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY || containingClass == ValuetypePackage.Literals.CARDINALITY) {
			refreshCardinality();
			// } else if (notification.getFeature() == C){
		} else if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES
				|| notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES
				|| notification.getFeature() == ComponentPackage.Literals.DIRECTED_TYPED_PORT__KIND) {
			refreshPortType();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void addListeners(DiagramEventBroker broker) {
		super.addListeners(broker);
		// in case getPort() != getSemanticElement() because getPort() was
		// overridden
		broker.addNotificationListener(getPort(), this);
	}

	@Override
	protected void removeListeners(DiagramEventBroker broker) {
		super.removeListeners(broker);
		// in case getPort() != getSemanticElement() because getPort() was
		// overridden
		broker.removeNotificationListener(getPort(), this);
	}

	protected void refreshPortType() {
		EObject port = getPort();

		PortKind portKind = PortKind.DISCRETE;
		PortType portType = PortType.NONE;

		if (port != null) {
			if (ComponentPackage.Literals.DISCRETE_PORT.isSuperTypeOf(port
					.eClass())) {
				portKind = PortKind.DISCRETE;
				portType = getDiscretePortType();
			} else if (ComponentPackage.Literals.CONTINUOUS_PORT
					.isSuperTypeOf(port.eClass())) {
				portKind = PortKind.CONTINUOUS;
				portType = getDirectedPortType();
			} else if (ComponentPackage.Literals.HYBRID_PORT.isSuperTypeOf(port
					.eClass())) {
				portKind = PortKind.HYBRID;
				portType = getDirectedPortType();
			}
		}

		getPortFigure().setPortKindAndPortType(portKind, portType);
	}
	
	protected Cardinality getCardinality() {
		Port port = getPort();
		if (port != null
				&& ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT
						.isSuperTypeOf(port.eClass())) {
			Cardinality cardinality = (Cardinality) port
					.eGet(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY);
			return cardinality;
		}
		return null;
	}

	@Override
	protected void refreshCardinality() {
		Cardinality cardinality = getCardinality();
		if (cardinality != null) {
			applyCardinality(cardinality);
		} else {
			// applyCardinality also does this, so do it here
			Color color = getForegroundColor();
			getPortFigure().configureArrows(color, color);
			getPortFigure().setLineStyle(EditPolicyUtils.getLineType(getPrimaryView()));
		}
	}

	protected PortType getDiscretePortType() {
		PortType type = CustomPortFigure.PortType.NONE;
		DiscretePort discretePort = (DiscretePort) getPort();
		if (discretePort != null) {
			if (discretePort.isIsDiscreteInOutPort()) {
				type = CustomPortFigure.PortType.INOUT_PORT;
			} else if (discretePort.isIsDiscreteInPort()) {
				type = CustomPortFigure.PortType.IN_PORT;
			} else if (discretePort.isIsDiscreteOutPort()) {
				type = CustomPortFigure.PortType.OUT_PORT;
			}
		}
		return type;
	}

	protected Port getPort() {
		return (Port) getSemanticElement();
	}

	protected PortType getDirectedPortType() {
		// Get port direction
		PortDirectionKind direction = null;
		DirectedTypedPort directedPort = (DirectedTypedPort) getPort();
		if (directedPort != null) {
			direction = (PortDirectionKind) directedPort.getKind();
		}

		// select port type based on port direction
		CustomPortFigure.PortType type;
		switch (direction) {
		case IN:
			type = CustomPortFigure.PortType.IN_PORT;
			break;
		case OUT:
			type = CustomPortFigure.PortType.OUT_PORT;
			break;
		default:
			type = CustomPortFigure.PortType.NONE;
			break;
		}
		return type;
	}

}
