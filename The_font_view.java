package slide7;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class The_font_view extends JFrame {
	private JButton buttonSo, buttonSo0, buttonStart, buttonStop;

	public The_font_view() {
		setLayout(new GridLayout());
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 3));
		for (int i = 1; i <= 9; i++) {
			panel1.add(buttonSo = new JButton("" + i));
		}
		panel1.add(buttonSo0 = new JButton("0"));
		panel1.add(buttonStart=new JButton("Start"));
		panel1.add(buttonStop=new JButton("Stop"));

		JPanel panelNho = new JPanel();
		panelNho.setLayout(new BorderLayout());
		panelNho.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
		panelNho.add(panel1, BorderLayout.CENTER);
		add(new JTextField("hfhfhod"));
		add(panelNho);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		The_font_view view = new The_font_view();
		view.setVisible(true);
	}
}
