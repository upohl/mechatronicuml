package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.calls.Callable;



/**
 * @generated
 */
public class ParameterCreateCommand extends EditElementCommand {
	
	private String name = null;
	private String type = null;

	/**
	 * @generated
	 */
	public ParameterCreateCommand(CreateElementRequest req, String name, String type) {
		super(req.getLabel(), null, req);
		this.name = name;
		this.type = type;
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
	
	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}
	
	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		
		EParameter newElement = EcoreFactory.eINSTANCE.createEParameter();

		Callable owner = (Callable) getElementToEdit();
		owner.getContainedParameters().add(newElement);
		
		EDataType dataType = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEDataType();
		if(type.equals("int")){
			dataType.setName("EInt");
			dataType.setInstanceTypeName("int");
			dataType.setSerializable(true);
		}else if(type.equals("double")){
			dataType.setName("EDouble");
			dataType.setInstanceTypeName("double");
			dataType.setSerializable(true);
		}else if(type.equals("string")){
			dataType.setName("EString");
			dataType.setInstanceTypeName("java.lang.String");
			dataType.setSerializable(true);			
		}else{
			throw new ExecutionException("Type not found!");
		}

		newElement.setName(name);
		newElement.setEType(dataType);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}
	

	/**
	 * @generated
	 */
	protected void doConfigure(EParameter newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
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
