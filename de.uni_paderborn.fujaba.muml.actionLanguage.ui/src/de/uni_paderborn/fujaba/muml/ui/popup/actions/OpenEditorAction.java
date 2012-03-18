package de.uni_paderborn.fujaba.muml.ui.popup.actions;

import de.uni_paderborn.fujaba.muml.ui.ActionStorage;
import de.uni_paderborn.fujaba.muml.ui.IModelStorage;

public class OpenEditorAction extends OpenEditorBase {

	@Override
	protected IModelStorage getStorage() {
		return new ActionStorage(getModel());
	}

}
