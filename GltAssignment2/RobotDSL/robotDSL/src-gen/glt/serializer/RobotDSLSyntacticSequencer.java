/*
 * generated by Xtext 2.11.0
 */
package glt.serializer;

import com.google.inject.Inject;
import glt.services.RobotDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RobotDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RobotDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_IfStatement___ElseKeyword_6_0_DoKeyword_6_1_EndKeyword_6_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RobotDSLGrammarAccess) access;
		match_IfStatement___ElseKeyword_6_0_DoKeyword_6_1_EndKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getElseKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getDoKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getEndKeyword_6_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_IfStatement___ElseKeyword_6_0_DoKeyword_6_1_EndKeyword_6_3__q.equals(syntax))
				emit_IfStatement___ElseKeyword_6_0_DoKeyword_6_1_EndKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('else' 'do' 'end')?
	 *
	 * This ambiguous syntax occurs at:
	 *     logicalexps=LogicalExps 'do' 'end' (ambiguity) (rule end)
	 *     runningstatements+=RunningStatements 'end' (ambiguity) (rule end)
	 */
	protected void emit_IfStatement___ElseKeyword_6_0_DoKeyword_6_1_EndKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}