package entities;

public class Librarian {

	private String name;
	private String employeeId;
	
	public Librarian() {
	}

	public Librarian(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
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
