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
import robotDSLEcore.LogicalExps;
import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.RunningStatements;
import robotDSLEcore.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.WhileStatementImpl#getLogicalexps <em>Logicalexps</em>}</li>
 *   <li>{@link robotDSLEcore.impl.WhileStatementImpl#getRunningstatements <em>Runningstatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileStatementImpl extends RunningStatementsImpl implements WhileStatement {
	/**
	 * The cached value of the '{@link #getLogicalexps() <em>Logicalexps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalexps()
	 * @generated
	 * @ordered
	 */
	protected LogicalExps logicalexps;
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
	protected WhileStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLEcorePackage.Literals.WHILE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExps getLogicalexps() {
		return logicalexps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalexps(LogicalExps newLogicalexps, NotificationChain msgs) {
		LogicalExps oldLogicalexps = logicalexps;
		logicalexps = newLogicalexps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS, oldLogicalexps, newLogicalexps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalexps(LogicalExps newLogicalexps) {
		if (newLogicalexps != logicalexps) {
			NotificationChain msgs = null;
			if (logicalexps != null)
				msgs = ((InternalEObject)logicalexps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS, null, msgs);
			if (newLogicalexps != null)
				msgs = ((InternalEObject)newLogicalexps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS, null, msgs);
			msgs = basicSetLogicalexps(newLogicalexps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS, newLogicalexps, newLogicalexps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunningStatements> getRunningstatements() {
		if (runningstatements == null) {
			runningstatements = new EObjectContainmentEList<RunningStatements>(RunningStatements.class, this, RobotDSLEcorePackage.WHILE_STATEMENT__RUNNINGSTATEMENTS);
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
			case RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS:
				return basicSetLogicalexps(null, msgs);
			case RobotDSLEcorePackage.WHILE_STATEMENT__RUNNINGSTATEMENTS:
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
			case RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS:
				return getLogicalexps();
			case RobotDSLEcorePackage.WHILE_STATEMENT__RUNNINGSTATEMENTS:
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
			case RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS:
				setLogicalexps((LogicalExps)newValue);
				return;
			case RobotDSLEcorePackage.WHILE_STATEMENT__RUNNINGSTATEMENTS:
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
			case RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS:
				setLogicalexps((LogicalExps)null);
				return;
			case RobotDSLEcorePackage.WHILE_STATEMENT__RUNNINGSTATEMENTS:
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
			case RobotDSLEcorePackage.WHILE_STATEMENT__LOGICALEXPS:
				return logicalexps != null;
			case RobotDSLEcorePackage.WHILE_STATEMENT__RUNNINGSTATEMENTS:
				return runningstatements != null && !runningstatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhileStatementImpl
