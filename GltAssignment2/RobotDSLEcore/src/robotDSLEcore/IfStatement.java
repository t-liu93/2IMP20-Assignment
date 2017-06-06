/**
 */
package robotDSLEcore;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.IfStatement#getLogicalexps <em>Logicalexps</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statements {

	/**
	 * Returns the value of the '<em><b>Logicalexps</b></em>' containment reference list.
	 * The list contents are of type {@link robotDSLEcore.LogicalExps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logicalexps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicalexps</em>' containment reference list.
	 * @see robotDSLEcore.RobotDSLEcorePackage#getIfStatement_Logicalexps()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalExps> getLogicalexps();
} // IfStatement
