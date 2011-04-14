package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part;

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
public class RealtimeStatechartDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor> getRealtimeStatechart_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVertices().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex childElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState childElement = modelElement
					.getUMLRealtimeStartState();
			int visualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2008ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return getInitialState_2009ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID:
			return getFinalState_2010ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_2011ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2008IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return getInitialState_2009IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID:
			return getFinalState_2010IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_2011IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return getInitialState_2009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID:
			return getFinalState_2010OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_2011OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getRealtimeStatechart_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart modelElement = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getState_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getInitialState_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getFinalState_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getHistoryState_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getState_2008IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getInitialState_2009IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getFinalState_2010IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getHistoryState_2011IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getState_2008OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getInitialState_2009OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getFinalState_2010OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getHistoryState_2011OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState modelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Transition_4001,
					de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Transition_4001,
					de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex source) {
		de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart) {
				container = (de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition link = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Transition_4001,
					de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

}
