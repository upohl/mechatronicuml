package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class RealtimeStatechartNewDiagramFileWizard extends Wizard {

	/**
	 * @generated
	 */
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
	 * @generated
	 */
	private TransactionalEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	public RealtimeStatechartNewDiagramFileWizard(URI domainModelURI,
			EObject diagramRoot, TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new WizardNewFileCreationPage(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage
				.setTitle(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage
				.setDescription(NLS
						.bind(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_CreationPageDescription,
								de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID));
		IPath filePath;
		String fileName = URI.decode(domainModelURI.trimFileExtension()
				.lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1)
					.toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException(
					"Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage
				.setFileName(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorUtil
						.getUniqueFileName(filePath, fileName,
								"realtimestatechart_diagram")); //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage
				.setTitle(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage
				.setDescription(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

		myEditingDomain = editingDomain;
	}

	/**
	 * @generated
	 */
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile diagramFile = myFileCreationPage.createNewFile();
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorUtil
				.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				myEditingDomain,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				int diagramVID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
						.getDiagramVisualID(diagramRootElementSelectionPage
								.getModelElement());
				if (diagramVID != de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService
						.createDiagram(
								diagramRootElementSelectionPage
										.getModelElement(),
								de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID,
								de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			diagramResource
					.save(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorUtil
							.getSaveOptions());
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorUtil
					.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError(
							"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError("Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	 * @generated
	 */
	private static class DiagramRootElementSelectionPage
			extends
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.ModelElementSelectionPage {

		/**
		 * @generated
		 */
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
		 * @generated
		 */
		protected String getSelectionTitle() {
			return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
		 * @generated
		 */
		protected boolean validatePage() {
			if (selectedModelElement == null) {
				setErrorMessage(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = ViewService
					.getInstance()
					.provides(
							new CreateDiagramViewOperation(
									new EObjectAdapter(selectedModelElement),
									de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID,
									de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null
					: de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechartNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
