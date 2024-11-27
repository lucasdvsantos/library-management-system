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
		for (Book b : books) {
			System.out.println(b.toString());
		}
	}
	
	public void listBorrowedBooks() {
		for (Book b : books) {
			if (b.getIsAvailable() == false) {
				System.out.println(b.toString());
			}
		}
	}
	
	protected Book searchByTitle(String title) {
		for (Book b : books) {
			if (b.getTitle().equals(title)) {
				return b;
			}
		}
		System.out.println("Book not found");
		return null;
	}
	
	protected Book searchByAuthor(String author) {
		for (Book b : books) {
			if (b.getAuthor().equals(author)) {
				return b;
			}
		}
		System.out.println("Book not found");
		return null;
	}
	
	protected void addBook(Book book) {
		if (books.contains(book) == false) {
			books.add(book);
		} else {
			System.out.println("Book already added");
		}
		
	}
	
	protected void removeBook(Book book) {
		if (books.contains(book) == true) {
			books.remove(book);
		} else {
			System.out.println("Book doesn't exist");
		}
		
	}
}
