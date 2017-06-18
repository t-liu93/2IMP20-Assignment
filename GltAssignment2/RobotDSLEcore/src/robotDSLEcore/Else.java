/**
 */
package robotDSLEcore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.Else#getRunningstatements <em>Runningstatements</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getElse()
 * @model
 * @generated
 */
public interface Else extends EObject {

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
	 * @see robotDSLEcore.RobotDSLEcorePackage#getElse_Runningstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunningStatements> getRunningstatements();
} // Else
