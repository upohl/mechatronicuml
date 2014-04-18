package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part;

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
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class HardwareDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3016SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3023SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3024SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3025SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7004SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
			return getStructuredResourceInstanceStructuredResourceCompartment_7005SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
			return getHWPlatformInstanceHWPlatformCompartment_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstance_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNetworkingHardwareInstances()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstance_3016SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstance_3023SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNetworkingHardwareInstances()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDelegationPorts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getActuatorInstance_3024SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSensorInstance_3025SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHwports().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResources().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getStructuredResourceInstanceStructuredResourceCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedAtomicResourceInstances()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getHWPlatformInstanceHWPlatformCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getResources().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHwplatformInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance childElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3017ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3018ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3019ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3020ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3021ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3022ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3023ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3024ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3025ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3026ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart.VISUAL_ID:
			return getBridgeInstance_3027ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3028ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID:
			return getLinkInstance_4009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID:
			return getBusConnectorInstance_4010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3017IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3018IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3019IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3020IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3021IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3022IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3023IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3024IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3025IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3026IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart.VISUAL_ID:
			return getBridgeInstance_3027IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3028IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID:
			return getLinkInstance_4009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID:
			return getBusConnectorInstance_4010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3017OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3018OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3019OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3020OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3021OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3022OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3023OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3024OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3025OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3026OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart.VISUAL_ID:
			return getBridgeInstance_3027OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3028OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID:
			return getLinkInstance_4009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID:
			return getBusConnectorInstance_4010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstanceConfiguration_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DelegationInstance_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkInstance_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_BusConnectorInstance_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3023ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DelegationInstance_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkInstance_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_BusConnectorInstance_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusInstance_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBridgeInstance_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationHWPortInstance_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationInstance_4008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLinkInstance_4009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusConnectorInstance_4010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusInstance_3026IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkInstance_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BusConnectorInstance_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBridgeInstance_3027IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkInstance_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BusConnectorInstance_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationHWPortInstance_3028IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkInstance_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BusConnectorInstance_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationInstance_4008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLinkInstance_4009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusConnectorInstance_4010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStructuredResourceInstance_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCacheInstance_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProgrammableLogicDeviceInstance_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessorInstance_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getProcessingMemoryInstance_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getStorageMemoryInstance_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getCommunicationResource_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getHWPlatformInstance_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getActuatorInstance_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getSensorInstance_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusInstance_3026OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkInstance_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BusConnectorInstance_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBridgeInstance_3027OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkInstance_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BusConnectorInstance_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationHWPortInstance_3028OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance modelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkInstance_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BusConnectorInstance_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getDelegationInstance_4008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getLinkInstance_4009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getBusConnectorInstance_4010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_DelegationInstance_4008(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_LinkInstance_4009(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedTypeModelFacetLinks_BusConnectorInstance_4010(
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance container) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationInstance_4008(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_LinkInstance_4009(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingTypeModelFacetLinks_BusConnectorInstance_4010(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationInstance_4008(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance source) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) {
				container = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkInstance_4009(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance source) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) {
				container = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingTypeModelFacetLinks_BusConnectorInstance_4010(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance source) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) {
				container = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor>();
		for (Iterator<?> links = container.getNetworkingHardwareInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance link = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareNodeDescriptor> getSemanticChildren(
				View view) {
			return HardwareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getContainedLinks(
				View view) {
			return HardwareDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getIncomingLinks(
				View view) {
			return HardwareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareLinkDescriptor> getOutgoingLinks(
				View view) {
			return HardwareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
