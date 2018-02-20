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
package org.muml.pim.pattern.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.PatternFactory;
import org.muml.pim.pattern.PatternPackage;

/**
 * This is the item provider adapter for a {@link org.muml.pim.pattern.CoordinationPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationPatternItemProvider extends AbstractCoordinationPatternItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPatternItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCombineablePatternsPropertyDescriptor(object);
			addAlternativePatternsPropertyDescriptor(object);
			addDescriptionAspectsPropertyDescriptor(object);
			addPatternVariantsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description Aspects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionAspectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_descriptionAspects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_descriptionAspects_feature", "_UI_CoordinationPattern_type"),
				 PatternPackage.Literals.COORDINATION_PATTERN__DESCRIPTION_ASPECTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Variants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternVariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_patternVariants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_patternVariants_feature", "_UI_CoordinationPattern_type"),
				 PatternPackage.Literals.COORDINATION_PATTERN__PATTERN_VARIANTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combineable Patterns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombineablePatternsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_combineablePatterns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_combineablePatterns_feature", "_UI_CoordinationPattern_type"),
				 PatternPackage.Literals.COORDINATION_PATTERN__COMBINEABLE_PATTERNS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alternative Patterns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativePatternsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_alternativePatterns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_alternativePatterns_feature", "_UI_CoordinationPattern_type"),
				 PatternPackage.Literals.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PatternPackage.Literals.COORDINATION_PATTERN__DESCRIPTION_ASPECTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CoordinationPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinationPattern"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CoordinationPattern)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CoordinationPattern_type") :
			getString("_UI_CoordinationPattern_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CoordinationPattern.class)) {
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PatternPackage.Literals.COORDINATION_PATTERN__DESCRIPTION_ASPECTS,
				 PatternFactory.eINSTANCE.createDescriptionAspects()));
	}

	/**
	 * This enables OCL property filtering.
	 * @generated OCL
	 */
	protected org.eclipse.emf.edit.provider.ItemPropertyDescriptor createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.common.util.ResourceLocator resourceLocator,String displayName,String description,org.eclipse.emf.ecore.EStructuralFeature feature,boolean isSettable,Object staticImage,String category,String[] filterFlags) {
	    return new ocl.OCLItemPropertyDescriptor(adapterFactory,resourceLocator,displayName,description,feature,isSettable,false,false,staticImage,category,filterFlags);
	}
	
	/**
	 * This enables OCL property filtering.
	 * @generated OCL
	 */
	protected org.eclipse.emf.edit.provider.ItemPropertyDescriptor createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.common.util.ResourceLocator resourceLocator, String displayName, String description, org.eclipse.emf.ecore.EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage,String category, String[] filterFlags) {
		return new ocl.OCLItemPropertyDescriptor(adapterFactory, resourceLocator, displayName,description,feature,isSettable,multiLine,sortChoices, staticImage, category,filterFlags);
	}
}
