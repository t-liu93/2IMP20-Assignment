/**
 */
package robotDSLEcoreExtendedLogic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robotDSLEcore.RobotDSLEcorePackage;

import robotDSLEcore.impl.RobotDSLEcorePackageImpl;

import robotDSLEcoreExtendedLogic.And;
import robotDSLEcoreExtendedLogic.Binaries;
import robotDSLEcoreExtendedLogic.LogicExpExtended;
import robotDSLEcoreExtendedLogic.Not;
import robotDSLEcoreExtendedLogic.Or;
import robotDSLEcoreExtendedLogic.RobotDSLEcoreExtendedLogicFactory;
import robotDSLEcoreExtendedLogic.RobotDSLEcoreExtendedLogicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotDSLEcoreExtendedLogicPackageImpl extends EPackageImpl implements RobotDSLEcoreExtendedLogicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicExpExtendedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

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
	 * @see robotDSLEcoreExtendedLogic.RobotDSLEcoreExtendedLogicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotDSLEcoreExtendedLogicPackageImpl() {
		super(eNS_URI, RobotDSLEcoreExtendedLogicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RobotDSLEcoreExtendedLogicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotDSLEcoreExtendedLogicPackage init() {
		if (isInited) return (RobotDSLEcoreExtendedLogicPackage)EPackage.Registry.INSTANCE.getEPackage(RobotDSLEcoreExtendedLogicPackage.eNS_URI);

		// Obtain or create and register package
		RobotDSLEcoreExtendedLogicPackageImpl theRobotDSLEcoreExtendedLogicPackage = (RobotDSLEcoreExtendedLogicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RobotDSLEcoreExtendedLogicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RobotDSLEcoreExtendedLogicPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RobotDSLEcorePackageImpl theRobotDSLEcorePackage = (RobotDSLEcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RobotDSLEcorePackage.eNS_URI) instanceof RobotDSLEcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RobotDSLEcorePackage.eNS_URI) : RobotDSLEcorePackage.eINSTANCE);

		// Create package meta-data objects
		theRobotDSLEcoreExtendedLogicPackage.createPackageContents();
		theRobotDSLEcorePackage.createPackageContents();

		// Initialize created meta-data
		theRobotDSLEcoreExtendedLogicPackage.initializePackageContents();
		theRobotDSLEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotDSLEcoreExtendedLogicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotDSLEcoreExtendedLogicPackage.eNS_URI, theRobotDSLEcoreExtendedLogicPackage);
		return theRobotDSLEcoreExtendedLogicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicExpExtended() {
		return logicExpExtendedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaries() {
		return binariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcoreExtendedLogicFactory getRobotDSLEcoreExtendedLogicFactory() {
		return (RobotDSLEcoreExtendedLogicFactory)getEFactoryInstance();
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
		logicExpExtendedEClass = createEClass(LOGIC_EXP_EXTENDED);

		binariesEClass = createEClass(BINARIES);

		notEClass = createEClass(NOT);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);
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

		// Obtain other dependent packages
		RobotDSLEcorePackage theRobotDSLEcorePackage = (RobotDSLEcorePackage)EPackage.Registry.INSTANCE.getEPackage(RobotDSLEcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logicExpExtendedEClass.getESuperTypes().add(theRobotDSLEcorePackage.getLogicalExps());
		binariesEClass.getESuperTypes().add(this.getLogicExpExtended());
		notEClass.getESuperTypes().add(this.getLogicExpExtended());
		andEClass.getESuperTypes().add(this.getBinaries());
		orEClass.getESuperTypes().add(this.getBinaries());

		// Initialize classes and features; add operations and parameters
		initEClass(logicExpExtendedEClass, LogicExpExtended.class, "LogicExpExtended", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binariesEClass, Binaries.class, "Binaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RobotDSLEcoreExtendedLogicPackageImpl
