// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape {
	private  String name = "Octagon";
	private String message = "A Octagon has 8 sides.";
	private int side;
	private int startX;
	private int startY;
	//overloaded constructor
	public Shape3Octagon(int startX, int startY, int side)
	{
		this.startX = startX;
		this.startY = startY;
		this.side = side;
	}
	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		Polygon octagon = new Polygon();
		//top left to top right
		octagon.addPoint((startX + side), startY); //top left
		octagon.addPoint(startX, (startY + side)); //left
		octagon.addPoint(startX, (startY + (2 * side))); //left
		octagon.addPoint((startX + side), (startY + (3 * side))); //bottom left
		octagon.addPoint(startX + (2 * side), (startY + (3 * side))); //bottom
		octagon.addPoint(startX + (3 * side), (startY + (2 * side))); //bottom right
		octagon.addPoint(startX + (3 * side), (startY + side)); //right
		octagon.addPoint(startX + (2 * side), startY); //top right
		g.fillPolygon(octagon);
	}

	public void displayName(Graphics g) {
		g.drawString(name, startX - 120, startY);
	}
	public  void displayNumSides(Graphics g){
		g.drawString(message, startX-100, startY + 250);
	}
	}