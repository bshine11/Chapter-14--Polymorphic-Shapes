import java.awt.Color;
import java.awt.Graphics;

public class Shape4Circle implements Shape {
	private  String name = "Circle";
	private String message = "A Circle has 0 sides.";
	private int startX;
	private int startY;
	private int radius;
	//overloaded constructor
	public Shape4Circle(int startX, int startY, int radius){
		this.startX = startX;
		this.startY = startY;
		this.radius = radius;
	}
	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(startX, startY, radius, radius);
	}

	public void displayName(Graphics g) {
		g.drawString(name, startX - 75, startY -25);
	}
	public  void displayNumSides(Graphics g){
		g.drawString(message, startX -75, startY +225);
	}
}