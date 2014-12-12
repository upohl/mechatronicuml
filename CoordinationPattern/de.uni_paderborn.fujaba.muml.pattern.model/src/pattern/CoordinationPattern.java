/**
 */
package pattern;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

import de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * \todosd{document!}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}</li>
 *   <li>{@link pattern.CoordinationPattern#getLegalConfigurations <em>Legal Configurations</em>}</li>
 *   <li>{@link pattern.CoordinationPattern#getPatternParameters <em>Pattern Parameters</em>}</li>
 *   <li>{@link pattern.CoordinationPattern#getCombineablePatterns <em>Combineable Patterns</em>}</li>
 *   <li>{@link pattern.CoordinationPattern#getAlternativePatterns <em>Alternative Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.PatternPackage#getCoordinationPattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePatternNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniquePatternNames='CoordinationPattern.allInstances()->isUnique(name)'"
 * @generated
 */
public interface CoordinationPattern extends AbstractCoordinationSpecification {
	/**
	 * Returns the value of the '<em><b>Description Aspects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Aspects</em>' containment reference.
	 * @see #setDescriptionAspects(PlainTextualDescriptionAspects)
	 * @see pattern.PatternPackage#getCoordinationPattern_DescriptionAspects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PlainTextualDescriptionAspects getDescriptionAspects();

	/**
	 * Sets the value of the '{@link pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Aspects</em>' containment reference.
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	void setDescriptionAspects(PlainTextualDescriptionAspects value);

	/**
	 * Returns the value of the '<em><b>Legal Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.LegalConfiguration}.
	 * It is bidirectional and its opposite is '{@link pattern.LegalConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Configurations</em>' containment reference list.
	 * @see pattern.PatternPackage#getCoordinationPattern_LegalConfigurations()
	 * @see pattern.LegalConfiguration#getCoordinationPattern
	 * @model opposite="coordinationPattern" containment="true"
	 * @generated
	 */
	EList<LegalConfiguration> getLegalConfigurations();

	/**
	 * Returns the value of the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Parameters</em>' containment reference list.
	 * @see pattern.PatternPackage#getCoordinationPattern_PatternParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getPatternParameters();

	/**
	 * Returns the value of the '<em><b>Combineable Patterns</b></em>' reference list.
	 * The list contents are of type {@link pattern.CoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combineable Patterns</em>' reference list.
	 * @see pattern.PatternPackage#getCoordinationPattern_CombineablePatterns()
	 * @model
	 * @generated
	 */
	EList<CoordinationPattern> getCombineablePatterns();

	/**
	 * Returns the value of the '<em><b>Alternative Patterns</b></em>' reference list.
	 * The list contents are of type {@link pattern.CoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative Patterns</em>' reference list.
	 * @see pattern.PatternPackage#getCoordinationPattern_AlternativePatterns()
	 * @model
	 * @generated
	 */
	EList<CoordinationPattern> getAlternativePatterns();

} // CoordinationPattern
