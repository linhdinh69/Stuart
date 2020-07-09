package slide7;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class EX11_146_2 extends JFrame {
	private String[] list = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve" };
	private JCheckBox chBox1, chBox2, chBox3, chBox4, chBox5, chBox6, chBox7, chBox8, chBox9, chBox10, chBox11, chBox12;

	public EX11_146_2() {

		setLayout(new BorderLayout());
		String i="C";
		JList jlist = new JList(list);
		add(jlist, BorderLayout.WEST);
		JPanel panelCheckBox = new JPanel();
		panelCheckBox.setLayout(new BoxLayout(panelCheckBox, BoxLayout.Y_AXIS));
		add(panelCheckBox, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		new EX11_146_2();
	}
}
