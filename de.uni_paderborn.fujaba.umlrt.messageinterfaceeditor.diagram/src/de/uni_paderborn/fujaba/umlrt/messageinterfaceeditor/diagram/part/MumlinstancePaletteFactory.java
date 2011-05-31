package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part;

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
public class MumlinstancePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMessageinterfaceeditor1Group());
	}

	/**
	 * Creates "messageinterfaceeditor" palette tool group
	 * @generated
	 */
	private PaletteContainer createMessageinterfaceeditor1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.Messages.Messageinterfaceeditor1Group_title);
		paletteContainer.setId("createMessageinterfaceeditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createMessageInterface1CreationTool());
		paletteContainer.add(createMessageType2CreationTool());
		paletteContainer.add(createGeneralization3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageInterface1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.Messages.MessageInterface1CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.Messages.MessageInterface1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes.MessageInterface_2002));
		entry.setId("createMessageInterface1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom/icons/MessageInterface.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageType2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.Messages.MessageType2CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.Messages.MessageType2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes.MessageType_3002));
		entry.setId("createMessageType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes.MessageType_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.Messages.Generalization3CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.Messages.Generalization3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes.MessageInterfaceSuperType_4003));
		entry.setId("createGeneralization3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.common/icons/Generalization.gif")); //$NON-NLS-1$
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
