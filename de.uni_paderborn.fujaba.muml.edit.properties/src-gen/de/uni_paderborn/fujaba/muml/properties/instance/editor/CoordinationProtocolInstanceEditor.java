package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class CoordinationProtocolInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolInstanceEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCoordinationProtocolInstancePortInstancesEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCoordinationProtocolInstanceCoordinationProtocolPartEditor(null,
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolInstancePortInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolInstancePortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolInstancePortInstancesEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance_PortInstances());

		editor.setTooltipMessage("The port instances that use this coordination protocol instance.\n\n\\todosd{I suggest to change this reference so that it references a DiscretePortInstance.}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolInstanceCoordinationProtocolPartEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCoordinationProtocolInstanceCoordinationProtocolPartEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolInstanceCoordinationProtocolPartEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance_CoordinationProtocolPart());

		editor.setTooltipMessage("The CoordinationProtocolPart of that instance.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CoordinationProtocolInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance());
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
			return new CoordinationProtocolInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
