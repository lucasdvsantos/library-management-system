package entities;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private Boolean isAvailable;
	
	public Book() {
	}
	
	public Book(String title, String author, String isbn, Boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = isAvailable != null ? isAvailable : true;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if (title == null || title.trim().isEmpty()) {
			throw new IllegalArgumentException("Title can't be null or empty");
		}
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		if (author == null || author.trim().isEmpty()) {
			throw new IllegalArgumentException("Author can't be null or empty");
		}
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", isAvailable=" + isAvailable + "]";
	}
	
}
