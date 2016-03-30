package org.muml.modelica.adapter.rtsc.transformation;

import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.muml.modelica.adapter.transformation.QVToTransformationRunner;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

public class RealtimeStatechartLayouter {
	private static final String TRANSFORMATION = "/de.uni_paderborn.fujaba.modelica.m2t/transforms/layout.qvto";
	
	public int layout(RealtimeStatechart rtsc) {
		ExecutionDiagnostic result = RealtimeStatechartTransformationRunner.run(
				TRANSFORMATION, rtsc);
		QVToTransformationRunner.checkResult(result);
		return 0;
	}
}