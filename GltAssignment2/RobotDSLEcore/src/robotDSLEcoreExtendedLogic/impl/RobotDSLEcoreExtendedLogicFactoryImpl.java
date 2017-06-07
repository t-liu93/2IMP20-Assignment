/**
 */
package robotDSLEcoreExtendedLogic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotDSLEcoreExtendedLogic.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotDSLEcoreExtendedLogicFactoryImpl extends EFactoryImpl implements RobotDSLEcoreExtendedLogicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotDSLEcoreExtendedLogicFactory init() {
		try {
			RobotDSLEcoreExtendedLogicFactory theRobotDSLEcoreExtendedLogicFactory = (RobotDSLEcoreExtendedLogicFactory)EPackage.Registry.INSTANCE.getEFactory(RobotDSLEcoreExtendedLogicPackage.eNS_URI);
			if (theRobotDSLEcoreExtendedLogicFactory != null) {
				return theRobotDSLEcoreExtendedLogicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotDSLEcoreExtendedLogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcoreExtendedLogicFactoryImpl() {
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
			case RobotDSLEcoreExtendedLogicPackage.LOGIC_EXP_EXTENDED: return createLogicExpExtended();
			case RobotDSLEcoreExtendedLogicPackage.BINARIES: return createBinaries();
			case RobotDSLEcoreExtendedLogicPackage.NOT: return createNot();
			case RobotDSLEcoreExtendedLogicPackage.AND: return createAnd();
			case RobotDSLEcoreExtendedLogicPackage.OR: return createOr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicExpExtended createLogicExpExtended() {
		LogicExpExtendedImpl logicExpExtended = new LogicExpExtendedImpl();
		return logicExpExtended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binaries createBinaries() {
		BinariesImpl binaries = new BinariesImpl();
		return binaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLEcoreExtendedLogicPackage getRobotDSLEcoreExtendedLogicPackage() {
		return (RobotDSLEcoreExtendedLogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotDSLEcoreExtendedLogicPackage getPackage() {
		return RobotDSLEcoreExtendedLogicPackage.eINSTANCE;
	}

} //RobotDSLEcoreExtendedLogicFactoryImpl
