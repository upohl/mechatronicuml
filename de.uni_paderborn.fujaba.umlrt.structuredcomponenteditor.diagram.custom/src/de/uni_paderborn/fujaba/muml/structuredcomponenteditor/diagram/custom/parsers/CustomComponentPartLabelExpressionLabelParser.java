package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.parsers;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.ComponentPartLabelExpressionLabelParser;

public class CustomComponentPartLabelExpressionLabelParser extends
		ComponentPartLabelExpressionLabelParser {

//	@Override
//	protected IStatus updateValues(EObject target, String newString)
//			throws ExecutionException {
//		((ComponentPart) target).setName(newString);
//		return Status.OK_STATUS;
//	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		// XXX Any event is recognized as important, unless there's a way to
		// extract this information from expression itself.
		// TODO analyze expressions (e.g. using OCL parser) to find out
		// structural features in use
		return true;
	}

}
