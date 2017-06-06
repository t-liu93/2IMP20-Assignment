/**
 */
package robotDSLEcore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotDSLEcore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotDSLEcoreFactoryImpl extends EFactoryImpl implements RobotDSLEcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotDSLEcoreFactory init() {
		try {
			RobotDSLEcoreFactory theRobotDSLEcoreFactory = (RobotDSLEcoreFactory)EPackage.Registry.INSTANCE.getEFactory(RobotDSLEcorePackage.eNS_URI);
			if (theRobotDSLEcoreFactory != null) {
				return theRobotDSLEcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotDSLEcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RobotDSLEcorePackage.SCRIPT: return createScript();
			case RobotDSLEcorePackage.STATEMENTS: return createStatements();
			case RobotDSLEcorePackage.COMMAND_STATEMENT: return createCommandStatement();
			case RobotDSLEcorePackage.IF_STATEMENT_WITHOUT_ELSE: return createIfStatementWithoutElse();
			case RobotDSLEcorePackage.WHILE_STATEMENT: return createWhileStatement();
			case RobotDSLEcorePackage.REPEAT_STATEMENT: return createRepeatStatement();
			case RobotDSLEcorePackage.STEP: return createStep();
			case RobotDSLEcorePackage.TURN_LEFT: return createTurnLeft();
			case RobotDSLEcorePackage.DROP: return createDrop();
			case RobotDSLEcorePackage.PICK: return createPick();
			case RobotDSLEcorePackage.TRACE_MESSAGE: return createTraceMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statements createStatements() {
		StatementsImpl statements = new StatementsImpl();
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandStatement createCommandStatement() {
		CommandStatementImpl commandStatement = new CommandStatementImpl();
		return commandStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatementWithoutElse createIfStatementWithoutElse() {
		IfStatementWithoutElseImpl ifStatementWithoutElse = new IfStatementWithoutElseImpl();
		return ifStatementWithoutElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatStatement createRepeatStatement() {
		RepeatStatementImpl repeatStatement = new RepeatStatementImpl();
		return repeatStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnLeft createTurnLeft() {
		TurnLeftImpl turnLeft = new TurnLeftImpl();
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pick createPick() {
		PickImpl pick = new PickImpl();
		return pick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceMessage createTraceMessage() {
		TraceMessageImpl traceMessage = new TraceMessageImpl();
		return traceMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcorePackage getRobotDSLEcorePackage() {
		return (RobotDSLEcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotDSLEcorePackage getPackage() {
		return RobotDSLEcorePackage.eINSTANCE;
	}

} //RobotDSLEcoreFactoryImpl
