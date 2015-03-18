package org.storydriven.storydiagrams.properties.templates.editor;

/**
 * @generated
 */
public class TemplateSignatureEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TemplateSignatureEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null || "property.tab.general".equals(getTab())) { // Tab General

		} else if (tab == null || "property.tab.documentation".equals(getTab())) { // Tab Documentation

		} else if (tab == null || "property.tab.extensions".equals(getTab())) { // Tab Extensions

		} else if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

		}

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TemplateSignatureEditor(String tab) {
		this(
				tab,
				org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.storydiagrams.templates.TemplatesPackage.eINSTANCE
						.getTemplateSignature());
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
			return new TemplateSignatureEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(
					tab);
		}
	}

}
