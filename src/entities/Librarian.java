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
	
	public void addBook(Library library, Book book) {
		library.addBook(book);
	}
	
	public void removeBookFromLibrary(Library library, Book book) {
		library.removeBook(book);
	}
	
	public void searchBooksByTitle(Library library, String title) {
		library.searchByTitle(title);
	}
	
	public void searchBooksByAuthor(Library library, String author) {
		library.searchByAuthor(author);
	}
}
