
package org.muml.uppaal.properties.expressions.editor;

/**
 * @generated
 */
public class BitShiftExpressionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BitShiftExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorOperator_org_muml_uppaalTab_Editor(), false);

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

			addPropertyEditor(createEditorOperator_org_muml_uppaalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOperator_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOperator_org_muml_uppaalTab_Editor() {
		if (this.editorOperator_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.expressions.ExpressionsPackage.eINSTANCE
					.getBitShiftExpression_Operator();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The arithmetic operator to be applied.");

			this.editorOperator_org_muml_uppaalTab = editor;
		}
		return this.editorOperator_org_muml_uppaalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public BitShiftExpressionEditor(String tab) {
		this(tab, org.muml.uppaal.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.expressions.ExpressionsPackage.eINSTANCE.getBitShiftExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new BitShiftExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.uppaal"}).contains(tab);
		}
	}

}
