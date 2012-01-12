/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class ActionLanguageScopeProvider extends AbstractDeclarativeScopeProvider {
	private List<EAttribute> attributeList = null;
	
	public ActionLanguageScopeProvider() {
		super();
	}
	
	//IScope scope_Assignment_attribute(Assignment assignment, EReference ref) {
	//IScope scope_EAttribute(Assignment assignment, EReference ref) {
	IScope scope_EAttribute(Object object, EReference ref) {
		// this is called whenever an EAttribute is needed
		// (regardless if it's an assignment or BinaryLogicExpression etc.)
		System.out.println(this);
		if (attributeList == null) {
			return IScope.NULLSCOPE;
		}
		return Scopes.scopeFor(attributeList);
	}
	
	public void setAttributeList(List<EAttribute> attributeList) {
		this.attributeList = attributeList;
	}

}
