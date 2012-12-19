package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.commands;


//TODO: reactivate connectors (muml bug #405)


//public class CustomAssemblyReorientCommand extends AssemblyReorientCommand {
//
//	/**
//	 * The ComponentPart of the source Port.
//	 */
//	private ComponentPart sourceComponentPart;
//
//	/**
//	 * The ComponentPart of the target Port.
//	 */
//	private ComponentPart targetComponentPart;
//
//	/**
//	 * Constructs this Command.
//	 * 
//	 * @param request
//	 *            The ReorientRelationshipRequest.
//	 * @param sourceComponentPart
//	 *            The ComponentPart of the source port.
//	 * @param targetComponentPart
//	 *            The ComponentPart of the target port.
//	 */
//	public CustomAssemblyReorientCommand(ReorientRelationshipRequest request,
//			ComponentPart sourceComponentPart, ComponentPart targetComponentPart) {
//		super(request);
//		this.sourceComponentPart = sourceComponentPart;
//		this.targetComponentPart = targetComponentPart;
//	}
//
//	/**
//	 * Checks if this Assembly is allowed to be reoriented.
//	 */
//	@Override
//	public boolean canExecute() {
//
//		// Make sure both Ports are set.
//		if (getNewSource() == null || getNewTarget() == null) {
//			return false;
//		}
//
//		// Make sure, both ComponentParts are set.
//		if (sourceComponentPart == null || targetComponentPart == null) {
//			return false;
//		}
//
//		// Make sure both ComponentParts are within the same parent
//		// component.
//		if (sourceComponentPart.getParentComponent() != targetComponentPart
//				.getParentComponent()) {
//			return false;
//		}
//
//		return super.canExecute();
//	}
//
//	/**
//	 * Update both source and target ComponentParts of the Assembly according to
//	 * the ReorientRequest.
//	 */
//	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
//			IAdaptable info) throws ExecutionException {
//		getLink().setFrom(sourceComponentPart);
//		getLink().setTo(targetComponentPart);
//
//		/*
//		 * The ParentComponent has not changed. Otherwise canExecute() would
//		 * have returned false:
//		 */
//		// getLink().setParentComponent(sourceComponentPart.getParentComponent());
//
//		// Call super implementation, which will set the new Port of the Assembly. 
//		return super.doExecuteWithResult(monitor, info);
//	}
//
//}
