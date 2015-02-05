/**
 */
package de.uni_paderborn.uppaal.expressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uni_paderborn.uppaal.declarations.DataVariablePrefix;
import de.uni_paderborn.uppaal.expressions.DataPrefixExpression;
import de.uni_paderborn.uppaal.expressions.ExpressionsFactory;
import de.uni_paderborn.uppaal.expressions.ExpressionsPackage;
import de.uni_paderborn.uppaal.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.uppaal.expressions.DataPrefixExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPrefixExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPrefixExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addPrefixPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataPrefixExpression_prefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataPrefixExpression_prefix_feature", "_UI_DataPrefixExpression_type"),
				 ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION);
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
	 * This returns DataPrefixExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataPrefixExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DataVariablePrefix labelValue = ((DataPrefixExpression)object).getPrefix();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DataPrefixExpression_type") :
			getString("_UI_DataPrefixExpression_type") + " " + label;
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

		switch (notification.getFeatureID(DataPrefixExpression.class)) {
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__PREFIX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION:
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
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createChannelPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createDataPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 TypesFactory.eINSTANCE.createScalarTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 TypesFactory.eINSTANCE.createStructTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.DATA_PREFIX_EXPRESSION__DATA_TYPE_EXPRESSION,
				 TypesFactory.eINSTANCE.createRangeTypeSpecification()));
	}

}
