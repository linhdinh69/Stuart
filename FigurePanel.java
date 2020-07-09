package slide7;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FigurePanel extends JPanel {
	public static final int LINE = 1;
	public static final int RECTANGLE = 2;
	public static final int ROUND_RECTANGLE = 3;
	public static final int OVAL = 4;
	private int type = 0;
	private boolean fill = false;
	private Color color;

	/**
	 * @param type
	 * @param fill
	 */
	public FigurePanel(int type, boolean fill, Color color) {
		super();
		this.type = type;
		this.fill = fill;
		this.color = color;
	}

	/**
	 * @param type
	 */
	public FigurePanel(int type, Color color) {
		super();
		this.type = type;
		this.color = color;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		int width = getWidth();
		int height = getHeight();
		switch (type) {
		case LINE: // Display two cross lines
			g.setColor(color);
			g.drawLine(10, 10, width - 10, height - 10);
			g.drawLine(width - 10, 10, 10, height - 10);
			break;
		case RECTANGLE: // Display a rectangle
			g.setColor(color);
			if (fill)
				g.fillRect(0, 0, getWidth(), getHeight());
			else
				g.drawRect(0, 0, getWidth(), getHeight());
			break;
		case ROUND_RECTANGLE: // Display a round-cornered rectangle
			g.setColor(color);
			if (fill)
				g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
			else
				g.drawRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
			break;
		case OVAL:
			g.setColor(color);
			if (fill)
				g.fillOval(0, 0, getWidth(), getHeight());
			else
				g.drawOval(0, 0, getWidth(), getHeight());

		}
	}
}
