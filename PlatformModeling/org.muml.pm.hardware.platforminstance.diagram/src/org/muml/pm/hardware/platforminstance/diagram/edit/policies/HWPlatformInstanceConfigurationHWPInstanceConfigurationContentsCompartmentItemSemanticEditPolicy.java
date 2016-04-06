package org.muml.pm.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentItemSemanticEditPolicy extends
		org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentItemSemanticEditPolicy() {
		super(org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstanceConfiguration_3039);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3040 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platforminstance.diagram.edit.commands.HWPlatformInstance2CreateCommand(
							req));
		}
		if (org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_3042 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platforminstance.diagram.edit.commands.StructuredResourceInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.ActuatorInstance_3044 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platforminstance.diagram.edit.commands.ActuatorInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.SensorInstance_3045 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platforminstance.diagram.edit.commands.SensorInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3046 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platforminstance.diagram.edit.commands.BusInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkBridgeInstance_3047 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platforminstance.diagram.edit.commands.NetworkBridgeInstanceCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}