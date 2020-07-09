package slide7;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxLayoutDemo extends JFrame {
	private JLabel jlblFlag = new JLabel();
	private ImageIcon imageIconAus = new ImageIcon("./Image/2019-11-25 (3).png");
	private ImageIcon imageIconUS = new ImageIcon("./Image/2019-11-25 (10).png");
	private ImageIcon imageIconCanada = new ImageIcon("./Image/2019-11-25 (11).png");
	private ImageIcon imageIconNorway = new ImageIcon("./Image/2019-11-25 (3).png");
	private ImageIcon imageIconGermany = new ImageIcon("./Image/2019-11-25 (3).png");
	private ImageIcon imageIconPrint = new ImageIcon("./Image/2019-11-25 (3).png");
	private ImageIcon imageIconSave = new ImageIcon("./Image/2019-11-25 (3).png");
	private JButton jbtUS = new JButton("US ");
	private JButton jbtCanada = new JButton("Canada ");
	private JButton jbtAus = new JButton("Australia");
	private JButton jbtNorway = new JButton("Norway ");
	private JButton jbtGermany = new JButton("Germany");

	public BoxLayoutDemo() {

		JPanel box1 = new JPanel();
		BoxLayout bl1 = new BoxLayout(box1, BoxLayout.X_AXIS);
		box1.setLayout(bl1);
		JPanel box2 = new JPanel();
		BoxLayout bl2 = new BoxLayout(box2, BoxLayout.Y_AXIS);
		box2.setLayout(bl2);
		box1.add(new JButton(imageIconPrint));
		box1.add(new JButton(imageIconSave));
		box2.add(jbtUS);
		box2.add(jbtCanada);
		box2.add(jbtAus);
		box2.add(jbtNorway);
		box2.add(jbtGermany);
		box1.setBorder(new javax.swing.border.LineBorder(Color.red));
		box2.setBorder(new javax.swing.border.LineBorder(Color.black));
		add(box1, BorderLayout.NORTH);
		add(box2, BorderLayout.EAST);
		jlblFlag.setIcon(imageIconAus);
		add(jlblFlag, BorderLayout.CENTER);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

	}

	public static void main(String[] args) {
		new BoxLayoutDemo();
	}
}
