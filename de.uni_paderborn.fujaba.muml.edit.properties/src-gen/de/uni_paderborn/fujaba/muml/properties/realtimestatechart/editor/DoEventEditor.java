package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class DoEventEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.StateEventEditor {

	/**
	 * @generated
	 */
	public DoEventEditor(String tab,
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
			addDoEventActionEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addDoEventPeriodEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDoEventActionEditor(String category, boolean front) {
		addEditorToCategory(category, createDoEventActionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDoEventActionEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDoEvent_Action());

	}
	/**
	 * @generated
	 */
	protected void addDoEventPeriodEditor(String category, boolean front) {
		addEditorToCategory(category, createDoEventPeriodEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDoEventPeriodEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDoEvent_Period());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DoEventEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDoEvent());
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
			return new DoEventEditor(tab);
		}
	}

}
