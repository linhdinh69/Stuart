package slide7;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class EX10_144 extends JFrame {

	public EX10_144() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());

		ImageIcon image = new ImageIcon("Image/2019-11-25 (10).png");

		JScrollBar barHori = new JScrollBar(JScrollBar.HORIZONTAL);
		JScrollBar barVeti = new JScrollBar(JScrollBar.VERTICAL);

		add(new JLabel(image), BorderLayout.CENTER);
		add(barHori, BorderLayout.SOUTH);
		add(barVeti, BorderLayout.EAST);
		add(new JLabel("The new is 70"), BorderLayout.NORTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new EX10_144();
	}
}
