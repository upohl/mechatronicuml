package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

/**
 * @generated
 */
public class MumlViewProvider extends AbstractProvider implements IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(op.getSemanticHint())
				&& de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
						.equals(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return createStaticStructuredComponent_2005(domainElement,
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return createDiscretePort_3010(domainElement, containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return createContinuousPort_3011(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return createComponentPart_3012(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return createHybridPort_3013(domainElement, containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return createDiscretePort_3014(domainElement, containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return createContinuousPort_3015(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return createCoordinationProtocol_3016(domainElement,
					containerView, index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(elementTypeHint)) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return createAssemblyConnector_4001(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return createDelegationConnector_4002(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortGmfProtocolEditPart.VISUAL_ID:
			return createDiscretePortGmfProtocol_4005(containerView, index,
					persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createStaticStructuredComponent_2005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5021 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID),
				false, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDiscretePort_3010(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5012 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID));
		label5012.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5012 = (Location) label5012.getLayoutConstraint();
		location5012.setX(0);
		location5012.setY(5);
		Node label5025 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		label5025.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5025 = (Location) label5025.getLayoutConstraint();
		location5025.setX(0);
		location5025.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createContinuousPort_3011(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5013 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID));
		label5013.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5013 = (Location) label5013.getLayoutConstraint();
		location5013.setX(0);
		location5013.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createComponentPart_3012(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5017 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createHybridPort_3013(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5024 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID));
		label5024.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5024 = (Location) label5024.getLayoutConstraint();
		location5024.setX(0);
		location5024.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDiscretePort_3014(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5015 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortName2EditPart.VISUAL_ID));
		label5015.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5015 = (Location) label5015.getLayoutConstraint();
		location5015.setX(0);
		location5015.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createContinuousPort_3015(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5016 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortName2EditPart.VISUAL_ID));
		label5016.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5016 = (Location) label5016.getLayoutConstraint();
		location5016.setX(0);
		location5016.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCoordinationProtocol_3016(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5026 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.CoordinationProtocolNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createAssemblyConnector_4001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label6001 = createLabel(
				edge,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorCommentEditPart.VISUAL_ID));
		label6001.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6001 = (Location) label6001.getLayoutConstraint();
		location6001.setX(0);
		location6001.setY(40);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createDelegationConnector_4002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label6002 = createLabel(
				edge,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorCommentEditPart.VISUAL_ID));
		label6002.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6002 = (Location) label6002.getLayoutConstraint();
		location6002.setX(0);
		location6002.setY(40);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createDiscretePortGmfProtocol_4005(View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortGmfProtocolEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		// org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);

		// All lines should be black, see bug #46 of Mechatronic UML.
		org.eclipse.swt.graphics.RGB lineRGB = ColorConstants.black.getRGB();

		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label6003 = createLabel(
				edge,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		label6003.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6003 = (Location) label6003.getLayoutConstraint();
		location6003.setX(0);
		location6003.setY(40);
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put("modelID", de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private Node createCompartment(View owner, String hint,
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles()
					.add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(
					TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
