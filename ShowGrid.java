package slide7;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGrid extends JFrame {
	public ShowGrid(String title) {
		super(title);
		setLayout(new GridLayout(3, 2, 5, 5));
		// Add labels and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("First Name"));
		add(new JTextField(8));
		setSize(300, 180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ShowGrid showGrid = new ShowGrid("Show Grid");
	}
}
