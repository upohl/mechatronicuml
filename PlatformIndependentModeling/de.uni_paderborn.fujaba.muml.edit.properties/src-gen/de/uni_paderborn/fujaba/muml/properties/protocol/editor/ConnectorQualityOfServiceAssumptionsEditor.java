package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

/**
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					"Message Delay", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if (tab == null || "property.tab.general".equals(getTab())) { // Tab General

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createMessageLossPossible_GeneralTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					"Message Delay", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					createMinMessageDelay_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					createMaxMessageDelay_GeneralTab_Editor(), false);

		} else if (tab == null || "property.tab.documentation".equals(getTab())) { // Tab Documentation

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addPropertyEditor(createComment_DocumentationTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					"Message Delay", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if (tab == null || "property.tab.extensions".equals(getTab())) { // Tab Extensions

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createExtension_ExtensionsTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					"Message Delay", org.eclipse.swt.SWT.HORIZONTAL, true);

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMinMessageDelay_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createMinMessageDelay_GeneralTab_Editor() {
		if (this.editorMinMessageDelay_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getConnectorQualityOfServiceAssumptions_MinMessageDelay();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The minimal time a message needs from the sender to the receiver using this connector.");

			this.editorMinMessageDelay_GeneralTab = editor;
		}
		return this.editorMinMessageDelay_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMaxMessageDelay_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createMaxMessageDelay_GeneralTab_Editor() {
		if (this.editorMaxMessageDelay_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getConnectorQualityOfServiceAssumptions_MaxMessageDelay();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The maximal time a message needs from the sender to the receiver using this connector.");

			this.editorMaxMessageDelay_GeneralTab = editor;
		}
		return this.editorMaxMessageDelay_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessageLossPossible_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createMessageLossPossible_GeneralTab_Editor() {
		if (this.editorMessageLossPossible_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getConnectorQualityOfServiceAssumptions_MessageLossPossible();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Defines if messages that are send using this connector may be lost during transport.");

			this.editorMessageLossPossible_GeneralTab = editor;
		}
		return this.editorMessageLossPossible_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createComment_DocumentationTab_Editor() {
		if (this.editorComment_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_DocumentationTab = editor;
		}
		return this.editorComment_DocumentationTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions());
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
			return new ConnectorQualityOfServiceAssumptionsEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
