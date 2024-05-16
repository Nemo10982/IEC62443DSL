/**
 * generated by Xtext 2.31.0
 */
package org.xtext.iec62443.baseModel.mIEC.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.xtext.iec62443.baseModel.mIEC.Application;
import org.xtext.iec62443.baseModel.mIEC.BooleanExpression;
import org.xtext.iec62443.baseModel.mIEC.BooleanValue;
import org.xtext.iec62443.baseModel.mIEC.Channel;
import org.xtext.iec62443.baseModel.mIEC.ClassicalZone;
import org.xtext.iec62443.baseModel.mIEC.Comparison;
import org.xtext.iec62443.baseModel.mIEC.Component;
import org.xtext.iec62443.baseModel.mIEC.Conduit;
import org.xtext.iec62443.baseModel.mIEC.Constraint;
import org.xtext.iec62443.baseModel.mIEC.CounterMeasure;
import org.xtext.iec62443.baseModel.mIEC.DataFlow;
import org.xtext.iec62443.baseModel.mIEC.Device;
import org.xtext.iec62443.baseModel.mIEC.DeviceReference;
import org.xtext.iec62443.baseModel.mIEC.Expression;
import org.xtext.iec62443.baseModel.mIEC.FloatExpression;
import org.xtext.iec62443.baseModel.mIEC.FloatValue;
import org.xtext.iec62443.baseModel.mIEC.IntegerExpression;
import org.xtext.iec62443.baseModel.mIEC.IntegerValue;
import org.xtext.iec62443.baseModel.mIEC.MIECPackage;
import org.xtext.iec62443.baseModel.mIEC.Model;
import org.xtext.iec62443.baseModel.mIEC.NumberExpression;
import org.xtext.iec62443.baseModel.mIEC.OperationConstraint;
import org.xtext.iec62443.baseModel.mIEC.OperationNumber;
import org.xtext.iec62443.baseModel.mIEC.OperationNumberNary;
import org.xtext.iec62443.baseModel.mIEC.PresenceConstraint;
import org.xtext.iec62443.baseModel.mIEC.Property;
import org.xtext.iec62443.baseModel.mIEC.Reference;
import org.xtext.iec62443.baseModel.mIEC.ReferenceExpression;
import org.xtext.iec62443.baseModel.mIEC.SecurityLevels;
import org.xtext.iec62443.baseModel.mIEC.SelfReference;
import org.xtext.iec62443.baseModel.mIEC.StringExpression;
import org.xtext.iec62443.baseModel.mIEC.StringValue;
import org.xtext.iec62443.baseModel.mIEC.TernaryOp;
import org.xtext.iec62443.baseModel.mIEC.Value;
import org.xtext.iec62443.baseModel.mIEC.ValueOrReference;
import org.xtext.iec62443.baseModel.mIEC.Zone;
import org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.iec62443.baseModel.mIEC.MIECPackage
 * @generated
 */
public class MIECAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MIECPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIECAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MIECPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIECSwitch<Adapter> modelSwitch =
		new MIECSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter caseSecurityLevels(SecurityLevels object) {
				return createSecurityLevelsAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseConduit(Conduit object) {
				return createConduitAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseCounterMeasure(CounterMeasure object) {
				return createCounterMeasureAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseSystem(org.xtext.iec62443.baseModel.mIEC.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseClassicalZone(ClassicalZone object) {
				return createClassicalZoneAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseOperationConstraint(OperationConstraint object) {
				return createOperationConstraintAdapter();
			}
			@Override
			public Adapter casePresenceConstraint(PresenceConstraint object) {
				return createPresenceConstraintAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseFloatValue(FloatValue object) {
				return createFloatValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseValueOrReference(ValueOrReference object) {
				return createValueOrReferenceAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseSelfReference(SelfReference object) {
				return createSelfReferenceAdapter();
			}
			@Override
			public Adapter caseDeviceReference(DeviceReference object) {
				return createDeviceReferenceAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseNumberExpression(NumberExpression object) {
				return createNumberExpressionAdapter();
			}
			@Override
			public Adapter caseComparison(Comparison object) {
				return createComparisonAdapter();
			}
			@Override
			public Adapter caseOperationNumber(OperationNumber object) {
				return createOperationNumberAdapter();
			}
			@Override
			public Adapter caseReferenceExpression(ReferenceExpression object) {
				return createReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseTernaryOp(TernaryOp object) {
				return createTernaryOpAdapter();
			}
			@Override
			public Adapter caseFloatExpression(FloatExpression object) {
				return createFloatExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseOperationNumberNary(OperationNumberNary object) {
				return createOperationNumberNaryAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseZoneCharacteristics(ZoneCharacteristics object) {
				return createZoneCharacteristicsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.SecurityLevels <em>Security Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.SecurityLevels
	 * @generated
	 */
	public Adapter createSecurityLevelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Conduit <em>Conduit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Conduit
	 * @generated
	 */
	public Adapter createConduitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.CounterMeasure <em>Counter Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.CounterMeasure
	 * @generated
	 */
	public Adapter createCounterMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.ClassicalZone <em>Classical Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.ClassicalZone
	 * @generated
	 */
	public Adapter createClassicalZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.OperationConstraint <em>Operation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.OperationConstraint
	 * @generated
	 */
	public Adapter createOperationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.PresenceConstraint <em>Presence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.PresenceConstraint
	 * @generated
	 */
	public Adapter createPresenceConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.FloatValue
	 * @generated
	 */
	public Adapter createFloatValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.ValueOrReference <em>Value Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.ValueOrReference
	 * @generated
	 */
	public Adapter createValueOrReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.SelfReference <em>Self Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.SelfReference
	 * @generated
	 */
	public Adapter createSelfReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.DeviceReference <em>Device Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.DeviceReference
	 * @generated
	 */
	public Adapter createDeviceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.NumberExpression <em>Number Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.NumberExpression
	 * @generated
	 */
	public Adapter createNumberExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.OperationNumber <em>Operation Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.OperationNumber
	 * @generated
	 */
	public Adapter createOperationNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.ReferenceExpression <em>Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.ReferenceExpression
	 * @generated
	 */
	public Adapter createReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.TernaryOp <em>Ternary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.TernaryOp
	 * @generated
	 */
	public Adapter createTernaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.FloatExpression <em>Float Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.FloatExpression
	 * @generated
	 */
	public Adapter createFloatExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.OperationNumberNary <em>Operation Number Nary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.OperationNumberNary
	 * @generated
	 */
	public Adapter createOperationNumberNaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics <em>Zone Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.iec62443.baseModel.mIEC.ZoneCharacteristics
	 * @generated
	 */
	public Adapter createZoneCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MIECAdapterFactory
