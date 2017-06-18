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
import robotDSLEcore.Else;
import robotDSLEcore.IfStatement;
import robotDSLEcore.LogicalExps;
import robotDSLEcore.RobotDSLEcorePackage;
import robotDSLEcore.RunningStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.IfStatementImpl#getLogicalexps <em>Logicalexps</em>}</li>
 *   <li>{@link robotDSLEcore.impl.IfStatementImpl#getRunningstatements <em>Runningstatements</em>}</li>
 *   <li>{@link robotDSLEcore.impl.IfStatementImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends RunningStatementsImpl implements IfStatement {
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
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Else else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLEcorePackage.Literals.IF_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS, oldLogicalexps, newLogicalexps);
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
				msgs = ((InternalEObject)logicalexps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS, null, msgs);
			if (newLogicalexps != null)
				msgs = ((InternalEObject)newLogicalexps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS, null, msgs);
			msgs = basicSetLogicalexps(newLogicalexps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS, newLogicalexps, newLogicalexps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunningStatements> getRunningstatements() {
		if (runningstatements == null) {
			runningstatements = new EObjectContainmentEList<RunningStatements>(RunningStatements.class, this, RobotDSLEcorePackage.IF_STATEMENT__RUNNINGSTATEMENTS);
		}
		return runningstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Else newElse, NotificationChain msgs) {
		Else oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.IF_STATEMENT__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Else newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.IF_STATEMENT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLEcorePackage.IF_STATEMENT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLEcorePackage.IF_STATEMENT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS:
				return basicSetLogicalexps(null, msgs);
			case RobotDSLEcorePackage.IF_STATEMENT__RUNNINGSTATEMENTS:
				return ((InternalEList<?>)getRunningstatements()).basicRemove(otherEnd, msgs);
			case RobotDSLEcorePackage.IF_STATEMENT__ELSE:
				return basicSetElse(null, msgs);
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
			case RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS:
				return getLogicalexps();
			case RobotDSLEcorePackage.IF_STATEMENT__RUNNINGSTATEMENTS:
				return getRunningstatements();
			case RobotDSLEcorePackage.IF_STATEMENT__ELSE:
				return getElse();
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
			case RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS:
				setLogicalexps((LogicalExps)newValue);
				return;
			case RobotDSLEcorePackage.IF_STATEMENT__RUNNINGSTATEMENTS:
				getRunningstatements().clear();
				getRunningstatements().addAll((Collection<? extends RunningStatements>)newValue);
				return;
			case RobotDSLEcorePackage.IF_STATEMENT__ELSE:
				setElse((Else)newValue);
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
			case RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS:
				setLogicalexps((LogicalExps)null);
				return;
			case RobotDSLEcorePackage.IF_STATEMENT__RUNNINGSTATEMENTS:
				getRunningstatements().clear();
				return;
			case RobotDSLEcorePackage.IF_STATEMENT__ELSE:
				setElse((Else)null);
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
			case RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS:
				return logicalexps != null;
			case RobotDSLEcorePackage.IF_STATEMENT__RUNNINGSTATEMENTS:
				return runningstatements != null && !runningstatements.isEmpty();
			case RobotDSLEcorePackage.IF_STATEMENT__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
