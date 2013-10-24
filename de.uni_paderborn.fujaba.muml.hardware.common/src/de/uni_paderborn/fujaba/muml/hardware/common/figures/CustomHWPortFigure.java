package de.uni_paderborn.fujaba.muml.hardware.common.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Color;


/**
 * The custom HWPort figure for all hardware ports.
 * @author adann
 *
 */
public class CustomHWPortFigure extends RectangleFigure {
	
	public enum HWPortKind {
		BUS,LINK
	}
	public boolean isDelegationPort;

	/**
	 * @generated
	 */
	private ScalablePolygonShape fFigureBusArrow;
	/**
	 * @generated
	 */
	private PolylineShape fFigureP2PLine;
	/**
	 * @generated
	 */
	private Ellipse fFigureCircle1;
	/**
	 * @generated
	 */
	private Ellipse fFigureCircle2;

	/**
	 * @generated
	 */
	public CustomHWPortFigure() {
		this.setLayoutManager(new StackLayout());
		this.setFill(true);
		this.setBorder(new MarginBorder(1));
		createContents();
		setDelegationPort(false);
		setHWPortKind(HWPortKind.BUS);
	}
	
	public void setHWPortKind(HWPortKind portKind){
		this.getFigureBusArrow().setVisible(portKind==HWPortKind.BUS);
		this.getFigureP2PLine().setVisible(portKind==HWPortKind.LINK);
		this.getFigureCircle1().setVisible(portKind==HWPortKind.LINK);
		this.getFigureCircle2().setVisible(portKind==HWPortKind.LINK);
	}
	
	public void setDelegationPort(boolean isDelegationPort){
		Color newColor=ColorConstants.black;
		if(isDelegationPort){
			newColor=ColorConstants.gray;
		}
		this.getFigureBusArrow().setBackgroundColor(newColor);
		this.getFigureP2PLine().setBackgroundColor(newColor);
		this.getFigureCircle1().setBackgroundColor(newColor);
		this.getFigureCircle2().setBackgroundColor(newColor);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureBusArrow = new ScalablePolygonShape();

		fFigureBusArrow.addPoint(new Point(0,2));
		fFigureBusArrow.addPoint(new Point(2,4));
		fFigureBusArrow.addPoint(new Point(2,3));
		fFigureBusArrow.addPoint(new Point(4,3));
		fFigureBusArrow.addPoint(new Point(4,4));
		fFigureBusArrow.addPoint(new Point(6,2));
		fFigureBusArrow.addPoint(new Point(4,0));
		fFigureBusArrow.addPoint(new Point(4,1));
		fFigureBusArrow.addPoint(new Point(2,1));
		fFigureBusArrow.addPoint(new Point(2,0));
		fFigureBusArrow.addPoint(new Point(0,2));
		fFigureBusArrow.setFill(true);
		fFigureBusArrow.setOutline(false);
		fFigureBusArrow.setBackgroundColor(ColorConstants.black);

		this.add(fFigureBusArrow);

		fFigureP2PLine = new PolylineShape();

		fFigureP2PLine.addPoint(new Point(3,3));
		fFigureP2PLine.addPoint(new Point(11,3));
		fFigureP2PLine.addPoint(new Point(11,18));
		fFigureP2PLine.addPoint(new Point(18,18));
		fFigureP2PLine.setBackgroundColor(ColorConstants.black);

		this.add(fFigureP2PLine);

		fFigureCircle1 = new Ellipse();

		fFigureCircle1.setOutline(false);
		fFigureCircle1.setBackgroundColor(ColorConstants.black);
		fFigureCircle1.setLocation(new Point(2,1));
		fFigureCircle1.setSize(6,6);

		fFigureP2PLine.add(fFigureCircle1);

		fFigureCircle2 = new Ellipse();

		fFigureCircle2.setOutline(false);
		fFigureCircle2.setBackgroundColor(ColorConstants.black);
		fFigureCircle2.setLocation(new Point(14,16));
		fFigureCircle2.setSize(6,6);

		fFigureP2PLine.add(fFigureCircle2);

	}

	/**
	 * @generated
	 */
	public ScalablePolygonShape getFigureBusArrow() {
		return fFigureBusArrow;
	}

	/**
	 * @generated
	 */
	public PolylineShape getFigureP2PLine() {
		return fFigureP2PLine;
	}

	/**
	 * @generated
	 */
	public Ellipse getFigureCircle1() {
		return fFigureCircle1;
	}

	/**
	 * @generated
	 */
	public Ellipse getFigureCircle2() {
		return fFigureCircle2;
	}
	
	/**
	 * Sets the side that this Port lies at.
	 * 
	 * @param side
	 *            Can be a value of PositionConstants (WEST, NORTH, EAST,
	 *            SOUTH).
	 */
	public void setPortSide(int side) {
		switch (side) {
		case PositionConstants.WEST:
		//	setRotationInDegrees(0.0);
			break;

		default:
		case PositionConstants.NORTH:
			//setRotationInDegrees(90.0);
			break;

		case PositionConstants.EAST:
			//setRotationInDegrees(180.0);
			break;

		case PositionConstants.SOUTH:
			//setRotationInDegrees(270.0);
			break;

		}
	}

	

}
