package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers;

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
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser structuredComponentInstanceLabel_5026Parser;

	/**
	 * @generated
	 */
	protected IParser getStructuredComponentInstanceLabel_5026Parser() {
		if (structuredComponentInstanceLabel_5026Parser == null) {
			structuredComponentInstanceLabel_5026Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser();
		}
		return structuredComponentInstanceLabel_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortInstanceName_5020Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5020Parser() {
		if (hybridPortInstanceName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortInstanceName_5020Parser = parser;
		}
		return hybridPortInstanceName_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5021Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5021Parser() {
		if (discreteSinglePortInstanceName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5021Parser = parser;
		}
		return discreteSinglePortInstanceName_5021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteMultiPortInstanceName_5022Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteMultiPortInstanceName_5022Parser() {
		if (discreteMultiPortInstanceName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteMultiPortInstanceName_5022Parser = parser;
		}
		return discreteMultiPortInstanceName_5022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortInstanceName_5023Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceName_5023Parser() {
		if (continuousPortInstanceName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortInstanceName_5023Parser = parser;
		}
		return continuousPortInstanceName_5023Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser atomicComponentInstanceLabel_5032Parser;

	/**
	 * @generated
	 */
	protected IParser getAtomicComponentInstanceLabel_5032Parser() {
		if (atomicComponentInstanceLabel_5032Parser == null) {
			atomicComponentInstanceLabel_5032Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser();
		}
		return atomicComponentInstanceLabel_5032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortInstanceName_5013Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5013Parser() {
		if (hybridPortInstanceName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortInstanceName_5013Parser = parser;
		}
		return hybridPortInstanceName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5014Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5014Parser() {
		if (discreteSinglePortInstanceName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5014Parser = parser;
		}
		return discreteSinglePortInstanceName_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteMultiPortInstanceName_5016Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteMultiPortInstanceName_5016Parser() {
		if (discreteMultiPortInstanceName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteMultiPortInstanceName_5016Parser = parser;
		}
		return discreteMultiPortInstanceName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5015Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5015Parser() {
		if (discreteSinglePortInstanceName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5015Parser = parser;
		}
		return discreteSinglePortInstanceName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortInstanceName_5017Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceName_5017Parser() {
		if (continuousPortInstanceName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortInstanceName_5017Parser = parser;
		}
		return continuousPortInstanceName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser structuredComponentInstanceLabel_5025Parser;

	/**
	 * @generated
	 */
	protected IParser getStructuredComponentInstanceLabel_5025Parser() {
		if (structuredComponentInstanceLabel_5025Parser == null) {
			structuredComponentInstanceLabel_5025Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser();
		}
		return structuredComponentInstanceLabel_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5024Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5024Parser() {
		if (discreteSinglePortInstanceName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5024Parser = parser;
		}
		return discreteSinglePortInstanceName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortInstanceName_5027Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5027Parser() {
		if (hybridPortInstanceName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortInstanceName_5027Parser = parser;
		}
		return hybridPortInstanceName_5027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5028Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5028Parser() {
		if (discreteSinglePortInstanceName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5028Parser = parser;
		}
		return discreteSinglePortInstanceName_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteMultiPortInstanceName_5030Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteMultiPortInstanceName_5030Parser() {
		if (discreteMultiPortInstanceName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteMultiPortInstanceName_5030Parser = parser;
		}
		return discreteMultiPortInstanceName_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5029Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5029Parser() {
		if (discreteSinglePortInstanceName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5029Parser = parser;
		}
		return discreteSinglePortInstanceName_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortInstanceName_5031Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceName_5031Parser() {
		if (continuousPortInstanceName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortInstanceName_5031Parser = parser;
		}
		return continuousPortInstanceName_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5026Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceName_5020Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5021Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceName_5022Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5023Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5032Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID:
			return getHybridPortInstanceName_5013Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5014Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceName_5016Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5015Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5017Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5025Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName4EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5024Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceName3EditPart.VISUAL_ID:
			return getHybridPortInstanceName_5027Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName5EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5028Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceName3EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceName_5030Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName6EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5029Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceName3EditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5031Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes
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
