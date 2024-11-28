package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books = new ArrayList<>();
	private List<Member> members = new ArrayList<>();
	
	public Library() {
	}

	public Library(List<Book> books, List<Member> members) {
		this.books = books;
		this.members = members;
	}
	
	public List<Member> getMembers() {
		return members;
	}

	public List<Book> getBooks() {
		return books;
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void removeMember(Member member) {
		members.remove(member);
	}

	public void listBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available in the library");
		} else {
			for (Book b : books) {
				System.out.println(b.toString());
			}
		}
	}
	
	public void listBorrowedBooks() {
		boolean found = false;
		for (Book b : books) {
			if (!b.getIsAvailable()) {
				System.out.println(b.toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No books are currently borrowed");
		}
	}
	
	protected void searchByTitle(String title) {
		List<Book> foundBooks = new ArrayList<>();
		for (Book b : books) {
			if (b.getTitle().equalsIgnoreCase(title)) {
				foundBooks.add(b);
			}
		}
		if (foundBooks.isEmpty()) {
			System.out.println("No books found with the title: " + title);
		} else {
			System.out.println("Books found with the title: " + title);
			for (Book b : foundBooks) {
				System.out.println(b);
			}
		}
	}
	
	protected void searchByAuthor(String author) {
		List<Book> foundBooks = new ArrayList<>();
		for (Book b : books) {
			if (b.getAuthor().equalsIgnoreCase(author)) {
				foundBooks.add(b);
			}
		}
		if (foundBooks.isEmpty()) {
			System.out.println("No books found by the author: " + author);
		} else {
			System.out.println("Books found by the author: " + author);
			for (Book b : foundBooks) {
				System.out.println(b);
			}
		}
	}
	
	protected void addBook(Book book) {
		if (books.contains(book)) {
			System.out.println("Book already added: " + book.getTitle());
		} else {
			books.add(book);
			System.out.println("Book added to the library: " + book.getTitle());
		}
		
	}
	
	protected void removeBook(Book book) {
		if (books.contains(book)) {
			books.remove(book);
			System.out.println("Book removed from the library: " + book.getTitle());
		} else {
			System.out.println("Book not found in the library: " + book.getTitle());
		}
		
	}
}
