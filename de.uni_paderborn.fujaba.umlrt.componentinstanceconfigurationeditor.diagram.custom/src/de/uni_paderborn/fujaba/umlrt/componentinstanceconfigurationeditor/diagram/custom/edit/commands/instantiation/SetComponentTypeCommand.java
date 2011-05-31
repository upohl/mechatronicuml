package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands.instantiation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

public class SetComponentTypeCommand extends AbstractCommand {

	private ComponentInstance componentInstance;
	private Component newComponentType;

	public SetComponentTypeCommand(ComponentInstance componentInstance,
			Component newComponentType) {
		this.componentInstance = componentInstance;
		this.newComponentType = newComponentType;
	}

	@Override
	public boolean prepare() {
		return true;
	}

	@Override
	public void execute() {
		configureComponentInstance(componentInstance, newComponentType);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}

	public ComponentInstance createComponentInstance(Component component) {
		ComponentInstance newInstance = component.createInstance();
		configureComponentInstance(newInstance, component);
		return newInstance;
	}

	public void configureComponentInstance(ComponentInstance newInstance,
			Component component) {
		
		CompoundCommand compoundCommand = new CompoundCommand();
		destroyContents(newInstance, compoundCommand);
		compoundCommand.execute();

		newInstance.setComponentType(component);

		if (component != null) {

			// instantiate new port instances
			for (Port port : component.getPorts()) {
				newInstance.getPortInstances().addAll(
						createPortInstances(port, newInstance));
			}

			// instantiate component parts
			if (component instanceof StructuredComponent) {
				StructuredComponent structuredComponent = (StructuredComponent) component;
				for (ComponentPart componentPart : structuredComponent
						.getEmbeddedParts()) {
					ComponentInstance partInstance = createComponentPartInstance(componentPart);
					newInstance.getEmbeddedInstances().add(partInstance);
				}
			}
		}
	}

	private void destroyContents(ComponentInstance newInstance, CompoundCommand compoundCommand) {
		
		for (PortInstance portInstance : newInstance.getPortInstances()) {
			for (ConnectorInstance connectorInstance : portInstance.getIncomingConnectorInstances()) {
				compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
						new DestroyElementRequest(connectorInstance, false))));
			}
			for (ConnectorInstance connectorInstance : portInstance.getOutgoingConnectorInstances()) {
				compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
						new DestroyElementRequest(connectorInstance, false))));
			}
			compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(portInstance, false))));
		}

		// Destroy all embedded instances...
		for (ComponentInstance componentInstance : newInstance
				.getEmbeddedInstances()) {
			destroyContents(componentInstance, compoundCommand);
			 
			compoundCommand.add(new ICommandProxy(new DestroyElementCommand(
					new DestroyElementRequest(componentInstance, false))));
		}
	
	
	}

	public ComponentInstance createComponentPartInstance(
			ComponentPart componentPart) {
		ComponentInstance newInstance = createComponentInstance(componentPart
				.getComponentType());
		newInstance.setComponentPart(componentPart);
		return newInstance;
	}

	public List<PortInstance> createPortInstances(Port port,
			ComponentInstance componentInstance) {
		List<PortInstance> newInstances = new ArrayList<PortInstance>();
		
		// Find out the lowerBound of the Port's Cardinality.
		long lowerBound = 0;
		Cardinality cardinality = port.getCardinality();
		if (cardinality != null) {
			NaturalNumber lowerBoundNumber = cardinality.getLowerBound();
			if (lowerBoundNumber != null) {
				lowerBound = lowerBoundNumber.getValue();
			}
		}

		// Create as many PortInstances as the Port's lowerBound requires.
		for (long i = 0; i < lowerBound; i++) {
			PortInstance portInstance = port.createInstance();
			portInstance.setName(componentInstance.getName() + port.getName());
			portInstance.setComponentInstance(componentInstance);
			portInstance.getIncomingConnectorInstances().addAll(createIncomingConnectorInstances(port, componentInstance));
			portInstance.getOutgoingConnectorInstances().addAll(createOutgoingConnectorInstances(port, componentInstance));
			
		}
		return newInstances;
	}

	private List<ConnectorInstance> createIncomingConnectorInstances(Port port, ComponentInstance componentInstance) {
		List<ConnectorInstance> connectorInstances = new ArrayList<ConnectorInstance>();
		for (ConnectorType connectorType : port.getIncomingConnectors()) {
			Port fromPort = connectorType.getFromPort();
			
			for (PortInstance fromInstance : componentInstance.getPortInstances()) {
				if (fromInstance.getPortType() == fromPort) {
					ConnectorInstance newInstance = connectorType
							.createInstance();
					newInstance.setSource(fromInstance);
					// target is set, when this ConnectorInstance is added to its opposite feature "incomingConnectors".
					newInstance
							.setParentComponentInstance(componentInstance);
				}
			}
		}
		return connectorInstances;
	}

	private List<ConnectorInstance> createOutgoingConnectorInstances(Port port, ComponentInstance componentInstance) {
		List<ConnectorInstance> connectorInstances = new ArrayList<ConnectorInstance>();
		for (ConnectorType connectorType : port.getOutgoingConnectors()) {
			Port toPort = connectorType.getToPort();
			for (PortInstance toInstance : componentInstance.getPortInstances()) {
				if (toInstance.getPortType() == toPort) {
					ConnectorInstance connectorInstance = connectorType
							.createInstance();
					// source is set, when this ConnectorInstance is added to its opposite feature "incomingConnectors".
					connectorInstance.setTarget(toInstance);
					connectorInstance
							.setParentComponentInstance(componentInstance);
					connectorInstances.add(connectorInstance);
				}
			}
		}
		return connectorInstances;
	}

}
