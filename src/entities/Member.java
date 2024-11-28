package entities;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private String name;
	private String memberId;
	
	private List<Book> borrowedBooks = new ArrayList<>();
	
	public Member() {
	}
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void listBorrowedBooks() {
		if (borrowedBooks.isEmpty()) {
			System.out.println("No borrowed books");
		} else {
			for (Book b : borrowedBooks) {
				System.out.println(b);
			}
		}
	}
	
	public void borrowBook(Library library, Book book) {
		if (!library.getMembers().contains(this)) {
			System.out.println("Not a member of this Library");
			return;
		}
		
		if (book.getIsAvailable()) {
			borrowedBooks.add(book);
			book.setAvailable(false);
			System.out.println("Successfully borrowed: " + book.getTitle());
		} else {
			System.out.println("Book is not available");
		}
	}
	
	public void returnBook(Library library, Book book) {
		if (!library.getMembers().contains(this)) {
			System.out.println("Not a member of this Library");
			return;
		}
		
		if (borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			book.setAvailable(true);
			System.out.println("Successfully returned: " + book.getTitle());
		} else {
			System.out.println("This book wasn't borrowed by you");
		}
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", memberId=" + memberId + ", borrowedBooks=" + borrowedBooks + "]";
	}

}
