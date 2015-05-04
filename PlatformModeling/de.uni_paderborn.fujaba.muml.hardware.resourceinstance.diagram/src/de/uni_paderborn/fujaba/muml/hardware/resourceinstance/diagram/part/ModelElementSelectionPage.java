package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	 * @generated
	 */
	public ModelElementSelectionPage(String pageName) {
		super(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory(),
				pageName);
	}

	/**
	 * Override to provide custom model element description.
	 * @generated
	 */
	protected String getSelectionTitle() {
		return de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.ModelElementSelectionPageMessage;
	}

}
