
package de.uni_paderborn.fujaba.muml.psm.properties.allocation.editor;

/**
 * @generated
 */
public class AssemblyConnectorInstanceAllocationEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AssemblyConnectorInstanceAllocationEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorAssemblyConnectorInstance_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorNetworkConnectorInstance_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorAssemblyConnectorInstance_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorNetworkConnectorInstance_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAssemblyConnectorInstance_property_tab_psmTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAssemblyConnectorInstance_property_tab_psmTab_Editor() {
		if (this.editorAssemblyConnectorInstance_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage.eINSTANCE
					.getAssemblyConnectorInstanceAllocation_AssemblyConnectorInstance();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The assembly connector instance.");

			this.editorAssemblyConnectorInstance_property_tab_psmTab = editor;
		}
		return this.editorAssemblyConnectorInstance_property_tab_psmTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNetworkConnectorInstance_property_tab_psmTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNetworkConnectorInstance_property_tab_psmTab_Editor() {
		if (this.editorNetworkConnectorInstance_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage.eINSTANCE
					.getAssemblyConnectorInstanceAllocation_NetworkConnectorInstance();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The network connector instance that is used by the assemblyConnector.connectorEndpointInstances\nto communicate with each other. If this reference is null, the assemblyConnector.connectorEndpointInstances\ncommunicate with each other by local means.");

			this.editorNetworkConnectorInstance_property_tab_psmTab = editor;
		}
		return this.editorNetworkConnectorInstance_property_tab_psmTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AssemblyConnectorInstanceAllocationEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage.eINSTANCE
						.getAssemblyConnectorInstanceAllocation());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new AssemblyConnectorInstanceAllocationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.psm", "property.tab.psm"})
					.contains(tab);
		}
	}

}
