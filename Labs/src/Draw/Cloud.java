package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Cloud extends LandscapeObject{
	//Attributes
	private String cloudColor;
	private int cloudWith=24;
	private int cloudHeight=12;
	
	public Cloud(Graphics2D g2, int x, int y, double scale, String s_cloudColor) {
		super(g2, x, y, scale);
		this.cloudColor = "#" + s_cloudColor;
	}
	
	public void draw() {
		applyScale();
		drawCloud();
		
	}

	@Override
	public void applyScale() {
		// TODO Auto-generated method stub
		cloudWith = (int) (cloudWith * getScale());
		cloudHeight = (int)(cloudHeight * getScale());
	}
	public void drawCloud() {
		
		Ellipse2D.Double elipse3 = new Ellipse2D.Double(getStartX()+cloudWith/2,getStartY()-cloudHeight/2,cloudWith,cloudHeight);
		g2.setColor(Color.decode(cloudColor));
		g2.fill(elipse3);
		
		Ellipse2D.Double elipse1 = new Ellipse2D.Double(getStartX(),getStartY(),cloudWith,cloudHeight);
		g2.setColor(Color.decode(cloudColor));
		g2.fill(elipse1);
		
		Ellipse2D.Double elipse2 = new Ellipse2D.Double(getStartX()+cloudWith/2,getStartY()+cloudHeight/2,cloudWith,cloudHeight);
		g2.setColor(Color.decode(cloudColor));
		g2.fill(elipse2);
		
		Ellipse2D.Double elipse4 = new Ellipse2D.Double(getStartX()+cloudWith,getStartY(),cloudWith,cloudHeight);
		g2.setColor(Color.decode(cloudColor));
		g2.fill(elipse4);
	}

}
