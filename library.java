package com.practiceoops;
import java.util.*;
public class library {
	
  Scanner scn = new Scanner(System.in); 
ArrayList<book> books = new ArrayList<book>();
ArrayList<member> members = new ArrayList<member>();

public void addbook () {
	System.out.println("Enter book Id : ");
	int bookId = scn.nextInt();
	scn.nextLine();
	for (book b : books) {
		if (b.getBookID() == bookId) {
			System.out.println("BookId is already exists.");
			return;
		}
	}
	System.out.println("Enter bookName : ");
	String bookName = scn.nextLine();

	if (bookName.isEmpty()) {
		System.out.println("bookName should not empty,Please enter bookName: ");
		return;
	}
	
System.out.println("Enter AuthorName: ");
String AuthorName = scn.nextLine();

System.out.println("Enter Category: ");
String Category = scn.nextLine();

System.out.println("Enter a total copies: ");
int Total_copies = scn.nextInt();
// ant total_copies  = scn.nextInt();
if (Total_copies <= 0) {
	System.out.println("The total copies should be greater than zero. please enter totalcopies.");
	return;
}
System.out.println("Enter a available copies: ");
int availableCopies = scn.nextInt();

book b1 = new book (bookId,bookName,AuthorName,Category,Total_copies,availableCopies);
books.add(b1);
System.out.println("The Book is added successfull");
}

public void registermember() {

	System.out.println("Enter the memberId: ");
	int memberId = scn.nextInt();
	scn.nextLine();
	for (member mb : members) {
		if (mb.getMemberID() == memberId) {
			System.out.println("MemberId is already exists.");
			return;
		}
	}
	System.out.println("Enter the MemberName: ");
	String memberName = scn.nextLine();
	
	System.out.println("Enter the MobileNumber: ");
	Long MobileNumber = scn.nextLong();
	scn.nextLine();
	System.out.println("Enter the email : ");
	String email = scn.nextLine();
		if (email.isEmpty()) {
			System.out.println("The email should not empty. please enter email.");
	}
		member m1 = new member(memberId,memberName,MobileNumber,email);
		members.add(m1);
		System.out.println("The member added successfully.");
}

public void viewallbooks() {
	if (books.isEmpty()) {
		System.out.println ("No books are not available: ");
		return;
	} 
	for (book b : books) {
	       System.out.println("--------------------------------");
	        System.out.println("Book ID          : " + b.getBookID());
	        System.out.println("Book Name        : " + b.getBookName());
	        System.out.println("Author Name      : " + b.getAuthorName());
	        System.out.println("Category         : " + b.getCategory());
	        System.out.println("Total Copies     : " + b.getTotalCopies());
	        System.out.println("Available Copies     : " + b.getAvailableCopies());
	        System.out.println("--------------------------------");	
}
	}
public void searchbook() {
	System.out.println("Enter bookId Or Enter bookName: ");
	int bookId = scn.nextInt();
	String bookName = scn.nextLine();
	for (book b : books) {
		if (b.getBookID() == bookId || b.getBookName()== bookName) {
			System.out.println("Book Found");
			System.out.println("Book ID          : " + b.getBookID());
	        System.out.println("Book Name        : " + b.getBookName());
	        System.out.println("Author Name      : " + b.getAuthorName());
	        System.out.println("Category         : " + b.getCategory());
	        System.out.println("Total Copies     : " + b.getTotalCopies());
		} else {
			System.out.println("Book Not Found");
		}
	} 
}

public void issuebook() {
	System.out.println("Enter a memberId : ");
	int memberId = scn.nextInt();
	System.out.println("Enter a bookId: ");
	int bookId = scn.nextInt();
	
	member  selectedMember = null;
	book selectedbook = null;
	
	for (member m : members) {
		if (m.getMemberID() ==memberId ) {
			selectedMember = m;
			break;
		}
	}
	
	for (book b : books) {
		if (b.getBookID() == bookId) {
			selectedbook = b;
			break;
		}
	}
	if (selectedMember == null) {
		System.out.println("member Not found");
		return;
	}
	
	if (selectedbook == null) {
		System.out.println("Book Not found");
		return;
	}
	if (selectedbook.getAvailableCopies()<=0) {
		System.out.println("Book is not available");
		return;
	}
	selectedbook.setAvailableCopies(selectedbook.getAvailableCopies()-1);
	System.out.println("Book issed successfully.");
}

public void returnbook () {
	System.out.println("Enter the MemberId: ");
	int MemberId = scn.nextInt();
	System.out.println("Enter the BookId: ");
	int BookId = scn.nextInt();
	for (book b : books ) {
		if (b.getBookID() == BookId) {
			b.setAvailableCopies(b.getAvailableCopies()+1);
			System.out.println("Book returned successfully.");
			return;
		}
	}
	System.out.println("Book Not found ");
}
public void DisplayIssuedBook() {
	boolean found = false;
	for (book b : books) {
		if (b.getAvailableCopies()< b.getTotalCopies()) {
			System.out.println("--------------------------------");
	        System.out.println("Book ID          : " + b.getBookID());
	        System.out.println("Book Name        : " + b.getBookName());
	        System.out.println("Author Name      : " + b.getAuthorName());
	        System.out.println("Category         : " + b.getCategory());
	        System.out.println("Total Copies     : " + b.getTotalCopies());
	        System.out.println("--------------------------------");	
	        found = true;
		}
	}
	if (!found) {
		System.out.println("No books are currently not issued.");
	}
}
public void RemoveBook() {
	System.out.println("Enter the bookId : ");
	int bookId = scn.nextInt();
	for (book b : books) {
		if (b.getBookID() == bookId) {
			books.remove(b);
			System.out.println("Book removed successfully.");
			return;
		}
	}
	System.out.println("Book not found.");
}
public void updatebook() {
	System.out.println("Enter the bookId : ");
	int bookId = scn.nextInt();
	scn.nextLine();
	for (book b : books) {
		if (b.getBookID() == bookId) {
			System.out.println("Enter the BookName: ");
		b.setBookName(scn.nextLine());
		
		System.out.println("Enter AuthorName : ");
		b.setAuthorName(scn.nextLine());
		
		System.out.println("Enter a Category: ");
		b.setCategory(scn.nextLine());
		
		System.out.println("Book details are updated successfully.");
		return;
		}
	}
	System.out.println("Book not found.");
}
public void Calculatefine() {
	System.out.println("Enter Number of Late days: ");
	int latedays = scn.nextInt();
	int fine = latedays*10;
	System.out.println("Fine Days: " + fine);
}

}


