/**
 */
package robotDSLEcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.RepeatStatement#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends Statements {

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see robotDSLEcore.RobotDSLEcorePackage#getRepeatStatement_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link robotDSLEcore.RepeatStatement#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);
} // RepeatStatement
