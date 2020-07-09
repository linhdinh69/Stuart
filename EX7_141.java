package slide7;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EX7_141 extends JFrame {
	private String[] listStringColor = { "Black", "Blue", "Cyan", "Dark Cyan" };
	private JList list = new JList(listStringColor);
	
	// tao mang mau cho tung mau trong list mau
	private Color[] listColors = { Color.BLACK, Color.BLUE, Color.cyan, Color.DARK_GRAY };

	public EX7_141() {

		setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		add(panel);
		panel.add(list);
		
		// bat su kien
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {

				getContentPane().setBackground(listColors[list.getSelectedIndex()]);
				/**
				 * getContentPane() de xet su thay doi cua background
				 * addListSelectionListener(new ListSelectionListener()) ham dung lay chon doi tuong dc chon 
				 * getSelectedIndex() lay vi tri dc chon trong Jlist
				 */
			}
		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		;
	}

	public static void main(String[] args) {
		new EX7_141();
	}
}
