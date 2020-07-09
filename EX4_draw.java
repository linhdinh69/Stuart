package slide7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EX4_draw extends JFrame {
	private JPanel panelButton, panelDraw;
	private JButton btBlack, btRed, btGreen, btOrange, btYellow, btClear;
	private JButton[] listBtColor = { btBlack, btRed, btGreen, btOrange, btYellow, btClear };
	private Color[] listColor = { Color.BLACK, Color.RED, Color.GREEN, Color.ORANGE, Color.YELLOW };
	private Dimension dimension = new Dimension(100, 50);
	private int x, y;
	private Graphics g;
	Draw draw;
	ArrayList<Rectangle> arr;

	public EX4_draw() {
		setLayout(new BorderLayout());

		add(panelDraw = new JPanel());
		panelDraw.setPreferredSize(new Dimension(500, 500));
		panelDraw.setLayout(new BoxLayout(panelDraw, BoxLayout.Y_AXIS));
		panelDraw.add(new JLabel("add a retangle doing press, drag and relead"));

		panelDraw.add(draw = new Draw());

		getContentPane().add(panelButton = new JPanel(), BorderLayout.SOUTH);

		for (int i = 0; i < listBtColor.length; i++) {

			panelButton.add(listBtColor[i] = new JButton());
			listBtColor[i].setPreferredSize(dimension);
			if (i < listColor.length)
				listBtColor[i].setBackground(listColor[i]);
		}
		listBtColor[listBtColor.length - 1].setPreferredSize(new Dimension(150, 50));
		listBtColor[listBtColor.length - 1].setText("Clear");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}

	class Draw extends JPanel {
		Point pointStar = null;
		Point pointEnd = null;
		{
			addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					pointStar = e.getPoint();
					System.out.println(pointStar.x + " " + pointStar.y);
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}
			});
			addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					pointEnd = e.getPoint();
					repaint();

				}
			});
		}

		public void paint(Graphics g) {
			super.paint(g);
			Graphics g2 = g;

			if (pointStar != null) {
				g.setColor(Color.red);
				g.drawRect(pointStar.x, pointStar.y, pointEnd.x, pointEnd.y);
				arr.add(new Rectangle(pointStar.x, pointStar.y, pointStar.x - pointEnd.x, pointStar.y - pointEnd.y));
			}

			if (!arr.isEmpty()) {
				for (int i = 0; i < arr.size(); i++) {
					g.setColor(Color.red);
					g.drawRect(arr.get(i).x, arr.get(i).y, arr.get(i).width, arr.get(i).height);
				}
			}
		}
	}

	public static void main(String[] args) {
		new EX4_draw();
	}
}
