package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponentinstanceconfiguration1Group());
	}

	/**
	 * Creates "componentinstanceconfiguration" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentinstanceconfiguration1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.Componentinstanceconfiguration1Group_title);
		paletteContainer.setId("createComponentinstanceconfiguration1Group"); //$NON-NLS-1$
		paletteContainer.add(createStructuredComponentInstance1CreationTool());
		paletteContainer.add(createAssemblyInstance2CreationTool());
		paletteContainer.add(createDelegationInstance3CreationTool());
		paletteContainer.add(createDiscreteSinglePortInstance4CreationTool());
		paletteContainer.add(createDiscreteMultiPortInstance5CreationTool());
		paletteContainer.add(createContinuousPortInstance6CreationTool());
		paletteContainer.add(createHybridPortInstance7CreationTool());
		paletteContainer.add(createAtomicComponentInstance8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredComponentInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.StructuredComponentInstance_2015);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.StructuredComponentInstance_3027);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.StructuredComponentInstance1CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.StructuredComponentInstance1CreationTool_desc,
				types);
		entry.setId("createStructuredComponentInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyInstance2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AssemblyInstance2CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AssemblyInstance2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyInstance_4005));
		entry.setId("createAssemblyInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationInstance3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DelegationInstance3CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DelegationInstance3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationInstance_4006));
		entry.setId("createDelegationInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscreteSinglePortInstance4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3019);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3029);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteSinglePortInstance4CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteSinglePortInstance4CreationTool_desc,
				types);
		entry.setId("createDiscreteSinglePortInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscreteMultiPortInstance5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3020);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3030);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteMultiPortInstance5CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteMultiPortInstance5CreationTool_desc,
				types);
		entry.setId("createDiscreteMultiPortInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousPortInstance6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3022);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3032);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ContinuousPortInstance6CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ContinuousPortInstance6CreationTool_desc,
				types);
		entry.setId("createContinuousPortInstance6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ContinuousPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHybridPortInstance7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3018);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3028);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HybridPortInstance7CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HybridPortInstance7CreationTool_desc,
				types);
		entry.setId("createHybridPortInstance7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/HybridPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicComponentInstance8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AtomicComponentInstance8CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AtomicComponentInstance8CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AtomicComponentInstance_2016));
		entry.setId("createAtomicComponentInstance8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
