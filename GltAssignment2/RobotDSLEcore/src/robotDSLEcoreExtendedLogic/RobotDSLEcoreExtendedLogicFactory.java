/**
 */
package robotDSLEcoreExtendedLogic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robotDSLEcoreExtendedLogic.RobotDSLEcoreExtendedLogicPackage
 * @generated
 */
public interface RobotDSLEcoreExtendedLogicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotDSLEcoreExtendedLogicFactory eINSTANCE = robotDSLEcoreExtendedLogic.impl.RobotDSLEcoreExtendedLogicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logic Exp Extended</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Exp Extended</em>'.
	 * @generated
	 */
	LogicExpExtended createLogicExpExtended();

	/**
	 * Returns a new object of class '<em>Binaries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binaries</em>'.
	 * @generated
	 */
	Binaries createBinaries();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobotDSLEcoreExtendedLogicPackage getRobotDSLEcoreExtendedLogicPackage();

} //RobotDSLEcoreExtendedLogicFactory
