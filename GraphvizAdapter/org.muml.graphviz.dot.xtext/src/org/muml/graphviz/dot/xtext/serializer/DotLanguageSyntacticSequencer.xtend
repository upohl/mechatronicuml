/*
 * generated by Xtext
 */
package org.muml.graphviz.dot.xtext.serializer

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable

class DotLanguageSyntacticSequencer extends AbstractDotLanguageSyntacticSequencer {
	
	protected override void emit_DotSubGraph_SemicolonKeyword_4_0_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		if (nodes != null) {
			super.emit_DotSubGraph_SemicolonKeyword_4_0_5_q(semanticObject, transition, nodes)
			return
		}
		// emit semicolon
		acceptUnassignedKeyword(grammarAccess.getDotSubGraphAccess()
			.getSemicolonKeyword_4_0_5(), ";", null
		)
	}
	
	protected override void emit_DotSubGraph_SemicolonKeyword_4_1_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		if (nodes != null) {
			super.emit_DotSubGraph_SemicolonKeyword_4_1_5_q(semanticObject, transition, nodes)
			return
		}
		// emit semicolon
		acceptUnassignedKeyword(grammarAccess.getDotSubGraphAccess()
			.getSemicolonKeyword_4_1_5(), ";", null
		)
	}
	
	protected override void emit_DotSubGraph_SemicolonKeyword_4_2_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		if (nodes != null) {
			super.emit_DotSubGraph_SemicolonKeyword_4_2_5_q(semanticObject, transition, nodes)
			return
		}
		// emit semicolon
		acceptUnassignedKeyword(grammarAccess.getDotSubGraphAccess()
			.getSemicolonKeyword_4_2_5(), ";", null
		)
	}
	
	protected override void emit_DotGraph_SemicolonKeyword_4_0_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		if (nodes != null) {
			super.emit_DotGraph_SemicolonKeyword_4_0_5_q(semanticObject, transition, nodes)
			return
		}
		// emit semicolon
		acceptUnassignedKeyword(grammarAccess.getDotGraphAccess()
			.getSemicolonKeyword_4_0_5(), ";", null
		)
	}
	
	protected override void emit_DotGraph_SemicolonKeyword_4_1_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		if (nodes != null) {
			super.emit_DotGraph_SemicolonKeyword_4_1_5_q(semanticObject, transition, nodes)
			return
		}
		// emit semicolon
		acceptUnassignedKeyword(grammarAccess.getDotGraphAccess()
			.getSemicolonKeyword_4_1_5(), ";", null
		)
	}
	
	protected override void emit_DotGraph_SemicolonKeyword_4_2_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		if (nodes != null) {
			super.emit_DotGraph_SemicolonKeyword_4_2_5_q(semanticObject, transition, nodes)
			return
		}
		// emit semicolon
		acceptUnassignedKeyword(grammarAccess.getDotGraphAccess()
			.getSemicolonKeyword_4_2_5(), ";", null
		)
	}
}