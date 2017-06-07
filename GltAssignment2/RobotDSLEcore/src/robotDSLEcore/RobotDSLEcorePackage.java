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
	String eNS_URI = "robotDSLEcore";

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
	 * The feature id for the '<em><b>Buildstatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__BUILDSTATEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link robotDSLEcore.impl.SingleLogalExpImpl <em>Single Logal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.SingleLogalExpImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getSingleLogalExp()
	 * @generated
	 */
	int SINGLE_LOGAL_EXP = 26;

	/**
	 * The number of structural features of the '<em>Single Logal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LOGAL_EXP_FEATURE_COUNT = LOGICAL_EXPS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Logal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LOGAL_EXP_OPERATION_COUNT = LOGICAL_EXPS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL__NOT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_FEATURE_COUNT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OPERATION_COUNT = SINGLE_LOGAL_EXP_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__NOT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = SINGLE_LOGAL_EXP_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD__NOT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wall Ahead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_FEATURE_COUNT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wall Ahead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_OPERATION_COUNT = SINGLE_LOGAL_EXP_OPERATION_COUNT + 0;

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
	int HEADING__DIRECTION = SINGLE_LOGAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__NOT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = SINGLE_LOGAL_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = SINGLE_LOGAL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.BuildStatementsImpl <em>Build Statements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.BuildStatementsImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBuildStatements()
	 * @generated
	 */
	int BUILD_STATEMENTS = 17;

	/**
	 * The number of structural features of the '<em>Build Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STATEMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Build Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STATEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.DestroyWallImpl <em>Destroy Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.DestroyWallImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDestroyWall()
	 * @generated
	 */
	int DESTROY_WALL = 18;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_WALL__ROW = BUILD_STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_WALL__COLUMN = BUILD_STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Destroy Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_WALL_FEATURE_COUNT = BUILD_STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Destroy Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_WALL_OPERATION_COUNT = BUILD_STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.PickMarkImpl <em>Pick Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.PickMarkImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getPickMark()
	 * @generated
	 */
	int PICK_MARK = 19;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_MARK__ROW = BUILD_STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_MARK__COLUMN = BUILD_STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pick Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_MARK_FEATURE_COUNT = BUILD_STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pick Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_MARK_OPERATION_COUNT = BUILD_STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.DropMarkImpl <em>Drop Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.DropMarkImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDropMark()
	 * @generated
	 */
	int DROP_MARK = 20;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK__ROW = BUILD_STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK__COLUMN = BUILD_STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Drop Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK_FEATURE_COUNT = BUILD_STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Drop Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK_OPERATION_COUNT = BUILD_STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.BuildWallImpl <em>Build Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.BuildWallImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBuildWall()
	 * @generated
	 */
	int BUILD_WALL = 21;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL__ROW = BUILD_STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL__COLUMN = BUILD_STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Build Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL_FEATURE_COUNT = BUILD_STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Build Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL_OPERATION_COUNT = BUILD_STATEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.BinariesImpl <em>Binaries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.BinariesImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBinaries()
	 * @generated
	 */
	int BINARIES = 22;

	/**
	 * The number of structural features of the '<em>Binaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.AndImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 23;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BINARIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.OrImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getOr()
	 * @generated
	 */
	int OR = 24;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BINARIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.NotImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getNot()
	 * @generated
	 */
	int NOT = 25;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.impl.BinaryLogicalExpImpl <em>Binary Logical Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.BinaryLogicalExpImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBinaryLogicalExp()
	 * @generated
	 */
	int BINARY_LOGICAL_EXP = 27;

	/**
	 * The feature id for the '<em><b>Binaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXP__BINARIES = LOGICAL_EXPS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Singlelogalexp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXP__SINGLELOGALEXP = LOGICAL_EXPS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Logical Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXP_FEATURE_COUNT = LOGICAL_EXPS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Logical Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXP_OPERATION_COUNT = LOGICAL_EXPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcore.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.Directions
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 28;


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
	 * Returns the meta object for the containment reference list '{@link robotDSLEcore.Script#getBuildstatements <em>Buildstatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildstatements</em>'.
	 * @see robotDSLEcore.Script#getBuildstatements()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Buildstatements();

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
	 * Returns the meta object for the containment reference '{@link robotDSLEcore.Full#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see robotDSLEcore.Full#getNot()
	 * @see #getFull()
	 * @generated
	 */
	EReference getFull_Not();

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
	 * Returns the meta object for the containment reference '{@link robotDSLEcore.Mark#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see robotDSLEcore.Mark#getNot()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Not();

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
	 * Returns the meta object for the containment reference '{@link robotDSLEcore.WallAhead#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see robotDSLEcore.WallAhead#getNot()
	 * @see #getWallAhead()
	 * @generated
	 */
	EReference getWallAhead_Not();

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
	 * Returns the meta object for the containment reference '{@link robotDSLEcore.Heading#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see robotDSLEcore.Heading#getNot()
	 * @see #getHeading()
	 * @generated
	 */
	EReference getHeading_Not();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.BuildStatements <em>Build Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Statements</em>'.
	 * @see robotDSLEcore.BuildStatements
	 * @generated
	 */
	EClass getBuildStatements();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.DestroyWall <em>Destroy Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Wall</em>'.
	 * @see robotDSLEcore.DestroyWall
	 * @generated
	 */
	EClass getDestroyWall();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.DestroyWall#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see robotDSLEcore.DestroyWall#getRow()
	 * @see #getDestroyWall()
	 * @generated
	 */
	EAttribute getDestroyWall_Row();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.DestroyWall#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see robotDSLEcore.DestroyWall#getColumn()
	 * @see #getDestroyWall()
	 * @generated
	 */
	EAttribute getDestroyWall_Column();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.PickMark <em>Pick Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick Mark</em>'.
	 * @see robotDSLEcore.PickMark
	 * @generated
	 */
	EClass getPickMark();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.PickMark#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see robotDSLEcore.PickMark#getRow()
	 * @see #getPickMark()
	 * @generated
	 */
	EAttribute getPickMark_Row();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.PickMark#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see robotDSLEcore.PickMark#getColumn()
	 * @see #getPickMark()
	 * @generated
	 */
	EAttribute getPickMark_Column();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.DropMark <em>Drop Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Mark</em>'.
	 * @see robotDSLEcore.DropMark
	 * @generated
	 */
	EClass getDropMark();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.DropMark#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see robotDSLEcore.DropMark#getRow()
	 * @see #getDropMark()
	 * @generated
	 */
	EAttribute getDropMark_Row();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.DropMark#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see robotDSLEcore.DropMark#getColumn()
	 * @see #getDropMark()
	 * @generated
	 */
	EAttribute getDropMark_Column();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.BuildWall <em>Build Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Wall</em>'.
	 * @see robotDSLEcore.BuildWall
	 * @generated
	 */
	EClass getBuildWall();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.BuildWall#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see robotDSLEcore.BuildWall#getRow()
	 * @see #getBuildWall()
	 * @generated
	 */
	EAttribute getBuildWall_Row();

	/**
	 * Returns the meta object for the attribute '{@link robotDSLEcore.BuildWall#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see robotDSLEcore.BuildWall#getColumn()
	 * @see #getBuildWall()
	 * @generated
	 */
	EAttribute getBuildWall_Column();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Binaries <em>Binaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binaries</em>'.
	 * @see robotDSLEcore.Binaries
	 * @generated
	 */
	EClass getBinaries();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see robotDSLEcore.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see robotDSLEcore.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see robotDSLEcore.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.SingleLogalExp <em>Single Logal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Logal Exp</em>'.
	 * @see robotDSLEcore.SingleLogalExp
	 * @generated
	 */
	EClass getSingleLogalExp();

	/**
	 * Returns the meta object for class '{@link robotDSLEcore.BinaryLogicalExp <em>Binary Logical Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Logical Exp</em>'.
	 * @see robotDSLEcore.BinaryLogicalExp
	 * @generated
	 */
	EClass getBinaryLogicalExp();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSLEcore.BinaryLogicalExp#getBinaries <em>Binaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binaries</em>'.
	 * @see robotDSLEcore.BinaryLogicalExp#getBinaries()
	 * @see #getBinaryLogicalExp()
	 * @generated
	 */
	EReference getBinaryLogicalExp_Binaries();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSLEcore.BinaryLogicalExp#getSinglelogalexp <em>Singlelogalexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Singlelogalexp</em>'.
	 * @see robotDSLEcore.BinaryLogicalExp#getSinglelogalexp()
	 * @see #getBinaryLogicalExp()
	 * @generated
	 */
	EReference getBinaryLogicalExp_Singlelogalexp();

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
		 * The meta object literal for the '<em><b>Buildstatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__BUILDSTATEMENTS = eINSTANCE.getScript_Buildstatements();

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
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULL__NOT = eINSTANCE.getFull_Not();

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
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__NOT = eINSTANCE.getMark_Not();

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
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALL_AHEAD__NOT = eINSTANCE.getWallAhead_Not();

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
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING__NOT = eINSTANCE.getHeading_Not();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.BuildStatementsImpl <em>Build Statements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.BuildStatementsImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBuildStatements()
		 * @generated
		 */
		EClass BUILD_STATEMENTS = eINSTANCE.getBuildStatements();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.DestroyWallImpl <em>Destroy Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.DestroyWallImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDestroyWall()
		 * @generated
		 */
		EClass DESTROY_WALL = eINSTANCE.getDestroyWall();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTROY_WALL__ROW = eINSTANCE.getDestroyWall_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTROY_WALL__COLUMN = eINSTANCE.getDestroyWall_Column();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.PickMarkImpl <em>Pick Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.PickMarkImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getPickMark()
		 * @generated
		 */
		EClass PICK_MARK = eINSTANCE.getPickMark();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK_MARK__ROW = eINSTANCE.getPickMark_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK_MARK__COLUMN = eINSTANCE.getPickMark_Column();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.DropMarkImpl <em>Drop Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.DropMarkImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getDropMark()
		 * @generated
		 */
		EClass DROP_MARK = eINSTANCE.getDropMark();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_MARK__ROW = eINSTANCE.getDropMark_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_MARK__COLUMN = eINSTANCE.getDropMark_Column();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.BuildWallImpl <em>Build Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.BuildWallImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBuildWall()
		 * @generated
		 */
		EClass BUILD_WALL = eINSTANCE.getBuildWall();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_WALL__ROW = eINSTANCE.getBuildWall_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_WALL__COLUMN = eINSTANCE.getBuildWall_Column();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.BinariesImpl <em>Binaries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.BinariesImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBinaries()
		 * @generated
		 */
		EClass BINARIES = eINSTANCE.getBinaries();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.AndImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.OrImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.NotImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.SingleLogalExpImpl <em>Single Logal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.SingleLogalExpImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getSingleLogalExp()
		 * @generated
		 */
		EClass SINGLE_LOGAL_EXP = eINSTANCE.getSingleLogalExp();

		/**
		 * The meta object literal for the '{@link robotDSLEcore.impl.BinaryLogicalExpImpl <em>Binary Logical Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.BinaryLogicalExpImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getBinaryLogicalExp()
		 * @generated
		 */
		EClass BINARY_LOGICAL_EXP = eINSTANCE.getBinaryLogicalExp();

		/**
		 * The meta object literal for the '<em><b>Binaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGICAL_EXP__BINARIES = eINSTANCE.getBinaryLogicalExp_Binaries();

		/**
		 * The meta object literal for the '<em><b>Singlelogalexp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGICAL_EXP__SINGLELOGALEXP = eINSTANCE.getBinaryLogicalExp_Singlelogalexp();

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
