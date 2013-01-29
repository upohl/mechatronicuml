package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part;

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
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.JunctionNode;

/**
 * @generated
 */
public class ComponentStoryDiagramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID:
			return getComponentStoryRule_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			return getPartVariable_3014SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityActivityCompartmentEditPart.VISUAL_ID:
			return getActivityActivityCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
			return getComponentStoryNodeComponentStoryNodeCompartment_7002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			return getComponentStoryPatternComponentStoryPatternCompartment_7005SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			return getComponentVariableComponentVariableCompartment_7006SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7007SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7008SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getComponentStoryRule_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getComponentVariable_3012SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable childElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getPartVariable_3014SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable childElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getActivityActivityCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) containerView.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it
				.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getComponentStoryNodeComponentStoryNodeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern childElement = modelElement
					.getComponentStoryPattern();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getComponentStoryPatternComponentStoryPatternCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable childElement = modelElement
					.getThisVariable();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getComponentVariableComponentVariableCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPartVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable childElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable childElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable childElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID:
			return getComponentStoryRule_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID:
			return getComponentStoryNode_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3011ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			return getPartVariable_3014ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3017ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3018ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3019ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3020ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3010ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID:
			return getComponentStoryNode_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3011IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			return getPartVariable_3014IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3017IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3018IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3019IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3020IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3010IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID:
			return getComponentStoryNode_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3011OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			return getPartVariable_3014OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3017OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3018OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3019OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3020OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3010OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentStoryRule_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivity_2003ContainedLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentStoryNode_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentVariable_3012ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getPartVariable_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getInitialNode_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getJunctionNode_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivityFinalNode_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivityEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getAssemblyVariable_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getDelegationVariable_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivity_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentStoryNode_3001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentVariable_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getPartVariable_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3016IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3017IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3018IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3019IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3020IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getInitialNode_3007IncomingLinks(
			View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getJunctionNode_3008IncomingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivityFinalNode_3010IncomingLinks(
			View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivityEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getAssemblyVariable_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getDelegationVariable_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivity_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentStoryNode_3001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getComponentVariable_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getPartVariable_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3016OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3017OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3018OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3019OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3020OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getInitialNode_3007OutgoingLinks(
			View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getJunctionNode_3008OutgoingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivityFinalNode_3010OutgoingLinks(
			View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getActivityEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getAssemblyVariable_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getDelegationVariable_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4001(
			Activity container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyVariable_4004(
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable link = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getContainedTypeModelFacetLinks_DelegationVariable_4005(
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable link = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitiesPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) setting.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyVariable_4004(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable link = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationVariable_4005(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable link = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Activity) {
				container = (Activity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) {
				container = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable link = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationVariable_4005(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) {
				container = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable link = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005,
					de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

}
