/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.provider;

import de.fujaba.properties.util.PropertiesAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesItemProviderAdapterFactory extends PropertiesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.PropertyGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyGeneratorItemProvider propertyGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.PropertyGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyGeneratorAdapter() {
		if (propertyGeneratorItemProvider == null) {
			propertyGeneratorItemProvider = new PropertyGeneratorItemProvider(this);
		}

		return propertyGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.Plugin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginItemProvider pluginItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.Plugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPluginAdapter() {
		if (pluginItemProvider == null) {
			pluginItemProvider = new PluginItemProvider(this);
		}

		return pluginItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.PropertyTab} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTabItemProvider propertyTabItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.PropertyTab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyTabAdapter() {
		if (propertyTabItemProvider == null) {
			propertyTabItemProvider = new PropertyTabItemProvider(this);
		}

		return propertyTabItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.TextPropertySection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextPropertySectionItemProvider textPropertySectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.TextPropertySection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextPropertySectionAdapter() {
		if (textPropertySectionItemProvider == null) {
			textPropertySectionItemProvider = new TextPropertySectionItemProvider(this);
		}

		return textPropertySectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.ComboBoxPropertySection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboBoxPropertySectionItemProvider comboBoxPropertySectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.ComboBoxPropertySection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComboBoxPropertySectionAdapter() {
		if (comboBoxPropertySectionItemProvider == null) {
			comboBoxPropertySectionItemProvider = new ComboBoxPropertySectionItemProvider(this);
		}

		return comboBoxPropertySectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.RadioPropertySection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioPropertySectionItemProvider radioPropertySectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.RadioPropertySection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRadioPropertySectionAdapter() {
		if (radioPropertySectionItemProvider == null) {
			radioPropertySectionItemProvider = new RadioPropertySectionItemProvider(this);
		}

		return radioPropertySectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.ListPropertySection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListPropertySectionItemProvider listPropertySectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.ListPropertySection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListPropertySectionAdapter() {
		if (listPropertySectionItemProvider == null) {
			listPropertySectionItemProvider = new ListPropertySectionItemProvider(this);
		}

		return listPropertySectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.GroupPropertySection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupPropertySectionItemProvider groupPropertySectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.GroupPropertySection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupPropertySectionAdapter() {
		if (groupPropertySectionItemProvider == null) {
			groupPropertySectionItemProvider = new GroupPropertySectionItemProvider(this);
		}

		return groupPropertySectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.CustomPropertySection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomPropertySectionItemProvider customPropertySectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.CustomPropertySection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomPropertySectionAdapter() {
		if (customPropertySectionItemProvider == null) {
			customPropertySectionItemProvider = new CustomPropertySectionItemProvider(this);
		}

		return customPropertySectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.OCLPropertyFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLPropertyFilterItemProvider oclPropertyFilterItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.OCLPropertyFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOCLPropertyFilterAdapter() {
		if (oclPropertyFilterItemProvider == null) {
			oclPropertyFilterItemProvider = new OCLPropertyFilterItemProvider(this);
		}

		return oclPropertyFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fujaba.properties.PropertyReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyReferenceItemProvider propertyReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.fujaba.properties.PropertyReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyReferenceAdapter() {
		if (propertyReferenceItemProvider == null) {
			propertyReferenceItemProvider = new PropertyReferenceItemProvider(this);
		}

		return propertyReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (propertyGeneratorItemProvider != null) propertyGeneratorItemProvider.dispose();
		if (pluginItemProvider != null) pluginItemProvider.dispose();
		if (propertyTabItemProvider != null) propertyTabItemProvider.dispose();
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (textPropertySectionItemProvider != null) textPropertySectionItemProvider.dispose();
		if (comboBoxPropertySectionItemProvider != null) comboBoxPropertySectionItemProvider.dispose();
		if (radioPropertySectionItemProvider != null) radioPropertySectionItemProvider.dispose();
		if (listPropertySectionItemProvider != null) listPropertySectionItemProvider.dispose();
		if (groupPropertySectionItemProvider != null) groupPropertySectionItemProvider.dispose();
		if (customPropertySectionItemProvider != null) customPropertySectionItemProvider.dispose();
		if (oclPropertyFilterItemProvider != null) oclPropertyFilterItemProvider.dispose();
		if (propertyReferenceItemProvider != null) propertyReferenceItemProvider.dispose();
	}

}
