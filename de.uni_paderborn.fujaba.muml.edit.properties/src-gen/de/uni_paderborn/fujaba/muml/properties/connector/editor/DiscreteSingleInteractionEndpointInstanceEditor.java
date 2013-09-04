package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public abstract class DiscreteSingleInteractionEndpointInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.DiscreteInteractionEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstanceEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstanceEditor(
					null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addDiscreteSingleInteractionEndpointInstanceNextEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addDiscreteSingleInteractionEndpointInstancePreviousEditor(null,
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstanceEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstanceEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstanceEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance());

	}
	/**
	 * @generated
	 */
	protected void addDiscreteSingleInteractionEndpointInstanceNextEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteSingleInteractionEndpointInstanceNextEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteSingleInteractionEndpointInstanceNextEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteSingleInteractionEndpointInstance_Next());

	}
	/**
	 * @generated
	 */
	protected void addDiscreteSingleInteractionEndpointInstancePreviousEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteSingleInteractionEndpointInstancePreviousEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteSingleInteractionEndpointInstancePreviousEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteSingleInteractionEndpointInstance_Previous());

	}

}
