/**
 */
package de.uni_paderborn.uppaal.declarations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a set of variable, type, function, or template declarations, that are either global, local to a template, local to a block, or system declarations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.declarations.Declarations#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.declarations.DeclarationsPackage#getDeclarations()
 * @model abstract="true"
 *        extendedMetaData="name='Declarations' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueTypeNames='self.declaration->select(oclIsKindOf(TypeDeclaration)).oclAsType(TypeDeclaration)->collect(type)->isUnique(name)' UniqueTypedElementNames='self.declaration->select(e | e.oclIsKindOf(uppaal::declarations::TypedDeclaration))->collect(oclAsType(uppaal::declarations::TypedDeclaration))->collect(elements)->select(e | e.oclIsKindOf(uppaal::core::NamedElement))->collect(oclAsType(uppaal::core::NamedElement))->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueTypeNames UniqueTypedElementNames'"
 * @generated
 */
public interface Declarations extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.uppaal.declarations.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The single declarations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see de.uni_paderborn.uppaal.declarations.DeclarationsPackage#getDeclarations_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclaration();

} // Declarations
