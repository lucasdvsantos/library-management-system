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
			System.out.println("Book: " + b.getTitle() + " Available: " + b.getIsAvailable());
		}
	}
	
	public void listBorrowedBooks() {
		for (Book b : books) {
			if (b.getIsAvailable() == false) {
				System.out.println("Book: " + b.getTitle() + " Available: " + b.getIsAvailable());
			}
		}
	}
	
	public Book searchByTitle(String title) {
		for (Book b : books) {
			if (b.getTitle().equals(title)) {
				return b;
			}
		}
		return null;
	}
	
	public Book searchByAuthor(String author) {
		for (Book b : books) {
			if (b.getAuthor().equals(author)) {
				return b;
			}
		}
		return null;
	}
}
