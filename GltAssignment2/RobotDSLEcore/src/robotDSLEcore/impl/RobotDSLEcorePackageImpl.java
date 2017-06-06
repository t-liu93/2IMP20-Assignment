/**
 */
package robotDSLEcore.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robotDSLEcore.CommandStatement;
import robotDSLEcore.Comment;
import robotDSLEcore.Directions;
import robotDSLEcore.Drop;
import robotDSLEcore.IfStatement;
import robotDSLEcore.LogicalExps;
import robotDSLEcore.Pick;
import robotDSLEcore.RepeatStatement;
import robotDSLEcore.RobotDSLEcoreFactory;
import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.Script;
import robotDSLEcore.Statements;
import robotDSLEcore.Step;
import robotDSLEcore.TraceMessage;
import robotDSLEcore.TurnLeft;
import robotDSLEcore.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotDSLEcorePackageImpl extends EPackageImpl implements RobotDSLEcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnLeftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robotDSLEcore.RobotDSLEcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotDSLEcorePackageImpl() {
		super(eNS_URI, RobotDSLEcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RobotDSLEcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotDSLEcorePackage init() {
		if (isInited) return (RobotDSLEcorePackage)EPackage.Registry.INSTANCE.getEPackage(RobotDSLEcorePackage.eNS_URI);

		// Obtain or create and register package
		RobotDSLEcorePackageImpl theRobotDSLEcorePackage = (RobotDSLEcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RobotDSLEcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RobotDSLEcorePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRobotDSLEcorePackage.createPackageContents();

		// Initialize created meta-data
		theRobotDSLEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotDSLEcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotDSLEcorePackage.eNS_URI, theRobotDSLEcorePackage);
		return theRobotDSLEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Name() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Statements() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatements() {
		return statementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandStatement() {
		return commandStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Logicalexps() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatStatement() {
		return repeatStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatStatement_Time() {
		return (EAttribute)repeatStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnLeft() {
		return turnLeftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrop() {
		return dropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPick() {
		return pickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceMessage() {
		return traceMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceMessage_Message() {
		return (EAttribute)traceMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExps() {
		return logicalExpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalExps_Direction() {
		return (EAttribute)logicalExpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirections() {
		return directionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcoreFactory getRobotDSLEcoreFactory() {
		return (RobotDSLEcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__NAME);
		createEReference(scriptEClass, SCRIPT__STATEMENTS);

		statementsEClass = createEClass(STATEMENTS);

		commandStatementEClass = createEClass(COMMAND_STATEMENT);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__LOGICALEXPS);

		whileStatementEClass = createEClass(WHILE_STATEMENT);

		repeatStatementEClass = createEClass(REPEAT_STATEMENT);
		createEAttribute(repeatStatementEClass, REPEAT_STATEMENT__TIME);

		stepEClass = createEClass(STEP);

		turnLeftEClass = createEClass(TURN_LEFT);

		dropEClass = createEClass(DROP);

		pickEClass = createEClass(PICK);

		traceMessageEClass = createEClass(TRACE_MESSAGE);
		createEAttribute(traceMessageEClass, TRACE_MESSAGE__MESSAGE);

		commentEClass = createEClass(COMMENT);

		logicalExpsEClass = createEClass(LOGICAL_EXPS);
		createEAttribute(logicalExpsEClass, LOGICAL_EXPS__DIRECTION);

		// Create enums
		directionsEEnum = createEEnum(DIRECTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commandStatementEClass.getESuperTypes().add(this.getStatements());
		ifStatementEClass.getESuperTypes().add(this.getStatements());
		whileStatementEClass.getESuperTypes().add(this.getStatements());
		repeatStatementEClass.getESuperTypes().add(this.getStatements());
		stepEClass.getESuperTypes().add(this.getCommandStatement());
		turnLeftEClass.getESuperTypes().add(this.getCommandStatement());
		dropEClass.getESuperTypes().add(this.getCommandStatement());
		pickEClass.getESuperTypes().add(this.getCommandStatement());
		traceMessageEClass.getESuperTypes().add(this.getCommandStatement());
		commentEClass.getESuperTypes().add(this.getCommandStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Name(), ecorePackage.getEString(), "name", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScript_Statements(), this.getStatements(), null, "statements", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementsEClass, Statements.class, "Statements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandStatementEClass, CommandStatement.class, "CommandStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Logicalexps(), this.getLogicalExps(), null, "logicalexps", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatStatementEClass, RepeatStatement.class, "RepeatStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatStatement_Time(), ecorePackage.getEInt(), "time", null, 0, 1, RepeatStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnLeftEClass, TurnLeft.class, "TurnLeft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropEClass, Drop.class, "Drop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pickEClass, Pick.class, "Pick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traceMessageEClass, TraceMessage.class, "TraceMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, TraceMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalExpsEClass, LogicalExps.class, "LogicalExps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalExps_Direction(), this.getDirections(), "direction", "north", 0, 1, LogicalExps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionsEEnum, Directions.class, "Directions");
		addEEnumLiteral(directionsEEnum, Directions.SOUTH);
		addEEnumLiteral(directionsEEnum, Directions.NORTH);
		addEEnumLiteral(directionsEEnum, Directions.WEST);
		addEEnumLiteral(directionsEEnum, Directions.EAST);

		// Create resource
		createResource(eNS_URI);
	}

} //RobotDSLEcorePackageImpl
