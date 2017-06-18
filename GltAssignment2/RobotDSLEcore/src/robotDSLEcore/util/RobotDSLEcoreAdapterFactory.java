/**
 */
package robotDSLEcore.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robotDSLEcore.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robotDSLEcore.RobotDSLEcorePackage
 * @generated
 */
public class RobotDSLEcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotDSLEcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RobotDSLEcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotDSLEcoreSwitch<Adapter> modelSwitch =
		new RobotDSLEcoreSwitch<Adapter>() {
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseStatements(Statements object) {
				return createStatementsAdapter();
			}
			@Override
			public Adapter caseCommandStatement(CommandStatement object) {
				return createCommandStatementAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			@Override
			public Adapter caseRepeatStatement(RepeatStatement object) {
				return createRepeatStatementAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseTurnLeft(TurnLeft object) {
				return createTurnLeftAdapter();
			}
			@Override
			public Adapter caseDrop(Drop object) {
				return createDropAdapter();
			}
			@Override
			public Adapter casePick(Pick object) {
				return createPickAdapter();
			}
			@Override
			public Adapter caseTraceMessage(TraceMessage object) {
				return createTraceMessageAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseLogicalExps(LogicalExps object) {
				return createLogicalExpsAdapter();
			}
			@Override
			public Adapter caseFull(Full object) {
				return createFullAdapter();
			}
			@Override
			public Adapter caseMark(Mark object) {
				return createMarkAdapter();
			}
			@Override
			public Adapter caseWallAhead(WallAhead object) {
				return createWallAheadAdapter();
			}
			@Override
			public Adapter caseHeading(Heading object) {
				return createHeadingAdapter();
			}
			@Override
			public Adapter caseBuildStatements(BuildStatements object) {
				return createBuildStatementsAdapter();
			}
			@Override
			public Adapter caseDestroyWall(DestroyWall object) {
				return createDestroyWallAdapter();
			}
			@Override
			public Adapter casePickMark(PickMark object) {
				return createPickMarkAdapter();
			}
			@Override
			public Adapter caseDropMark(DropMark object) {
				return createDropMarkAdapter();
			}
			@Override
			public Adapter caseBuildWall(BuildWall object) {
				return createBuildWallAdapter();
			}
			@Override
			public Adapter caseBinaries(Binaries object) {
				return createBinariesAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseSingleLogalExp(SingleLogalExp object) {
				return createSingleLogalExpAdapter();
			}
			@Override
			public Adapter caseBinaryLogicalExp(BinaryLogicalExp object) {
				return createBinaryLogicalExpAdapter();
			}
			@Override
			public Adapter caseRunningStatements(RunningStatements object) {
				return createRunningStatementsAdapter();
			}
			@Override
			public Adapter caseElse(Else object) {
				return createElseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Statements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Statements
	 * @generated
	 */
	public Adapter createStatementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.CommandStatement <em>Command Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.CommandStatement
	 * @generated
	 */
	public Adapter createCommandStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.RepeatStatement
	 * @generated
	 */
	public Adapter createRepeatStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.TurnLeft
	 * @generated
	 */
	public Adapter createTurnLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Pick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Pick
	 * @generated
	 */
	public Adapter createPickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.TraceMessage <em>Trace Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.TraceMessage
	 * @generated
	 */
	public Adapter createTraceMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.LogicalExps <em>Logical Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.LogicalExps
	 * @generated
	 */
	public Adapter createLogicalExpsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Full <em>Full</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Full
	 * @generated
	 */
	public Adapter createFullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Mark
	 * @generated
	 */
	public Adapter createMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.WallAhead <em>Wall Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.WallAhead
	 * @generated
	 */
	public Adapter createWallAheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Heading
	 * @generated
	 */
	public Adapter createHeadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.BuildStatements <em>Build Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.BuildStatements
	 * @generated
	 */
	public Adapter createBuildStatementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.DestroyWall <em>Destroy Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.DestroyWall
	 * @generated
	 */
	public Adapter createDestroyWallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.PickMark <em>Pick Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.PickMark
	 * @generated
	 */
	public Adapter createPickMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.DropMark <em>Drop Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.DropMark
	 * @generated
	 */
	public Adapter createDropMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.BuildWall <em>Build Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.BuildWall
	 * @generated
	 */
	public Adapter createBuildWallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Binaries <em>Binaries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Binaries
	 * @generated
	 */
	public Adapter createBinariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.SingleLogalExp <em>Single Logal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.SingleLogalExp
	 * @generated
	 */
	public Adapter createSingleLogalExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.BinaryLogicalExp <em>Binary Logical Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.BinaryLogicalExp
	 * @generated
	 */
	public Adapter createBinaryLogicalExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.RunningStatements <em>Running Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.RunningStatements
	 * @generated
	 */
	public Adapter createRunningStatementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSLEcore.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSLEcore.Else
	 * @generated
	 */
	public Adapter createElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RobotDSLEcoreAdapterFactory
