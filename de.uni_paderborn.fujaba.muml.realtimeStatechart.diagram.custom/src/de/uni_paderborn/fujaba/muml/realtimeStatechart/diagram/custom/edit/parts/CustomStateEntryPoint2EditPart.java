package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

// Deactivated because StateEntryPoint2EditPart does not exist anymore

//import org.eclipse.draw2d.ConnectionAnchor;
//import org.eclipse.draw2d.EllipseAnchor;
//import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
//import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
//import org.eclipse.gmf.runtime.notation.View;
//
//import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPoint2EditPart;
//
//public class CustomStateEntryPoint2EditPart extends StateEntryPoint2EditPart {
//
//	public CustomStateEntryPoint2EditPart(View view) {
//		super(view);
//	}
//
//	protected NodeFigure createNodePlate() {
//		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(25, 25) {
//			
//			@Override
//			public ConnectionAnchor getConnectionAnchor(String terminal) {
//				return createDefaultAnchor();
//			}
//
//			@Override
//			public ConnectionAnchor createDefaultAnchor() {
//				return new EllipseAnchor(this);
//			}
//		};
//
//		// FIXME: workaround for #154536
//		result.getBounds().setSize(result.getPreferredSize());
//
//		return result;
//	}
//
//}
