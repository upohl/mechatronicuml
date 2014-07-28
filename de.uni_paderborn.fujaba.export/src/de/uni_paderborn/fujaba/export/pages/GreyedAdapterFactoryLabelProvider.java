package de.uni_paderborn.fujaba.export.pages;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Color;

public class GreyedAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider {

	private static final Color COLOR_UNSUPPORTED_ITEM_FOREGROUND = new Color(null, 128, 128, 128);
	private static final Color COLOR_UNSUPPORTED_ITEM_BACKGROUND = new Color(null, 200, 200, 200);

	public GreyedAdapterFactoryLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	@Override
	public Color getForeground(Object object) {
		if (!isEnabled(object)) {
			return COLOR_UNSUPPORTED_ITEM_FOREGROUND;
		}
		return super.getForeground(object);
	}
	@Override
	public Color getBackground(Object object) {
		if (!isEnabled(object)) {
			return COLOR_UNSUPPORTED_ITEM_BACKGROUND;
		}
		return super.getForeground(object);
	}

	public boolean isEnabled(Object object) {
		return true;
	}

}
