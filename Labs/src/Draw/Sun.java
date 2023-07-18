package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Sun extends LandscapeObject {
	
	private String sunColor;
	private int sunWidth = 20;
	private int sunHeigth = 20;
	public Sun(Graphics2D g2, int x, int y, double scale, String s_sunColor) {
		super(g2,x,y,scale);
		this.sunColor = "#" + s_sunColor;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		applyScale();
		drawSun();
	}
	@Override
	public void applyScale() {
		// TODO Auto-generated method stub
		sunWidth = (int)(sunWidth*getScale());
		sunHeigth = (int)(sunHeigth*getScale());
	}
	public void drawSun() {
		var sun = new Ellipse2D.Double(getStartX(),getStartY(),sunWidth,sunHeigth);
		g2.setColor(Color.decode(sunColor));
		g2.fill(sun);
		
		g2.setStroke(new BasicStroke(5));
		var line1 = new Line2D.Double(getStartX(),getStartY(),getStartX()+ sunWidth,getStartY() + sunHeigth);
		g2.draw(line1);
		var line2 = new Line2D.Double(getStartX(),getStartY()+ sunHeigth,getStartX()+ sunWidth,getStartY());
		g2.draw(line2);
		var line3 = new Line2D.Double(getStartX()+(sunWidth/2),getStartY()-(sunHeigth/5),getStartX()+(sunWidth/2),getStartY()+sunHeigth+(sunHeigth/5));
		g2.draw(line3);
		var line4 = new Line2D.Double(getStartX()-(sunWidth/5),getStartY()+(sunHeigth/2),(getStartX()+sunWidth)+(sunWidth/5),getStartY()+(sunHeigth/2));
		g2.draw(line4);
	}
	
}
