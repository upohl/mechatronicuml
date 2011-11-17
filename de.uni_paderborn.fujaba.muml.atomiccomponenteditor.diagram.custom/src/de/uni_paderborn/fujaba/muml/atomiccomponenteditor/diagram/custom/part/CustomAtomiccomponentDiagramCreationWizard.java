package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.part;

import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlCreationWizard;

/**
 * A CreationWizard for StructuredComponent diagrams. It implements the abstract
 * creation wizard from the de.uni_paderborn.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentDiagramCreationWizard extends
		MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.components.category";
	}

}
