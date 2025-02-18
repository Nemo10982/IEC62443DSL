/**
 * generated by Xtext 2.31.0
 */
package org.xtext.iec62443.baseModel.mIEC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Number Nary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.OperationNumberNary#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.OperationNumberNary#getOps <em>Ops</em>}</li>
 * </ul>
 *
 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getOperationNumberNary()
 * @model
 * @generated
 */
public interface OperationNumberNary extends NumberExpression {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.xtext.iec62443.baseModel.mIEC.NumberOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.xtext.iec62443.baseModel.mIEC.NumberOperation
	 * @see #setOperation(NumberOperation)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getOperationNumberNary_Operation()
	 * @model default="none" required="true"
	 * @generated
	 */
	NumberOperation getOperation();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.OperationNumberNary#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.xtext.iec62443.baseModel.mIEC.NumberOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(NumberOperation value);

	/**
	 * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.iec62443.baseModel.mIEC.NumberExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' containment reference list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getOperationNumberNary_Ops()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NumberExpression> getOps();

} // OperationNumberNary
