/**
 */
package robotDSLEcoreExtendedLogic;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import robotDSLEcore.RobotDSLEcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotDSLEcoreExtendedLogic.RobotDSLEcoreExtendedLogicFactory
 * @model kind="package"
 * @generated
 */
public interface RobotDSLEcoreExtendedLogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotDSLEcoreExtendedLogic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "robotDSLEcoreExtendedLogic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotDSLEcoreExtendedLogic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotDSLEcoreExtendedLogicPackage eINSTANCE = robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link robotDSLEcoreExtendedLogic.impl.LogicExpExtendedImpl <em>Logic Exp Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcoreExtendedLogic.impl.LogicExpExtendedImpl
	 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getLogicExpExtended()
	 * @generated
	 */
	int LOGIC_EXP_EXTENDED = 0;

	/**
	 * The number of structural features of the '<em>Logic Exp Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_EXP_EXTENDED_FEATURE_COUNT = RobotDSLEcorePackage.LOGICAL_EXPS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcoreExtendedLogic.impl.BinariesImpl <em>Binaries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcoreExtendedLogic.impl.BinariesImpl
	 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getBinaries()
	 * @generated
	 */
	int BINARIES = 1;

	/**
	 * The number of structural features of the '<em>Binaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARIES_FEATURE_COUNT = LOGIC_EXP_EXTENDED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcoreExtendedLogic.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcoreExtendedLogic.impl.NotImpl
	 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 2;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = LOGIC_EXP_EXTENDED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcoreExtendedLogic.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcoreExtendedLogic.impl.AndImpl
	 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 3;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSLEcoreExtendedLogic.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSLEcoreExtendedLogic.impl.OrImpl
	 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getOr()
	 * @generated
	 */
	int OR = 4;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link robotDSLEcoreExtendedLogic.LogicExpExtended <em>Logic Exp Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Exp Extended</em>'.
	 * @see robotDSLEcoreExtendedLogic.LogicExpExtended
	 * @generated
	 */
	EClass getLogicExpExtended();

	/**
	 * Returns the meta object for class '{@link robotDSLEcoreExtendedLogic.Binaries <em>Binaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binaries</em>'.
	 * @see robotDSLEcoreExtendedLogic.Binaries
	 * @generated
	 */
	EClass getBinaries();

	/**
	 * Returns the meta object for class '{@link robotDSLEcoreExtendedLogic.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see robotDSLEcoreExtendedLogic.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link robotDSLEcoreExtendedLogic.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see robotDSLEcoreExtendedLogic.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link robotDSLEcoreExtendedLogic.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see robotDSLEcoreExtendedLogic.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotDSLEcoreExtendedLogicFactory getRobotDSLEcoreExtendedLogicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotDSLEcoreExtendedLogic.impl.LogicExpExtendedImpl <em>Logic Exp Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcoreExtendedLogic.impl.LogicExpExtendedImpl
		 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getLogicExpExtended()
		 * @generated
		 */
		EClass LOGIC_EXP_EXTENDED = eINSTANCE.getLogicExpExtended();

		/**
		 * The meta object literal for the '{@link robotDSLEcoreExtendedLogic.impl.BinariesImpl <em>Binaries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcoreExtendedLogic.impl.BinariesImpl
		 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getBinaries()
		 * @generated
		 */
		EClass BINARIES = eINSTANCE.getBinaries();

		/**
		 * The meta object literal for the '{@link robotDSLEcoreExtendedLogic.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcoreExtendedLogic.impl.NotImpl
		 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link robotDSLEcoreExtendedLogic.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcoreExtendedLogic.impl.AndImpl
		 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link robotDSLEcoreExtendedLogic.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSLEcoreExtendedLogic.impl.OrImpl
		 * @see robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

	}

} //RobotDSLEcoreExtendedLogicPackage
