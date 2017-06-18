/**
 */
package robotDSLEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotDSLEcore.Binaries;
import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.SingleLogalExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binaries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.BinariesImpl#getSinglelogalexp <em>Singlelogalexp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinariesImpl extends MinimalEObjectImpl.Container implements Binaries {
	/**
	 * The cached value of the '{@link #getSinglelogalexp() <em>Singlelogalexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglelogalexp()
	 * @generated
	 * @ordered
	 */
	protected SingleLogalExp singlelogalexp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinariesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLEcorePackage.Literals.BINARIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLogalExp getSinglelogalexp() {
		return singlelogalexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSinglelogalexp(SingleLogalExp newSinglelogalexp, NotificationChain msgs) {
		SingleLogalExp oldSinglelogalexp = singlelogalexp;
		singlelogalexp = newSinglelogalexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP, oldSinglelogalexp, newSinglelogalexp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinglelogalexp(SingleLogalExp newSinglelogalexp) {
		if (newSinglelogalexp != singlelogalexp) {
			NotificationChain msgs = null;
			if (singlelogalexp != null)
				msgs = ((InternalEObject)singlelogalexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP, null, msgs);
			if (newSinglelogalexp != null)
				msgs = ((InternalEObject)newSinglelogalexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP, null, msgs);
			msgs = basicSetSinglelogalexp(newSinglelogalexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP, newSinglelogalexp, newSinglelogalexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP:
				return basicSetSinglelogalexp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP:
				return getSinglelogalexp();
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
			case RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP:
				setSinglelogalexp((SingleLogalExp)newValue);
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
			case RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP:
				setSinglelogalexp((SingleLogalExp)null);
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
			case RobotDSLEcorePackage.BINARIES__SINGLELOGALEXP:
				return singlelogalexp != null;
		}
		return super.eIsSet(featureID);
	}

} //BinariesImpl
