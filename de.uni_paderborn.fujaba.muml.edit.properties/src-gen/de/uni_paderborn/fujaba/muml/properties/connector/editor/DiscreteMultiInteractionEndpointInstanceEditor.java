package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class DiscreteMultiInteractionEndpointInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.DiscreteInteractionEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public DiscreteMultiInteractionEndpointInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(
				null, true);

		addConnectorEndpointInstanceConnectorInstancesEditor(null, true);

		addCommentableElementCommentEditor(null, true);

		addNamedElementNameEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances());

	}
	/**
	 * @generated
	 */
	protected void addConnectorEndpointInstanceConnectorInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointInstanceConnectorInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointInstanceConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpointInstance_ConnectorInstances());

	}
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment());

	}
	/**
	 * @generated
	 */
	protected void addNamedElementNameEditor(String category, boolean front) {
		addEditorToCategory(category, createNamedElementNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementNameEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DiscreteMultiInteractionEndpointInstanceEditor();
		}
	}

}
