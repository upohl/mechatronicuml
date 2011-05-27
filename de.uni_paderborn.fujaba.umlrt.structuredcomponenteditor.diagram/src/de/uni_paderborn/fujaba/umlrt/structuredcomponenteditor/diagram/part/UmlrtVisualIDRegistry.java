package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part;

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
public class UmlrtVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.UmlrtVisualIDRegistry
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
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
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
		if (de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
				.getModelElementCategory()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) domainElement)) {
			return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID;
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
		String containerModelID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.UmlrtVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
					.getStructuredComponent().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
					.getPort().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
					.getPort().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
					.getComponentPart().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.UmlrtVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartNameComponentNameDeriveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID == nodeVisualID) {
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
		if (de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
				.getDelegation().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID;
		}
		if (de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
				.getAssembly().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID;
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
			de.uni_paderborn.fujaba.modelinstance.ModelElementCategory element) {
		return true;
	}

}
