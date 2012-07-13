package de.uni_paderborn.fujaba.muml.deployment.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor> getDeployment_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.deployment.Deployment modelElement = (de.uni_paderborn.fujaba.muml.model.deployment.Deployment) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwareNodes().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode childElement = (de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor> getHardwareNode_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode modelElement = (de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwarePorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort childElement = (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getCommunicationLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getCommunicationLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getCommunicationLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getDeployment_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.deployment.Deployment modelElement = (de.uni_paderborn.fujaba.muml.model.deployment.Deployment) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CommunicationLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getHardwareNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getHardwarePort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getCommunicationLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getHardwareNode_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getHardwarePort_3001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CommunicationLink_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getCommunicationLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getHardwareNode_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getHardwarePort_3001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CommunicationLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getCommunicationLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_CommunicationLink_4001(
			de.uni_paderborn.fujaba.muml.model.deployment.Deployment container) {
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getCommunicationLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink link = (de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) linkObject;
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001,
					de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_CommunicationLink_4001(
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage.eINSTANCE
					.getCommunicationLink_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink link = (de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001,
					de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_CommunicationLink_4001(
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort source) {
		de.uni_paderborn.fujaba.muml.model.deployment.Deployment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.deployment.Deployment) {
				container = (de.uni_paderborn.fujaba.muml.model.deployment.Deployment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getCommunicationLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink link = (de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) linkObject;
			if (de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001,
					de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

}
