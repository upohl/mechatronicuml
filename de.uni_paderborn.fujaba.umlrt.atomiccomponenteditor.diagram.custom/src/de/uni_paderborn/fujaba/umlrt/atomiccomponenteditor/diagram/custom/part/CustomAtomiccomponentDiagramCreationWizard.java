package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.modeling.ExtendableElement;

import de.uni_paderborn.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;

/**
 * A CreationWizard for StructuredComponent diagrams. It implements the abstract
 * creation wizard from the de.uni_paderborn.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentDiagramCreationWizard extends
		FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPatterneditorWizard.gif")); //$NON-NLS-1$

	}

	@Override
	protected String getDiagramFileExtension() {
		return "atomiccomponent_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditor.ID;

	}

//	@Override
//	protected EObject createInitialModel() {
//		AtomicComponentDiagram diagram = AtomiccomponenteditorFactory.eINSTANCE
//				.createAtomicComponentDiagram();
//		AtomicComponent atomicComponent = ComponentFactory.eINSTANCE
//				.createAtomicComponent();
//		diagram.setAtomicComponent(atomicComponent);
//		return diagram;
//	}

	@Override
	public boolean isValidDiagramElement(EObject object) {
		return ViewService
				.getInstance()
				.provides(
						new CreateDiagramViewOperation(
								new EObjectAdapter(object),
								de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.MODEL_ID,
								de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
	}

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.umlrt.components.category";
	}

	@Override
	protected ExtendableElement createDiagramElement() {
		// Return null, to use the ModelElementCategory as the Diagram Element.
		return null;
	}

}
