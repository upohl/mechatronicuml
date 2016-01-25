/*
 * generated by Xtext
 */
package de.uni_paderborn.uppaal.trace.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_paderborn.uppaal.trace.services.DiagnosticTraceGrammarAccess;

public class DiagnosticTraceParser extends AbstractContentAssistParser {
	
	@Inject
	private DiagnosticTraceGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_paderborn.uppaal.trace.ui.contentassist.antlr.internal.InternalDiagnosticTraceParser createParser() {
		de.uni_paderborn.uppaal.trace.ui.contentassist.antlr.internal.InternalDiagnosticTraceParser result = new de.uni_paderborn.uppaal.trace.ui.contentassist.antlr.internal.InternalDiagnosticTraceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTraceAccess().getAlternatives_1(), "rule__Trace__Alternatives_1");
					put(grammarAccess.getTraceAccess().getAlternatives_6_0(), "rule__Trace__Alternatives_6_0");
					put(grammarAccess.getTraceItemAccess().getAlternatives(), "rule__TraceItem__Alternatives");
					put(grammarAccess.getSynchronizationAccess().getAlternatives(), "rule__Synchronization__Alternatives");
					put(grammarAccess.getTransitionAccess().getAlternatives(), "rule__Transition__Alternatives");
					put(grammarAccess.getResultAccess().getAlternatives(), "rule__Result__Alternatives");
					put(grammarAccess.getCompareOperatorAccess().getAlternatives(), "rule__CompareOperator__Alternatives");
					put(grammarAccess.getSynchronizationKindAccess().getAlternatives(), "rule__SynchronizationKind__Alternatives");
					put(grammarAccess.getTraceRepositoryAccess().getGroup(), "rule__TraceRepository__Group__0");
					put(grammarAccess.getTraceAccess().getGroup(), "rule__Trace__Group__0");
					put(grammarAccess.getTraceAccess().getGroup_6(), "rule__Trace__Group_6__0");
					put(grammarAccess.getProcessIdentifierAccess().getGroup(), "rule__ProcessIdentifier__Group__0");
					put(grammarAccess.getProcessIdentifierAccess().getGroup_1(), "rule__ProcessIdentifier__Group_1__0");
					put(grammarAccess.getProcessIdentifierAccess().getGroup_1_2(), "rule__ProcessIdentifier__Group_1_2__0");
					put(grammarAccess.getLocationActivityAccess().getGroup(), "rule__LocationActivity__Group__0");
					put(grammarAccess.getVariableValueAccess().getGroup(), "rule__VariableValue__Group__0");
					put(grammarAccess.getVariableValueAccess().getGroup_1(), "rule__VariableValue__Group_1__0");
					put(grammarAccess.getSingleNamedElementReferenceAccess().getGroup(), "rule__SingleNamedElementReference__Group__0");
					put(grammarAccess.getSingleNamedElementReferenceAccess().getGroup_1(), "rule__SingleNamedElementReference__Group_1__0");
					put(grammarAccess.getNamedElementReferenceAccess().getGroup(), "rule__NamedElementReference__Group__0");
					put(grammarAccess.getNamedElementReferenceAccess().getGroup_1(), "rule__NamedElementReference__Group_1__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_5(), "rule__State__Group_5__0");
					put(grammarAccess.getStateAccess().getGroup_5_1(), "rule__State__Group_5_1__0");
					put(grammarAccess.getEdgeActivityAccess().getGroup(), "rule__EdgeActivity__Group__0");
					put(grammarAccess.getSynchronizationAccess().getGroup_1(), "rule__Synchronization__Group_1__0");
					put(grammarAccess.getChannelSynchronizationAccess().getGroup(), "rule__ChannelSynchronization__Group__0");
					put(grammarAccess.getDelayTransitionAccess().getGroup(), "rule__DelayTransition__Group__0");
					put(grammarAccess.getActionTransitionAccess().getGroup(), "rule__ActionTransition__Group__0");
					put(grammarAccess.getTraceRepositoryAccess().getTracesAssignment_1(), "rule__TraceRepository__TracesAssignment_1");
					put(grammarAccess.getTraceAccess().getPropertyAssignment_2(), "rule__Trace__PropertyAssignment_2");
					put(grammarAccess.getTraceAccess().getLineAssignment_4(), "rule__Trace__LineAssignment_4");
					put(grammarAccess.getTraceAccess().getResultAssignment_5(), "rule__Trace__ResultAssignment_5");
					put(grammarAccess.getTraceAccess().getTraceItemsAssignment_6_1(), "rule__Trace__TraceItemsAssignment_6_1");
					put(grammarAccess.getProcessIdentifierAccess().getTemplateAssignment_0(), "rule__ProcessIdentifier__TemplateAssignment_0");
					put(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_1(), "rule__ProcessIdentifier__ArgumentsAssignment_1_1");
					put(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_2_1(), "rule__ProcessIdentifier__ArgumentsAssignment_1_2_1");
					put(grammarAccess.getLocationActivityAccess().getProcessAssignment_0(), "rule__LocationActivity__ProcessAssignment_0");
					put(grammarAccess.getLocationActivityAccess().getLocationAssignment_2(), "rule__LocationActivity__LocationAssignment_2");
					put(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceAssignment_0(), "rule__VariableValue__FirstNamedElementReferenceAssignment_0");
					put(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceAssignment_1_1(), "rule__VariableValue__SecondNamedElementReferenceAssignment_1_1");
					put(grammarAccess.getVariableValueAccess().getOperatorAssignment_2(), "rule__VariableValue__OperatorAssignment_2");
					put(grammarAccess.getVariableValueAccess().getValueAssignment_3(), "rule__VariableValue__ValueAssignment_3");
					put(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementAssignment_0(), "rule__SingleNamedElementReference__NamedElementAssignment_0");
					put(grammarAccess.getSingleNamedElementReferenceAccess().getIndexesAssignment_1_1(), "rule__SingleNamedElementReference__IndexesAssignment_1_1");
					put(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceAssignment_0(), "rule__NamedElementReference__SingleNamedElementReferenceAssignment_0");
					put(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceAssignment_1_1(), "rule__NamedElementReference__NamedElementReferenceAssignment_1_1");
					put(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3(), "rule__State__LocationActivitiesAssignment_3");
					put(grammarAccess.getStateAccess().getVariableValuesAssignment_5_0(), "rule__State__VariableValuesAssignment_5_0");
					put(grammarAccess.getStateAccess().getVariableValuesAssignment_5_1_1(), "rule__State__VariableValuesAssignment_5_1_1");
					put(grammarAccess.getEdgeActivityAccess().getSourceAssignment_0(), "rule__EdgeActivity__SourceAssignment_0");
					put(grammarAccess.getEdgeActivityAccess().getTargetAssignment_2(), "rule__EdgeActivity__TargetAssignment_2");
					put(grammarAccess.getEdgeActivityAccess().getDetailsAssignment_3(), "rule__EdgeActivity__DetailsAssignment_3");
					put(grammarAccess.getChannelSynchronizationAccess().getChannelAssignment_0(), "rule__ChannelSynchronization__ChannelAssignment_0");
					put(grammarAccess.getChannelSynchronizationAccess().getKindAssignment_1(), "rule__ChannelSynchronization__KindAssignment_1");
					put(grammarAccess.getDelayTransitionAccess().getDurationAssignment_1(), "rule__DelayTransition__DurationAssignment_1");
					put(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1(), "rule__ActionTransition__EdgeActivitiesAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_paderborn.uppaal.trace.ui.contentassist.antlr.internal.InternalDiagnosticTraceParser typedParser = (de.uni_paderborn.uppaal.trace.ui.contentassist.antlr.internal.InternalDiagnosticTraceParser) parser;
			typedParser.entryRuleTraceRepository();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DiagnosticTraceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DiagnosticTraceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
