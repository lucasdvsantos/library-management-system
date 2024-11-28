package application;

import entities.Book;
import entities.Librarian;
import entities.Library;
import entities.Member;

public class Program {

	public static void main(String[] args) {
		
		Library lib = new Library();
		Librarian libEmployee = new Librarian("Petrucia Brown", "E123");
		
		Book b1 =  new Book("1984", "George Orwell", "1453452345", true);
		Book b2 =  new Book("Fahrenheit 451", "Ray Bradbury", "0943215870", true);
		Book b3 =  new Book("Moby-Dick", "Herman Melville", "1340259830", true);
		Book b4 =  new Book("Don Quixote", "Miguel de Cervantes", "4031879645", true);
		Book b5 =  new Book("The Lord of the Rings", "John Ronald Reuel Tolkien", "1453452345", true);
		
		// Adding books
		libEmployee.addBook(lib, b1);
		libEmployee.addBook(lib, b2);
		libEmployee.addBook(lib, b3);
		libEmployee.addBook(lib, b4);
		libEmployee.addBook(lib, b5);
		
		//Listing books
		//lib.listBooks();
		
		Member m1 = new Member("Petroina Carvalho", "M123");
		Member m2 = new Member("Avelino Silva", "M321");
		
		// Adding members
		lib.addMember(m1);
		lib.addMember(m2);
		
		m1.borrowBook(lib, b1);
		m1.borrowBook(lib, b2);
		
		System.out.println("--------------------------------------");
		
		//lib.listBooks();
		
		m1.listBorrowedBooks();
		
		System.out.println("--------------------------------------");
		
		libEmployee.searchBooksByTitle(lib, "1984");
		libEmployee.searchBooksByAuthor(lib, "Ray Bradbury");
		
		System.out.println("--------------------------------------");
		
		m1.returnBook(lib, b2);
		m1.listBorrowedBooks();
		
		System.out.println("--------------------------------------");
		
		m2.borrowBook(lib, b2);
		m2.listBorrowedBooks();
		
		System.out.println("--------------------------------------");
		
		lib.listBorrowedBooks();

	}

}
