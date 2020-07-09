package slide7;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class EX9 extends JFrame {
	private JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5, jrb6, jrb7, jrb8, jrb9, jrb10, jrb11, jrb12, jrb13, jrb14, jrb15,
			jrb16, jrb17, jrb18;

	public EX9() {
		setLayout(new BorderLayout());

		JPanel panalFull = new JPanel();

		panalFull.setLayout(new BoxLayout(panalFull, BoxLayout.X_AXIS));
		add(panalFull, BorderLayout.CENTER);
		add(new JScrollPane(panalFull));
		add(new JScrollPane(panalFull));
		JPanel panelText = new JPanel();
		panalFull.add(panelText);
		panelText.setLayout(new GridLayout(7, 1));
		panelText.add(new JLabel("						"));
		panelText.add(new JLabel("Household"));
		panelText.add(new JLabel("Office"));
		panelText.add(new JLabel("Extended Family"));
		panelText.add(new JLabel("Company (US)"));
		panelText.add(new JLabel("Company (World)"));
		panelText.add(new JLabel("Team"));

		JPanel panelRadio = new JPanel();
		panelRadio.setLayout(new BoxLayout(panelRadio, BoxLayout.Y_AXIS));
		JPanel panelSo = new JPanel();
		panalFull.add(panelRadio);
		panelRadio.add(panelSo);
		panelSo.setLayout(new GridLayout(1, 3));
		panelSo.add(new JLabel("0-1"));
		panelSo.add(new JLabel("2-5"));
		panelSo.add(new JLabel("6-10"));

		JPanel line1 = new JPanel();
		panelRadio.add(line1);
		line1.setLayout(new GridLayout(1, 3));
		line1.add(jrb1 = new JRadioButton());
		line1.add(jrb2 = new JRadioButton());
		line1.add(jrb3 = new JRadioButton());
		ButtonGroup group1 = new ButtonGroup();
		group1.add(jrb1);
		group1.add(jrb2);
		group1.add(jrb3);
		JPanel line2 = new JPanel();
		panelRadio.add(line2);
		line2.setLayout(new GridLayout(1, 3));
		line2.add(jrb4 = new JRadioButton());
		line2.add(jrb5 = new JRadioButton());
		line2.add(jrb6 = new JRadioButton());
		ButtonGroup group2 = new ButtonGroup();
		group2.add(jrb4);
		group2.add(jrb5);
		group2.add(jrb6);
		JPanel line3 = new JPanel();
		panelRadio.add(line3);
		line3.setLayout(new GridLayout(1, 3));
		line3.add(jrb7 = new JRadioButton());
		line3.add(jrb8 = new JRadioButton());
		line3.add(jrb9 = new JRadioButton());
		ButtonGroup group3 = new ButtonGroup();
		group3.add(jrb7);
		group3.add(jrb8);
		group3.add(jrb9);
		JPanel line4 = new JPanel();
		panelRadio.add(line4);
		line4.setLayout(new GridLayout(1, 3));
		line4.add(jrb10 = new JRadioButton());
		line4.add(jrb11 = new JRadioButton());
		line4.add(jrb12 = new JRadioButton());
		ButtonGroup group4 = new ButtonGroup();
		group4.add(jrb10);
		group4.add(jrb11);
		group4.add(jrb12);
		JPanel line5 = new JPanel();
		panelRadio.add(line5);
		line5.setLayout(new GridLayout(1, 3));
		line5.add(jrb13 = new JRadioButton());
		line5.add(jrb14 = new JRadioButton());
		line5.add(jrb15 = new JRadioButton());
		ButtonGroup group5 = new ButtonGroup();
		group5.add(jrb13);
		group5.add(jrb14);
		group5.add(jrb15);
		JPanel line6 = new JPanel();
		panelRadio.add(line6);
		line6.setLayout(new GridLayout(1, 3));
		line6.add(jrb16 = new JRadioButton());
		line6.add(jrb17 = new JRadioButton());
		line6.add(jrb18 = new JRadioButton());
		ButtonGroup group6 = new ButtonGroup();
		group6.add(jrb16);
		group6.add(jrb17);
		group6.add(jrb18);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		new EX9();
	}
}
