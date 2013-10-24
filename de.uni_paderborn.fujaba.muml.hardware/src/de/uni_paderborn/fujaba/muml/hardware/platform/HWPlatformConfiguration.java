/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware platform configuration at type level.
 *  A hardware platform configuration consists of several HWPlatforms and ResourceInstanceRepositories that contain all ResourceInstances to build a HWPlatform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration#getHwplatforms <em>Hwplatforms</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration#getRepositories <em>Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatformConfiguration()
 * @model
 * @generated
 */
public interface HWPlatformConfiguration extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Hwplatforms</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatforms that are contained in this HWPlatformConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatforms</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatformConfiguration_Hwplatforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPlatform> getHwplatforms();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstanceRepositories that belong to this HWPlatformConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatformConfiguration_Repositories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceInstanceRepository> getRepositories();

} // HWPlatformConfiguration
