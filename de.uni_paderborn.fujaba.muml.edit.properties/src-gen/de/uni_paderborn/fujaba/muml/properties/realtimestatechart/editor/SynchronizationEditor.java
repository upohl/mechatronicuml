package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class SynchronizationEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public SynchronizationEditor(String tab,
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
			addSynchronizationSyncChannelEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addSynchronizationKindEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addSynchronizationSelectorExpressionEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addSynchronizationSyncChannelEditor(String category,
			boolean front) {
		addEditorToCategory(category, createSynchronizationSyncChannelEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationSyncChannelEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_SyncChannel());

	}
	/**
	 * @generated
	 */
	protected void addSynchronizationKindEditor(String category, boolean front) {
		addEditorToCategory(category, createSynchronizationKindEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationKindEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_Kind());

	}
	/**
	 * @generated
	 */
	protected void addSynchronizationSelectorExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSynchronizationSelectorExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationSelectorExpressionEditor() {
		return new de.uni_paderborn.fujaba.muml.ui.properties.XtextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_SelectorExpression());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SynchronizationEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new SynchronizationEditor(tab);
		}
	}

}
