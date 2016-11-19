package edu.stevens.XDF._2dGraphics;

/*
 * @author:Jiahui Zhang
 * Draw SVG ellipse
 */

import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

public class Ellipse extends Shape{
	private String rx,ry,stroke,strokeWidth,color;
	private SVGDocument doc;
	public Ellipse(String cx,String cy,String rx,String ry,String color,String stroke, String strokeWidth,SVGDocument doc){
		super(cx,cy,color,doc);
		this.rx = rx;
		this.ry = ry;
		this.stroke = stroke;
		this.strokeWidth = strokeWidth;
	}	
	public Element paint() {
		// Create the ellipse
		Element ellipse = doc.createElementNS("http://www.w3.org/2000/svg", "ellipse");
		ellipse.setAttributeNS(null, "cx", x);
		ellipse.setAttributeNS(null, "cy", y);
		ellipse.setAttributeNS(null, "rx", rx);
		ellipse.setAttributeNS(null, "ry", ry);
		ellipse.setAttributeNS(null, "stroke", stroke);
		ellipse.setAttributeNS(null, "stroke-width", strokeWidth);
		ellipse.setAttributeNS(null, "fill", color);
		return ellipse;	
	}
}
