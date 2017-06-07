/**
 */
package robotDSLEcore.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import robotDSLEcore.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robotDSLEcore.RobotDSLEcorePackage
 * @generated
 */
public class RobotDSLEcoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotDSLEcorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcoreSwitch() {
		if (modelPackage == null) {
			modelPackage = RobotDSLEcorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RobotDSLEcorePackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.STATEMENTS: {
				Statements statements = (Statements)theEObject;
				T result = caseStatements(statements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.COMMAND_STATEMENT: {
				CommandStatement commandStatement = (CommandStatement)theEObject;
				T result = caseCommandStatement(commandStatement);
				if (result == null) result = caseRunningStatements(commandStatement);
				if (result == null) result = caseStatements(commandStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseRunningStatements(ifStatement);
				if (result == null) result = caseStatements(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T result = caseWhileStatement(whileStatement);
				if (result == null) result = caseRunningStatements(whileStatement);
				if (result == null) result = caseStatements(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.REPEAT_STATEMENT: {
				RepeatStatement repeatStatement = (RepeatStatement)theEObject;
				T result = caseRepeatStatement(repeatStatement);
				if (result == null) result = caseRunningStatements(repeatStatement);
				if (result == null) result = caseStatements(repeatStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseCommandStatement(step);
				if (result == null) result = caseRunningStatements(step);
				if (result == null) result = caseStatements(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.TURN_LEFT: {
				TurnLeft turnLeft = (TurnLeft)theEObject;
				T result = caseTurnLeft(turnLeft);
				if (result == null) result = caseCommandStatement(turnLeft);
				if (result == null) result = caseRunningStatements(turnLeft);
				if (result == null) result = caseStatements(turnLeft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.DROP: {
				Drop drop = (Drop)theEObject;
				T result = caseDrop(drop);
				if (result == null) result = caseCommandStatement(drop);
				if (result == null) result = caseRunningStatements(drop);
				if (result == null) result = caseStatements(drop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.PICK: {
				Pick pick = (Pick)theEObject;
				T result = casePick(pick);
				if (result == null) result = caseCommandStatement(pick);
				if (result == null) result = caseRunningStatements(pick);
				if (result == null) result = caseStatements(pick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.TRACE_MESSAGE: {
				TraceMessage traceMessage = (TraceMessage)theEObject;
				T result = caseTraceMessage(traceMessage);
				if (result == null) result = caseCommandStatement(traceMessage);
				if (result == null) result = caseRunningStatements(traceMessage);
				if (result == null) result = caseStatements(traceMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseCommandStatement(comment);
				if (result == null) result = caseRunningStatements(comment);
				if (result == null) result = caseStatements(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.LOGICAL_EXPS: {
				LogicalExps logicalExps = (LogicalExps)theEObject;
				T result = caseLogicalExps(logicalExps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.FULL: {
				Full full = (Full)theEObject;
				T result = caseFull(full);
				if (result == null) result = caseSingleLogalExp(full);
				if (result == null) result = caseLogicalExps(full);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.MARK: {
				Mark mark = (Mark)theEObject;
				T result = caseMark(mark);
				if (result == null) result = caseSingleLogalExp(mark);
				if (result == null) result = caseLogicalExps(mark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.WALL_AHEAD: {
				WallAhead wallAhead = (WallAhead)theEObject;
				T result = caseWallAhead(wallAhead);
				if (result == null) result = caseSingleLogalExp(wallAhead);
				if (result == null) result = caseLogicalExps(wallAhead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.HEADING: {
				Heading heading = (Heading)theEObject;
				T result = caseHeading(heading);
				if (result == null) result = caseSingleLogalExp(heading);
				if (result == null) result = caseLogicalExps(heading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.BUILD_STATEMENTS: {
				BuildStatements buildStatements = (BuildStatements)theEObject;
				T result = caseBuildStatements(buildStatements);
				if (result == null) result = caseStatements(buildStatements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.DESTROY_WALL: {
				DestroyWall destroyWall = (DestroyWall)theEObject;
				T result = caseDestroyWall(destroyWall);
				if (result == null) result = caseBuildStatements(destroyWall);
				if (result == null) result = caseStatements(destroyWall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.PICK_MARK: {
				PickMark pickMark = (PickMark)theEObject;
				T result = casePickMark(pickMark);
				if (result == null) result = caseBuildStatements(pickMark);
				if (result == null) result = caseStatements(pickMark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.DROP_MARK: {
				DropMark dropMark = (DropMark)theEObject;
				T result = caseDropMark(dropMark);
				if (result == null) result = caseBuildStatements(dropMark);
				if (result == null) result = caseStatements(dropMark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.BUILD_WALL: {
				BuildWall buildWall = (BuildWall)theEObject;
				T result = caseBuildWall(buildWall);
				if (result == null) result = caseBuildStatements(buildWall);
				if (result == null) result = caseStatements(buildWall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.BINARIES: {
				Binaries binaries = (Binaries)theEObject;
				T result = caseBinaries(binaries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaries(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaries(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.SINGLE_LOGAL_EXP: {
				SingleLogalExp singleLogalExp = (SingleLogalExp)theEObject;
				T result = caseSingleLogalExp(singleLogalExp);
				if (result == null) result = caseLogicalExps(singleLogalExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP: {
				BinaryLogicalExp binaryLogicalExp = (BinaryLogicalExp)theEObject;
				T result = caseBinaryLogicalExp(binaryLogicalExp);
				if (result == null) result = caseLogicalExps(binaryLogicalExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotDSLEcorePackage.RUNNING_STATEMENTS: {
				RunningStatements runningStatements = (RunningStatements)theEObject;
				T result = caseRunningStatements(runningStatements);
				if (result == null) result = caseStatements(runningStatements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatements(Statements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandStatement(CommandStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatStatement(RepeatStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnLeft(TurnLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePick(Pick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceMessage(TraceMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Exps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Exps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExps(LogicalExps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFull(Full object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMark(Mark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Ahead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Ahead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallAhead(WallAhead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeading(Heading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Statements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Statements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildStatements(BuildStatements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Wall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Wall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyWall(DestroyWall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickMark(PickMark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropMark(DropMark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Wall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Wall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildWall(BuildWall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binaries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binaries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaries(Binaries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Logal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Logal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleLogalExp(SingleLogalExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Logical Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Logical Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryLogicalExp(BinaryLogicalExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Running Statements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Running Statements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunningStatements(RunningStatements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RobotDSLEcoreSwitch
