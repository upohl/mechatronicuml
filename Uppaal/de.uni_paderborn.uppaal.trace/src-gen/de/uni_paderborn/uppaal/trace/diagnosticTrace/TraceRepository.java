/**
 */
package de.uni_paderborn.uppaal.trace.diagnosticTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.TraceRepository#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getTraceRepository()
 * @model
 * @generated
 */
public interface TraceRepository extends EObject
{
  /**
   * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traces</em>' containment reference list.
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getTraceRepository_Traces()
   * @model containment="true"
   * @generated
   */
  EList<Trace> getTraces();

} // TraceRepository
