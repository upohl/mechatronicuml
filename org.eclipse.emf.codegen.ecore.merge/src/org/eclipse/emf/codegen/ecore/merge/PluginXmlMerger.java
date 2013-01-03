package org.eclipse.emf.codegen.ecore.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class PluginXmlMerger {

	public PluginXmlMerger() {

	}

	public Document merge(Document before, Document after) {
		// Create a copy of the after document.
		Document merged = copyDocument(after);
		
		// Merge custom elements from before into it.
		Element beforePluginElement = findPluginElement(before);
		Element mergedPluginElement = findPluginElement(merged);
		Node firstChild = mergedPluginElement.getFirstChild();
		for (Node customElement : getCustomElements(beforePluginElement)) {
			Node copy = merged.importNode(customElement, true);
			
			// Trim text
			if (copy instanceof Text) {
				Text textNode = (Text) copy;
				String textContent = textNode.getTextContent();
				textContent = textContent.trim();
				textNode.setTextContent(textContent);
			}
			
			mergedPluginElement.insertBefore(copy, firstChild);
		}

		return merged;
	}

	public static Document copyDocument(Document originalDocument) {
		Document copyDocument = null;
		try {
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder;
			docBuilder = dbfac.newDocumentBuilder();
			copyDocument = docBuilder.newDocument();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return null;
		}
		
		
		for (int i = 0; i < originalDocument.getChildNodes().getLength(); i++) {
			Node node = originalDocument.getChildNodes().item(i);
			Node copyNode = copyDocument.importNode(node, true);		
			copyDocument.appendChild(copyNode);
		}
		
		return copyDocument;
	}

	private Collection<Node> getCustomElements(Element pluginElement) {
		List<Node> customElements = new ArrayList<Node>();
		for (int i = 0; i < pluginElement.getChildNodes().getLength(); i++) {
			Node node = pluginElement.getChildNodes().item(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				if (containsGeneratedTag(element)) {
					continue;
				}
			}
			customElements.add(node);
		}
		return customElements;
	}

	private boolean containsGeneratedTag(Element element) {
		for (int j = 0; j < element.getChildNodes().getLength(); j++) {
			Node child = element.getChildNodes().item(j);
			if (child instanceof ProcessingInstruction) {
				ProcessingInstruction instruction = (ProcessingInstruction) child;
				if (isGeneratedTag(instruction)) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean isGeneratedTag(
			ProcessingInstruction instruction) {
		return "emfgen".equals(instruction.getTarget())
				&& "generated=\"true\"".equals(instruction.getData());
	}

	protected Element findPluginElement(Document document) {
		NodeList nodes = document.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (node instanceof Element) {
				Element element = (Element) nodes.item(i);
				if ("plugin".equals(element.getTagName())) {
					return element;
				}
			}
		}
		return null;
	}

}
