/**
 * generated by Xtext 2.10.0
 */
package de.fraunhofer.iem.projectPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.Assignment#getProject <em>Project</em>}</li>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.Assignment#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' reference.
   * @see #setProject(Project)
   * @see de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage#getAssignment_Project()
   * @model
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link de.fraunhofer.iem.projectPlanning.Assignment#getProject <em>Project</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

  /**
   * Returns the value of the '<em><b>Employee</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employee</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employee</em>' reference.
   * @see #setEmployee(Employee)
   * @see de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage#getAssignment_Employee()
   * @model
   * @generated
   */
  Employee getEmployee();

  /**
   * Sets the value of the '{@link de.fraunhofer.iem.projectPlanning.Assignment#getEmployee <em>Employee</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Employee</em>' reference.
   * @see #getEmployee()
   * @generated
   */
  void setEmployee(Employee value);

} // Assignment
