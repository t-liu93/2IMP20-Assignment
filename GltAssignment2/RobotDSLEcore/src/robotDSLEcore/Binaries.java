/**
 */
package robotDSLEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binaries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.Binaries#getSinglelogalexp <em>Singlelogalexp</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getBinaries()
 * @model
 * @generated
 */
public interface Binaries extends EObject {

	/**
	 * Returns the value of the '<em><b>Singlelogalexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singlelogalexp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singlelogalexp</em>' containment reference.
	 * @see #setSinglelogalexp(SingleLogalExp)
	 * @see robotDSLEcore.RobotDSLEcorePackage#getBinaries_Singlelogalexp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleLogalExp getSinglelogalexp();

	/**
	 * Sets the value of the '{@link robotDSLEcore.Binaries#getSinglelogalexp <em>Singlelogalexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singlelogalexp</em>' containment reference.
	 * @see #getSinglelogalexp()
	 * @generated
	 */
	void setSinglelogalexp(SingleLogalExp value);
} // Binaries
