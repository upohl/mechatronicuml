/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.connector;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.connector.Connector#getConnectorEndpoints <em>Connector Endpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getConnector()
 * @model abstract="true"
 * @generated
 */
public interface Connector extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Connector Endpoints</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Endpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Endpoints</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getConnector_ConnectorEndpoints()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<ConnectorEndpoint> getConnectorEndpoints();

} // Connector
