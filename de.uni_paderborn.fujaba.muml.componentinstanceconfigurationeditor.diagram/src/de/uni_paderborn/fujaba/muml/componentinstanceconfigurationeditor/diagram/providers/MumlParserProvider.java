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
import org.storydriven.modeling.SDMPackage;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ComponentInstanceLabelExpressionLabelParser5019 componentInstanceLabel_5019Parser;

	/**
	 * @generated
	 */
	protected IParser getComponentInstanceLabel_5019Parser() {
		if (componentInstanceLabel_5019Parser == null) {
			componentInstanceLabel_5019Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ComponentInstanceLabelExpressionLabelParser5019();
		}
		return componentInstanceLabel_5019Parser;
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
	protected IParser hybridPortInstanceName_5013Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5013Parser() {
		if (hybridPortInstanceName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
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
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ComponentInstanceLabelExpressionLabelParser5018 componentInstanceLabel_5018Parser;

	/**
	 * @generated
	 */
	protected IParser getComponentInstanceLabel_5018Parser() {
		if (componentInstanceLabel_5018Parser == null) {
			componentInstanceLabel_5018Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ComponentInstanceLabelExpressionLabelParser5018();
		}
		return componentInstanceLabel_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getComponentInstanceLabel_5019Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceName_5020Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5021Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceName_5022Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5023Parser();
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
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getComponentInstanceLabel_5018Parser();
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
