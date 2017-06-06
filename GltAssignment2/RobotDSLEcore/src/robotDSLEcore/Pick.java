/**
 */
package robotDSLEcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.Pick#getPick <em>Pick</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getPick()
 * @model
 * @generated
 */
public interface Pick extends CommandStatement {
	/**
	 * Returns the value of the '<em><b>Pick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick</em>' attribute.
	 * @see #setPick(String)
	 * @see robotDSLEcore.RobotDSLEcorePackage#getPick_Pick()
	 * @model
	 * @generated
	 */
	String getPick();

	/**
	 * Sets the value of the '{@link robotDSLEcore.Pick#getPick <em>Pick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick</em>' attribute.
	 * @see #getPick()
	 * @generated
	 */
	void setPick(String value);

} // Pick
