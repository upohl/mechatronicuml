package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import de.fujaba.modelinstance.ModelinstancePackage;

/**
 * @generated
 */
public class MumlElementTypes {

	/**
	 * @generated
	 */
	private MumlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StaticStructuredComponent_2005 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.StaticStructuredComponent_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscretePort_3010 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.DiscretePort_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPort_3011 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ContinuousPort_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentPart_3012 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ComponentPart_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPort_3013 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.HybridPort_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscretePort_3014 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.DiscretePort_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPort_3015 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ContinuousPort_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocol_3016 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.CoordinationProtocol_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyConnector_4001 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.AssemblyConnector_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationConnector_4002 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.DelegationConnector_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscretePortGmfProtocol_4005 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.DiscretePortGmfProtocol_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ModelElementCategory_1000,
					ModelinstancePackage.eINSTANCE.getModelElementCategory());

			elements.put(
					StaticStructuredComponent_2005,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getStaticStructuredComponent());

			elements.put(
					DiscretePort_3010,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDiscretePort());

			elements.put(
					ContinuousPort_3011,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getContinuousPort());

			elements.put(
					ComponentPart_3012,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getComponentPart());

			elements.put(
					HybridPort_3013,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getHybridPort());

			elements.put(
					DiscretePort_3014,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDiscretePort());

			elements.put(
					ContinuousPort_3015,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getContinuousPort());

			elements.put(
					CoordinationProtocol_3016,
					de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
							.getCoordinationProtocol());

			elements.put(
					AssemblyConnector_4001,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getAssemblyConnector());

			elements.put(
					DelegationConnector_4002,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDelegationConnector());

			elements.put(
					DiscretePortGmfProtocol_4005,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDiscretePort_GmfProtocol());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ModelElementCategory_1000);
			KNOWN_ELEMENT_TYPES.add(StaticStructuredComponent_2005);
			KNOWN_ELEMENT_TYPES.add(DiscretePort_3010);
			KNOWN_ELEMENT_TYPES.add(ContinuousPort_3011);
			KNOWN_ELEMENT_TYPES.add(ComponentPart_3012);
			KNOWN_ELEMENT_TYPES.add(HybridPort_3013);
			KNOWN_ELEMENT_TYPES.add(DiscretePort_3014);
			KNOWN_ELEMENT_TYPES.add(ContinuousPort_3015);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocol_3016);
			KNOWN_ELEMENT_TYPES.add(AssemblyConnector_4001);
			KNOWN_ELEMENT_TYPES.add(DelegationConnector_4002);
			KNOWN_ELEMENT_TYPES.add(DiscretePortGmfProtocol_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return StaticStructuredComponent_2005;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return DiscretePort_3010;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return ContinuousPort_3011;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return ComponentPart_3012;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return HybridPort_3013;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return DiscretePort_3014;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return ContinuousPort_3015;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return CoordinationProtocol_3016;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return AssemblyConnector_4001;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return DelegationConnector_4002;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortGmfProtocolEditPart.VISUAL_ID:
			return DiscretePortGmfProtocol_4005;
		}
		return null;
	}

}
