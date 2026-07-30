package com.practiceoops;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		library lb = new library();
		while (true) {
			System.out.println("""  
               1.Add Book
               2.RegisterMember
               3.ViewAllBooks
               4.Searchbook
               5.Issuebook
               6.Returnbook
               7.DisplayIssuedBook
               8.RemoveBook
               9.updatebook
               10.Calculatefine """);
			System.out.println("Enter a choice : "); 
		int choice = scn.nextInt();
		switch (choice) {
		case 1 :
			lb.addbook();
			break;
		case 2 :
			lb.registermember();
			break;
		case 3 :
			lb.viewallbooks();
			break;
		case 4 :
			lb.searchbook();
			break;
		case 5:
			lb.issuebook();
		break;
		case 6:
			lb.returnbook();
			break;
		
		case 7: 
			lb.DisplayIssuedBook();
			break;
		case 8:
			lb.RemoveBook();
			break;
		case 9: 
			lb.updatebook();
			break;
		case 10:
			lb.Calculatefine();
			break;
		case 11:
			System.out.println("Thank you!");
			scn.close();
			return;
			default:
				System.out.println("Invalid choice.");
		}
	}
	}

}
