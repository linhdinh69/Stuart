package slide7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EX5_139 extends JFrame {
	private JTextField txtName1, txtName2, txtSe, txtMmoney1, txtMoney2;
	private JRadioButton rbNam, rbNu;

	public String format(String txt) {
		String dinhDang = "###,###,###";
		DecimalFormat decimalFormat = new DecimalFormat(dinhDang);
		return decimalFormat.format(Double.valueOf(txt));
	}

	public EX5_139() {
		setLayout(new GridLayout(1, 3, 5, 5));

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3, 1, 5, 5));
		panel1.add(new JLabel("Ho ten"));
		panel1.add(new JLabel("Nam"));
		panel1.add(new JLabel("So tien"));
		add(panel1);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 1, 5, 5));
		panel2.add(txtName1 = new JTextField(15));
		JPanel panelCheck = new JPanel();
		panelCheck.setLayout(new GridLayout(1, 2));

		panelCheck.add(rbNam = new JRadioButton("Nam"));
		panelCheck.add(rbNu = new JRadioButton("Nu"));
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbNam);
		bg.add(rbNu);
		panelCheck.add(rbNam);
		panelCheck.add(rbNu);
		panel2.add(panelCheck);
		panel2.add(txtMmoney1 = new JTextField(15));
		add(panel2);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(3, 1, 5, 5));
		panel3.add(txtName2 = new JTextField(15));
		txtName2.setEditable(false);
		panel3.add(txtSe = new JTextField(15));
		txtSe.setEditable(false);
		panel3.add(txtMoney2 = new JTextField(15));
		txtMoney2.setEditable(false);
		add(panel3);

		txtName1.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == KeyEvent.VK_ENTER)
					txtName2.setText(txtName1.getText());
			}
		});

		rbNam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtSe.setText(rbNam.getText());

			}
		});

		rbNu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtSe.setText(rbNu.getText());

			}
		});

		txtMmoney1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == KeyEvent.VK_ENTER)

					txtMoney2.setText(format(txtMmoney1.getText()));
			}

		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();

	}

	public static void main(String[] args) {
		new EX5_139();
	}
}
