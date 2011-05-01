/*
 * Created on 08.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.umlrt.common.wizard.AbstractWizard;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin;

public class ModifyParameterWizard extends AbstractWizard {
	
	private final String ADD_EPARAMETER_WIZARD_SECTION = "AddEParameterWizard";

	private org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag = null;

	private ModifyParameterPage addEParameterPage;
	
	private SynchronizationChannel selectedSyncChannel = null;

	public ModifyParameterWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, SynchronizationChannel sC)
	{
		super();

		this.diag = diag;
		this.setSelectedSyncChannel(sC);

		IDialogSettings workbenchSettings = RealtimeStatechartDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.ADD_EPARAMETER_WIZARD_SECTION);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.ADD_EPARAMETER_WIZARD_SECTION);
		}
		setDialogSettings(section);
		
	}

	@Override
	public void addPages() {

		addEParameterPage = new ModifyParameterPage("Create/Delete parameters for selected synchronization channel");
		addPage(addEParameterPage);
		
	}


	public org.eclipse.gmf.runtime.notation.impl.DiagramImpl getDiag() {
		return diag;
	}

	@Override
	public boolean performFinish() {
		
		return super.performFinish();
	}

	public void setSelectedSyncChannel(SynchronizationChannel selectedSyncChannel) {
		this.selectedSyncChannel = selectedSyncChannel;
	}

	public SynchronizationChannel getSelectedSyncChannel() {
		return selectedSyncChannel;
	}
}
