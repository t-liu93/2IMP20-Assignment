/**
 */
package robotDSLEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__END = 1;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS__SCRIPT = 0;

	/**
	 * The number of structural features of the '<em>Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STATEMENT__SCRIPT = STATEMENTS__SCRIPT;

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
	 * The meta object id for the '{@link robotDSLEcore.impl.IfStatementWithoutElseImpl <em>If Statement Without Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcore.impl.IfStatementWithoutElseImpl
	 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getIfStatementWithoutElse()
	 * @generated
	 */
	int IF_STATEMENT_WITHOUT_ELSE = 3;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_WITHOUT_ELSE__SCRIPT = STATEMENTS__SCRIPT;

	/**
	 * The number of structural features of the '<em>If Statement Without Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_WITHOUT_ELSE_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If Statement Without Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_WITHOUT_ELSE_OPERATION_COUNT = STATEMENTS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__SCRIPT = STATEMENTS__SCRIPT;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__SCRIPT = STATEMENTS__SCRIPT;

	/**
	 * The number of structural features of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SCRIPT = COMMAND_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__SCRIPT = COMMAND_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Turn Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__TURN_LEFT = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__SCRIPT = COMMAND_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__DROP = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__SCRIPT = COMMAND_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__PICK = COMMAND_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_FEATURE_COUNT = COMMAND_STATEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MESSAGE__SCRIPT = COMMAND_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MESSAGE__TRACE = COMMAND_STATEMENT_FEATURE_COUNT + 0;

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
	 * Returns the meta object for the attribute '{@link robotDSLEcore.Script#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see robotDSLEcore.Script#getEnd()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_End();

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
	 * Returns the meta object for the reference list '{@link robotDSLEcore.Statements#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Script</em>'.
	 * @see robotDSLEcore.Statements#getScript()
	 * @see #getStatements()
	 * @generated
	 */
	EReference getStatements_Script();

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
	 * Returns the meta object for class '{@link robotDSLEcore.IfStatementWithoutElse <em>If Statement Without Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement Without Else</em>'.
	 * @see robotDSLEcore.IfStatementWithoutElse
	 * @generated
	 */
	EClass getIfStatementWithoutElse();

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
	 * Returns the meta object for class '{@link robotDSLEcore.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Statement</em>'.
	 * @see robotDSLEcore.RepeatStatement
	 * @generated
	 */
	EClass getRepeatStatement();

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
	 * Returns the meta object for the attribute '{@link robotDSLEcore.Step#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see robotDSLEcore.Step#getStep()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Step();

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
	 * Returns the meta object for the attribute '{@link robotDSLEcore.TurnLeft#getTurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turn Left</em>'.
	 * @see robotDSLEcore.TurnLeft#getTurnLeft()
	 * @see #getTurnLeft()
	 * @generated
	 */
	EAttribute getTurnLeft_TurnLeft();

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
	 * Returns the meta object for the attribute '{@link robotDSLEcore.Drop#getDrop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drop</em>'.
	 * @see robotDSLEcore.Drop#getDrop()
	 * @see #getDrop()
	 * @generated
	 */
	EAttribute getDrop_Drop();

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
	 * Returns the meta object for the attribute '{@link robotDSLEcore.Pick#getPick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pick</em>'.
	 * @see robotDSLEcore.Pick#getPick()
	 * @see #getPick()
	 * @generated
	 */
	EAttribute getPick_Pick();

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
	 * Returns the meta object for the attribute '{@link robotDSLEcore.TraceMessage#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace</em>'.
	 * @see robotDSLEcore.TraceMessage#getTrace()
	 * @see #getTraceMessage()
	 * @generated
	 */
	EAttribute getTraceMessage_Trace();

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
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__END = eINSTANCE.getScript_End();

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
		 * The meta object literal for the '<em><b>Script</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENTS__SCRIPT = eINSTANCE.getStatements_Script();

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
		 * The meta object literal for the '{@link robotDSLEcore.impl.IfStatementWithoutElseImpl <em>If Statement Without Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.IfStatementWithoutElseImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getIfStatementWithoutElse()
		 * @generated
		 */
		EClass IF_STATEMENT_WITHOUT_ELSE = eINSTANCE.getIfStatementWithoutElse();

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
		 * The meta object literal for the '{@link robotDSLEcore.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcore.impl.RepeatStatementImpl
		 * @see robotDSLEcore.impl.RobotDSLEcorePackageImpl#getRepeatStatement()
		 * @generated
		 */
		EClass REPEAT_STATEMENT = eINSTANCE.getRepeatStatement();

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
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP = eINSTANCE.getStep_Step();

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
		 * The meta object literal for the '<em><b>Turn Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_LEFT__TURN_LEFT = eINSTANCE.getTurnLeft_TurnLeft();

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
		 * The meta object literal for the '<em><b>Drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP__DROP = eINSTANCE.getDrop_Drop();

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
		 * The meta object literal for the '<em><b>Pick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK__PICK = eINSTANCE.getPick_Pick();

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
		 * The meta object literal for the '<em><b>Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_MESSAGE__TRACE = eINSTANCE.getTraceMessage_Trace();

	}

} //RobotDSLEcorePackage
