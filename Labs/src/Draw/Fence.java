package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Fence extends LandscapeObject{
	private String fenceColor;
	private String barColor;
	private int longFence;
	private int fenceWith=25;
	private int fenceHeight=100;
	
	public Fence(Graphics2D g2, int x, int y, double scale, int longFence,String s_fenceColor,String s_barColor) {
		super(g2, x, y, scale);
		this.fenceColor = "#" + s_fenceColor;
		this.longFence = longFence;
		this.barColor = "#" + s_barColor;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		applyScale();
		drawFence();
	}

	@Override
	public void applyScale() {
		// TODO Auto-generated method stub
		fenceWith = (int) (fenceWith * getScale());
		fenceHeight = (int)(fenceHeight * getScale());
		
	}
	public void drawFence() {	
		int moveX = 0;
		for(int i=0; i<longFence; i++) {
			int[] xPoints3 = {getStartX()+moveX,(getStartX()+fenceWith/2)+moveX,(getStartX()+fenceWith)+moveX,(getStartX()+fenceWith)+moveX,getStartX()+moveX};
			int[] yPointS3 = {getStartY(),getStartY()-fenceWith,getStartY(),getStartY()+fenceHeight,getStartY()+fenceHeight};
			Polygon fence = new Polygon(xPoints3,yPointS3,5);
			g2.setColor(Color.decode(fenceColor));
			g2.fillPolygon(fence);
			moveX += (fenceWith+fenceWith/2);
			//totalWith += fenceWith + (fenceWith+fenceWith/2);
		}
		g2.setColor(Color.decode(barColor));
		var emptyRR2 = new Rectangle2D.Double(getStartX(),getStartY()+(fenceWith/2),moveX-(fenceWith/2),fenceWith/2);
		//g2.setColor(Color.decode(barColor));
		g2.fill(emptyRR2);
		var emptyRR3 = new Rectangle2D.Double(getStartX(),getStartY()+fenceWith*3,moveX-(fenceWith/2),fenceWith/2);
		g2.fill(emptyRR3);
	}
}
																																																																																																																																																																																						