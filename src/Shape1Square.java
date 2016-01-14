// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape {
	private String name = "Square";
	private String message = "A Square has 4 sides.";
	private int side;
	private int startX;
	private int startY;

	
	
	//overloaded constructor
	public Shape1Square(int startX, int startY, int side){
		this.startX = startX;
		this.startY = startY;
		this.side = side;

	}
	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(startX, startY, side, side);

	}

	public void displayName(Graphics g) {
		g.drawString(name, startX-70, startY-50);
	}

	public void displayNumSides(Graphics g) {
		g.drawString(message, startX -50, startY+ 185);
	}
}