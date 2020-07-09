package slide7;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EX11_145 extends JFrame {
	private String[] list = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve" };
	private JCheckBox chBox1, chBox2, chBox3, chBox4, chBox5, chBox6, chBox7, chBox8, chBox9, chBox10, chBox11, chBox12,
			chBox13;
	private JCheckBox[] listCheckBoxs = { chBox1, chBox2, chBox3, chBox4, chBox5, chBox6, chBox7, chBox8, chBox9,
			chBox10, chBox11, chBox12, chBox13 };

	public EX11_145() {

		setLayout(new BorderLayout());

		JList jlist = new JList(list);
		add(jlist, BorderLayout.WEST);
		JPanel panelCheckBox = new JPanel();
		panelCheckBox.setLayout(new BoxLayout(panelCheckBox, BoxLayout.Y_AXIS));
		add(panelCheckBox, BorderLayout.CENTER);

		for (int i = 0; i < listCheckBoxs.length; i++) {
			panelCheckBox.add(listCheckBoxs[i] = new JCheckBox());
			listCheckBoxs[i].setEnabled(false);
			listCheckBoxs[i].setText(" selectoin " + i);
		}

		jlist.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!listCheckBoxs[jlist.getSelectedIndex()].isSelected())
					listCheckBoxs[jlist.getSelectedIndex()].setSelected(true);
				else
					listCheckBoxs[jlist.getSelectedIndex()].setSelected(false);

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		pack();
	}

	public static void main(String[] args) {
		new EX11_145();
	}
}
