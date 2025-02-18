/**
 * generated by Xtext 2.31.0
 */
package org.xtext.iec62443.baseModel.mIEC.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.iec62443.baseModel.mIEC.MIECPackage;
import org.xtext.iec62443.baseModel.mIEC.SecurityLevel;
import org.xtext.iec62443.baseModel.mIEC.SecurityLevels;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Levels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.SecurityLevelsImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.SecurityLevelsImpl#getUseControl <em>Use Control</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.SecurityLevelsImpl#getSystemIntegrity <em>System Integrity</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.SecurityLevelsImpl#getDataConfidentiality <em>Data Confidentiality</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.SecurityLevelsImpl#getRestrictedDataFlow <em>Restricted Data Flow</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.SecurityLevelsImpl#getTimelyResponse <em>Timely Response</em>}</li>
 *   <li>{@link org.xtext.iec62443.baseModel.mIEC.impl.SecurityLevelsImpl#getResourceAvailability <em>Resource Availability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLevelsImpl extends MinimalEObjectImpl.Container implements SecurityLevels {
	/**
	 * The default value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel ACCESS_CONTROL_EDEFAULT = SecurityLevel.SL4;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel accessControl = ACCESS_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseControl() <em>Use Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseControl()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel USE_CONTROL_EDEFAULT = SecurityLevel.SL4;

	/**
	 * The cached value of the '{@link #getUseControl() <em>Use Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseControl()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel useControl = USE_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemIntegrity() <em>System Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel SYSTEM_INTEGRITY_EDEFAULT = SecurityLevel.SL4;

	/**
	 * The cached value of the '{@link #getSystemIntegrity() <em>System Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIntegrity()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel systemIntegrity = SYSTEM_INTEGRITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataConfidentiality() <em>Data Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel DATA_CONFIDENTIALITY_EDEFAULT = SecurityLevel.SL4;

	/**
	 * The cached value of the '{@link #getDataConfidentiality() <em>Data Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel dataConfidentiality = DATA_CONFIDENTIALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestrictedDataFlow() <em>Restricted Data Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedDataFlow()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel RESTRICTED_DATA_FLOW_EDEFAULT = SecurityLevel.SL4;

	/**
	 * The cached value of the '{@link #getRestrictedDataFlow() <em>Restricted Data Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedDataFlow()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel restrictedDataFlow = RESTRICTED_DATA_FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimelyResponse() <em>Timely Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimelyResponse()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel TIMELY_RESPONSE_EDEFAULT = SecurityLevel.SL4;

	/**
	 * The cached value of the '{@link #getTimelyResponse() <em>Timely Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimelyResponse()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel timelyResponse = TIMELY_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceAvailability() <em>Resource Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel RESOURCE_AVAILABILITY_EDEFAULT = SecurityLevel.SL4;

	/**
	 * The cached value of the '{@link #getResourceAvailability() <em>Resource Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAvailability()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel resourceAvailability = RESOURCE_AVAILABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MIECPackage.Literals.SECURITY_LEVELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getAccessControl() {
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessControl(SecurityLevel newAccessControl) {
		SecurityLevel oldAccessControl = accessControl;
		accessControl = newAccessControl == null ? ACCESS_CONTROL_EDEFAULT : newAccessControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.SECURITY_LEVELS__ACCESS_CONTROL, oldAccessControl, accessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getUseControl() {
		return useControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseControl(SecurityLevel newUseControl) {
		SecurityLevel oldUseControl = useControl;
		useControl = newUseControl == null ? USE_CONTROL_EDEFAULT : newUseControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.SECURITY_LEVELS__USE_CONTROL, oldUseControl, useControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getSystemIntegrity() {
		return systemIntegrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemIntegrity(SecurityLevel newSystemIntegrity) {
		SecurityLevel oldSystemIntegrity = systemIntegrity;
		systemIntegrity = newSystemIntegrity == null ? SYSTEM_INTEGRITY_EDEFAULT : newSystemIntegrity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.SECURITY_LEVELS__SYSTEM_INTEGRITY, oldSystemIntegrity, systemIntegrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getDataConfidentiality() {
		return dataConfidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataConfidentiality(SecurityLevel newDataConfidentiality) {
		SecurityLevel oldDataConfidentiality = dataConfidentiality;
		dataConfidentiality = newDataConfidentiality == null ? DATA_CONFIDENTIALITY_EDEFAULT : newDataConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.SECURITY_LEVELS__DATA_CONFIDENTIALITY, oldDataConfidentiality, dataConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getRestrictedDataFlow() {
		return restrictedDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestrictedDataFlow(SecurityLevel newRestrictedDataFlow) {
		SecurityLevel oldRestrictedDataFlow = restrictedDataFlow;
		restrictedDataFlow = newRestrictedDataFlow == null ? RESTRICTED_DATA_FLOW_EDEFAULT : newRestrictedDataFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.SECURITY_LEVELS__RESTRICTED_DATA_FLOW, oldRestrictedDataFlow, restrictedDataFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getTimelyResponse() {
		return timelyResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimelyResponse(SecurityLevel newTimelyResponse) {
		SecurityLevel oldTimelyResponse = timelyResponse;
		timelyResponse = newTimelyResponse == null ? TIMELY_RESPONSE_EDEFAULT : newTimelyResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.SECURITY_LEVELS__TIMELY_RESPONSE, oldTimelyResponse, timelyResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getResourceAvailability() {
		return resourceAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceAvailability(SecurityLevel newResourceAvailability) {
		SecurityLevel oldResourceAvailability = resourceAvailability;
		resourceAvailability = newResourceAvailability == null ? RESOURCE_AVAILABILITY_EDEFAULT : newResourceAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MIECPackage.SECURITY_LEVELS__RESOURCE_AVAILABILITY, oldResourceAvailability, resourceAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MIECPackage.SECURITY_LEVELS__ACCESS_CONTROL:
				return getAccessControl();
			case MIECPackage.SECURITY_LEVELS__USE_CONTROL:
				return getUseControl();
			case MIECPackage.SECURITY_LEVELS__SYSTEM_INTEGRITY:
				return getSystemIntegrity();
			case MIECPackage.SECURITY_LEVELS__DATA_CONFIDENTIALITY:
				return getDataConfidentiality();
			case MIECPackage.SECURITY_LEVELS__RESTRICTED_DATA_FLOW:
				return getRestrictedDataFlow();
			case MIECPackage.SECURITY_LEVELS__TIMELY_RESPONSE:
				return getTimelyResponse();
			case MIECPackage.SECURITY_LEVELS__RESOURCE_AVAILABILITY:
				return getResourceAvailability();
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
			case MIECPackage.SECURITY_LEVELS__ACCESS_CONTROL:
				setAccessControl((SecurityLevel)newValue);
				return;
			case MIECPackage.SECURITY_LEVELS__USE_CONTROL:
				setUseControl((SecurityLevel)newValue);
				return;
			case MIECPackage.SECURITY_LEVELS__SYSTEM_INTEGRITY:
				setSystemIntegrity((SecurityLevel)newValue);
				return;
			case MIECPackage.SECURITY_LEVELS__DATA_CONFIDENTIALITY:
				setDataConfidentiality((SecurityLevel)newValue);
				return;
			case MIECPackage.SECURITY_LEVELS__RESTRICTED_DATA_FLOW:
				setRestrictedDataFlow((SecurityLevel)newValue);
				return;
			case MIECPackage.SECURITY_LEVELS__TIMELY_RESPONSE:
				setTimelyResponse((SecurityLevel)newValue);
				return;
			case MIECPackage.SECURITY_LEVELS__RESOURCE_AVAILABILITY:
				setResourceAvailability((SecurityLevel)newValue);
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
			case MIECPackage.SECURITY_LEVELS__ACCESS_CONTROL:
				setAccessControl(ACCESS_CONTROL_EDEFAULT);
				return;
			case MIECPackage.SECURITY_LEVELS__USE_CONTROL:
				setUseControl(USE_CONTROL_EDEFAULT);
				return;
			case MIECPackage.SECURITY_LEVELS__SYSTEM_INTEGRITY:
				setSystemIntegrity(SYSTEM_INTEGRITY_EDEFAULT);
				return;
			case MIECPackage.SECURITY_LEVELS__DATA_CONFIDENTIALITY:
				setDataConfidentiality(DATA_CONFIDENTIALITY_EDEFAULT);
				return;
			case MIECPackage.SECURITY_LEVELS__RESTRICTED_DATA_FLOW:
				setRestrictedDataFlow(RESTRICTED_DATA_FLOW_EDEFAULT);
				return;
			case MIECPackage.SECURITY_LEVELS__TIMELY_RESPONSE:
				setTimelyResponse(TIMELY_RESPONSE_EDEFAULT);
				return;
			case MIECPackage.SECURITY_LEVELS__RESOURCE_AVAILABILITY:
				setResourceAvailability(RESOURCE_AVAILABILITY_EDEFAULT);
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
			case MIECPackage.SECURITY_LEVELS__ACCESS_CONTROL:
				return accessControl != ACCESS_CONTROL_EDEFAULT;
			case MIECPackage.SECURITY_LEVELS__USE_CONTROL:
				return useControl != USE_CONTROL_EDEFAULT;
			case MIECPackage.SECURITY_LEVELS__SYSTEM_INTEGRITY:
				return systemIntegrity != SYSTEM_INTEGRITY_EDEFAULT;
			case MIECPackage.SECURITY_LEVELS__DATA_CONFIDENTIALITY:
				return dataConfidentiality != DATA_CONFIDENTIALITY_EDEFAULT;
			case MIECPackage.SECURITY_LEVELS__RESTRICTED_DATA_FLOW:
				return restrictedDataFlow != RESTRICTED_DATA_FLOW_EDEFAULT;
			case MIECPackage.SECURITY_LEVELS__TIMELY_RESPONSE:
				return timelyResponse != TIMELY_RESPONSE_EDEFAULT;
			case MIECPackage.SECURITY_LEVELS__RESOURCE_AVAILABILITY:
				return resourceAvailability != RESOURCE_AVAILABILITY_EDEFAULT;
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
		result.append(" (accessControl: ");
		result.append(accessControl);
		result.append(", useControl: ");
		result.append(useControl);
		result.append(", systemIntegrity: ");
		result.append(systemIntegrity);
		result.append(", dataConfidentiality: ");
		result.append(dataConfidentiality);
		result.append(", restrictedDataFlow: ");
		result.append(restrictedDataFlow);
		result.append(", timelyResponse: ");
		result.append(timelyResponse);
		result.append(", resourceAvailability: ");
		result.append(resourceAvailability);
		result.append(')');
		return result.toString();
	}

	@Override
	public SecurityLevel getSecurityLevel(int i) {
		switch(i) {
		case 0:
			return this.accessControl;
		case 1:
			return this.useControl;
		case 2:
			return this.systemIntegrity;
		case 3:
			return this.dataConfidentiality;
		case 4:
			return this.restrictedDataFlow;
		case 5:
			return this.timelyResponse;
		case 6:
			return this.resourceAvailability;
		}
		return null;
	}

	@Override
	public void setSecurityLevel(int i, SecurityLevel sl) {
		switch(i) {
		case 0:
			this.accessControl = sl;
			break;
		case 1:
			this.useControl = sl;
			break;
		case 2:
			this.systemIntegrity = sl;
			break;
		case 3:
			this.dataConfidentiality = sl;
			break;
		case 4:
			this.restrictedDataFlow = sl;
			break;
		case 5:
			this.timelyResponse = sl;
			break;
		case 6:
			this.resourceAvailability = sl;
			break;
		}
		
	}

} //SecurityLevelsImpl
