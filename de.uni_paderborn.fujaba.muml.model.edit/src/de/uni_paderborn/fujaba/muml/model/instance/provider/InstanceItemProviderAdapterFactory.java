/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.provider;

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

import de.uni_paderborn.fujaba.muml.model.instance.util.InstanceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceItemProviderAdapterFactory extends InstanceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public InstanceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceItemProvider componentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstanceAdapter() {
		if (componentInstanceItemProvider == null) {
			componentInstanceItemProvider = new ComponentInstanceItemProvider(this);
		}

		return componentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorInstanceItemProvider connectorInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorInstanceAdapter() {
		if (connectorInstanceItemProvider == null) {
			connectorInstanceItemProvider = new ConnectorInstanceItemProvider(this);
		}

		return connectorInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInstanceItemProvider assemblyInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyInstanceAdapter() {
		if (assemblyInstanceItemProvider == null) {
			assemblyInstanceItemProvider = new AssemblyInstanceItemProvider(this);
		}

		return assemblyInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationInstanceItemProvider delegationInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance}.
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
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceConfigurationItemProvider componentInstanceConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstanceConfigurationAdapter() {
		if (componentInstanceConfigurationItemProvider == null) {
			componentInstanceConfigurationItemProvider = new ComponentInstanceConfigurationItemProvider(this);
		}

		return componentInstanceConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousPortInstanceItemProvider continuousPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContinuousPortInstanceAdapter() {
		if (continuousPortInstanceItemProvider == null) {
			continuousPortInstanceItemProvider = new ContinuousPortInstanceItemProvider(this);
		}

		return continuousPortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridPortInstanceItemProvider hybridPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHybridPortInstanceAdapter() {
		if (hybridPortInstanceItemProvider == null) {
			hybridPortInstanceItemProvider = new HybridPortInstanceItemProvider(this);
		}

		return hybridPortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteSinglePortInstanceItemProvider discreteSinglePortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscreteSinglePortInstanceAdapter() {
		if (discreteSinglePortInstanceItemProvider == null) {
			discreteSinglePortInstanceItemProvider = new DiscreteSinglePortInstanceItemProvider(this);
		}

		return discreteSinglePortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteMultiPortInstanceItemProvider discreteMultiPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscreteMultiPortInstanceAdapter() {
		if (discreteMultiPortInstanceItemProvider == null) {
			discreteMultiPortInstanceItemProvider = new DiscreteMultiPortInstanceItemProvider(this);
		}

		return discreteMultiPortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.instance.PatternInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternInstanceItemProvider patternInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.PatternInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternInstanceAdapter() {
		if (patternInstanceItemProvider == null) {
			patternInstanceItemProvider = new PatternInstanceItemProvider(this);
		}

		return patternInstanceItemProvider;
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
		if (componentInstanceItemProvider != null) componentInstanceItemProvider.dispose();
		if (connectorInstanceItemProvider != null) connectorInstanceItemProvider.dispose();
		if (assemblyInstanceItemProvider != null) assemblyInstanceItemProvider.dispose();
		if (delegationInstanceItemProvider != null) delegationInstanceItemProvider.dispose();
		if (componentInstanceConfigurationItemProvider != null) componentInstanceConfigurationItemProvider.dispose();
		if (continuousPortInstanceItemProvider != null) continuousPortInstanceItemProvider.dispose();
		if (hybridPortInstanceItemProvider != null) hybridPortInstanceItemProvider.dispose();
		if (discreteSinglePortInstanceItemProvider != null) discreteSinglePortInstanceItemProvider.dispose();
		if (discreteMultiPortInstanceItemProvider != null) discreteMultiPortInstanceItemProvider.dispose();
		if (patternInstanceItemProvider != null) patternInstanceItemProvider.dispose();
	}

}
