package slide7;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class EX4_138 extends JFrame {
	private JLabel labelRed, labelBlue, labelYellow;
	private JRadioButton rdb1, rdb2, rdb3;

	public EX4_138() {
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JPanel panelDen = new JPanel();
		panelDen.setBorder(new TitledBorder("Thay đổi tính hiệu giao thông"));
		panelDen.setLayout(new GridLayout(3, 1, 5, 5));
		panelDen.add(labelRed = new JLabel("-Do"));
		panelDen.add(labelBlue = new JLabel("-Xanh"));
		panelDen.add(labelYellow = new JLabel("-Vang"));
		add(panelDen);

		JPanel label2 = new JPanel();
		label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
		label2.add(new JLabel("Chon đen "));
		label2.add(rdb1 = new JRadioButton("Do"));
		label2.add(rdb2 = new JRadioButton("Xanh"));
		label2.add(rdb3 = new JRadioButton("Vàng"));
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdb1);
		buttonGroup.add(rdb2);
		buttonGroup.add(rdb3);
		add(label2);
		String daChon = ": Ban da chon mau ";
		rdb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelRed.setText(removeText(labelRed.getText(), daChon, rdb1.getText()));
				labelBlue.setText(removeText(labelBlue.getText(), daChon, rdb2.getText()));
				labelYellow.setText(removeText(labelYellow.getText(), daChon, rdb3.getText()));
				labelRed.setText(labelRed.getText() + daChon + rdb1.getText());
			}
		});
		rdb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelRed.setText(removeText(labelRed.getText(), daChon, rdb1.getText()));
				labelBlue.setText(removeText(labelBlue.getText(), daChon, rdb2.getText()));
				labelYellow.setText(removeText(labelYellow.getText(), daChon, rdb3.getText()));
				labelBlue.setText(labelBlue.getText() + daChon + rdb2.getText());
			}
		});
		rdb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelRed.setText(removeText(labelRed.getText(), daChon, rdb1.getText()));
				labelBlue.setText(removeText(labelBlue.getText(), daChon, rdb2.getText()));
				labelYellow.setText(removeText(labelYellow.getText(), daChon, rdb3.getText()));
				labelYellow.setText(labelYellow.getText() + daChon + rdb3.getText());
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}

	public static String removeText(String text, String replace, String mau) {
		text.replace(replace + mau, "");
		return text;
	}

	public static void main(String[] args) {
		new EX4_138();
	}
}
