
package de.uni_paderborn.fujaba.muml.actionlanguage.properties.actionlanguage.editor;

/**
 * @generated
 */
public class DoWhileLoopEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DoWhileLoopEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBlock_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLoopTest_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBlock_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLoopTest_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBlock_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBlock_property_tab_generalTab_Editor() {
		if (this.editorBlock_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
					.getLoop_Block();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Body block of the loop.");

			this.editorBlock_property_tab_generalTab = editor;
		}
		return this.editorBlock_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLoopTest_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLoopTest_property_tab_generalTab_Editor() {
		if (this.editorLoopTest_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
					.getLoop_LoopTest();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("If the loop test expression evaluates to true the block is executed. ");

			this.editorLoopTest_property_tab_generalTab = editor;
		}
		return this.editorLoopTest_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DoWhileLoopEditor(String tab) {
		this(tab,
				de.uni_paderborn.fujaba.muml.actionlanguage.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE.getDoWhileLoop());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new DoWhileLoopEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
