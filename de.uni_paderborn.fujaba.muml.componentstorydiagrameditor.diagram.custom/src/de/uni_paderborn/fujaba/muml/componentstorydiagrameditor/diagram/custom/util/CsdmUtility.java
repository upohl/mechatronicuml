package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.muml.model.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule;

public class CsdmUtility {

	private static final String EMPTY = ""; //$NON-NLS-1$
	private static final String STEREOTYPE_PREFIX = "\u00ab"; //$NON-NLS-1$
	private static final String STEREOTYPE_SUFFIX = "\u00bb"; //$NON-NLS-1$

	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	private CsdmUtility() {
		// hide constructor
	}

	public static String adaptComponentStoryPatternVariableText(
			IGraphicalEditPart editPart) {
		ComponentStoryPatternVariable cspVar = (ComponentStoryPatternVariable) ((View) editPart
				.getModel()).getElement();

		switch (cspVar.getBindingOperator()) {
		case CREATE: {
			return STEREOTYPE_PREFIX + "create" + STEREOTYPE_SUFFIX;
		}
		case DESTROY: {
			return STEREOTYPE_PREFIX + "destroy" + STEREOTYPE_SUFFIX;
		}
		default: {
			return EMPTY;
		}
		}
	}

	public static void adaptColor(IGraphicalEditPart editPart) {
		ComponentStoryPatternVariable cspVar = (ComponentStoryPatternVariable) ((View) editPart
				.getModel()).getElement();
		org.eclipse.swt.graphics.RGB lineRGB;

		switch (cspVar.getBindingOperator()) {
		case CREATE:
			lineRGB = RGB_CREATE;
			break;
		case DESTROY:
			lineRGB = RGB_DESTROY;
			break;
		default:
		case CHECK_ONLY:
			lineRGB = RGB_CHECK;
			break;
		}

		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						(View) editPart.getModel(),
						org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE
								.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));

	}

	private static Component getComponentFromComponentStoryRule(
			ComponentStoryRule componentStoryRule) {
		if (componentStoryRule.getActivity() != null) {
			Activity activity = componentStoryRule.getActivity();
			if (!activity.getOwnedActivityNodes().isEmpty()) {
				for (int i = 0; i < activity.getOwnedActivityNodes().size(); i++) {
					ComponentStoryNode componentStoryNode = (ComponentStoryNode) activity
							.getOwnedActivityNodes().get(i);
					if (componentStoryNode.getComponentStoryPattern() != null) {
						ComponentStoryPattern componentStoryPattern = componentStoryNode
								.getComponentStoryPattern();
						if (componentStoryPattern.getThisVariable() != null) {
							ComponentVariable componentVariable = componentStoryPattern
									.getThisVariable();
							if (componentVariable.getType() != null) {
								return componentVariable.getType();
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static String getSignature(ComponentStoryRule componentStoryRule) {

		Component component = CsdmUtility
				.getComponentFromComponentStoryRule(componentStoryRule);

		String type = "";
		String name = "";
		String parameters = "";
		String resultParameters = "";

		Port tmpPort = null;
		ComponentPart tmpPart = null;
		Component tmpComponent = null;

		// build list of Return Parameters and build String to Display
		for (Parameter returnParameter : componentStoryRule
				.getReturnParameters()) {
			if (returnParameter.getDataType() instanceof Port) {
				tmpPort = ((Port) returnParameter.getDataType());
				resultParameters = resultParameters.concat(tmpPort.getName()
						+ " " + returnParameter.getName() + ", ");
			} else if (returnParameter.getDataType() instanceof ComponentPart) {
				tmpPart = ((ComponentPart) returnParameter.getDataType());
				tmpComponent = ((Component) tmpPart.getComponentType());
				resultParameters = resultParameters.concat(returnParameter
						.getName()
						+ " / "
						+ tmpPart.getName()
						+ " : "
						+ tmpComponent.getName() + ", ");
			}
		}

		if (resultParameters != "") {
			resultParameters = resultParameters.substring(0,
					resultParameters.length() - 2);
		}

		for (Parameter parameter : componentStoryRule.getParameters()) {
			if (parameter.getDataType() instanceof Port) {
				tmpPort = ((Port) parameter.getDataType());
				parameters = parameters.concat(parameter.getName() + " / "
						+ tmpPort.getName() /* + " : " + tmpPortType.getName() */
						+ ", ");
			} else if (parameter.getDataType() instanceof ComponentPart) {
				tmpPart = ((ComponentPart) parameter.getDataType());
				tmpComponent = ((Component) tmpPart.getComponentType());
				parameters = parameters.concat(parameter.getName() + " / "
						+ tmpPart.getName() + " : " + tmpComponent.getName()
						+ ", ");
			}
		}

		if (parameters != "") {
			parameters = parameters.substring(0, parameters.length() - 2);
		}

		if (componentStoryRule.getName() != null) {
			name = componentStoryRule.getName();
		}

		if (component != null){
			if (component.getName() != null) {
				type = component.getName();
			}
		}

		return type + "::" + name + "(" + parameters + ") : ("
				+ resultParameters + ")";
	}

}
