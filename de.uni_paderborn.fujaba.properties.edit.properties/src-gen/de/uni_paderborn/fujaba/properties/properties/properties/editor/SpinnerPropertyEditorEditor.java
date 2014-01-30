package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class SpinnerPropertyEditorEditor
		extends
			de.uni_paderborn.fujaba.properties.properties.properties.editor.PropertyEditorEditor {

	/**
	 * @generated
	 */
	public SpinnerPropertyEditorEditor(String tab,
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

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addSpinnerPropertyEditorDigits_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addSpinnerPropertyEditorDigits_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createSpinnerPropertyEditorDigits_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSpinnerPropertyEditorDigits_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getSpinnerPropertyEditor_Digits(), 0);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SpinnerPropertyEditorEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getSpinnerPropertyEditor());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new SpinnerPropertyEditorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
