package slide7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListDemo extends JFrame {
	private String[] flagTitles = { "Vietnam", "Australia", "Canada", "China", "Denmark", "France", "Germany", "Norway",
			"United Kingdom" };
	private JList jlst = new JList(flagTitles);

	public ListDemo() {
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		add(new JLabel("Please choose a country:"), BorderLayout.NORTH);
		add(jlst, BorderLayout.CENTER);
		add(new JButton("OK"), BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ListDemo();
	}
}
