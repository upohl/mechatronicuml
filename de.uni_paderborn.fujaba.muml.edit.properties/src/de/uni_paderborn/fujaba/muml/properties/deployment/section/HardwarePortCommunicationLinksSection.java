package de.uni_paderborn.fujaba.muml.properties.deployment.section;
public class HardwarePortCommunicationLinksSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
				.getHardwarePort_CommunicationLinks();
	}
	@Override
	protected String getLabelText() {
		return "CommunicationLinks";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}