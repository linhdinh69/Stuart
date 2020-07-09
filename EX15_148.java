package slide7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class EX15_148 extends JFrame {
	private String[] listType = { "Son dau", "Sap", "Dieu khac" };
	private String[] listStyle = { "Khong ro", "tru tuong", "Retro" };
	private String[] listAuthor = { "Bui Xuan Phai", "Leonardo", "Meachal" };

	private ImageIcon iconPlus = new ImageIcon("Image/icons8-plus-64.png");
	private ImageIcon iconPyr = new ImageIcon("Image/triangular-shape-of-pyramid-from-top-view-icon.png");

	private JComboBox cBoxType, cBoxStyle, cBoxAuthor;
	private JTextField textName, textYear;
	private Dimension size = new Dimension(150, 50);
	private ListBook listBook = new ListBook();

	public EX15_148() {
		// TODO Auto-generated constructor stub
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JPanel panelTitle = new JPanel();
		add(panelTitle);
		panelTitle.add(new JLabel("Quản lí hội họa"));

		JPanel panelName = new JPanel();
		add(panelName);
		panelName.add(new JLabel("Tên tác phẩm"));
		panelName.add(textName = new JTextField(15));

		JPanel panelyear = new JPanel();
		add(panelyear);
		panelyear.add(new JLabel("Năm sáng tác"));
		panelyear.add(textYear = new JTextField(15));

		JPanel panelType = new JPanel();
		add(panelType);
		panelType.add(new JLabel("Loại tranh"));
		panelType.add(cBoxType = new JComboBox(listType));

		JPanel panelStyle = new JPanel();
		add(panelStyle);
		panelStyle.add(new JLabel("Phong cách"));
		panelStyle.add(cBoxStyle = new JComboBox(listStyle));

		JPanel panelAuthor = new JPanel();
		add(panelAuthor);
		panelAuthor.add(new JLabel("Tác giả"));
		panelAuthor.add(cBoxAuthor = new JComboBox(listAuthor));

		JPanel panelButton = new JPanel();
		add(panelButton);
		JButton buttonPlus = new JButton("Thêm", iconPlus);
		buttonPlus.setSize(size);
		panelButton.add(buttonPlus);
		JButton buttonPyr = new JButton("Sắp xếp", iconPlus);
		buttonPyr.setSize(size);
		panelButton.add(buttonPyr);

		JTextArea textArea = new JTextArea();
		add(new JScrollPane(textArea));
		textArea.setEditable(false);
		textArea.setBorder(new TitledBorder("Thông tin về tác phẩm hội họa"));
		textArea.setText(listBook.edit());
		buttonPlus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				listBook.add(listBook.size() + 1, textName.getText(), listAuthor[cBoxAuthor.getSelectedIndex()]);
				textArea.setText(listBook.edit());
			}
		});
		;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		pack();
	}

	public static void main(String[] args) {
		new EX15_148();
	}
}
