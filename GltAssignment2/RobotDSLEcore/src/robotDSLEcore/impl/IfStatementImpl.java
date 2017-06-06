/**
 */
package robotDSLEcore.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import robotDSLEcore.IfStatement;
import robotDSLEcore.LogicalExps;
import robotDSLEcore.RobotDSLEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSLEcore.impl.IfStatementImpl#getLogicalexps <em>Logicalexps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementsImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getLogicalexps() <em>Logicalexps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalexps()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalExps> logicalexps;

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
	public EList<LogicalExps> getLogicalexps() {
		if (logicalexps == null) {
			logicalexps = new EObjectContainmentEList<LogicalExps>(LogicalExps.class, this, RobotDSLEcorePackage.IF_STATEMENT__LOGICALEXPS);
		}
		return logicalexps;
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
				return ((InternalEList<?>)getLogicalexps()).basicRemove(otherEnd, msgs);
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
				getLogicalexps().clear();
				getLogicalexps().addAll((Collection<? extends LogicalExps>)newValue);
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
				getLogicalexps().clear();
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
				return logicalexps != null && !logicalexps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
