/**
 * generated by Xtext 2.31.0
 */
package org.xtext.iec62443.baseModel.mIEC;

import org.xtext.iec62443.baseModel.mIEC.NumberExpression.ComputationErrorException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getStringExpression()
 * @model abstract="true"
 * @generated
 */
public interface StringExpression extends Expression {

	String computeString(Application application, Device device)  throws ComputationErrorException;
} // StringExpression
