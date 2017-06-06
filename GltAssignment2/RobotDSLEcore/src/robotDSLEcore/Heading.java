/**
 */
package robotDSLEcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.Heading#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getHeading()
 * @model
 * @generated
 */
public interface Heading extends LogicalExps {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
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
	 * @see robotDSLEcore.RobotDSLEcorePackage#getHeading_Direction()
	 * @model
	 * @generated
	 */
	Directions getDirection();

	/**
	 * Sets the value of the '{@link robotDSLEcore.Heading#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see robotDSLEcore.Directions
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Directions value);

} // Heading
