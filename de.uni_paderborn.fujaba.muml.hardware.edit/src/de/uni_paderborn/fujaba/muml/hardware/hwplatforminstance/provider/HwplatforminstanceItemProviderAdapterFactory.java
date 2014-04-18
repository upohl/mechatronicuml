/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.provider;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.util.HwplatforminstanceAdapterFactory;

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
public class HwplatforminstanceItemProviderAdapterFactory extends HwplatforminstanceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public HwplatforminstanceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformInstanceItemProvider hwPlatformInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHWPlatformInstanceAdapter() {
		if (hwPlatformInstanceItemProvider == null) {
			hwPlatformInstanceItemProvider = new HWPlatformInstanceItemProvider(this);
		}

		return hwPlatformInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformInstanceConfigurationItemProvider hwPlatformInstanceConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHWPlatformInstanceConfigurationAdapter() {
		if (hwPlatformInstanceConfigurationItemProvider == null) {
			hwPlatformInstanceConfigurationItemProvider = new HWPlatformInstanceConfigurationItemProvider(this);
		}

		return hwPlatformInstanceConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPortInstanceItemProvider hwPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHWPortInstanceAdapter() {
		if (hwPortInstanceItemProvider == null) {
			hwPortInstanceItemProvider = new HWPortInstanceItemProvider(this);
		}

		return hwPortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationInstanceItemProvider delegationInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationInstanceAdapter() {
		if (delegationInstanceItemProvider == null) {
			delegationInstanceItemProvider = new DelegationInstanceItemProvider(this);
		}

		return delegationInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusConnectorInstanceItemProvider busConnectorInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusConnectorInstanceAdapter() {
		if (busConnectorInstanceItemProvider == null) {
			busConnectorInstanceItemProvider = new BusConnectorInstanceItemProvider(this);
		}

		return busConnectorInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusInstanceItemProvider busInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusInstanceAdapter() {
		if (busInstanceItemProvider == null) {
			busInstanceItemProvider = new BusInstanceItemProvider(this);
		}

		return busInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkInstanceItemProvider linkInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkInstanceAdapter() {
		if (linkInstanceItemProvider == null) {
			linkInstanceItemProvider = new LinkInstanceItemProvider(this);
		}

		return linkInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeInstanceItemProvider bridgeInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBridgeInstanceAdapter() {
		if (bridgeInstanceItemProvider == null) {
			bridgeInstanceItemProvider = new BridgeInstanceItemProvider(this);
		}

		return bridgeInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPortInstanceItemProvider delegationHWPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationHWPortInstanceAdapter() {
		if (delegationHWPortInstanceItemProvider == null) {
			delegationHWPortInstanceItemProvider = new DelegationHWPortInstanceItemProvider(this);
		}

		return delegationHWPortInstanceItemProvider;
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
		if (hwPlatformInstanceItemProvider != null) hwPlatformInstanceItemProvider.dispose();
		if (hwPlatformInstanceConfigurationItemProvider != null) hwPlatformInstanceConfigurationItemProvider.dispose();
		if (hwPortInstanceItemProvider != null) hwPortInstanceItemProvider.dispose();
		if (delegationInstanceItemProvider != null) delegationInstanceItemProvider.dispose();
		if (busConnectorInstanceItemProvider != null) busConnectorInstanceItemProvider.dispose();
		if (busInstanceItemProvider != null) busInstanceItemProvider.dispose();
		if (linkInstanceItemProvider != null) linkInstanceItemProvider.dispose();
		if (bridgeInstanceItemProvider != null) bridgeInstanceItemProvider.dispose();
		if (delegationHWPortInstanceItemProvider != null) delegationHWPortInstanceItemProvider.dispose();
	}

}
