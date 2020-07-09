package slide7;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class EX8 extends JFrame {
	public EX8() {
		setLayout(new BorderLayout());

		String categories[] = { "Household", "Office", "Extended Family", "Company (US)", "Company (World)", "Team",
				"Will", "Birthday Card List", "High School", "Country", "Continent", "Planet" };

		JList list = new JList(categories);
		JScrollPane scrollPan = new JScrollPane(list);
		add(scrollPan, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(100, 100);
		
	}

	public static void main(String[] args) {
		new EX8();
	}
}
