/**
 */
package org.muml.uppaal.adapter.mtctl.BooleanLogic.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.adapter.mtctl.BooleanLogic.BooleanLogicFactory;
import org.muml.uppaal.adapter.mtctl.BooleanLogic.BooleanLogicPackage;
import org.muml.uppaal.adapter.mtctl.BooleanLogic.ImplyExpr;
import org.muml.uppaal.adapter.mtctl.Comparables.ComparablesFactory;
import org.muml.uppaal.adapter.mtctl.Predicates.PredicatesFactory;
import org.muml.uppaal.adapter.mtctl.Quantifiers.QuantifiersFactory;
import org.muml.uppaal.adapter.mtctl.Sets.SetsFactory;
import org.muml.uppaal.adapter.mtctl.provider.ExpressionItemProvider;
import org.muml.uppaal.adapter.mtctl.provider.MtctlEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.adapter.mtctl.BooleanLogic.ImplyExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplyExprItemProvider
	extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplyExprItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD);
			childrenFeatures.add(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD);
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
	 * This returns ImplyExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplyExpr"));
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
		return getString("_UI_ImplyExpr_type");
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

		switch (notification.getFeatureID(ImplyExpr.class)) {
			case BooleanLogicPackage.IMPLY_EXPR__LEFT_OPD:
			case BooleanLogicPackage.IMPLY_EXPR__RIGHT_OPD:
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
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createConnectorOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createStateInStatechartExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 PredicatesFactory.eINSTANCE.createMessageDiscardedExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createInstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 SetsFactory.eINSTANCE.createSubinstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createConnectorOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createStateInStatechartExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 PredicatesFactory.eINSTANCE.createMessageDiscardedExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createInstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 SetsFactory.eINSTANCE.createSubinstanceSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BooleanLogicPackage.Literals.IMPLY_EXPR__LEFT_OPD ||
			childFeature == BooleanLogicPackage.Literals.IMPLY_EXPR__RIGHT_OPD;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MtctlEditPlugin.INSTANCE;
	}

}