/**
 */
package robotDSLEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.TurnLeft;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn Left</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.TurnLeftImpl#getTurnLeft <em>Turn Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnLeftImpl extends CommandStatementImpl implements TurnLeft {
	/**
	 * The default value of the '{@link #getTurnLeft() <em>Turn Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String TURN_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTurnLeft() <em>Turn Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnLeft()
	 * @generated
	 * @ordered
	 */
	protected String turnLeft = TURN_LEFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnLeftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLEcorePackage.Literals.TURN_LEFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTurnLeft() {
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnLeft(String newTurnLeft) {
		String oldTurnLeft = turnLeft;
		turnLeft = newTurnLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.TURN_LEFT__TURN_LEFT, oldTurnLeft, turnLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotDSLEcorePackage.TURN_LEFT__TURN_LEFT:
				return getTurnLeft();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RobotDSLEcorePackage.TURN_LEFT__TURN_LEFT:
				setTurnLeft((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RobotDSLEcorePackage.TURN_LEFT__TURN_LEFT:
				setTurnLeft(TURN_LEFT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RobotDSLEcorePackage.TURN_LEFT__TURN_LEFT:
				return TURN_LEFT_EDEFAULT == null ? turnLeft != null : !TURN_LEFT_EDEFAULT.equals(turnLeft);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (turnLeft: ");
		result.append(turnLeft);
		result.append(')');
		return result.toString();
	}

} //TurnLeftImpl
