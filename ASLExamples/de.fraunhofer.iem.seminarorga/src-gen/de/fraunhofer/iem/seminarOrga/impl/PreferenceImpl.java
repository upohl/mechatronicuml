/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminarOrga.impl;

import de.fraunhofer.iem.seminarOrga.Preference;
import de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage;
import de.fraunhofer.iem.seminarOrga.Student;
import de.fraunhofer.iem.seminarOrga.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.seminarOrga.impl.PreferenceImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminarOrga.impl.PreferenceImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreferenceImpl extends MinimalEObjectImpl.Container implements Preference
{
  /**
   * The cached value of the '{@link #getStudent() <em>Student</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudent()
   * @generated
   * @ordered
   */
  protected Student student;

  /**
   * The cached value of the '{@link #getTopics() <em>Topics</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopics()
   * @generated
   * @ordered
   */
  protected EList<Topic> topics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SeminarOrgaPackage.Literals.PREFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Student getStudent()
  {
    if (student != null && student.eIsProxy())
    {
      InternalEObject oldStudent = (InternalEObject)student;
      student = (Student)eResolveProxy(oldStudent);
      if (student != oldStudent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeminarOrgaPackage.PREFERENCE__STUDENT, oldStudent, student));
      }
    }
    return student;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Student basicGetStudent()
  {
    return student;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStudent(Student newStudent)
  {
    Student oldStudent = student;
    student = newStudent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeminarOrgaPackage.PREFERENCE__STUDENT, oldStudent, student));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getTopics()
  {
    if (topics == null)
    {
      topics = new EObjectResolvingEList<Topic>(Topic.class, this, SeminarOrgaPackage.PREFERENCE__TOPICS);
    }
    return topics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SeminarOrgaPackage.PREFERENCE__STUDENT:
        if (resolve) return getStudent();
        return basicGetStudent();
      case SeminarOrgaPackage.PREFERENCE__TOPICS:
        return getTopics();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SeminarOrgaPackage.PREFERENCE__STUDENT:
        setStudent((Student)newValue);
        return;
      case SeminarOrgaPackage.PREFERENCE__TOPICS:
        getTopics().clear();
        getTopics().addAll((Collection<? extends Topic>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SeminarOrgaPackage.PREFERENCE__STUDENT:
        setStudent((Student)null);
        return;
      case SeminarOrgaPackage.PREFERENCE__TOPICS:
        getTopics().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SeminarOrgaPackage.PREFERENCE__STUDENT:
        return student != null;
      case SeminarOrgaPackage.PREFERENCE__TOPICS:
        return topics != null && !topics.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PreferenceImpl