/**
 */
package robotDSLEcore;

import org.eclipse.emf.common.util.EList;


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
 *   <li>{@link robotDSLEcore.RepeatStatement#getCommandstatement <em>Commandstatement</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends RunningStatements {

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

	/**
	 * Returns the value of the '<em><b>Commandstatement</b></em>' containment reference list.
	 * The list contents are of type {@link robotDSLEcore.CommandStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commandstatement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commandstatement</em>' containment reference list.
	 * @see robotDSLEcore.RobotDSLEcorePackage#getRepeatStatement_Commandstatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandStatement> getCommandstatement();
} // RepeatStatement
