/**
 */
package robotDSLEcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.WhileStatement#getLogicalexps <em>Logicalexps</em>}</li>
 *   <li>{@link robotDSLEcore.WhileStatement#getRunningstatements <em>Runningstatements</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends RunningStatements {

	/**
	 * Returns the value of the '<em><b>Logicalexps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logicalexps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicalexps</em>' containment reference.
	 * @see #setLogicalexps(LogicalExps)
	 * @see robotDSLEcore.RobotDSLEcorePackage#getWhileStatement_Logicalexps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicalExps getLogicalexps();

	/**
	 * Sets the value of the '{@link robotDSLEcore.WhileStatement#getLogicalexps <em>Logicalexps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logicalexps</em>' containment reference.
	 * @see #getLogicalexps()
	 * @generated
	 */
	void setLogicalexps(LogicalExps value);

	/**
	 * Returns the value of the '<em><b>Runningstatements</b></em>' containment reference list.
	 * The list contents are of type {@link robotDSLEcore.RunningStatements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runningstatements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runningstatements</em>' containment reference list.
	 * @see robotDSLEcore.RobotDSLEcorePackage#getWhileStatement_Runningstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunningStatements> getRunningstatements();
} // WhileStatement
