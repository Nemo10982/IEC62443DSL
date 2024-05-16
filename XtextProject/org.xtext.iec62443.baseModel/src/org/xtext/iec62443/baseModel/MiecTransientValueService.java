package org.xtext.iec62443.baseModel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;
import org.xtext.iec62443.baseModel.mIEC.MIECPackage;

public class MiecTransientValueService extends LegacyTransientValueService {
	@Override
	public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {
		if (feature == MIECPackage.Literals.DEVICE__RUNNING) {
			return ValueTransient.YES;
		}
		return super.isValueTransient(semanticObject, feature);
	}
	
	@Override
	public ListTransient isListTransient(EObject semanticObject, EStructuralFeature feature) {
	if (feature == MIECPackage.Literals.DEVICE__RUNNING) {
	return ListTransient.YES;
	}
	return super.isListTransient(semanticObject, feature);
	}
}
