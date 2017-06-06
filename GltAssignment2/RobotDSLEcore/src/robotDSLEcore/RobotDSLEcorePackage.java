/**
 */
package robotDSLEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotDSLEcore.RobotDSLEcoreFactory
 * @model kind="package"
 * @generated
 */
public interface RobotDSLEcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotDSLEcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robotDSLEcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotDSLEcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotDSLEcorePackage eINSTANCE = robotDSLEcore.impl.RobotDSLEcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.ScriptImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STATEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.StatementsImpl <em>Statements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.StatementsImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getStatements()
	 * @generated
	 */
	int STATEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.CommandStatementImpl <em>Command Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.CommandStatementImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getCommandStatement()
	 * @generated
	 */
	int COMMAND_STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Command Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STATEMENT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STATEMENT_OPERATION_COUNT = STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.IfStatementImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Logicalexps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__LOGICALEXPS = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__STATEMENTS = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.WhileStatementImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Logicalexps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__LOGICALEXPS = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__STATEMENTS = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.RepeatStatementImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getRepeatStatement()
	 * @generated
	 */
	int REPEAT_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__TIME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commandstatement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__COMMANDSTATEMENT = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_OPERATION_COUNT = STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.StepImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 6;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = COMMAND_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.TurnLeftImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 7;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_OPERATION_COUNT = COMMAND_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.DropImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 8;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OPERATION_COUNT = COMMAND_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.PickImpl <em>Pick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.PickImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getPick()
	 * @generated
	 */
	int PICK = 9;

	/**
	 * The number of structural features of the '<em>Pick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_OPERATION_COUNT = COMMAND_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.TraceMessageImpl <em>Trace Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.TraceMessageImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getTraceMessage()
	 * @generated
	 */
	int TRACE_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MESSAGE__MESSAGE = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MESSAGE_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trace Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MESSAGE_OPERATION_COUNT = COMMAND_STATEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.CommentImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = COMMAND_STATEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.LogicalExpsImpl <em>Logical Exps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.LogicalExpsImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getLogicalExps()
	 * @generated
	 */
	int LOGICAL_EXPS = 12;

	/**
	 * The number of structural features of the '<em>Logical Exps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Logical Exps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.FullImpl <em>Full</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.FullImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getFull()
	 * @generated
	 */
	int FULL = 13;

	/**
	 * The number of structural features of the '<em>Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_FEATURE_COUNT = LOGICAL_EXPS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OPERATION_COUNT = LOGICAL_EXPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.MarkImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getMark()
	 * @generated
	 */
	int MARK = 14;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = LOGICAL_EXPS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = LOGICAL_EXPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.WallAheadImpl <em>Wall Ahead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.WallAheadImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getWallAhead()
	 * @generated
	 */
	int WALL_AHEAD = 15;

	/**
	 * The number of structural features of the '<em>Wall Ahead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_FEATURE_COUNT = LOGICAL_EXPS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wall Ahead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_OPERATION_COUNT = LOGICAL_EXPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.HeadingImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 16;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__DIRECTION = LOGICAL_EXPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = LOGICAL_EXPS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = LOGICAL_EXPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.Directions
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 17;


	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see robotDSLEcore.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.Script#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotDSLEcore.Script#getName()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSLEcore.Script#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see robotDSLEcore.Script#getStatements()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Statements();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Statements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statements</em>'.
	 * @see robotDSLEcore.Statements
	 * @generated
	 */
	EClass getStatements();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.CommandStatement <em>Command Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Statement</em>'.
	 * @see robotDSLEcore.CommandStatement
	 * @generated
	 */
	EClass getCommandStatement();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see robotDSLEcore.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link robotDSLEcore.IfStatement#getLogicalexps <em>Logicalexps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logicalexps</em>'.
	 * @see robotDSLEcore.IfStatement#getLogicalexps()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Logicalexps();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSLEcore.IfStatement#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see robotDSLEcore.IfStatement#getStatements()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Statements();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see robotDSLEcore.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link robotDSLEcore.WhileStatement#getLogicalexps <em>Logicalexps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logicalexps</em>'.
	 * @see robotDSLEcore.WhileStatement#getLogicalexps()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Logicalexps();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSLEcore.WhileStatement#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see robotDSLEcore.WhileStatement#getStatements()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Statements();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Statement</em>'.
	 * @see robotDSLEcore.RepeatStatement
	 * @generated
	 */
	EClass getRepeatStatement();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.RepeatStatement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see robotDSLEcore.RepeatStatement#getTime()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EAttribute getRepeatStatement_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSLEcore.RepeatStatement#getCommandstatement <em>Commandstatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commandstatement</em>'.
	 * @see robotDSLEcore.RepeatStatement#getCommandstatement()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_Commandstatement();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see robotDSLEcore.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see robotDSLEcore.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see robotDSLEcore.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Pick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick</em>'.
	 * @see robotDSLEcore.Pick
	 * @generated
	 */
	EClass getPick();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.TraceMessage <em>Trace Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Message</em>'.
	 * @see robotDSLEcore.TraceMessage
	 * @generated
	 */
	EClass getTraceMessage();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.TraceMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see robotDSLEcore.TraceMessage#getMessage()
	 * @see #getTraceMessage()
	 * @generated
	 */
	EAttribute getTraceMessage_Message();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see robotDSLEcore.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see robotDSLEcore.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.LogicalExps <em>Logical Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Exps</em>'.
	 * @see robotDSLEcore.LogicalExps
	 * @generated
	 */
	EClass getLogicalExps();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Full <em>Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full</em>'.
	 * @see robotDSLEcore.Full
	 * @generated
	 */
	EClass getFull();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see robotDSLEcore.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.WallAhead <em>Wall Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall Ahead</em>'.
	 * @see robotDSLEcore.WallAhead
	 * @generated
	 */
	EClass getWallAhead();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see robotDSLEcore.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.Heading#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see robotDSLEcore.Heading#getDirection()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Direction();

	/**
	 * Returns the meta object for enum '{@link robotDSLEcore.Directions <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Directions</em>'.
	 * @see robotDSLEcore.Directions
	 * @generated
	 */
	EEnum getDirections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotDSLEcoreFactory getRobotDSLEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.ScriptImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__NAME = eINSTANCE.getScript_Name();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__STATEMENTS = eINSTANCE.getScript_Statements();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.StatementsImpl <em>Statements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.StatementsImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getStatements()
		 * @generated
		 */
		EClass STATEMENTS = eINSTANCE.getStatements();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.CommandStatementImpl <em>Command Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.CommandStatementImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getCommandStatement()
		 * @generated
		 */
		EClass COMMAND_STATEMENT = eINSTANCE.getCommandStatement();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.IfStatementImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Logicalexps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__LOGICALEXPS = eINSTANCE.getIfStatement_Logicalexps();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__STATEMENTS = eINSTANCE.getIfStatement_Statements();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.WhileStatementImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Logicalexps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__LOGICALEXPS = eINSTANCE.getWhileStatement_Logicalexps();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__STATEMENTS = eINSTANCE.getWhileStatement_Statements();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.RepeatStatementImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getRepeatStatement()
		 * @generated
		 */
		EClass REPEAT_STATEMENT = eINSTANCE.getRepeatStatement();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_STATEMENT__TIME = eINSTANCE.getRepeatStatement_Time();

		/**
		 * The meta object literal for the '<em><b>Commandstatement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__COMMANDSTATEMENT = eINSTANCE.getRepeatStatement_Commandstatement();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.StepImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.TurnLeftImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.DropImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.PickImpl <em>Pick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.PickImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getPick()
		 * @generated
		 */
		EClass PICK = eINSTANCE.getPick();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.TraceMessageImpl <em>Trace Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.TraceMessageImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getTraceMessage()
		 * @generated
		 */
		EClass TRACE_MESSAGE = eINSTANCE.getTraceMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_MESSAGE__MESSAGE = eINSTANCE.getTraceMessage_Message();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.CommentImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.LogicalExpsImpl <em>Logical Exps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.LogicalExpsImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getLogicalExps()
		 * @generated
		 */
		EClass LOGICAL_EXPS = eINSTANCE.getLogicalExps();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.FullImpl <em>Full</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.FullImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getFull()
		 * @generated
		 */
		EClass FULL = eINSTANCE.getFull();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.MarkImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.WallAheadImpl <em>Wall Ahead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.WallAheadImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getWallAhead()
		 * @generated
		 */
		EClass WALL_AHEAD = eINSTANCE.getWallAhead();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.HeadingImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__DIRECTION = eINSTANCE.getHeading_Direction();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.Directions <em>Directions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.Directions
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDirections()
		 * @generated
		 */
		EEnum DIRECTIONS = eINSTANCE.getDirections();

	}

} //RobotDSLEcorePackage
