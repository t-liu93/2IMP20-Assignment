/**
 */
package robotDSLEcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Logical Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.BinaryLogicalExp#getBinaries <em>Binaries</em>}</li>
 *   <li>{@link robotDSLEcore.BinaryLogicalExp#getSinglelogalexp <em>Singlelogalexp</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getBinaryLogicalExp()
 * @model
 * @generated
 */
public interface BinaryLogicalExp extends LogicalExps {
	/**
	 * Returns the value of the '<em><b>Binaries</b></em>' containment reference list.
	 * The list contents are of type {@link robotDSLEcore.Binaries}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binaries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binaries</em>' containment reference list.
	 * @see robotDSLEcore.RobotDSLEcorePackage#getBinaryLogicalExp_Binaries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Binaries> getBinaries();

	/**
	 * Returns the value of the '<em><b>Singlelogalexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singlelogalexp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singlelogalexp</em>' containment reference.
	 * @see #setSinglelogalexp(SingleLogalExp)
	 * @see robotDSLEcore.RobotDSLEcorePackage#getBinaryLogicalExp_Singlelogalexp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleLogalExp getSinglelogalexp();

	/**
	 * Sets the value of the '{@link robotDSLEcore.BinaryLogicalExp#getSinglelogalexp <em>Singlelogalexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singlelogalexp</em>' containment reference.
	 * @see #getSinglelogalexp()
	 * @generated
	 */
	void setSinglelogalexp(SingleLogalExp value);

} // BinaryLogicalExp
