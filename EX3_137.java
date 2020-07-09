package slide7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class EX3_137 extends JFrame {
	private JMenuItem itemAdd, itemSub, itemMulti, itemDiv;
	private JTextField textField1, textField2, textField3;
	private JButton btnPlus, btnSub, btnMuti, btnDiv;

	public EX3_137() {
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JMenuBar jMenuBar = new JMenuBar();
		setJMenuBar(jMenuBar);
		JMenu op = new JMenu("operation");
		op.add(itemAdd = new JMenuItem("Add"));
		itemAdd.setMnemonic('A');
		op.add(itemSub = new JMenuItem("Substrac"));
		itemSub.setMnemonic('S');
		op.add(itemMulti = new JMenuItem("Multiply"));
		itemMulti.setMnemonic('M');
		op.add(itemDiv = new JMenuItem("Divine"));
		itemDiv.setMnemonic('D');
		jMenuBar.add(op);
		JMenu he = new JMenu("help");
		jMenuBar.add(he);

		JPanel pan1 = new JPanel();
		pan1.setLayout(new FlowLayout());
		pan1.add(new JLabel("Number 1"));
		pan1.add(textField1 = new JTextField(8));
		pan1.add(new JLabel("Number 2"));

		pan1.add(textField2 = new JTextField(8));
		pan1.add(new JLabel("Result"));
		pan1.add(textField3 = new JTextField(8));
		textField3.setEditable(false);

		add(pan1);
		JPanel pan2 = new JPanel();
		pan2.setLayout(new FlowLayout());
		pan2.add(btnPlus = new JButton("Add"));
		pan2.add(btnSub = new JButton("Substract"));
		pan2.add(btnMuti = new JButton("Multiply"));
		pan2.add(btnDiv = new JButton("Divide"));

		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField1.getText().toString());
				double num2 = Double.parseDouble(textField2.getText().toString());

				textField3.setText((num1 + num2) + "");
			}
		});
		btnSub.addActionListener(new ActionListener() {
			double num1 = Double.parseDouble(textField1.getText());
			double num2 = Double.parseDouble(textField2.getText());

			public void actionPerformed(ActionEvent e) {
				textField3.setText((num1 - num2) + "");
			}
		});
		btnMuti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField1.getText().toString());
				double num2 = Double.parseDouble(textField2.getText().toString());

				textField3.setText((num1 * num2) + "");
			}
		});
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField1.getText().toString());
				double num2 = Double.parseDouble(textField2.getText().toString());

				textField3.setText((num1 / num2) + "");
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pan2);
		setVisible(true);
		setLocationRelativeTo(null);
		pack();
	}

	public static void main(String[] args) {
		new EX3_137();
	}
}
