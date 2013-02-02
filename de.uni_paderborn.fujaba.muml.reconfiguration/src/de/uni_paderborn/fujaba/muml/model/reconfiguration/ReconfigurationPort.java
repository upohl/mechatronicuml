/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import de.uni_paderborn.fujaba.muml.component.DiscretePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reconfiguration port defines the external interface for accessing the reconfiguration capabilities of a reconfigurable structured component. In case of a reconfigurable structured component, they are delegated to one of the controllers of the component. In case of a reconfigurable atomic component, the reconfiguration port is directly implemented.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationPort()
 * @model abstract="true"
 * @generated
 */
public interface ReconfigurationPort extends DiscretePort {
} // ReconfigurationPort
