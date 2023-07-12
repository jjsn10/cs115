package Draw12a;

//package DrawBaseLine;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;
	

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	
	
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12a
	 * Draw all your objects in the paintComponent method.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer
		
		/*
		 * Use this section to write your code.
		 * DrawShapes
		 * Draw at least 6 shapes in BOTH draw and fill formats using methods found in the Graphics class and/or the Graphics2D class.
		 * In other words, if you draw an empty rectangle, you should also draw a filled rectangle.  That counts as one (1) shape.
		 * The empty and filled versions of the shape should be at different orientations.
		 * One of the shapes MUST be a triangle.
		 * Each shape should be a different color.  An empty and a filled rectangle may be the same color, but they must be a different color from an empty and filled triangle.
		 * At least one of the colors should NOT be a standard color from the COLOR palette.
		 * Each empty shape should have a different stroke size.
		 * Be sure all shapes are located such that they can all be seen.
		 */
		//Draw12a a rectangle
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(3));
		g2.drawRect(50, 50, 200, 100);
		//g2.rotate(Math.toRadians(45));
		g2.fillRect(300, 50, 100, 200);
		
		g2.setStroke(new BasicStroke(2));
		g2.setColor(new Color(250,120,20));
		Ellipse2D.Double elipse = new Ellipse2D.Double(450,50,100,150);
		//g2.rotate(Math.toRadians(45));
		g2.draw(elipse);
		
		g2.setColor(new Color(250,120,20));
		Ellipse2D.Double elipse2 = new Ellipse2D.Double(600,100,150,100);
		g2.fill(elipse2);
		
		g2.setColor(new Color(102,0,102));
		g2.setStroke(new BasicStroke(6));
		//int[] xPoints1 = {1000, 1100, 1200}; //Define the x cords for each point
		int[] xPoints1 = {800, 900, 1000}; 
		int[] yPoints1 = {250, 50, 250}; //Define the y cords for each point
		Polygon triangle = new Polygon(xPoints1,yPoints1,3);
		g2.drawPolygon(triangle);
		
		
		int[] xPoints2 = {1000, 1100, 1200}; 
		int[] yPoints2 = {50, 250, 50};
		g2.drawPolygon(xPoints2, yPoints2, 3);
		Polygon triangle2 = new Polygon(xPoints2,yPoints2,3);
		g2.fillPolygon(triangle2);
		
		g2.setColor(new Color(0,153,153));
		Ellipse2D.Double circle = new Ellipse2D.Double(50,400,200,200);
		g2.draw(circle);
		
		g2.setColor(new Color(0,153,153));
		Ellipse2D.Double circle2 = new Ellipse2D.Double(300,400,200,200);
		g2.fill(circle2);
		
		int[] xPoints3 = {540,615,690,765,690,615};
		int[] yPoints3 = {500,400,400,500,600,600};
		g2.setStroke(new BasicStroke(7));
		g2.setColor(new Color(153,51,255));
		Polygon hexa = new Polygon(xPoints3,yPoints3,6);
		g2.drawPolygon(hexa);
		
		int[] xPoints4 = {780,855,930,1005,930,855};
		int[] yPoints4 = {500,400,400,500,600,600};
		g2.setStroke(new BasicStroke(7));
		g2.setColor(new Color(153,51,255));
		Polygon hexa2 = new Polygon(xPoints4,yPoints4,6);
		g2.fill(hexa2);
		
		g2.setColor(Color.decode("#008a2e"));
		g2.setStroke(new BasicStroke(4));
		
		var emptyRR2 = new RoundRectangle2D.Double(1020,400,100,300, 30, 30);
		g2.draw(emptyRR2);
		
		var emptyRR = new RoundRectangle2D.Double(350,1250,300, 100, 30, 30);
		g2.rotate(Math.toRadians(-45));
		g2.fill(emptyRR);
		
		
	}//end of method paintComponent(Graphics)

}//end of class DrawPanel