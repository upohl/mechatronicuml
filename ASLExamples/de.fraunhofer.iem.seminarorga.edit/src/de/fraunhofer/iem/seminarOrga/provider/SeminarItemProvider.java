/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminarOrga.provider;


import de.fraunhofer.iem.seminarOrga.Seminar;
import de.fraunhofer.iem.seminarOrga.SeminarOrgaFactory;
import de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.seminarOrga.Seminar} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SeminarItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeminarItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Seminar_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Seminar_name_feature", "_UI_Seminar_type"),
				 SeminarOrgaPackage.Literals.SEMINAR__NAME,
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
			childrenFeatures.add(SeminarOrgaPackage.Literals.SEMINAR__SUPERVISORS);
			childrenFeatures.add(SeminarOrgaPackage.Literals.SEMINAR__STUDENTS);
			childrenFeatures.add(SeminarOrgaPackage.Literals.SEMINAR__TOPICS);
			childrenFeatures.add(SeminarOrgaPackage.Literals.SEMINAR__PREFERENCES);
			childrenFeatures.add(SeminarOrgaPackage.Literals.SEMINAR__RATINGS);
			childrenFeatures.add(SeminarOrgaPackage.Literals.SEMINAR__SUPERVISES);
			childrenFeatures.add(SeminarOrgaPackage.Literals.SEMINAR__ASSIGNMENTS);
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
	 * This returns Seminar.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Seminar"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Seminar)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Seminar_type") :
			getString("_UI_Seminar_type") + " " + label;
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

		switch (notification.getFeatureID(Seminar.class)) {
			case SeminarOrgaPackage.SEMINAR__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SeminarOrgaPackage.SEMINAR__SUPERVISORS:
			case SeminarOrgaPackage.SEMINAR__STUDENTS:
			case SeminarOrgaPackage.SEMINAR__TOPICS:
			case SeminarOrgaPackage.SEMINAR__PREFERENCES:
			case SeminarOrgaPackage.SEMINAR__RATINGS:
			case SeminarOrgaPackage.SEMINAR__SUPERVISES:
			case SeminarOrgaPackage.SEMINAR__ASSIGNMENTS:
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
				(SeminarOrgaPackage.Literals.SEMINAR__SUPERVISORS,
				 SeminarOrgaFactory.eINSTANCE.createSupervisor()));

		newChildDescriptors.add
			(createChildParameter
				(SeminarOrgaPackage.Literals.SEMINAR__STUDENTS,
				 SeminarOrgaFactory.eINSTANCE.createStudent()));

		newChildDescriptors.add
			(createChildParameter
				(SeminarOrgaPackage.Literals.SEMINAR__TOPICS,
				 SeminarOrgaFactory.eINSTANCE.createTopic()));

		newChildDescriptors.add
			(createChildParameter
				(SeminarOrgaPackage.Literals.SEMINAR__PREFERENCES,
				 SeminarOrgaFactory.eINSTANCE.createPreference()));

		newChildDescriptors.add
			(createChildParameter
				(SeminarOrgaPackage.Literals.SEMINAR__RATINGS,
				 SeminarOrgaFactory.eINSTANCE.createRating()));

		newChildDescriptors.add
			(createChildParameter
				(SeminarOrgaPackage.Literals.SEMINAR__SUPERVISES,
				 SeminarOrgaFactory.eINSTANCE.createSupervise()));

		newChildDescriptors.add
			(createChildParameter
				(SeminarOrgaPackage.Literals.SEMINAR__ASSIGNMENTS,
				 SeminarOrgaFactory.eINSTANCE.createAssignment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SeminarOrgaEditPlugin.INSTANCE;
	}

}