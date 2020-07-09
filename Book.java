package slide7;

public class Book {
	private int iD;
	private String nameBook;
	private String nameAuthor;

	public Book(int iD, String nameBook, String nameAuthor) {
		this.iD = iD;
		this.nameBook = nameBook;
		this.nameAuthor = nameAuthor;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	@Override
	public String toString() {
		return String.format("%-6s%-40s%s\n", (iD+"--"),nameBook,nameAuthor);
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

}
