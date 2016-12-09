package edu.stevens;

/*
 * @author:
 * Draw SVG polygon
 */
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;
public class Polyline {
	private String points,stroke,strokeWidth,color,fillRule,fillOpacity,strokeOpacity,opacity;
	private SVGDocument doc;
	public Polyline(String points,String color,String stroke, String strokeWidth,String strokeOpacity,String fillRule,String fillOpacity,String opacity,SVGDocument doc){
		this.points = points;
		this.color = color;
		this.stroke = stroke;
		this.strokeWidth = strokeWidth;
		this.fillRule = fillRule;
		this.opacity = opacity;
		this.fillOpacity = fillOpacity;
		this.strokeOpacity = strokeOpacity;
		this.doc = doc;
	}	
	public Element paint() {
		// Create the polygon
		Element polyline = doc.createElementNS("http://www.w3.org/2000/svg", "polyline");
		polyline.setAttributeNS(null, "points", points);
		polyline.setAttributeNS(null, "stroke", stroke);
		polyline.setAttributeNS(null, "stroke-width", strokeWidth);
		polyline.setAttributeNS(null, "fill", color);
		polyline.setAttributeNS(null, "fill-rule", fillRule);
		polyline.setAttributeNS(null, "fill-opacity", fillOpacity);
		polyline.setAttributeNS(null, "stroke-opacity", strokeOpacity);
		polyline.setAttributeNS(null, "opacity", opacity);
		return polyline;	
	}
}
