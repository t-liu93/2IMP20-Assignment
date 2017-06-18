/**
 */
package robotDSLEcore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robotDSLEcore.Binaries;
import robotDSLEcore.BinaryLogicalExp;
import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.SingleLogalExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Logical Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.BinaryLogicalExpImpl#getBinaries <em>Binaries</em>}</li>
 *   <li>{@link robotDSLEcore.impl.BinaryLogicalExpImpl#getSinglelogalexp <em>Singlelogalexp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryLogicalExpImpl extends LogicalExpsImpl implements BinaryLogicalExp {
	/**
	 * The cached value of the '{@link #getBinaries() <em>Binaries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaries()
	 * @generated
	 * @ordered
	 */
	protected EList<Binaries> binaries;

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
	protected BinaryLogicalExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLEcorePackage.Literals.BINARY_LOGICAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binaries> getBinaries() {
		if (binaries == null) {
			binaries = new EObjectContainmentEList<Binaries>(Binaries.class, this, RobotDSLEcorePackage.BINARY_LOGICAL_EXP__BINARIES);
		}
		return binaries;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP, oldSinglelogalexp, newSinglelogalexp);
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
				msgs = ((InternalEObject)singlelogalexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP, null, msgs);
			if (newSinglelogalexp != null)
				msgs = ((InternalEObject)newSinglelogalexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP, null, msgs);
			msgs = basicSetSinglelogalexp(newSinglelogalexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP, newSinglelogalexp, newSinglelogalexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__BINARIES:
				return ((InternalEList<?>)getBinaries()).basicRemove(otherEnd, msgs);
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP:
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
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__BINARIES:
				return getBinaries();
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP:
				return getSinglelogalexp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__BINARIES:
				getBinaries().clear();
				getBinaries().addAll((Collection<? extends Binaries>)newValue);
				return;
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP:
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
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__BINARIES:
				getBinaries().clear();
				return;
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP:
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
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__BINARIES:
				return binaries != null && !binaries.isEmpty();
			case RobotDSLEcorePackage.BINARY_LOGICAL_EXP__SINGLELOGALEXP:
				return singlelogalexp != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryLogicalExpImpl
