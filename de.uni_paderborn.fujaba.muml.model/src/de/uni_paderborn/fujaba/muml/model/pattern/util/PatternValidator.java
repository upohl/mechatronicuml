/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.util;

import de.uni_paderborn.fujaba.muml.model.pattern.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.DiscreteInteractionPoint;
import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage
 * @generated
 */
public class PatternValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PatternValidator INSTANCE = new PatternValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.pattern";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PatternPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PatternPackage.ROLE_CONNECTOR:
				return validateRoleConnector((RoleConnector)value, diagnostics, context);
			case PatternPackage.COORDINATION_PATTERN:
				return validateCoordinationPattern((CoordinationPattern)value, diagnostics, context);
			case PatternPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case PatternPackage.MESSAGE_BUFFER:
				return validateMessageBuffer((MessageBuffer)value, diagnostics, context);
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return validateConnectorQualityOfServiceAssumptions((ConnectorQualityOfServiceAssumptions)value, diagnostics, context);
			case PatternPackage.DISCRETE_INTERACTION_POINT:
				return validateDiscreteInteractionPoint((DiscreteInteractionPoint)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleConnector(RoleConnector roleConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleConnector_OnlyRolesOfSameCoordinationPattern(roleConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyRolesOfSameCoordinationPattern constraint of '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE_CONNECTOR__ONLY_ROLES_OF_SAME_COORDINATION_PATTERN__EEXPRESSION = "(not source.oclIsUndefined() and not target.oclIsUndefined()) implies source.coordinationPattern = target.coordinationPattern";

	/**
	 * Validates the OnlyRolesOfSameCoordinationPattern constraint of '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleConnector_OnlyRolesOfSameCoordinationPattern(RoleConnector roleConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE_CONNECTOR,
				 roleConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyRolesOfSameCoordinationPattern",
				 ROLE_CONNECTOR__ONLY_ROLES_OF_SAME_COORDINATION_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationPattern(CoordinationPattern coordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordinationPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationPattern_UniqueRoleNames(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationPattern_CoordinationPatternNamesMustBeUnique(coordinationPattern, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueRoleNames constraint of '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION_PATTERN__UNIQUE_ROLE_NAMES__EEXPRESSION = "self.roles->isUnique(name)";

	/**
	 * Validates the UniqueRoleNames constraint of '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationPattern_UniqueRoleNames(CoordinationPattern coordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.COORDINATION_PATTERN,
				 coordinationPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueRoleNames",
				 COORDINATION_PATTERN__UNIQUE_ROLE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CoordinationPatternNamesMustBeUnique constraint of '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION_PATTERN__COORDINATION_PATTERN_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "CoordinationPattern.allInstances().name->count(self.name) = 1";

	/**
	 * Validates the CoordinationPatternNamesMustBeUnique constraint of '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationPattern_CoordinationPatternNamesMustBeUnique(CoordinationPattern coordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.COORDINATION_PATTERN,
				 coordinationPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CoordinationPatternNamesMustBeUnique",
				 COORDINATION_PATTERN__COORDINATION_PATTERN_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(role, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_MultiPortRequiresDefinedOrder(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleHasConnector(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleRequiresBehavior(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleRequiresInterface(role, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MultiPortRequiresDefinedOrder constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__MULTI_PORT_REQUIRES_DEFINED_ORDER__EEXPRESSION = "self.ordered implies (self.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity)";

	/**
	 * Validates the MultiPortRequiresDefinedOrder constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_MultiPortRequiresDefinedOrder(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MultiPortRequiresDefinedOrder",
				 ROLE__MULTI_PORT_REQUIRES_DEFINED_ORDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleHasConnector constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ROLE_HAS_CONNECTOR__EEXPRESSION = "self.incomingRoleConnector->notEmpty() or self.outgoingRoleConnector->notEmpty()";

	/**
	 * Validates the RoleHasConnector constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_RoleHasConnector(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RoleHasConnector",
				 ROLE__ROLE_HAS_CONNECTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleRequiresBehavior constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ROLE_REQUIRES_BEHAVIOR__EEXPRESSION = "not self.behavior.oclIsUndefined()";

	/**
	 * Validates the RoleRequiresBehavior constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_RoleRequiresBehavior(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RoleRequiresBehavior",
				 ROLE__ROLE_REQUIRES_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleRequiresInterface constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ROLE_REQUIRES_INTERFACE__EEXPRESSION = "not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined())";

	/**
	 * Validates the RoleRequiresInterface constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_RoleRequiresInterface(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RoleRequiresInterface",
				 ROLE__ROLE_REQUIRES_INTERFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageBuffer(MessageBuffer messageBuffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageBuffer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions connectorQualityOfServiceAssumptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorQualityOfServiceAssumptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInteractionPoint(DiscreteInteractionPoint discreteInteractionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteInteractionPoint, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PatternValidator
