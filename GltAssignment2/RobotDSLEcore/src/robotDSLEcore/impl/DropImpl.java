/**
 */
package robotDSLEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotDSLEcore.Drop;
import robotDSLEcore.RobotDSLEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.DropImpl#getDrop <em>Drop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropImpl extends CommandStatementImpl implements Drop {
	/**
	 * The default value of the '{@link #getDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected static final String DROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected String drop = DROP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLEcorePackage.Literals.DROP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDrop() {
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrop(String newDrop) {
		String oldDrop = drop;
		drop = newDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.DROP__DROP, oldDrop, drop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotDSLEcorePackage.DROP__DROP:
				return getDrop();
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
			case RobotDSLEcorePackage.DROP__DROP:
				setDrop((String)newValue);
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
			case RobotDSLEcorePackage.DROP__DROP:
				setDrop(DROP_EDEFAULT);
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
			case RobotDSLEcorePackage.DROP__DROP:
				return DROP_EDEFAULT == null ? drop != null : !DROP_EDEFAULT.equals(drop);
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
		result.append(" (drop: ");
		result.append(drop);
		result.append(')');
		return result.toString();
	}

} //DropImpl
