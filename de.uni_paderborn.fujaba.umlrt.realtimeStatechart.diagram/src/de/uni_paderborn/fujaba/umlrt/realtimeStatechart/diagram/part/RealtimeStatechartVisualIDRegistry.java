package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RealtimeStatechartVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage.eINSTANCE
				.getRealtimeStatechart().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart) domainElement)) {
			return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getInitialState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart element) {
		return true;
	}

}
