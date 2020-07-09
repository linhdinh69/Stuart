package slide7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX1_134 extends JFrame {
	int xetDau;
	double ketQua;

	public EX1_134() {

		setLayout(new GridLayout(5, 1, 5, 5));

		JPanel pan1 = new JPanel();
		pan1.setLayout(new FlowLayout());
		pan1.add(new JLabel("So thu 1"));
		JTextField txtNumber1 = new JTextField(8);
		pan1.add(txtNumber1);
		add(pan1);

		JPanel pan2 = new JPanel();
		pan2.setLayout(new FlowLayout());
		JButton buttonAdd = new JButton("+");
		pan2.add(buttonAdd);
		JButton buttonSubtract = new JButton("-");
		pan2.add(buttonSubtract);
		JButton buttonMutil = new JButton("*");
		pan2.add(buttonMutil);
		JButton buttonDiv = new JButton("/");
		pan2.add(buttonDiv);
		add(pan2);
		JPanel pan3 = new JPanel();
		pan3.setLayout(new FlowLayout());
		pan3.add(new JLabel("So thu 2"));
		JTextField txtNumber2 = new JTextField(8);
		pan3.add(txtNumber2);
		add(pan3);

		JPanel pan4 = new JPanel();
		JButton buttonBang = new JButton("=");
		pan4.add(buttonBang);
		add(pan4);

		JPanel pan5 = new JPanel();
		pan5.setLayout(new FlowLayout());
		JLabel texKetQua = new JLabel("Ket Qua");
		pan5.add(texKetQua);
		JTextField txtKetQua = new JTextField(8);
		pan5.add(txtKetQua);
		add(pan5);

		buttonAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xetDau = 1;

			}
		});
		buttonSubtract.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xetDau = 2;

			}
		});
		buttonMutil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xetDau = 3;

			}
		});
		buttonDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xetDau = 4;

			}
		});

		buttonBang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtNumber1.getText());
				double b = Double.parseDouble(txtNumber2.getText());

				switch (xetDau) {
				case 1:
					ketQua = a + b;
					break;
				case 2:
					ketQua = a - b;
					break;
				case 3:
					ketQua = a * b;
					break;
				case 4:
					ketQua = (double) a / b;
					break;
				}

				txtKetQua.setText(ketQua + "");
			}
		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) {
		new EX1_134();

	}
}
