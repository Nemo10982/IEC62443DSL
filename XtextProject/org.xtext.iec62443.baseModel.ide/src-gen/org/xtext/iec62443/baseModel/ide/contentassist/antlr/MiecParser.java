/*
 * generated by Xtext 2.32.0
 */
package org.xtext.iec62443.baseModel.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.iec62443.baseModel.ide.contentassist.antlr.internal.InternalMiecParser;
import org.xtext.iec62443.baseModel.services.MiecGrammarAccess;

public class MiecParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MiecGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MiecGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives_1(), "rule__Model__Alternatives_1");
			builder.put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
			builder.put(grammarAccess.getZoneAccess().getAlternatives(), "rule__Zone__Alternatives");
			builder.put(grammarAccess.getApplicationAccess().getAlternatives_6(), "rule__Application__Alternatives_6");
			builder.put(grammarAccess.getConstraintAccess().getAlternatives(), "rule__Constraint__Alternatives");
			builder.put(grammarAccess.getValueOrReferenceAccess().getAlternatives(), "rule__ValueOrReference__Alternatives");
			builder.put(grammarAccess.getReferenceAccess().getAlternatives(), "rule__Reference__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getSecurityLevelAccess().getAlternatives(), "rule__SecurityLevel__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getClassicalZoneAccess().getGroup(), "rule__ClassicalZone__Group__0");
			builder.put(grammarAccess.getClassicalZoneAccess().getGroup_7(), "rule__ClassicalZone__Group_7__0");
			builder.put(grammarAccess.getClassicalZoneAccess().getGroup_7_4(), "rule__ClassicalZone__Group_7_4__0");
			builder.put(grammarAccess.getClassicalZoneAccess().getGroup_8(), "rule__ClassicalZone__Group_8__0");
			builder.put(grammarAccess.getClassicalZoneAccess().getGroup_8_4(), "rule__ClassicalZone__Group_8_4__0");
			builder.put(grammarAccess.getClassicalZoneAccess().getGroup_9(), "rule__ClassicalZone__Group_9__0");
			builder.put(grammarAccess.getClassicalZoneAccess().getGroup_9_4(), "rule__ClassicalZone__Group_9_4__0");
			builder.put(grammarAccess.getSecurityLevelsAccess().getGroup(), "rule__SecurityLevels__Group__0");
			builder.put(grammarAccess.getCounterMeasureAccess().getGroup(), "rule__CounterMeasure__Group__0");
			builder.put(grammarAccess.getConduitAccess().getGroup(), "rule__Conduit__Group__0");
			builder.put(grammarAccess.getConduitAccess().getGroup_8(), "rule__Conduit__Group_8__0");
			builder.put(grammarAccess.getConduitAccess().getGroup_13(), "rule__Conduit__Group_13__0");
			builder.put(grammarAccess.getConduitAccess().getGroup_13_4(), "rule__Conduit__Group_13_4__0");
			builder.put(grammarAccess.getConduitAccess().getGroup_14(), "rule__Conduit__Group_14__0");
			builder.put(grammarAccess.getConduitAccess().getGroup_14_4(), "rule__Conduit__Group_14_4__0");
			builder.put(grammarAccess.getConduitAccess().getGroup_15(), "rule__Conduit__Group_15__0");
			builder.put(grammarAccess.getConduitAccess().getGroup_15_4(), "rule__Conduit__Group_15_4__0");
			builder.put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
			builder.put(grammarAccess.getDeviceAccess().getGroup_1(), "rule__Device__Group_1__0");
			builder.put(grammarAccess.getDeviceAccess().getGroup_6(), "rule__Device__Group_6__0");
			builder.put(grammarAccess.getDeviceAccess().getGroup_6_4(), "rule__Device__Group_6_4__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_6(), "rule__System__Group_6__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_6_4(), "rule__System__Group_6_4__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_7(), "rule__System__Group_7__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_7_4(), "rule__System__Group_7_4__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_10(), "rule__Application__Group_10__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_10_4(), "rule__Application__Group_10_4__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_11(), "rule__Application__Group_11__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_11_5(), "rule__Application__Group_11_5__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_12(), "rule__Application__Group_12__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_12_4(), "rule__Application__Group_12_4__0");
			builder.put(grammarAccess.getChannelAccess().getGroup(), "rule__Channel__Group__0");
			builder.put(grammarAccess.getChannelAccess().getGroup_8(), "rule__Channel__Group_8__0");
			builder.put(grammarAccess.getPresenceConstraintAccess().getGroup(), "rule__PresenceConstraint__Group__0");
			builder.put(grammarAccess.getOperationConstraintAccess().getGroup(), "rule__OperationConstraint__Group__0");
			builder.put(grammarAccess.getDeviceReferenceAccess().getGroup(), "rule__DeviceReference__Group__0");
			builder.put(grammarAccess.getSelfReferenceAccess().getGroup(), "rule__SelfReference__Group__0");
			builder.put(grammarAccess.getModelAccess().getZonesAssignment_1_0(), "rule__Model__ZonesAssignment_1_0");
			builder.put(grammarAccess.getModelAccess().getConduitsAssignment_1_1(), "rule__Model__ConduitsAssignment_1_1");
			builder.put(grammarAccess.getClassicalZoneAccess().getTrustedAssignment_0(), "rule__ClassicalZone__TrustedAssignment_0");
			builder.put(grammarAccess.getClassicalZoneAccess().getPhysicalAssignment_1(), "rule__ClassicalZone__PhysicalAssignment_1");
			builder.put(grammarAccess.getClassicalZoneAccess().getNameAssignment_3(), "rule__ClassicalZone__NameAssignment_3");
			builder.put(grammarAccess.getClassicalZoneAccess().getTargetAssignment_6(), "rule__ClassicalZone__TargetAssignment_6");
			builder.put(grammarAccess.getClassicalZoneAccess().getComponentsAssignment_7_3(), "rule__ClassicalZone__ComponentsAssignment_7_3");
			builder.put(grammarAccess.getClassicalZoneAccess().getComponentsAssignment_7_4_1(), "rule__ClassicalZone__ComponentsAssignment_7_4_1");
			builder.put(grammarAccess.getClassicalZoneAccess().getCountermeasuresAssignment_8_3(), "rule__ClassicalZone__CountermeasuresAssignment_8_3");
			builder.put(grammarAccess.getClassicalZoneAccess().getCountermeasuresAssignment_8_4_1(), "rule__ClassicalZone__CountermeasuresAssignment_8_4_1");
			builder.put(grammarAccess.getClassicalZoneAccess().getSubZonesAssignment_9_3(), "rule__ClassicalZone__SubZonesAssignment_9_3");
			builder.put(grammarAccess.getClassicalZoneAccess().getSubZonesAssignment_9_4_1(), "rule__ClassicalZone__SubZonesAssignment_9_4_1");
			builder.put(grammarAccess.getSecurityLevelsAccess().getAccessControlAssignment_1(), "rule__SecurityLevels__AccessControlAssignment_1");
			builder.put(grammarAccess.getSecurityLevelsAccess().getUseControlAssignment_3(), "rule__SecurityLevels__UseControlAssignment_3");
			builder.put(grammarAccess.getSecurityLevelsAccess().getSystemIntegrityAssignment_5(), "rule__SecurityLevels__SystemIntegrityAssignment_5");
			builder.put(grammarAccess.getSecurityLevelsAccess().getDataConfidentialityAssignment_7(), "rule__SecurityLevels__DataConfidentialityAssignment_7");
			builder.put(grammarAccess.getSecurityLevelsAccess().getRestrictedDataFlowAssignment_9(), "rule__SecurityLevels__RestrictedDataFlowAssignment_9");
			builder.put(grammarAccess.getSecurityLevelsAccess().getTimelyResponseAssignment_11(), "rule__SecurityLevels__TimelyResponseAssignment_11");
			builder.put(grammarAccess.getSecurityLevelsAccess().getResourceAvailabilityAssignment_13(), "rule__SecurityLevels__ResourceAvailabilityAssignment_13");
			builder.put(grammarAccess.getCounterMeasureAccess().getNameAssignment_1(), "rule__CounterMeasure__NameAssignment_1");
			builder.put(grammarAccess.getCounterMeasureAccess().getCapabilityAssignment_4(), "rule__CounterMeasure__CapabilityAssignment_4");
			builder.put(grammarAccess.getConduitAccess().getTrustedAssignment_0(), "rule__Conduit__TrustedAssignment_0");
			builder.put(grammarAccess.getConduitAccess().getPhysicalAssignment_1(), "rule__Conduit__PhysicalAssignment_1");
			builder.put(grammarAccess.getConduitAccess().getNameAssignment_3(), "rule__Conduit__NameAssignment_3");
			builder.put(grammarAccess.getConduitAccess().getConnectsAssignment_7(), "rule__Conduit__ConnectsAssignment_7");
			builder.put(grammarAccess.getConduitAccess().getConnectsAssignment_8_1(), "rule__Conduit__ConnectsAssignment_8_1");
			builder.put(grammarAccess.getConduitAccess().getTargetAssignment_12(), "rule__Conduit__TargetAssignment_12");
			builder.put(grammarAccess.getConduitAccess().getComponentsAssignment_13_3(), "rule__Conduit__ComponentsAssignment_13_3");
			builder.put(grammarAccess.getConduitAccess().getComponentsAssignment_13_4_1(), "rule__Conduit__ComponentsAssignment_13_4_1");
			builder.put(grammarAccess.getConduitAccess().getCountermeasuresAssignment_14_3(), "rule__Conduit__CountermeasuresAssignment_14_3");
			builder.put(grammarAccess.getConduitAccess().getCountermeasuresAssignment_14_4_1(), "rule__Conduit__CountermeasuresAssignment_14_4_1");
			builder.put(grammarAccess.getConduitAccess().getChannelsAssignment_15_3(), "rule__Conduit__ChannelsAssignment_15_3");
			builder.put(grammarAccess.getConduitAccess().getChannelsAssignment_15_4_1(), "rule__Conduit__ChannelsAssignment_15_4_1");
			builder.put(grammarAccess.getDeviceAccess().getNetworkAssignment_1_0(), "rule__Device__NetworkAssignment_1_0");
			builder.put(grammarAccess.getDeviceAccess().getEmbeddedAssignment_1_1(), "rule__Device__EmbeddedAssignment_1_1");
			builder.put(grammarAccess.getDeviceAccess().getHostAssignment_1_2(), "rule__Device__HostAssignment_1_2");
			builder.put(grammarAccess.getDeviceAccess().getNameAssignment_2(), "rule__Device__NameAssignment_2");
			builder.put(grammarAccess.getDeviceAccess().getCapabilityAssignment_5(), "rule__Device__CapabilityAssignment_5");
			builder.put(grammarAccess.getDeviceAccess().getPropertiesAssignment_6_3(), "rule__Device__PropertiesAssignment_6_3");
			builder.put(grammarAccess.getDeviceAccess().getPropertiesAssignment_6_4_1(), "rule__Device__PropertiesAssignment_6_4_1");
			builder.put(grammarAccess.getPropertyAccess().getNameAssignment_0(), "rule__Property__NameAssignment_0");
			builder.put(grammarAccess.getPropertyAccess().getValueAssignment_2(), "rule__Property__ValueAssignment_2");
			builder.put(grammarAccess.getSystemAccess().getNameAssignment_2(), "rule__System__NameAssignment_2");
			builder.put(grammarAccess.getSystemAccess().getCapabilityAssignment_5(), "rule__System__CapabilityAssignment_5");
			builder.put(grammarAccess.getSystemAccess().getDevicesAssignment_6_3(), "rule__System__DevicesAssignment_6_3");
			builder.put(grammarAccess.getSystemAccess().getDevicesAssignment_6_4_1(), "rule__System__DevicesAssignment_6_4_1");
			builder.put(grammarAccess.getSystemAccess().getPropertiesAssignment_7_3(), "rule__System__PropertiesAssignment_7_3");
			builder.put(grammarAccess.getSystemAccess().getPropertiesAssignment_7_4_1(), "rule__System__PropertiesAssignment_7_4_1");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment_2(), "rule__Application__NameAssignment_2");
			builder.put(grammarAccess.getApplicationAccess().getExecutedOnAssignment_6_0(), "rule__Application__ExecutedOnAssignment_6_0");
			builder.put(grammarAccess.getApplicationAccess().getCapabilityAssignment_9(), "rule__Application__CapabilityAssignment_9");
			builder.put(grammarAccess.getApplicationAccess().getConstraintsAssignment_10_3(), "rule__Application__ConstraintsAssignment_10_3");
			builder.put(grammarAccess.getApplicationAccess().getConstraintsAssignment_10_4_1(), "rule__Application__ConstraintsAssignment_10_4_1");
			builder.put(grammarAccess.getApplicationAccess().getCommunicatesWithAssignment_11_4(), "rule__Application__CommunicatesWithAssignment_11_4");
			builder.put(grammarAccess.getApplicationAccess().getCommunicatesWithAssignment_11_5_1(), "rule__Application__CommunicatesWithAssignment_11_5_1");
			builder.put(grammarAccess.getApplicationAccess().getPropertiesAssignment_12_3(), "rule__Application__PropertiesAssignment_12_3");
			builder.put(grammarAccess.getApplicationAccess().getPropertiesAssignment_12_4_1(), "rule__Application__PropertiesAssignment_12_4_1");
			builder.put(grammarAccess.getChannelAccess().getNameAssignment_1(), "rule__Channel__NameAssignment_1");
			builder.put(grammarAccess.getChannelAccess().getConnectsAssignment_5(), "rule__Channel__ConnectsAssignment_5");
			builder.put(grammarAccess.getChannelAccess().getConnectsAssignment_7(), "rule__Channel__ConnectsAssignment_7");
			builder.put(grammarAccess.getChannelAccess().getConnectsAssignment_8_1(), "rule__Channel__ConnectsAssignment_8_1");
			builder.put(grammarAccess.getPresenceConstraintAccess().getOptionalAssignment_0(), "rule__PresenceConstraint__OptionalAssignment_0");
			builder.put(grammarAccess.getPresenceConstraintAccess().getPropertyNameAssignment_2(), "rule__PresenceConstraint__PropertyNameAssignment_2");
			builder.put(grammarAccess.getOperationConstraintAccess().getOptionalAssignment_0(), "rule__OperationConstraint__OptionalAssignment_0");
			builder.put(grammarAccess.getOperationConstraintAccess().getPropertyNameAssignment_1(), "rule__OperationConstraint__PropertyNameAssignment_1");
			builder.put(grammarAccess.getOperationConstraintAccess().getOperationAssignment_2(), "rule__OperationConstraint__OperationAssignment_2");
			builder.put(grammarAccess.getOperationConstraintAccess().getValueAssignment_3(), "rule__OperationConstraint__ValueAssignment_3");
			builder.put(grammarAccess.getDeviceReferenceAccess().getReferenceAssignment_1(), "rule__DeviceReference__ReferenceAssignment_1");
			builder.put(grammarAccess.getSelfReferenceAccess().getReferenceAssignment_1(), "rule__SelfReference__ReferenceAssignment_1");
			builder.put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getFloatValueAccess().getValueAssignment(), "rule__FloatValue__ValueAssignment");
			builder.put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MiecGrammarAccess grammarAccess;

	@Override
	protected InternalMiecParser createParser() {
		InternalMiecParser result = new InternalMiecParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MiecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MiecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
