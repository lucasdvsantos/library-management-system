package entities;

public class Librarian {

	private String name;
	private int employeeId;
	
	public Librarian() {
	}

	public Librarian(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void addBookToLibrary(Library library, Book book) {
		library.addBook(book);
	}
	
	public void removeBookFromLibrary(Library library, Book book) {
		library.removeBook(book);
	}
	
	public Book searchBookByTitle(Library library, String title) {
		return library.searchByTitle(title);
	}
	
	public Book searchBookByAuthor(Library library, String author) {
		return library.searchByAuthor(author);
	}
}
