package slide7;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout extends JFrame {
	ImageIcon image = new ImageIcon("C:\\Users\\HP\\Downloads\\IMG_20200308_074827.jpg");

	public ShowBorderLayout(String title) {
		super(title);
		setLayout(new BorderLayout(5, 10));
		add(new JButton("East"), BorderLayout.EAST);

		add(new JButton(image), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) {
		new ShowBorderLayout("ShowBorderLayout");
	}
}
