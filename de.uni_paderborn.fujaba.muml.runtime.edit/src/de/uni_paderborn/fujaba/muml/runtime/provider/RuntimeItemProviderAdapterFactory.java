/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package de.uni_paderborn.fujaba.muml.runtime.provider;

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

import de.uni_paderborn.fujaba.muml.runtime.util.RuntimeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeItemProviderAdapterFactory extends RuntimeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public RuntimeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeComponentInstanceItemProvider runtimeComponentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeComponentInstanceAdapter() {
		if (runtimeComponentInstanceItemProvider == null) {
			runtimeComponentInstanceItemProvider = new RuntimeComponentInstanceItemProvider(this);
		}

		return runtimeComponentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeMessageBufferItemProvider runtimeMessageBufferItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeMessageBufferAdapter() {
		if (runtimeMessageBufferItemProvider == null) {
			runtimeMessageBufferItemProvider = new RuntimeMessageBufferItemProvider(this);
		}

		return runtimeMessageBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeStatechartInstanceItemProvider realtimeStatechartInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealtimeStatechartInstanceAdapter() {
		if (realtimeStatechartInstanceItemProvider == null) {
			realtimeStatechartInstanceItemProvider = new RealtimeStatechartInstanceItemProvider(this);
		}

		return realtimeStatechartInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeMessageItemProvider runtimeMessageItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeMessageAdapter() {
		if (runtimeMessageItemProvider == null) {
			runtimeMessageItemProvider = new RuntimeMessageItemProvider(this);
		}

		return runtimeMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeParameterItemProvider runtimeParameterItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeParameterAdapter() {
		if (runtimeParameterItemProvider == null) {
			runtimeParameterItemProvider = new RuntimeParameterItemProvider(this);
		}

		return runtimeParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.VariableBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableBindingItemProvider variableBindingItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.VariableBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableBindingAdapter() {
		if (variableBindingItemProvider == null) {
			variableBindingItemProvider = new VariableBindingItemProvider(this);
		}

		return variableBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.SingleRoleInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleRoleInstanceItemProvider singleRoleInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.SingleRoleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleRoleInstanceAdapter() {
		if (singleRoleInstanceItemProvider == null) {
			singleRoleInstanceItemProvider = new SingleRoleInstanceItemProvider(this);
		}

		return singleRoleInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.MultiRoleInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiRoleInstanceItemProvider multiRoleInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.MultiRoleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiRoleInstanceAdapter() {
		if (multiRoleInstanceItemProvider == null) {
			multiRoleInstanceItemProvider = new MultiRoleInstanceItemProvider(this);
		}

		return multiRoleInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeRoleConnectorInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeRoleConnectorInstanceItemProvider runtimeRoleConnectorInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeRoleConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeRoleConnectorInstanceAdapter() {
		if (runtimeRoleConnectorInstanceItemProvider == null) {
			runtimeRoleConnectorInstanceItemProvider = new RuntimeRoleConnectorInstanceItemProvider(this);
		}

		return runtimeRoleConnectorInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeAssemblyConnectorInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeAssemblyConnectorInstanceItemProvider runtimeAssemblyConnectorInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeAssemblyConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeAssemblyConnectorInstanceAdapter() {
		if (runtimeAssemblyConnectorInstanceItemProvider == null) {
			runtimeAssemblyConnectorInstanceItemProvider = new RuntimeAssemblyConnectorInstanceItemProvider(this);
		}

		return runtimeAssemblyConnectorInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOnConnectorItemProvider messageOnConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageOnConnectorAdapter() {
		if (messageOnConnectorItemProvider == null) {
			messageOnConnectorItemProvider = new MessageOnConnectorItemProvider(this);
		}

		return messageOnConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscreteSinglePortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeDiscreteSinglePortInstanceItemProvider runtimeDiscreteSinglePortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscreteSinglePortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeDiscreteSinglePortInstanceAdapter() {
		if (runtimeDiscreteSinglePortInstanceItemProvider == null) {
			runtimeDiscreteSinglePortInstanceItemProvider = new RuntimeDiscreteSinglePortInstanceItemProvider(this);
		}

		return runtimeDiscreteSinglePortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscreteMultiPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeDiscreteMultiPortInstanceItemProvider runtimeDiscreteMultiPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscreteMultiPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeDiscreteMultiPortInstanceAdapter() {
		if (runtimeDiscreteMultiPortInstanceItemProvider == null) {
			runtimeDiscreteMultiPortInstanceItemProvider = new RuntimeDiscreteMultiPortInstanceItemProvider(this);
		}

		return runtimeDiscreteMultiPortInstanceItemProvider;
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
		if (runtimeComponentInstanceItemProvider != null) runtimeComponentInstanceItemProvider.dispose();
		if (runtimeMessageBufferItemProvider != null) runtimeMessageBufferItemProvider.dispose();
		if (realtimeStatechartInstanceItemProvider != null) realtimeStatechartInstanceItemProvider.dispose();
		if (runtimeMessageItemProvider != null) runtimeMessageItemProvider.dispose();
		if (runtimeParameterItemProvider != null) runtimeParameterItemProvider.dispose();
		if (variableBindingItemProvider != null) variableBindingItemProvider.dispose();
		if (singleRoleInstanceItemProvider != null) singleRoleInstanceItemProvider.dispose();
		if (multiRoleInstanceItemProvider != null) multiRoleInstanceItemProvider.dispose();
		if (runtimeRoleConnectorInstanceItemProvider != null) runtimeRoleConnectorInstanceItemProvider.dispose();
		if (runtimeAssemblyConnectorInstanceItemProvider != null) runtimeAssemblyConnectorInstanceItemProvider.dispose();
		if (messageOnConnectorItemProvider != null) messageOnConnectorItemProvider.dispose();
		if (runtimeDiscreteSinglePortInstanceItemProvider != null) runtimeDiscreteSinglePortInstanceItemProvider.dispose();
		if (runtimeDiscreteMultiPortInstanceItemProvider != null) runtimeDiscreteMultiPortInstanceItemProvider.dispose();
	}

}
