package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DiscreteMultiPortInstanceCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public DiscreteMultiPortInstanceCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	public boolean canExecute() {
		// This command must not be used. The containment feature is not changable!
		return false;
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance newElement = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
				.createDiscreteMultiPortInstance();

		de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration owner = (de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) getElementToEdit();
		owner.getParentPortInstances().add(newElement);

		de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.ElementInitializers
				.getInstance().init_DiscreteMultiPortInstance_2023(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(
			de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
