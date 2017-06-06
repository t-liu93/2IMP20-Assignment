/**
 */
package robotDSLEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Exps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.LogicalExps#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getLogicalExps()
 * @model
 * @generated
 */
public interface LogicalExps extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"north"</code>.
	 * The literals are from the enumeration {@link robotDSLEcore.Directions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see robotDSLEcore.Directions
	 * @see #setDirection(Directions)
	 * @see robotDSLEcore.RobotDSLEcorePackage#getLogicalExps_Direction()
	 * @model default="north"
	 * @generated
	 */
	Directions getDirection();

	/**
	 * Sets the value of the '{@link robotDSLEcore.LogicalExps#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see robotDSLEcore.Directions
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Directions value);

} // LogicalExps
