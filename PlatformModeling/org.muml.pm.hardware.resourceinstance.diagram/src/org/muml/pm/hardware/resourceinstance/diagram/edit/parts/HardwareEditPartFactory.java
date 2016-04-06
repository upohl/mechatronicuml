package org.muml.pm.hardware.resourceinstance.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class HardwareEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel11EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel12EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel13EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel14EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel15EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel16EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel17EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel18EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel19EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel20EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel21EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel22EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel23EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel24EditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart(
						view);

			case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}