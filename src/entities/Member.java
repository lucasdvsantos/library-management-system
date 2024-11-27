package entities;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private String name;
	private int memberId;
	
	private List<Book> borrowedBooks = new ArrayList<>();
	
	public Member() {
	}
	
	public Member(String name, int memberId) {
		this.name = name;
		this.memberId = memberId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	
	public void borrowBook(Library library, Book book) {
		if (library.getMembers().contains(this) == true) {
			if (book.getIsAvailable() == true) {
				borrowedBooks.add(book);
				book.setAvailability(false);	
			} else {
				System.out.println("Book not available");
			}
		} else {
			System.out.println("Not a member from this Library");
		}
	}
	
	public void returnBook(Library library, Book book) {
		if (library.getMembers().contains(this) == true) {
			if (borrowedBooks.contains(book) == true) {
				borrowedBooks.remove(book);
				book.setAvailability(true);
			} else {
				System.out.println("This book wasn't borrowed");
			}
		} else {
			System.out.println("Not a member from this Library");
		}
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", memberId=" + memberId + ", borrowedBooks=" + borrowedBooks + "]";
	}

}
