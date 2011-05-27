package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.sheet.AtomiccomponentPropertySection;
import de.uni_paderborn.fujaba.umlrt.common.sheet.CustomPropertySource;

public class CustomAtomiccomponentPropertySection extends
		AtomiccomponentPropertySection {

	/**
	 * Customized to create our own CustomPropertySource objects.
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new CustomPropertySource(object, ips);
			}
		}
		return super.getPropertySource(object);
	}
}
