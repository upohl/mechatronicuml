package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public abstract class BehaviorEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BehaviorEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addBehaviorBehavioralElementEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addBehaviorOperationsEditor("de.fujaba.properties.category.Lists",
					true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addBehaviorVariablesEditor("de.fujaba.properties.category.Lists",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addBehaviorBehavioralElementEditor(String category,
			boolean front) {
		addEditorToCategory(category, createBehaviorBehavioralElementEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehaviorBehavioralElementEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavior_BehavioralElement());

	}
	/**
	 * @generated
	 */
	protected void addBehaviorOperationsEditor(String category, boolean front) {
		addEditorToCategory(category, createBehaviorOperationsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehaviorOperationsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavior_Operations());

	}
	/**
	 * @generated
	 */
	protected void addBehaviorVariablesEditor(String category, boolean front) {
		addEditorToCategory(category, createBehaviorVariablesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehaviorVariablesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavior_Variables());

	}

}
