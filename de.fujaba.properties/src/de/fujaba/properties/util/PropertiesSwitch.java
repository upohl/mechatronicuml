/**
 */
package de.fujaba.properties.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.fujaba.properties.CheckboxPropertyEditor;
import de.fujaba.properties.ComboBoxPropertyEditor;
import de.fujaba.properties.CustomPropertyEditor;
import de.fujaba.properties.CustomTransformation;
import de.fujaba.properties.ListPropertyEditor;
import de.fujaba.properties.OCLPropertyEditor;
import de.fujaba.properties.OCLPropertyFilter;
import de.fujaba.properties.ObjectPropertyEditor;
import de.fujaba.properties.Plugin;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;
import de.fujaba.properties.PropertyCategory;
import de.fujaba.properties.PropertyEditor;
import de.fujaba.properties.PropertyFilter;
import de.fujaba.properties.PropertyGenerator;
import de.fujaba.properties.PropertyTab;
import de.fujaba.properties.RadioPropertyEditor;
import de.fujaba.properties.Reconciler;
import de.fujaba.properties.SpinnerPropertyEditor;
import de.fujaba.properties.TextPropertyEditor;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.fujaba.properties.PropertiesPackage
 * @generated
 */
public class PropertiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesSwitch() {
		if (modelPackage == null) {
			modelPackage = PropertiesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PropertiesPackage.PROPERTY_GENERATOR: {
				PropertyGenerator propertyGenerator = (PropertyGenerator)theEObject;
				T result = casePropertyGenerator(propertyGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.RECONCILER: {
				Reconciler reconciler = (Reconciler)theEObject;
				T result = caseReconciler(reconciler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.CUSTOM_TRANSFORMATION: {
				CustomTransformation customTransformation = (CustomTransformation)theEObject;
				T result = caseCustomTransformation(customTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PLUGIN: {
				Plugin plugin = (Plugin)theEObject;
				T result = casePlugin(plugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PROPERTY_TAB: {
				PropertyTab propertyTab = (PropertyTab)theEObject;
				T result = casePropertyTab(propertyTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PACKAGE: {
				de.fujaba.properties.Package package_ = (de.fujaba.properties.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.CLASS: {
				de.fujaba.properties.Class class_ = (de.fujaba.properties.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PROPERTY_CATEGORY: {
				PropertyCategory propertyCategory = (PropertyCategory)theEObject;
				T result = casePropertyCategory(propertyCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PROPERTY_EDITOR: {
				PropertyEditor propertyEditor = (PropertyEditor)theEObject;
				T result = casePropertyEditor(propertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.TEXT_PROPERTY_EDITOR: {
				TextPropertyEditor textPropertyEditor = (TextPropertyEditor)theEObject;
				T result = caseTextPropertyEditor(textPropertyEditor);
				if (result == null) result = casePropertyEditor(textPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SPINNER_PROPERTY_EDITOR: {
				SpinnerPropertyEditor spinnerPropertyEditor = (SpinnerPropertyEditor)theEObject;
				T result = caseSpinnerPropertyEditor(spinnerPropertyEditor);
				if (result == null) result = casePropertyEditor(spinnerPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.COMBO_BOX_PROPERTY_EDITOR: {
				ComboBoxPropertyEditor comboBoxPropertyEditor = (ComboBoxPropertyEditor)theEObject;
				T result = caseComboBoxPropertyEditor(comboBoxPropertyEditor);
				if (result == null) result = casePropertyEditor(comboBoxPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.CHECKBOX_PROPERTY_EDITOR: {
				CheckboxPropertyEditor checkboxPropertyEditor = (CheckboxPropertyEditor)theEObject;
				T result = caseCheckboxPropertyEditor(checkboxPropertyEditor);
				if (result == null) result = casePropertyEditor(checkboxPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.RADIO_PROPERTY_EDITOR: {
				RadioPropertyEditor radioPropertyEditor = (RadioPropertyEditor)theEObject;
				T result = caseRadioPropertyEditor(radioPropertyEditor);
				if (result == null) result = casePropertyEditor(radioPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.LIST_PROPERTY_EDITOR: {
				ListPropertyEditor listPropertyEditor = (ListPropertyEditor)theEObject;
				T result = caseListPropertyEditor(listPropertyEditor);
				if (result == null) result = casePropertyEditor(listPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.OBJECT_PROPERTY_EDITOR: {
				ObjectPropertyEditor objectPropertyEditor = (ObjectPropertyEditor)theEObject;
				T result = caseObjectPropertyEditor(objectPropertyEditor);
				if (result == null) result = casePropertyEditor(objectPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.OCL_PROPERTY_EDITOR: {
				OCLPropertyEditor oclPropertyEditor = (OCLPropertyEditor)theEObject;
				T result = caseOCLPropertyEditor(oclPropertyEditor);
				if (result == null) result = casePropertyEditor(oclPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.CUSTOM_PROPERTY_EDITOR: {
				CustomPropertyEditor customPropertyEditor = (CustomPropertyEditor)theEObject;
				T result = caseCustomPropertyEditor(customPropertyEditor);
				if (result == null) result = casePropertyEditor(customPropertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PROPERTY_FILTER: {
				PropertyFilter propertyFilter = (PropertyFilter)theEObject;
				T result = casePropertyFilter(propertyFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.OCL_PROPERTY_FILTER: {
				OCLPropertyFilter oclPropertyFilter = (OCLPropertyFilter)theEObject;
				T result = caseOCLPropertyFilter(oclPropertyFilter);
				if (result == null) result = casePropertyFilter(oclPropertyFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyGenerator(PropertyGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconciler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconciler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconciler(Reconciler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTransformation(CustomTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlugin(Plugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyTab(PropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(de.fujaba.properties.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(de.fujaba.properties.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCategory(PropertyCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyEditor(PropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPropertyEditor(TextPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinner Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinner Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinnerPropertyEditor(SpinnerPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo Box Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo Box Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboBoxPropertyEditor(ComboBoxPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckboxPropertyEditor(CheckboxPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioPropertyEditor(RadioPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListPropertyEditor(ListPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyEditor(ObjectPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLPropertyEditor(OCLPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomPropertyEditor(CustomPropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyFilter(PropertyFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Property Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Property Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLPropertyFilter(OCLPropertyFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PropertiesSwitch
