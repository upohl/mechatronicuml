/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFactory;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StFactory;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockDeclarationItemProvider extends AbstractFunctionBlockDeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDeclarationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS);
			childrenFeatures.add(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__BODY);
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
	 * This returns FunctionBlockDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionBlockDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionBlockDeclaration)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionBlockDeclaration_type") :
			getString("_UI_FunctionBlockDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionBlockDeclaration.class)) {
			case PousPackage.FUNCTION_BLOCK_DECLARATION__DECLARATIONS:
			case PousPackage.FUNCTION_BLOCK_DECLARATION__BODY:
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
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createInputVarContainer()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createOutputVarContainer()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createInputOutputVarContainer()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createVarDeclarationContainer()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createExternalVarContainer()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createTempVarDeclarationContainer()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createIncomplLocatedVarContainer()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__BODY,
				 StFactory.eINSTANCE.createStatementList()));

		newChildDescriptors.add
			(createChildParameter
				(PousPackage.Literals.FUNCTION_BLOCK_DECLARATION__BODY,
				 IlFactory.eINSTANCE.createInstructionList()));
	}

}
