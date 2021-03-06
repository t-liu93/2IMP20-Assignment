/*
 * generated by Xtext 2.11.0
 */
package glt.serializer;

import com.google.inject.Inject;
import glt.services.RobotDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import robotDSLEcore.And;
import robotDSLEcore.Binaries;
import robotDSLEcore.BinaryLogicalExp;
import robotDSLEcore.BuildStatements;
import robotDSLEcore.BuildWall;
import robotDSLEcore.CommandStatement;
import robotDSLEcore.Comment;
import robotDSLEcore.DestroyWall;
import robotDSLEcore.Drop;
import robotDSLEcore.DropMark;
import robotDSLEcore.Else;
import robotDSLEcore.Full;
import robotDSLEcore.Heading;
import robotDSLEcore.IfStatement;
import robotDSLEcore.LogicalExps;
import robotDSLEcore.Mark;
import robotDSLEcore.Not;
import robotDSLEcore.Or;
import robotDSLEcore.Pick;
import robotDSLEcore.PickMark;
import robotDSLEcore.RepeatStatement;
import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.RunningStatements;
import robotDSLEcore.Script;
import robotDSLEcore.SingleLogalExp;
import robotDSLEcore.Statements;
import robotDSLEcore.Step;
import robotDSLEcore.TraceMessage;
import robotDSLEcore.TurnLeft;
import robotDSLEcore.WallAhead;
import robotDSLEcore.WhileStatement;

@SuppressWarnings("all")
public class RobotDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RobotDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RobotDSLEcorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RobotDSLEcorePackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case RobotDSLEcorePackage.BINARIES:
				sequence_Binaries_Impl(context, (Binaries) semanticObject); 
				return; 
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP:
				sequence_BinaryLogicalExp(context, (BinaryLogicalExp) semanticObject); 
				return; 
			case RobotDSLEcorePackage.BUILD_STATEMENTS:
				sequence_BuildStatements_Impl(context, (BuildStatements) semanticObject); 
				return; 
			case RobotDSLEcorePackage.BUILD_WALL:
				sequence_BuildWall(context, (BuildWall) semanticObject); 
				return; 
			case RobotDSLEcorePackage.COMMAND_STATEMENT:
				sequence_CommandStatement_Impl(context, (CommandStatement) semanticObject); 
				return; 
			case RobotDSLEcorePackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case RobotDSLEcorePackage.DESTROY_WALL:
				sequence_DestroyWall(context, (DestroyWall) semanticObject); 
				return; 
			case RobotDSLEcorePackage.DROP:
				sequence_Drop(context, (Drop) semanticObject); 
				return; 
			case RobotDSLEcorePackage.DROP_MARK:
				sequence_DropMark(context, (DropMark) semanticObject); 
				return; 
			case RobotDSLEcorePackage.ELSE:
				sequence_Else(context, (Else) semanticObject); 
				return; 
			case RobotDSLEcorePackage.FULL:
				sequence_Full(context, (Full) semanticObject); 
				return; 
			case RobotDSLEcorePackage.HEADING:
				sequence_Heading(context, (Heading) semanticObject); 
				return; 
			case RobotDSLEcorePackage.IF_STATEMENT:
				sequence_IfStatement(context, (IfStatement) semanticObject); 
				return; 
			case RobotDSLEcorePackage.LOGICAL_EXPS:
				sequence_LogicalExps_Impl(context, (LogicalExps) semanticObject); 
				return; 
			case RobotDSLEcorePackage.MARK:
				sequence_Mark(context, (Mark) semanticObject); 
				return; 
			case RobotDSLEcorePackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case RobotDSLEcorePackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case RobotDSLEcorePackage.PICK:
				sequence_Pick(context, (Pick) semanticObject); 
				return; 
			case RobotDSLEcorePackage.PICK_MARK:
				sequence_PickMark(context, (PickMark) semanticObject); 
				return; 
			case RobotDSLEcorePackage.REPEAT_STATEMENT:
				sequence_RepeatStatement(context, (RepeatStatement) semanticObject); 
				return; 
			case RobotDSLEcorePackage.RUNNING_STATEMENTS:
				sequence_RunningStatements_Impl(context, (RunningStatements) semanticObject); 
				return; 
			case RobotDSLEcorePackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			case RobotDSLEcorePackage.SINGLE_LOGAL_EXP:
				sequence_SingleLogalExp_Impl(context, (SingleLogalExp) semanticObject); 
				return; 
			case RobotDSLEcorePackage.STATEMENTS:
				sequence_Statements_Impl(context, (Statements) semanticObject); 
				return; 
			case RobotDSLEcorePackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			case RobotDSLEcorePackage.TRACE_MESSAGE:
				sequence_TraceMessage(context, (TraceMessage) semanticObject); 
				return; 
			case RobotDSLEcorePackage.TURN_LEFT:
				sequence_TurnLeft(context, (TurnLeft) semanticObject); 
				return; 
			case RobotDSLEcorePackage.WALL_AHEAD:
				sequence_WallAhead(context, (WallAhead) semanticObject); 
				return; 
			case RobotDSLEcorePackage.WHILE_STATEMENT:
				sequence_WhileStatement(context, (WhileStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Binaries returns And
	 *     And returns And
	 *
	 * Constraint:
	 *     singlelogalexp=SingleLogalExp
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.BINARIES__SINGLELOGALEXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.BINARIES__SINGLELOGALEXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getSinglelogalexpSingleLogalExpParserRuleCall_2_0(), semanticObject.getSinglelogalexp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Binaries_Impl returns Binaries
	 *
	 * Constraint:
	 *     {Binaries}
	 */
	protected void sequence_Binaries_Impl(ISerializationContext context, Binaries semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExps returns BinaryLogicalExp
	 *     BinaryLogicalExp returns BinaryLogicalExp
	 *
	 * Constraint:
	 *     (singlelogalexp=SingleLogalExp binaries+=Binaries+)
	 */
	protected void sequence_BinaryLogicalExp(ISerializationContext context, BinaryLogicalExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BuildStatements_Impl returns BuildStatements
	 *
	 * Constraint:
	 *     {BuildStatements}
	 */
	protected void sequence_BuildStatements_Impl(ISerializationContext context, BuildStatements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns BuildWall
	 *     BuildWall returns BuildWall
	 *
	 * Constraint:
	 *     (row=INT column=INT)
	 */
	protected void sequence_BuildWall(ISerializationContext context, BuildWall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.BUILD_WALL__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.BUILD_WALL__ROW));
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.BUILD_WALL__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.BUILD_WALL__COLUMN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBuildWallAccess().getRowINTTerminalRuleCall_4_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getBuildWallAccess().getColumnINTTerminalRuleCall_6_0(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CommandStatement_Impl returns CommandStatement
	 *
	 * Constraint:
	 *     {CommandStatement}
	 */
	protected void sequence_CommandStatement_Impl(ISerializationContext context, CommandStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Comment
	 *     RunningStatements returns Comment
	 *     CommandStatement returns Comment
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     comment=COMMENTS
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.COMMENT__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.COMMENT__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getCommentCOMMENTSTerminalRuleCall_1_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns DestroyWall
	 *     DestroyWall returns DestroyWall
	 *
	 * Constraint:
	 *     (row=INT column=INT)
	 */
	protected void sequence_DestroyWall(ISerializationContext context, DestroyWall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.DESTROY_WALL__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.DESTROY_WALL__ROW));
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.DESTROY_WALL__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.DESTROY_WALL__COLUMN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDestroyWallAccess().getRowINTTerminalRuleCall_4_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getDestroyWallAccess().getColumnINTTerminalRuleCall_6_0(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns DropMark
	 *     DropMark returns DropMark
	 *
	 * Constraint:
	 *     (row=INT column=INT)
	 */
	protected void sequence_DropMark(ISerializationContext context, DropMark semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.DROP_MARK__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.DROP_MARK__ROW));
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.DROP_MARK__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.DROP_MARK__COLUMN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDropMarkAccess().getRowINTTerminalRuleCall_4_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getDropMarkAccess().getColumnINTTerminalRuleCall_6_0(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Drop
	 *     RunningStatements returns Drop
	 *     CommandStatement returns Drop
	 *     Drop returns Drop
	 *
	 * Constraint:
	 *     {Drop}
	 */
	protected void sequence_Drop(ISerializationContext context, Drop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Else returns Else
	 *
	 * Constraint:
	 *     (runningstatements+=RunningStatements runningstatements+=RunningStatements*)?
	 */
	protected void sequence_Else(ISerializationContext context, Else semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExps returns Full
	 *     SingleLogalExp returns Full
	 *     Full returns Full
	 *
	 * Constraint:
	 *     not=Not?
	 */
	protected void sequence_Full(ISerializationContext context, Full semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExps returns Heading
	 *     SingleLogalExp returns Heading
	 *     Heading returns Heading
	 *
	 * Constraint:
	 *     (not=Not? direction=Directions)
	 */
	protected void sequence_Heading(ISerializationContext context, Heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns IfStatement
	 *     RunningStatements returns IfStatement
	 *     IfStatement returns IfStatement
	 *
	 * Constraint:
	 *     (logicalexps=LogicalExps (runningstatements+=RunningStatements runningstatements+=RunningStatements*)? else=Else?)
	 */
	protected void sequence_IfStatement(ISerializationContext context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExps_Impl returns LogicalExps
	 *
	 * Constraint:
	 *     {LogicalExps}
	 */
	protected void sequence_LogicalExps_Impl(ISerializationContext context, LogicalExps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExps returns Mark
	 *     SingleLogalExp returns Mark
	 *     Mark returns Mark
	 *
	 * Constraint:
	 *     not=Not?
	 */
	protected void sequence_Mark(ISerializationContext context, Mark semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Not returns Not
	 *
	 * Constraint:
	 *     {Not}
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Binaries returns Or
	 *     Or returns Or
	 *
	 * Constraint:
	 *     singlelogalexp=SingleLogalExp
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.BINARIES__SINGLELOGALEXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.BINARIES__SINGLELOGALEXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getSinglelogalexpSingleLogalExpParserRuleCall_2_0(), semanticObject.getSinglelogalexp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns PickMark
	 *     PickMark returns PickMark
	 *
	 * Constraint:
	 *     (row=INT column=INT)
	 */
	protected void sequence_PickMark(ISerializationContext context, PickMark semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.PICK_MARK__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.PICK_MARK__ROW));
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.PICK_MARK__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.PICK_MARK__COLUMN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPickMarkAccess().getRowINTTerminalRuleCall_4_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getPickMarkAccess().getColumnINTTerminalRuleCall_6_0(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Pick
	 *     RunningStatements returns Pick
	 *     CommandStatement returns Pick
	 *     Pick returns Pick
	 *
	 * Constraint:
	 *     {Pick}
	 */
	protected void sequence_Pick(ISerializationContext context, Pick semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns RepeatStatement
	 *     RunningStatements returns RepeatStatement
	 *     RepeatStatement returns RepeatStatement
	 *
	 * Constraint:
	 *     (time=EInt (commandstatement+=CommandStatement commandstatement+=CommandStatement*)?)
	 */
	protected void sequence_RepeatStatement(ISerializationContext context, RepeatStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RunningStatements_Impl returns RunningStatements
	 *
	 * Constraint:
	 *     {RunningStatements}
	 */
	protected void sequence_RunningStatements_Impl(ISerializationContext context, RunningStatements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Script returns Script
	 *
	 * Constraint:
	 *     (name=NAME (statements+=Statements statements+=Statements*)?)
	 */
	protected void sequence_Script(ISerializationContext context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleLogalExp_Impl returns SingleLogalExp
	 *
	 * Constraint:
	 *     {SingleLogalExp}
	 */
	protected void sequence_SingleLogalExp_Impl(ISerializationContext context, SingleLogalExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements_Impl returns Statements
	 *
	 * Constraint:
	 *     {Statements}
	 */
	protected void sequence_Statements_Impl(ISerializationContext context, Statements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Step
	 *     RunningStatements returns Step
	 *     CommandStatement returns Step
	 *     Step returns Step
	 *
	 * Constraint:
	 *     {Step}
	 */
	protected void sequence_Step(ISerializationContext context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns TraceMessage
	 *     RunningStatements returns TraceMessage
	 *     CommandStatement returns TraceMessage
	 *     TraceMessage returns TraceMessage
	 *
	 * Constraint:
	 *     message=Messages
	 */
	protected void sequence_TraceMessage(ISerializationContext context, TraceMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLEcorePackage.Literals.TRACE_MESSAGE__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLEcorePackage.Literals.TRACE_MESSAGE__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTraceMessageAccess().getMessageMessagesParserRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns TurnLeft
	 *     RunningStatements returns TurnLeft
	 *     CommandStatement returns TurnLeft
	 *     TurnLeft returns TurnLeft
	 *
	 * Constraint:
	 *     {TurnLeft}
	 */
	protected void sequence_TurnLeft(ISerializationContext context, TurnLeft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExps returns WallAhead
	 *     SingleLogalExp returns WallAhead
	 *     WallAhead returns WallAhead
	 *
	 * Constraint:
	 *     not=Not?
	 */
	protected void sequence_WallAhead(ISerializationContext context, WallAhead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns WhileStatement
	 *     RunningStatements returns WhileStatement
	 *     WhileStatement returns WhileStatement
	 *
	 * Constraint:
	 *     (logicalexps=LogicalExps (runningstatements+=RunningStatements runningstatements+=RunningStatements*)?)
	 */
	protected void sequence_WhileStatement(ISerializationContext context, WhileStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
