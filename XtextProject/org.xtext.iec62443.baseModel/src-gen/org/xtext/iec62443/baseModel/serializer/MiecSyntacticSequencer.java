/*
 * generated by Xtext 2.32.0
 */
package org.xtext.iec62443.baseModel.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.iec62443.baseModel.services.MiecGrammarAccess;

@SuppressWarnings("all")
public class MiecSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MiecGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Device_DeviceKeyword_1_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MiecGrammarAccess) access;
		match_Device_DeviceKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getDeviceAccess().getDeviceKeyword_1_3());
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
			if (match_Device_DeviceKeyword_1_3_q.equals(syntax))
				emit_Device_DeviceKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'device'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_Device_DeviceKeyword_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
