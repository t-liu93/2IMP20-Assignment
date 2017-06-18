/**
 */
package robotDSLEcore.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import robotDSLEcore.Else;
import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.RunningStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.ElseImpl#getRunningstatements <em>Runningstatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElseImpl extends MinimalEObjectImpl.Container implements Else {
	/**
	 * The cached value of the '{@link #getRunningstatements() <em>Runningstatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<RunningStatements> runningstatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLEcorePackage.Literals.ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunningStatements> getRunningstatements() {
		if (runningstatements == null) {
			runningstatements = new EObjectContainmentEList<RunningStatements>(RunningStatements.class, this, RobotDSLEcorePackage.ELSE__RUNNINGSTATEMENTS);
		}
		return runningstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotDSLEcorePackage.ELSE__RUNNINGSTATEMENTS:
				return ((InternalEList<?>)getRunningstatements()).basicRemove(otherEnd, msgs);
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
			case RobotDSLEcorePackage.ELSE__RUNNINGSTATEMENTS:
				return getRunningstatements();
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
			case RobotDSLEcorePackage.ELSE__RUNNINGSTATEMENTS:
				getRunningstatements().clear();
				getRunningstatements().addAll((Collection<? extends RunningStatements>)newValue);
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
			case RobotDSLEcorePackage.ELSE__RUNNINGSTATEMENTS:
				getRunningstatements().clear();
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
			case RobotDSLEcorePackage.ELSE__RUNNINGSTATEMENTS:
				return runningstatements != null && !runningstatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElseImpl
