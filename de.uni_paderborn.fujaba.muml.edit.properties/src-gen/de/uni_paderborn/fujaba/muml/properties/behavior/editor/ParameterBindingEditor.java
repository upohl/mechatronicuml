package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public class ParameterBindingEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public ParameterBindingEditor(String tab,
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
			addParameterBindingParameterEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addParameterBindingValueEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addParameterBindingParameterEditor(String category,
			boolean front) {
		addEditorToCategory(category, createParameterBindingParameterEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createParameterBindingParameterEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getParameterBinding_Parameter());

	}
	/**
	 * @generated
	 */
	protected void addParameterBindingValueEditor(String category, boolean front) {
		addEditorToCategory(category, createParameterBindingValueEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createParameterBindingValueEditor() {
		return new de.uni_paderborn.fujaba.muml.ui.properties.XtextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getParameterBinding_Value());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ParameterBindingEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getParameterBinding());
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
			return new ParameterBindingEditor(tab);
		}
	}

}
