package slide7;

import java.awt.Color;

import javax.swing.JPanel;

public class DrawRect_Shape {
	private int xStar, yStar, xEnd, yEnd;
	private Color color;

	public int getxStar() {
		return xStar;
	}

	public void setxStar(int xStar) {
		this.xStar = xStar;
	}

	public int getyStar() {
		return yStar;
	}

	public void setyStar(int yStar) {
		this.yStar = yStar;
	}

	public int getxEnd() {
		return xEnd;
	}

	public void setxEnd(int xEnd) {
		this.xEnd = xEnd;
	}

	public int getyEnd() {
		return yEnd;
	}

	public void setyEnd(int yEnd) {
		this.yEnd = yEnd;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public DrawRect_Shape(int xStar, int yStar, int xEnd, int yEnd, Color color) {
		super();
		this.xStar = xStar;
		this.yStar = yStar;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
		this.color = color;
	}

}
