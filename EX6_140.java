package slide7;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EX6_140 extends JFrame {
	String[] listAnh = { "anh1", "anh2", "anh3" };
	private ImageIcon icon1 = new ImageIcon(
			"Image2/imgbin-brawlhalla-t-shirt-sticker-t-shirt-H99m4W0549UNBreN8WQ2bZwE7.jpg");
	private ImageIcon icon2 = new ImageIcon(
			"Image2/imgbin-invisible-pink-unicorn-t-shirt-sticker-horse-unicorn-rvr2tw5LiteZrsky0K7PvhUsW.jpg");
	private ImageIcon icon3 = new ImageIcon(
			"Image2/imgbin-tata-motors-t-shirt-sticker-bts-redbubble-stickers-pink-heart-A8WGYjrvYbavL55V28t2s6BWC.jpg");
	ImageIcon[] listIcon = { icon1, icon2, icon3 };

	public EX6_140() {
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JPanel panelCBox = new JPanel();
		add(panelCBox);
		JComboBox cbox = new JComboBox(listAnh);
		panelCBox.add(cbox);

		JPanel panelAnh = new JPanel();
		add(panelAnh);

		JButton anh = new JButton(icon1);
		panelAnh.add(anh);
		anh.setSize(500, 500);

		cbox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				anh.setIcon(listIcon[cbox.getSelectedIndex()]);

			}
		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
	}

	public static void main(String[] args) {
		new EX6_140();
	}
}
