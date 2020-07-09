package slide7;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1_Draw extends JFrame {
	public Ex1_Draw() {
		setLayout(new GridLayout(7, 7));
		for (int i = 1; i <= 49; i++) {
			JPanel jPanel = new JPanel();
			if (i % 2 == 0) {
				add(new FigurePanel(FigurePanel.RECTANGLE, true,Color.BLACK));
			} else {
				add(new FigurePanel(FigurePanel.RECTANGLE, false,Color.black));
			}
		}
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Ex1_Draw ex1 = new Ex1_Draw();
		ex1.setTitle("Grid Test");
		ex1.setVisible(true);
	}
}
