/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfStateEditPart
		extends org.muml.pim.realtimestatechart.diagram.providers.MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryEvent_3033);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.DoEvent_3034);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitEvent_3035);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Region_3042);
		types.add(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037);
		types.add(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ClockConstraint_3036);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart) {
			types.add(
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003);
		}
		if (targetEditPart instanceof org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart) {
			types.add(
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003);
		}
		if (targetEditPart instanceof org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart) {
			types.add(
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003) {
			types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.State_3032);
			types.add(
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040);
			types.add(
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget(
				(org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003) {
			types.add(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.State_3032);
			types.add(
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040);
			types.add(
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041);
		}
		return types;
	}

}
