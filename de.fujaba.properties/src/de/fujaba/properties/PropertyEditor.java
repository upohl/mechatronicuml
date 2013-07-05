/**
 */
package de.fujaba.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.PropertyEditor#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getPropertyEditor()
 * @model abstract="true"
 * @generated
 */
public interface PropertyEditor extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Property#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' container reference.
	 * @see #setProperty(Property)
	 * @see de.fujaba.properties.PropertiesPackage#getPropertyEditor_Property()
	 * @see de.fujaba.properties.Property#getEditor
	 * @model opposite="editor" required="true" transient="false"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.PropertyEditor#getProperty <em>Property</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' container reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // PropertyEditor
