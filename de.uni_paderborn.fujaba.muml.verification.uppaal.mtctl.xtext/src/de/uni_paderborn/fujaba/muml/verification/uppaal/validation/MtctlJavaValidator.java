/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.verification.uppaal.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DynamicPredicateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr;

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class MtctlJavaValidator extends de.uni_paderborn.fujaba.muml.verification.uppaal.validation.AbstractMtctlJavaValidator {

	@Check
	public void checkTemporallyQuantified(final DynamicPredicateExpr expr) { //Check whether every predicate is bound to a TemporalQuantifier
		EObject parent = expr;
		while (parent != null) {
			if (parent instanceof TemporalQuantifierExpr)
				return;
			parent = parent.eContainer();
		}
		
		error(expr.eClass().getName()+" must be bound to a Temporal Quantifier such as \"AG\"", null);
	}
	
	@Check 
	public void checkTemporallyQuantified(final TemporalQuantifierExpr expr) { //Disallow using nested TemporalQuantifiers
		EObject parent = expr.eContainer();
		while (parent != null) {
			if (parent instanceof TemporalQuantifierExpr) {
				error("TemporalQuantifiers must not be nested", null);
				return;
			}
			parent = parent.eContainer();
		}
	}
	
	@Check
	public void checkHiddenBoundVariable(final QuantifierExpr expr) { //give a warning when quantifier variables are shadowing one another
		EObject parent = expr.eContainer();
		while (parent != null) {
			if (parent instanceof QuantifierExpr && expr.getVar().getName().equals(((QuantifierExpr) parent).getVar().getName()))
				warning("The variable "+expr.getVar().getName()+" is shadowed", null);
			parent = parent.eContainer();
		}
	}
	
	//TODO check types in comparisons
}
