package slide7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX12_146 extends JFrame {
	JMenu file, help;
	JButton btnSp, btnCE, btnC, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPoint, btnAdd, btnNeg,
			btnMuth, btnDiv, btnEq;
	Dimension dms = new Dimension(100, 30);

	public EX12_146() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());

		JMenuBar menuBar = new JMenuBar();
		menuBar.add(file = new JMenu("File"));
		file.setMnemonic('F');
		menuBar.add(help = new JMenu("Help"));
		help.setMnemonic('H');
		setJMenuBar(menuBar);

		JTextField textField = new JTextField();
		add(textField, BorderLayout.NORTH);

		JPanel panelButton = new JPanel();
		add(panelButton, BorderLayout.CENTER);
		panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.Y_AXIS));
		JPanel panelOpti = new JPanel();
		panelButton.add(panelOpti);
		panelOpti.setLayout(new BorderLayout());
		panelOpti.add(btnSp = new JButton("Backspace"), BorderLayout.WEST);
		btnSp.setPreferredSize(dms);
		JPanel panelC = new JPanel();
		panelC.setLayout(new GridLayout(1, 2));
		panelOpti.add(panelC, BorderLayout.EAST);
		panelC.add(btnCE = new JButton("Ce"));
		panelC.add(btnC = new JButton("C"));
		panelOpti.add(new JLabel("     "), BorderLayout.CENTER);
		JPanel panelNum = new JPanel();

		panelButton.add(panelNum);
		panelNum.setLayout(new GridLayout(4, 4));
		panelNum.add(btn7 = new JButton("7"));
		panelNum.add(btn8 = new JButton("8"));
		panelNum.add(btn9 = new JButton("9"));
		panelNum.add(btnDiv = new JButton("/"));
		panelNum.add(btn4 = new JButton("4"));
		panelNum.add(btn5 = new JButton("5"));
		panelNum.add(btn6 = new JButton("6"));
		panelNum.add(btnMuth = new JButton("*"));
		panelNum.add(btn1 = new JButton("1"));
		panelNum.add(btn2 = new JButton("2"));
		panelNum.add(btn3 = new JButton("3"));
		panelNum.add(btnNeg = new JButton("-"));
		panelNum.add(btn0 = new JButton("0"));
		panelNum.add(btnPoint = new JButton("."));
		panelNum.add(btnEq = new JButton("="));
		panelNum.add(btnAdd = new JButton("+"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		new EX12_146();
	}
}
