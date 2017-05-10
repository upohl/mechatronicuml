/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminarOrga;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.seminarOrga.Supervisor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage#getSupervisor()
 * @model
 * @generated
 */
public interface Supervisor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage#getSupervisor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.fraunhofer.iem.seminarOrga.Supervisor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Supervisor