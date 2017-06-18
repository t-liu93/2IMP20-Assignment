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
 *   <li>{@link robotDSLEcore.Heading#getNot <em>Not</em>}</li>
 * </ul>
 *
 * @see robotDSLEcore.RobotDSLEcorePackage#getHeading()
 * @model
 * @generated
 */
public interface Heading extends SingleLogalExp {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"default"</code>.
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
	 * @model default="default"
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

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(Not)
	 * @see robotDSLEcore.RobotDSLEcorePackage#getHeading_Not()
	 * @model containment="true"
	 * @generated
	 */
	Not getNot();

	/**
	 * Sets the value of the '{@link robotDSLEcore.Heading#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(Not value);

} // Heading
