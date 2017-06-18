/**
 */
package robotDSLEcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robotDSLEcore.RobotDSLEcorePackage
 * @generated
 */
public interface RobotDSLEcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotDSLEcoreFactory eINSTANCE = robotDSLEcore.impl.RobotDSLEcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Statements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statements</em>'.
	 * @generated
	 */
	Statements createStatements();

	/**
	 * Returns a new object of class '<em>Command Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Statement</em>'.
	 * @generated
	 */
	CommandStatement createCommandStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>Repeat Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Statement</em>'.
	 * @generated
	 */
	RepeatStatement createRepeatStatement();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Left</em>'.
	 * @generated
	 */
	TurnLeft createTurnLeft();

	/**
	 * Returns a new object of class '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop</em>'.
	 * @generated
	 */
	Drop createDrop();

	/**
	 * Returns a new object of class '<em>Pick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick</em>'.
	 * @generated
	 */
	Pick createPick();

	/**
	 * Returns a new object of class '<em>Trace Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Message</em>'.
	 * @generated
	 */
	TraceMessage createTraceMessage();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Logical Exps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Exps</em>'.
	 * @generated
	 */
	LogicalExps createLogicalExps();

	/**
	 * Returns a new object of class '<em>Full</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full</em>'.
	 * @generated
	 */
	Full createFull();

	/**
	 * Returns a new object of class '<em>Mark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark</em>'.
	 * @generated
	 */
	Mark createMark();

	/**
	 * Returns a new object of class '<em>Wall Ahead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall Ahead</em>'.
	 * @generated
	 */
	WallAhead createWallAhead();

	/**
	 * Returns a new object of class '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heading</em>'.
	 * @generated
	 */
	Heading createHeading();

	/**
	 * Returns a new object of class '<em>Build Statements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Statements</em>'.
	 * @generated
	 */
	BuildStatements createBuildStatements();

	/**
	 * Returns a new object of class '<em>Destroy Wall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy Wall</em>'.
	 * @generated
	 */
	DestroyWall createDestroyWall();

	/**
	 * Returns a new object of class '<em>Pick Mark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick Mark</em>'.
	 * @generated
	 */
	PickMark createPickMark();

	/**
	 * Returns a new object of class '<em>Drop Mark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Mark</em>'.
	 * @generated
	 */
	DropMark createDropMark();

	/**
	 * Returns a new object of class '<em>Build Wall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Wall</em>'.
	 * @generated
	 */
	BuildWall createBuildWall();

	/**
	 * Returns a new object of class '<em>Binaries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binaries</em>'.
	 * @generated
	 */
	Binaries createBinaries();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Single Logal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Logal Exp</em>'.
	 * @generated
	 */
	SingleLogalExp createSingleLogalExp();

	/**
	 * Returns a new object of class '<em>Binary Logical Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Logical Exp</em>'.
	 * @generated
	 */
	BinaryLogicalExp createBinaryLogicalExp();

	/**
	 * Returns a new object of class '<em>Running Statements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Running Statements</em>'.
	 * @generated
	 */
	RunningStatements createRunningStatements();

	/**
	 * Returns a new object of class '<em>Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else</em>'.
	 * @generated
	 */
	Else createElse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobotDSLEcorePackage getRobotDSLEcorePackage();

} //RobotDSLEcoreFactory
