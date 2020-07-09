package slide7;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX14_147 extends JFrame {
	private String[] listDay = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
	private String[] listMonth = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private String[] listYear = { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
			"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
			"2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" };
	private JComboBox comBoxDay = new JComboBox(listDay), comBoxMonth = new JComboBox(listMonth),
			comBoxYear = new JComboBox(listYear);
	private JTextField txtName;
	private JComboBox comboxDay, comboxMonth, comboxYear;
	private JCheckBox chboxMale, chboxFemale, chboxEat, chboxSing, chboxShopping, chboxTravel;
	private JButton btOpen, btSave, btExit;

	public EX14_147() {
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(new JMenu("file"));
		JPanel panelTitle = new JPanel();
		add(panelTitle);
		JLabel titel = new JLabel("Lý lịch sinh viên");
		panelTitle.add(titel);

		JPanel panelName = new JPanel();
		add(panelName);
		panelName.setLayout(new FlowLayout());
		panelName.add(new JLabel("Họ và Tên"));
		panelName.add(txtName = new JTextField(15));

		JPanel panelDate = new JPanel();
		add(panelDate);
		panelDate.add(new JLabel("Ngày Sinh: "));
		panelDate.add(comBoxDay = new JComboBox(listDay));
		panelDate.add(new JLabel("/"));
		panelDate.add(comBoxMonth = new JComboBox(listMonth));
		panelDate.add(new JLabel("/"));
		panelDate.add(comBoxYear = new JComboBox(listYear));

		JPanel panelSe = new JPanel();
		add(panelSe);
		panelSe.add(new JLabel("Giới Tính: "));
		panelSe.add(chboxMale = new JCheckBox("nam"));
		panelSe.add(chboxFemale = new JCheckBox("nữ"));

		JPanel panelFar = new JPanel();
		add(panelFar);
		panelFar.add(new JLabel("So thich"));
		JPanel panelItemFar = new JPanel();
		panelFar.add(panelItemFar);
		panelItemFar.setLayout(new GridLayout(2, 2));
		panelItemFar.add(chboxEat = new JCheckBox("An uong"));
		panelItemFar.add(chboxSing = new JCheckBox("Ca hat"));
		panelItemFar.add(chboxShopping = new JCheckBox("Mua sam"));
		panelItemFar.add(chboxTravel = new JCheckBox("Du lich"));

		JPanel panelButton = new JPanel();
		add(panelButton);
		panelButton.add(btOpen = new JButton("Open"));
		panelButton.add(btSave = new JButton("Save"));
		panelButton.add(btExit = new JButton("Exit"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		pack();

	}

	public static void main(String[] args) {
		new EX14_147();
	}

}
