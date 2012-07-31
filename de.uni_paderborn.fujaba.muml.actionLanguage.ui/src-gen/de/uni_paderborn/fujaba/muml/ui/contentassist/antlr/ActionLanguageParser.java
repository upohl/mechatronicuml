/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.muml.services.ActionLanguageGrammarAccess;

public class ActionLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private ActionLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser createParser() {
		de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser result = new de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBlockAccess().getAlternatives(), "rule__Block__Alternatives");
					put(grammarAccess.getExpressionStartRuleAccess().getAlternatives(), "rule__ExpressionStartRule__Alternatives");
					put(grammarAccess.getAssignmentAccess().getAlternatives_1(), "rule__Assignment__Alternatives_1");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1(), "rule__ForLoopCountingExpression__Alternatives_1");
					put(grammarAccess.getLogicalExpressionAccess().getAlternatives_0(), "rule__LogicalExpression__Alternatives_0");
					put(grammarAccess.getLogicalExpressionAccess().getRightExpressionAlternatives_1_1_0(), "rule__LogicalExpression__RightExpressionAlternatives_1_1_0");
					put(grammarAccess.getAttributeExpressionAccess().getAlternatives(), "rule__AttributeExpression__Alternatives");
					put(grammarAccess.getOperationCallAccess().getAlternatives(), "rule__OperationCall__Alternatives");
					put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
					put(grammarAccess.getIdentifierOrValueAccess().getAlternatives(), "rule__IdentifierOrValue__Alternatives");
					put(grammarAccess.getAssignOperatorAccess().getAlternatives(), "rule__AssignOperator__Alternatives");
					put(grammarAccess.getIncrementDecrementOperatorAccess().getAlternatives(), "rule__IncrementDecrementOperator__Alternatives");
					put(grammarAccess.getLogicOperatorAccess().getAlternatives(), "rule__LogicOperator__Alternatives");
					put(grammarAccess.getArithmeticOperatorAccess().getAlternatives(), "rule__ArithmeticOperator__Alternatives");
					put(grammarAccess.getComparingOperatorAccess().getAlternatives(), "rule__ComparingOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getBlockAccess().getGroup_0(), "rule__Block__Group_0__0");
					put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
					put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
					put(grammarAccess.getDoWhileLoopAccess().getGroup(), "rule__DoWhileLoop__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
					put(grammarAccess.getIfStatementAccess().getGroup_6(), "rule__IfStatement__Group_6__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_0(), "rule__Assignment__Group_1_0__0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getGroup(), "rule__ForLoopCountingExpression__Group__0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1(), "rule__ForLoopCountingExpression__Group_1_1__0");
					put(grammarAccess.getArithmeticExpressionAccess().getGroup(), "rule__ArithmeticExpression__Group__0");
					put(grammarAccess.getArithmeticExpressionAccess().getGroup_1(), "rule__ArithmeticExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1_0(), "rule__ComparisonExpression__Group_1_0__0");
					put(grammarAccess.getLogicalExpressionAccess().getGroup(), "rule__LogicalExpression__Group__0");
					put(grammarAccess.getLogicalExpressionAccess().getGroup_1(), "rule__LogicalExpression__Group_1__0");
					put(grammarAccess.getLogicalExpressionAccess().getGroup_1_0(), "rule__LogicalExpression__Group_1_0__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup(), "rule__UnaryExpression__Group__0");
					put(grammarAccess.getAttributeExpressionAccess().getGroup_1(), "rule__AttributeExpression__Group_1__0");
					put(grammarAccess.getAttributeExpressionAccess().getGroup_1_2(), "rule__AttributeExpression__Group_1_2__0");
					put(grammarAccess.getAttributeLeafExpressionAccess().getGroup(), "rule__AttributeLeafExpression__Group__0");
					put(grammarAccess.getAttributeLeafExpressionAccess().getGroup_2(), "rule__AttributeLeafExpression__Group_2__0");
					put(grammarAccess.getOperationCallAccess().getGroup_1(), "rule__OperationCall__Group_1__0");
					put(grammarAccess.getOperationCallAccess().getGroup_1_1(), "rule__OperationCall__Group_1_1__0");
					put(grammarAccess.getOperationCallAccess().getGroup_1_1_3(), "rule__OperationCall__Group_1_1_3__0");
					put(grammarAccess.getParamaterBindingAccess().getGroup(), "rule__ParamaterBinding__Group__0");
					put(grammarAccess.getLiteralExpressionAccess().getGroup_0(), "rule__LiteralExpression__Group_0__0");
					put(grammarAccess.getLiteralExpressionAccess().getGroup_1(), "rule__LiteralExpression__Group_1__0");
					put(grammarAccess.getBlockAccess().getExpressionsAssignment_0_2(), "rule__Block__ExpressionsAssignment_0_2");
					put(grammarAccess.getBlockAccess().getExpressionsAssignment_1(), "rule__Block__ExpressionsAssignment_1");
					put(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignment_2(), "rule__ForLoop__InitalizeExpressionAssignment_2");
					put(grammarAccess.getForLoopAccess().getLoopTestAssignment_3(), "rule__ForLoop__LoopTestAssignment_3");
					put(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5(), "rule__ForLoop__CountingExpressionAssignment_5");
					put(grammarAccess.getForLoopAccess().getBlockAssignment_7(), "rule__ForLoop__BlockAssignment_7");
					put(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2(), "rule__WhileLoop__LoopTestAssignment_2");
					put(grammarAccess.getWhileLoopAccess().getBlockAssignment_4(), "rule__WhileLoop__BlockAssignment_4");
					put(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1(), "rule__DoWhileLoop__BlockAssignment_1");
					put(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4(), "rule__DoWhileLoop__LoopTestAssignment_4");
					put(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2(), "rule__IfStatement__IfConditionAssignment_2");
					put(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4(), "rule__IfStatement__IfBlockAssignment_4");
					put(grammarAccess.getIfStatementAccess().getElseIfConditionsAssignment_5_2(), "rule__IfStatement__ElseIfConditionsAssignment_5_2");
					put(grammarAccess.getIfStatementAccess().getElseIfBlocksAssignment_5_4(), "rule__IfStatement__ElseIfBlocksAssignment_5_4");
					put(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1(), "rule__IfStatement__ElseBlockAssignment_6_1");
					put(grammarAccess.getReturnStatementAccess().getExpressionAssignment_2(), "rule__ReturnStatement__ExpressionAssignment_2");
					put(grammarAccess.getAssignmentAccess().getLhs_attributeExpressionAssignment_0(), "rule__Assignment__Lhs_attributeExpressionAssignment_0");
					put(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0(), "rule__Assignment__AssignOperatorAssignment_1_0_0");
					put(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1(), "rule__Assignment__Rhs_assignExpressionAssignment_1_0_1");
					put(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1(), "rule__Assignment__IncrementDecrementOperatorAssignment_1_1");
					put(grammarAccess.getForLoopCountingExpressionAccess().getLhs_attributeExpressionAssignment_0(), "rule__ForLoopCountingExpression__Lhs_attributeExpressionAssignment_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0(), "rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0(), "rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1(), "rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1");
					put(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_1(), "rule__ArithmeticExpression__OperatorAssignment_1_1");
					put(grammarAccess.getArithmeticExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ArithmeticExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_0_1(), "rule__ComparisonExpression__OperatorAssignment_1_0_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_1(), "rule__ComparisonExpression__RightExpressionAssignment_1_1");
					put(grammarAccess.getLogicalExpressionAccess().getOperatorAssignment_1_0_1(), "rule__LogicalExpression__OperatorAssignment_1_0_1");
					put(grammarAccess.getLogicalExpressionAccess().getRightExpressionAssignment_1_1(), "rule__LogicalExpression__RightExpressionAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1(), "rule__UnaryExpression__OperatorAssignment_1");
					put(grammarAccess.getUnaryExpressionAccess().getEnclosedExpressionAssignment_2(), "rule__UnaryExpression__EnclosedExpressionAssignment_2");
					put(grammarAccess.getAttributeExpressionAccess().getAttributeAssignment_1_1(), "rule__AttributeExpression__AttributeAssignment_1_1");
					put(grammarAccess.getAttributeExpressionAccess().getIndicesAssignment_1_2_1(), "rule__AttributeExpression__IndicesAssignment_1_2_1");
					put(grammarAccess.getAttributeLeafExpressionAccess().getAttributeAssignment_1(), "rule__AttributeLeafExpression__AttributeAssignment_1");
					put(grammarAccess.getAttributeLeafExpressionAccess().getIndicesAssignment_2_1(), "rule__AttributeLeafExpression__IndicesAssignment_2_1");
					put(grammarAccess.getOperationCallAccess().getOperationAssignment_1_1_0(), "rule__OperationCall__OperationAssignment_1_1_0");
					put(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_1_1_2(), "rule__OperationCall__ParameterBindingAssignment_1_1_2");
					put(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_1_1_3_1(), "rule__OperationCall__ParameterBindingAssignment_1_1_3_1");
					put(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1(), "rule__ParamaterBinding__ParameterAssignment_1");
					put(grammarAccess.getParamaterBindingAccess().getValueAssignment_3(), "rule__ParamaterBinding__ValueAssignment_3");
					put(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1(), "rule__LiteralExpression__ValueAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser typedParser = (de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser) parser;
			typedParser.entryRuleBlock();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ActionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
