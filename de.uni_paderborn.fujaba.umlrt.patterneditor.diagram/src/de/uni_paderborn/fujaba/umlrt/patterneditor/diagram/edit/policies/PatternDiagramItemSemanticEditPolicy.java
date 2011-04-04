package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PatternDiagramItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.policies.PatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PatternDiagramItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.PatternDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.CoordinationPattern_2001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.commands.CoordinationPatternCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.Role_2002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.TextualConstraint_2003 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.commands.TextualConstraintCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
