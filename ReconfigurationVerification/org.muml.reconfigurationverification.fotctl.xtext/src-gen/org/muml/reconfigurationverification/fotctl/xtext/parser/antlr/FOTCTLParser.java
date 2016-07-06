/*
 * generated by Xtext
 */
package org.muml.reconfigurationverification.fotctl.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.muml.reconfigurationverification.fotctl.xtext.services.FOTCTLGrammarAccess;

public class FOTCTLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FOTCTLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.muml.reconfigurationverification.fotctl.xtext.parser.antlr.internal.InternalFOTCTLParser createParser(XtextTokenStream stream) {
		return new org.muml.reconfigurationverification.fotctl.xtext.parser.antlr.internal.InternalFOTCTLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "FoTCTLSpec";
	}
	
	public FOTCTLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FOTCTLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}