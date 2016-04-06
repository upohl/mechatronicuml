package org.muml.pim.operationrepository.diagram.sheet;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.tooling.runtime.sheet.DefaultPropertySection;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class MumlPropertySection extends DefaultPropertySection implements IPropertySourceProvider {

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	@Override
	protected Object transformSelection(Object selected) {
		selected = /*super.*/transformSelectionToDomain(selected);
		return selected;
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		AdapterFactoryEditingDomain editingDomain = getEditingDomainFor(object);
		if (editingDomain != null) {
			AdapterFactory defaultFactory = editingDomain.getAdapterFactory();
			List<AdapterFactory> positivePriorityFactories = org.muml.core.common.FujabaCommonPlugin
					.getInstance().getCustomItemProviderAdapterFactories(
							org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin.ID,
							true);
			List<AdapterFactory> negativePriorityFactories = org.muml.core.common.FujabaCommonPlugin
					.getInstance().getCustomItemProviderAdapterFactories(
							org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin.ID,
							false);

			// Put all factories into one composed adapter factory.
			List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
			factories.addAll(positivePriorityFactories);
			factories.add(defaultFactory);
			factories.addAll(negativePriorityFactories);
			return new ComposedAdapterFactory(factories);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected AdapterFactoryEditingDomain getEditingDomainFor(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return (AdapterFactoryEditingDomain) getEditingDomain();
		}
		return (AdapterFactoryEditingDomain) TransactionUtil.getEditingDomain(object);
	}

}