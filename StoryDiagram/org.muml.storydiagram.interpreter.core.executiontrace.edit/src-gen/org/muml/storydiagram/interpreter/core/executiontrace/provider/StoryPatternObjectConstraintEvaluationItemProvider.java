/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryPatternObjectConstraintEvaluationItemProvider extends StoryPatternObjectExecutionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternObjectConstraintEvaluationItemProvider(AdapterFactory adapterFactory) {
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

			addConstraintPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StoryPatternObjectConstraintEvaluation_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StoryPatternObjectConstraintEvaluation_constraint_feature", "_UI_StoryPatternObjectConstraintEvaluation_type"),
				 ExecutiontracePackage.Literals.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		StoryPatternObjectConstraintEvaluation<?, ?> storyPatternObjectConstraintEvaluation = (StoryPatternObjectConstraintEvaluation<?, ?>)object;
		return getString("_UI_StoryPatternObjectConstraintEvaluation_type") + " " + storyPatternObjectConstraintEvaluation.getExecutionStartedTimeStamp();
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

		switch (notification.getFeatureID(StoryPatternObjectConstraintEvaluation.class)) {
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
