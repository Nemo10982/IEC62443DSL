/**
 * generated by Xtext 2.31.0
 */
package org.xtext.iec62443.baseModel.mIEC.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.xtext.iec62443.baseModel.mIEC.Application;
import org.xtext.iec62443.baseModel.mIEC.BooleanExpression;
import org.xtext.iec62443.baseModel.mIEC.Comparison;
import org.xtext.iec62443.baseModel.mIEC.Device;
import org.xtext.iec62443.baseModel.mIEC.Expression;
import org.xtext.iec62443.baseModel.mIEC.MIECPackage;
import org.xtext.iec62443.baseModel.mIEC.NumberExpression;
import org.xtext.iec62443.baseModel.mIEC.NumberExpression.ComputationErrorException;
import org.xtext.iec62443.baseModel.mIEC.Operation;
import org.xtext.iec62443.baseModel.mIEC.StringExpression;
import org.xtext.iec62443.baseModel.mIEC.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.ComparisonImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.ComparisonImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.ComparisonImpl#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends BooleanExpressionImpl implements Comparison {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final Operation OPERATION_EDEFAULT = Operation.EQ;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOp1() <em>Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp1()
	 * @generated
	 * @ordered
	 */
	protected Expression op1;

	/**
	 * The cached value of the '{@link #getOp2() <em>Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp2()
	 * @generated
	 * @ordered
	 */
	protected Expression op2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MIECPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.COMPARISON__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOp1() {
		return op1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp1(Expression newOp1, NotificationChain msgs) {
		Expression oldOp1 = op1;
		op1 = newOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MIECPackage.COMPARISON__OP1, oldOp1, newOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp1(Expression newOp1) {
		if (newOp1 != op1) {
			NotificationChain msgs = null;
			if (op1 != null)
				msgs = ((InternalEObject)op1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MIECPackage.COMPARISON__OP1, null, msgs);
			if (newOp1 != null)
				msgs = ((InternalEObject)newOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MIECPackage.COMPARISON__OP1, null, msgs);
			msgs = basicSetOp1(newOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.COMPARISON__OP1, newOp1, newOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOp2() {
		return op2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp2(Expression newOp2, NotificationChain msgs) {
		Expression oldOp2 = op2;
		op2 = newOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MIECPackage.COMPARISON__OP2, oldOp2, newOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp2(Expression newOp2) {
		if (newOp2 != op2) {
			NotificationChain msgs = null;
			if (op2 != null)
				msgs = ((InternalEObject)op2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MIECPackage.COMPARISON__OP2, null, msgs);
			if (newOp2 != null)
				msgs = ((InternalEObject)newOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MIECPackage.COMPARISON__OP2, null, msgs);
			msgs = basicSetOp2(newOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.COMPARISON__OP2, newOp2, newOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MIECPackage.COMPARISON__OP1:
				return basicSetOp1(null, msgs);
			case MIECPackage.COMPARISON__OP2:
				return basicSetOp2(null, msgs);
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
			case MIECPackage.COMPARISON__OPERATION:
				return getOperation();
			case MIECPackage.COMPARISON__OP1:
				return getOp1();
			case MIECPackage.COMPARISON__OP2:
				return getOp2();
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
			case MIECPackage.COMPARISON__OPERATION:
				setOperation((Operation)newValue);
				return;
			case MIECPackage.COMPARISON__OP1:
				setOp1((Expression)newValue);
				return;
			case MIECPackage.COMPARISON__OP2:
				setOp2((Expression)newValue);
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
			case MIECPackage.COMPARISON__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case MIECPackage.COMPARISON__OP1:
				setOp1((Expression)null);
				return;
			case MIECPackage.COMPARISON__OP2:
				setOp2((Expression)null);
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
			case MIECPackage.COMPARISON__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case MIECPackage.COMPARISON__OP1:
				return op1 != null;
			case MIECPackage.COMPARISON__OP2:
				return op2 != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean getBooleanRes(Application application, Device device) throws ComputationErrorException {
		// check that both operands have the same type
		int type = Expression.determineType(op1, application, device);
		int type2 = Expression.determineType(op2, application, device);
		if (type == type2 || type == -1 || type2 == -1) {
			
			// Both depends on references, and both have at least one unset reference
			if (type == -1 && type2 == -1) {
				throw new ComputationErrorException("No type for both operands");
			}
			
			// Assume the type of an absent variable
			if (type == -1) type = type2;
			
			if (type == Value.BOOLEAN) {
				BooleanExpression op1B = (BooleanExpression) op1;
				BooleanExpression op2B = (BooleanExpression) op2;
				
				boolean val1 = op1B.getBooleanRes(application, device);
				boolean val2 = op2B.getBooleanRes(application, device);
				
				return Value.compareBooleans(val1, operation, val2);
			}
			
			if (type == Value.INTEGER) {
				NumberExpression op1N = (NumberExpression) op1;
				NumberExpression op2N = (NumberExpression) op2;
				
				float val1 = op1N.computeValue(application, device);
				float val2 = op2N.computeValue(application, device);
				
				return Value.compareFloats(val1, operation, val2);
			}
			
			if (type == Value.STRING) {
				StringExpression op1N = (StringExpression) op1;
				StringExpression op2N = (StringExpression) op2;
				
				String val1 = op1N.computeString(application, device);
				String val2 = op2N.computeString(application, device);
				
				return Value.compareStrings(val1, operation, val2);
			}
			
		}
		throw new ComputationErrorException("Error in comparison: mismatched types");
	}
	


	@Override
	public String ExpressiontoString() {
		return "(" + op1.ExpressiontoString() + " " + operation.opToSymbol() + " " + op2.ExpressiontoString() + ")";
 	}

} //ComparisonImpl
