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
package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.CorePackage;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser coordinationProtocolName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCoordinationProtocolName_5005Parser() {
		if (coordinationProtocolName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser(
					features);
			coordinationProtocolName_5005Parser = parser;
		}
		return coordinationProtocolName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5006Parser() {
		if (roleName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser(
					features);
			roleName_5006Parser = parser;
		}
		return roleName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageBufferName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getMessageBufferName_5012Parser() {
		if (messageBufferName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser(
					features);
			messageBufferName_5012Parser = parser;
		}
		return messageBufferName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMessageBufferLabel_5013Parser() {
		return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageBufferLabelExpressionLabelParser5013();
	}

	/**
	 * @generated
	 */
	private IParser messageTypeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getMessageTypeName_5010Parser() {
		if (messageTypeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.MessageFormatParser(
					features);
			messageTypeName_5010Parser = parser;
		}
		return messageTypeName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5014Parser() {
		return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5014();
	}

	/**
	 * @generated
	 */
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5015Parser() {
		return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5015();
	}

	/**
	 * @generated
	 */
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5016Parser() {
		return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5016();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolNameEditPart.VISUAL_ID:
			return getCoordinationProtocolName_5005Parser();
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_5006Parser();
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageBufferName2EditPart.VISUAL_ID:
			return getMessageBufferName_5012Parser();
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getMessageBufferLabel_5013Parser();
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
			return getMessageTypeName_5010Parser();
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsMessageLossPossibleEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5014Parser();
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5015Parser();
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5016Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
