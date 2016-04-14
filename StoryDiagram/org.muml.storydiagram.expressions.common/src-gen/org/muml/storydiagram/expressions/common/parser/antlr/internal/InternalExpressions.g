/*
* generated by Xtext
*/
grammar InternalExpressions;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@lexer::header {
package org.muml.storydiagram.expressions.common.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.muml.storydiagram.expressions.common.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.muml.storydiagram.expressions.common.services.ExpressionsGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private ExpressionsGrammarAccess grammarAccess;
 	
    public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "LExpression";	
   	}
   	
   	@Override
   	protected ExpressionsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleLExpression
entryRuleLExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLExpressionRule()); }
	 iv_ruleLExpression=ruleLExpression 
	 { $current=$iv_ruleLExpression.current; } 
	 EOF 
;

// Rule LExpression
ruleLExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
    }
    this_Equivalent_0=ruleEquivalent
    { 
        $current = $this_Equivalent_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleEquivalent
entryRuleEquivalent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEquivalentRule()); }
	 iv_ruleEquivalent=ruleEquivalent 
	 { $current=$iv_ruleEquivalent.current; } 
	 EOF 
;

// Rule Equivalent
ruleEquivalent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
    }
    this_Implication_0=ruleImplication
    { 
        $current = $this_Implication_0.current; 
        afterParserOrEnumRuleCall();
    }
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0(),
            $current);
    }
)	otherlv_2='equiv' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEquivalentAccess().getEquivKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleEquivalent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEquivalentRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Equivalent");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleImplication
entryRuleImplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImplicationRule()); }
	 iv_ruleImplication=ruleImplication 
	 { $current=$iv_ruleImplication.current; } 
	 EOF 
;

// Rule Implication
ruleImplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
    }
    this_Disjunction_0=ruleDisjunction
    { 
        $current = $this_Disjunction_0.current; 
        afterParserOrEnumRuleCall();
    }
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getImplicationAccess().getImplyLeftAction_1_0(),
            $current);
    }
)	otherlv_2='imply' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImplicationAccess().getImplyKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleImplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Implication");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleDisjunction
entryRuleDisjunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDisjunctionRule()); }
	 iv_ruleDisjunction=ruleDisjunction 
	 { $current=$iv_ruleDisjunction.current; } 
	 EOF 
;

// Rule Disjunction
ruleDisjunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
    }
    this_Conjunction_0=ruleConjunction
    { 
        $current = $this_Conjunction_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='or' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='xor' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
	    }
		lv_right_5_0=ruleDisjunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDisjunctionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"Disjunction");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleConjunction
entryRuleConjunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConjunctionRule()); }
	 iv_ruleConjunction=ruleConjunction 
	 { $current=$iv_ruleConjunction.current; } 
	 EOF 
;

// Rule Conjunction
ruleConjunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
    }
    this_Negation_0=ruleNegation
    { 
        $current = $this_Negation_0.current; 
        afterParserOrEnumRuleCall();
    }
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getConjunctionAccess().getAndLeftAction_1_0(),
            $current);
    }
)	otherlv_2='and' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConjunctionAccess().getAndKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleConjunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConjunctionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Conjunction");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleNegation
entryRuleNegation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNegationRule()); }
	 iv_ruleNegation=ruleNegation 
	 { $current=$iv_ruleNegation.current; } 
	 EOF 
;

// Rule Negation
ruleNegation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='not' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNotKeyword_0_0());
    }

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
    }
    this_Negated_1=ruleNegated
    { 
        $current = $this_Negated_1.current; 
        afterParserOrEnumRuleCall();
    }
)
    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
    }
    this_CExpression_2=ruleCExpression
    { 
        $current = $this_CExpression_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleNegated
entryRuleNegated returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNegatedRule()); }
	 iv_ruleNegated=ruleNegated 
	 { $current=$iv_ruleNegated.current; } 
	 EOF 
;

// Rule Negated
ruleNegated returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getNegatedAccess().getNotAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
	    }
		lv_not_1_0=ruleCExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNegatedRule());
	        }
       		set(
       			$current, 
       			"not",
        		lv_not_1_0, 
        		"CExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCExpression
entryRuleCExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCExpressionRule()); }
	 iv_ruleCExpression=ruleCExpression 
	 { $current=$iv_ruleCExpression.current; } 
	 EOF 
;

// Rule CExpression
ruleCExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0());
    }

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
    }
    this_LExpression_1=ruleLExpression
    { 
        $current = $this_LExpression_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2());
    }
)
    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
    }
    this_Compare_3=ruleCompare
    { 
        $current = $this_Compare_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
    }
    this_BooleanValue_4=ruleBooleanValue
    { 
        $current = $this_BooleanValue_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
    }
    this_Variable_5=ruleVariable
    { 
        $current = $this_Variable_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCompare
entryRuleCompare returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCompareRule()); }
	 iv_ruleCompare=ruleCompare 
	 { $current=$iv_ruleCompare.current; } 
	 EOF 
;

// Rule Compare
ruleCompare returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
    }
    this_SomeValue_0=ruleSomeValue
    { 
        $current = $this_SomeValue_0.current; 
        afterParserOrEnumRuleCall();
    }
(((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0(),
            $current);
    }
)	otherlv_2='<=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCompareAccess().getLessLeftAction_1_1_0(),
            $current);
    }
)	otherlv_4='<' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0(),
            $current);
    }
)	otherlv_6='>=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0(),
            $current);
    }
)	otherlv_8='>' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0(),
            $current);
    }
)	otherlv_10='=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0(),
            $current);
    }
)	otherlv_12='!=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0(),
            $current);
    }
)	otherlv_14='~' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getCompareAccess().getTildeKeyword_1_6_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
	    }
		lv_right_15_0=ruleSomeValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompareRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_15_0, 
        		"SomeValue");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSomeValue
entryRuleSomeValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSomeValueRule()); }
	 iv_ruleSomeValue=ruleSomeValue 
	 { $current=$iv_ruleSomeValue.current; } 
	 EOF 
;

// Rule SomeValue
ruleSomeValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
    }
    this_StringValue_0=ruleStringValue
    { 
        $current = $this_StringValue_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
    }
    this_BooleanValue_1=ruleBooleanValue
    { 
        $current = $this_BooleanValue_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
    }
    this_AExpression_2=ruleAExpression
    { 
        $current = $this_AExpression_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAExpression
entryRuleAExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAExpressionRule()); }
	 iv_ruleAExpression=ruleAExpression 
	 { $current=$iv_ruleAExpression.current; } 
	 EOF 
;

// Rule AExpression
ruleAExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
    }
    this_Addition_0=ruleAddition
    { 
        $current = $this_Addition_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	 iv_ruleAddition=ruleAddition 
	 { $current=$iv_ruleAddition.current; } 
	 EOF 
;

// Rule Addition
ruleAddition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
    }
    this_Multiplication_0=ruleMultiplication
    { 
        $current = $this_Multiplication_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='-' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
	    }
		lv_right_5_0=ruleMultiplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdditionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"Multiplication");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	 iv_ruleMultiplication=ruleMultiplication 
	 { $current=$iv_ruleMultiplication.current; } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
    }
    this_Power_0=rulePower
    { 
        $current = $this_Power_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='*' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='/' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0(),
            $current);
    }
)	otherlv_6='%' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
	    }
		lv_right_7_0=rulePower		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_7_0, 
        		"Power");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePower
entryRulePower returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPowerRule()); }
	 iv_rulePower=rulePower 
	 { $current=$iv_rulePower.current; } 
	 EOF 
;

// Rule Power
rulePower returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
    }
    this_PrimaryExpression_0=rulePrimaryExpression
    { 
        $current = $this_PrimaryExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
(((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(),
            $current);
    }
)	otherlv_2='^' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
	    }
		lv_right_3_0=rulePrimaryExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPowerRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"PrimaryExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	 iv_rulePrimaryExpression=rulePrimaryExpression 
	 { $current=$iv_rulePrimaryExpression.current; } 
	 EOF 
;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
    }

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
    }
    this_AExpression_1=ruleAExpression
    { 
        $current = $this_AExpression_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
    }
)
    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
    }
    this_NumberValue_3=ruleNumberValue
    { 
        $current = $this_NumberValue_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
    }
    this_Variable_4=ruleVariable
    { 
        $current = $this_Variable_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleNumberValue
entryRuleNumberValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberValueRule()); }
	 iv_ruleNumberValue=ruleNumberValue 
	 { $current=$iv_ruleNumberValue.current; } 
	 EOF 
;

// Rule NumberValue
ruleNumberValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
	    }
		lv_numValue_0_0=ruleNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumberValueRule());
	        }
       		set(
       			$current, 
       			"numValue",
        		lv_numValue_0_0, 
        		"NUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleNUMBER
entryRuleNUMBER returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNUMBERRule()); } 
	 iv_ruleNUMBER=ruleNUMBER 
	 { $current=$iv_ruleNUMBER.current.getText(); }  
	 EOF 
;

// Rule NUMBER
ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
    }
    this_INT_2=RULE_INT    {
		$current.merge(this_INT_2);
    }

    { 
    newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
    }
)?)
    ;





// Entry rule entryRuleBooleanValue
entryRuleBooleanValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanValueRule()); }
	 iv_ruleBooleanValue=ruleBooleanValue 
	 { $current=$iv_ruleBooleanValue.current; } 
	 EOF 
;

// Rule BooleanValue
ruleBooleanValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_BOOLEAN
		{
			newLeafNode(lv_value_0_0, grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"BOOLEAN");
	    }

)
)
;





// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	 iv_ruleStringValue=ruleStringValue 
	 { $current=$iv_ruleStringValue.current; } 
	 EOF 
;

// Rule StringValue
ruleStringValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_strValue_0_0=RULE_STRING
		{
			newLeafNode(lv_strValue_0_0, grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"strValue",
        		lv_strValue_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
	    }
		lv_varName_0_0=ruleVARIABLE_VALUE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableRule());
	        }
       		set(
       			$current, 
       			"varName",
        		lv_varName_0_0, 
        		"VARIABLE_VALUE");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleVARIABLE_VALUE
entryRuleVARIABLE_VALUE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVARIABLE_VALUERule()); } 
	 iv_ruleVARIABLE_VALUE=ruleVARIABLE_VALUE 
	 { $current=$iv_ruleVARIABLE_VALUE.current.getText(); }  
	 EOF 
;

// Rule VARIABLE_VALUE
ruleVARIABLE_VALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
    }

    |(    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
    }
    this_ID_3=RULE_ID    {
		$current.merge(this_ID_3);
    }

    { 
    newLeafNode(this_ID_3, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
    }
))
    ;





RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

