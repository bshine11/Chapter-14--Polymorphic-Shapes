// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape {
	private  String name = "Triangle";
	private String message = "A Triangle has 3 sides.";
	private int side;
	private int startX;
	private int startY;
	//overloaded constructor
	public Shape2Triangle(int startX, int startY, int side){
		this.startX = startX;
		this.startY = startY;
		this.side = side;
	}
	
	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		Polygon triangle = new Polygon(); // triangle
		triangle.addPoint(startX, (startY + side));
		triangle.addPoint((startX + side), (startY + side));
		triangle.addPoint((startX + (side / 2)), startY);
		g.fillPolygon(triangle);
	}

	public void displayName(Graphics g) {
		g.drawString(name, startX-100, startY-50);
	}
	public  void displayNumSides(Graphics g){
		g.drawString(message, startX-100, startY + 185);
	}
	}