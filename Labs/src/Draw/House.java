package Draw;

import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class House extends LandscapeObject{
	
	private String colorWall;
	private String colorRoof;
	private String colorChimeny;
	private String colorDoor;
	private String colorWindow;
	private int widthWall = 120;
	private int heigthWall = 120;
	private int widthDoor= widthWall/3;
	private int heightDoor=widthDoor*2;
	private int widthWindow=widthWall/2;
	private int heigthWindow=widthDoor;
	//private int widthRoof= widthWall+(widthWall/2);
	private int widthRoof= widthWall;
	private int heightRoof=widthRoof/2;

	public House(Graphics2D g2, int x, int y, double scale, String s_colorWall, String s_colorRoof,String s_colorChimeny, String s_colorDoor, String s_colorWindow) {
		super(g2,x,y,scale);
		this.colorWall = "#" + s_colorWall;
		this.colorRoof = "#" + s_colorRoof;
		this.colorChimeny = "#" + s_colorChimeny;
		this.colorDoor = "#" + s_colorDoor;
		this.colorWindow = "#" + s_colorWindow;
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		applyScale();
		drawHouse();
		
	}

	@Override
	public void applyScale() {
		// TODO Auto-generated method stub
		widthWall = (int) (widthWall * getScale());
		heigthWall = (int)(heigthWall * getScale());
		widthDoor = (int) (widthDoor * getScale());
		heightDoor = (int)(heightDoor * getScale());
		widthWindow = (int) (widthWindow * getScale());
		heigthWindow = (int)(heigthWindow * getScale());
		widthRoof = (int) (widthRoof * getScale());
		heightRoof = (int)(heightRoof * getScale());
		
		
	}
	public void drawHouse() {
		var wall = new Rectangle2D.Double(getStartX(),getStartY(),widthWall,heigthWall);
		g2.setColor(Color.decode(colorWall));
		g2.fill(wall);
		var door = new Rectangle2D.Double(getStartX()+(widthWall*0.55),getStartY()+heigthWall/3,widthDoor,heightDoor);
		g2.setColor(Color.decode(colorDoor));
		g2.fill(door);
		
		/*var window = new Rectangle2D.Double(getStartX()+(widthWindow*0.25),getStartY()+heigthWall/3,widthDoor,heigthWindow);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		g2.draw(window);
		g2.setColor(Color.decode(colorWindow));
		g2.fill(window);*/
		
		var window1 = new Rectangle2D.Double(getStartX()+(widthWindow*0.25),getStartY()+heigthWall/3,widthDoor/2,heigthWindow/2);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		g2.draw(window1);
		g2.setColor(Color.decode(colorWindow));
		g2.fill(window1);
		
		//var window2 = new Rectangle2D.Double(getStartX()+(widthWindow*0.25),getStartY()+heigthWall/3,widthDoor/2,heigthWindow/2);
		var window2 = new Rectangle2D.Double(getStartX()+(widthWindow*0.60),getStartY()+heigthWall/3,widthDoor/2,heigthWindow/2);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		g2.draw(window2);
		g2.setColor(Color.decode(colorWindow));
		g2.fill(window2);
		
		var window3 = new Rectangle2D.Double(getStartX()+(widthWindow*0.25),getStartY()+heigthWall*0.51,widthDoor/2,heigthWindow/2);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		g2.draw(window3);
		g2.setColor(Color.decode(colorWindow));
		g2.fill(window3);
		
		var window4 = new Rectangle2D.Double(getStartX()+(widthWindow*0.60),getStartY()+heigthWall*0.51,widthDoor/2,heigthWindow/2);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		g2.draw(window4);
		g2.setColor(Color.decode(colorWindow));
		g2.fill(window4);
		
		//Creating Triangles to create
		
		int[] xPoints2 = {(getStartX()-(widthDoor/2)),(getStartX()+(widthRoof/2)),getStartX()+widthRoof+(widthDoor/2)};
		int[] yPoints2 = {getStartY(), getStartY()-(widthRoof/2), getStartY()};
		//g2.drawPolygon(xPoints2, yPoints2, 3);
		Polygon triangle2 = new Polygon(xPoints2,yPoints2,3);
		g2.setColor(Color.decode(colorRoof));
		g2.fillPolygon(triangle2);
		
		//Creating Chimeny
		/*var chimeny = new Rectangle2D.Double(getStartX()+(widthRoof/4),widthDoor/2,);
		g2.setColor(Color.decode(colorDoor));
		g2.fill(door);*/
		
		
		/*var line1 = new Line2D.Double(getStartX()+(widthWindow*0.25),(getStartY()+heigthWall/3)+(heigthWindow/2),(getStartX()+widthWindow-0.01),(getStartY()+heigthWall/3)+(heigthWindow/2));
		g2.setColor(Color.BLACK);
		g2.draw(line1);*/
	}
}
