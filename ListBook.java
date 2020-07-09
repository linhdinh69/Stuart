package slide7;

import java.util.ArrayList;

public class ListBook {
	private ArrayList<Book> listBooks = new ArrayList<Book>();

	public ListBook() {
		// TODO Auto-generated constructor stub
		listBooks.add(new Book(1, "Tranh Hoa Huong Duong", "Vincent Van Goth"));
	}

	public void add(int iD, String name, String year) {
		listBooks.add(new Book(iD, name, year));
	}

	public int size() {
		return listBooks.size();
	}

	public String edit() {
		String result = "";
		for (int i = 0; i < listBooks.size(); i++) {
			result += listBooks.get(i).toString();
		}
		return result;
	}

}
