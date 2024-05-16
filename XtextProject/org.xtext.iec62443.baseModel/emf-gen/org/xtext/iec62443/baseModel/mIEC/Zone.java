/**
 * generated by Xtext 2.31.0
 */
package org.xtext.iec62443.baseModel.mIEC;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#isTrusted <em>Trusted</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#getCountermeasures <em>Countermeasures</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#isPhysical <em>Physical</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#getIsSubZoneOf <em>Is Sub Zone Of</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.Zone#getFurtherDesc <em>Further Desc</em>}</li>
 * </ul>
 *
 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone()
 * @model abstract="true"
 * @generated
 */
public interface Zone extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.Zone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(SecurityLevels)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityLevels getTarget();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.Zone#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SecurityLevels value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	SecurityLevels getAchieved();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.iec62443.baseModel.mIEC.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Trusted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted</em>' attribute.
	 * @see #setTrusted(boolean)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_Trusted()
	 * @model required="true"
	 * @generated
	 */
	boolean isTrusted();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.Zone#isTrusted <em>Trusted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted</em>' attribute.
	 * @see #isTrusted()
	 * @generated
	 */
	void setTrusted(boolean value);

	/**
	 * Returns the value of the '<em><b>Countermeasures</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.iec62443.baseModel.mIEC.CounterMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countermeasures</em>' containment reference list.
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_Countermeasures()
	 * @model containment="true"
	 * @generated
	 */
	EList<CounterMeasure> getCountermeasures();

	/**
	 * Returns the value of the '<em><b>Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical</em>' attribute.
	 * @see #setPhysical(boolean)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_Physical()
	 * @model required="true"
	 * @generated
	 */
	boolean isPhysical();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.Zone#isPhysical <em>Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical</em>' attribute.
	 * @see #isPhysical()
	 * @generated
	 */
	void setPhysical(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Sub Zone Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xtext.iec62443.baseModel.mIEC.ClassicalZone#getSubZones <em>Sub Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sub Zone Of</em>' container reference.
	 * @see #setIsSubZoneOf(ClassicalZone)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_IsSubZoneOf()
	 * @see org.xtext.iec62443.baseModel.mIEC.ClassicalZone#getSubZones
	 * @model opposite="subZones" transient="false"
	 * @generated
	 */
	ClassicalZone getIsSubZoneOf();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.Zone#getIsSubZoneOf <em>Is Sub Zone Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sub Zone Of</em>' container reference.
	 * @see #getIsSubZoneOf()
	 * @generated
	 */
	void setIsSubZoneOf(ClassicalZone value);

	/**
	 * Returns the value of the '<em><b>Further Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further Desc</em>' containment reference.
	 * @see #setFurtherDesc(ZoneCharacteristics)
	 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage#getZone_FurtherDesc()
	 * @model containment="true"
	 * @generated
	 */
	ZoneCharacteristics getFurtherDesc();

	/**
	 * Sets the value of the '{@link org.xtext.iec62443.baseModel.mIEC.Zone#getFurtherDesc <em>Further Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Further Desc</em>' containment reference.
	 * @see #getFurtherDesc()
	 * @generated
	 */
	void setFurtherDesc(ZoneCharacteristics value);

} // Zone
