/**
 */
package robotDSLEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.Statements#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getStatements()
 * @model
 * @generated
 */
public interface Statements extends EObject {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference list.
	 * The list contents are of type {@link robotDSLEcore.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference list.
	 * @see robotDSLEcore.RobotDSLEcorePackage#getStatements_Script()
	 * @model
	 * @generated
	 */
	EList<Script> getScript();

} // Statements
