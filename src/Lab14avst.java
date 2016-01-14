/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 1-12-16             
 * Polymorphic Shapes                *
 *                                   *
 ************************************/


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

public class Lab14avst extends Applet {
	public void init() {
		setSize(900, 700);
	}

	public void paint(Graphics g) {
		Shape square = new Shape1Square(100,100,150);
		Shape triangle = new Shape2Triangle(550,100,150);
		Shape octagon = new Shape3Octagon(150,350,50);
		Shape circle = new Shape4Circle(525,375,150);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(square);
		shapes.add(triangle);
		shapes.add(octagon);
		shapes.add(circle);
		for (Shape shape : shapes) {
			shape.drawShape(g);
			shape.displayName(g);
			shape.displayNumSides(g);
		}
		drawGrid(g);
	}

	public void drawGrid(Graphics g) {
		g.drawRect(10, 10, 800, 600);
		g.drawLine(10, 300, 810, 300);
		g.drawLine(410, 10, 410, 610);
	}

}