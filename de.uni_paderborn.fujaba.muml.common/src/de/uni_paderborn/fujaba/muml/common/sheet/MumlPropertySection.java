package de.uni_paderborn.fujaba.muml.common.sheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import de.uni_paderborn.fujaba.common.FujabaCommonPlugin;
import de.uni_paderborn.fujaba.muml.common.MumlCommonPlugin;

public class MumlPropertySection extends AdvancedPropertySection implements
		IPropertySourceProvider {

	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				EditingDomain ed = getEditingDomainFor(object);
				return new de.uni_paderborn.fujaba.muml.common.emf.edit.provider.CustomPropertySource(
						object, ips, af, ed, this);
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object)
					.getAdapter(IPropertySource.class);
		}
		return null;
	}

	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	/**
	 * Modify/unwrap selection.
	 */
	protected Object transformSelection(Object selected) {

		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(
				structuredSelection.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	protected AdapterFactory getAdapterFactory(Object object) {
		AdapterFactoryEditingDomain editingDomain = getEditingDomainFor(object);
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory();
			
		List<AdapterFactory> positiveFactories =  FujabaCommonPlugin.getInstance().getCustomItemProviderAdapterFactories(MumlCommonPlugin.ID, true);
		List<AdapterFactory> negativeFactories =  FujabaCommonPlugin.getInstance().getCustomItemProviderAdapterFactories(MumlCommonPlugin.ID, false);
		
		for (AdapterFactory factory : positiveFactories) {
			adapterFactory.addAdapterFactory(factory);		
		}
		
		if (editingDomain != null && editingDomain.getAdapterFactory() != null) {
			adapterFactory.addAdapterFactory(editingDomain.getAdapterFactory());
		}
			
		for (AdapterFactory factory : negativeFactories) {
			adapterFactory.addAdapterFactory(factory);		
		}
		return adapterFactory;
	}

	protected AdapterFactoryEditingDomain getEditingDomainFor(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return (AdapterFactoryEditingDomain) getEditingDomain();
		}
		return (AdapterFactoryEditingDomain) TransactionUtil
				.getEditingDomain(object);
	}

}
