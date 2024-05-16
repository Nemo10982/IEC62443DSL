/**
 * generated by Xtext 2.31.0
 */
package org.xtext.iec62443.baseModel.mIEC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getPhysicalBoundary <em>Physical Boundary</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getLogicalBoundary <em>Logical Boundary</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getPhysicalAccessPoints <em>Physical Access Points</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getSecurityPolicies <em>Security Policies</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getDataflows <em>Dataflows</em>}</li>
 * </ul>
 *
 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics()
 * @model
 * @generated
 */
public interface ZoneCharacteristics extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Boundary</em>' attribute.
	 * @see #setPhysicalBoundary(String)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics_PhysicalBoundary()
	 * @model
	 * @generated
	 */
	String getPhysicalBoundary();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getPhysicalBoundary <em>Physical Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Boundary</em>' attribute.
	 * @see #getPhysicalBoundary()
	 * @generated
	 */
	void setPhysicalBoundary(String value);

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' attribute list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics_Organizations()
	 * @model
	 * @generated
	 */
	EList<String> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Logical Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Boundary</em>' attribute.
	 * @see #setLogicalBoundary(String)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics_LogicalBoundary()
	 * @model
	 * @generated
	 */
	String getLogicalBoundary();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics#getLogicalBoundary <em>Logical Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Boundary</em>' attribute.
	 * @see #getLogicalBoundary()
	 * @generated
	 */
	void setLogicalBoundary(String value);

	/**
	 * Returns the value of the '<em><b>Physical Access Points</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Access Points</em>' attribute list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics_PhysicalAccessPoints()
	 * @model
	 * @generated
	 */
	EList<String> getPhysicalAccessPoints();

	/**
	 * Returns the value of the '<em><b>Security Policies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Policies</em>' attribute list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics_SecurityPolicies()
	 * @model
	 * @generated
	 */
	EList<String> getSecurityPolicies();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' attribute list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics_Assumptions()
	 * @model
	 * @generated
	 */
	EList<String> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Dataflows</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.iec62443.baseModel.mIEC.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflows</em>' containment reference list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZoneCharacteristics_Dataflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlow> getDataflows();

} // ZoneCharacteristics
