package com.practiceoops;

public class book {
	
	private int BookID;
	private String BookName;
	private String AuthorName;
	private String Category;
	private int TotalCopies;
	private int availableCopies;
	public book(int bookID, String bookName, String authorName, String category, int totalCopies, int availableCopies) {
		super();
		BookID = bookID;
		BookName = bookName;
		AuthorName = authorName;
		Category = category;
		TotalCopies = totalCopies;
		this.availableCopies = availableCopies;
	}
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getTotalCopies() {
		return TotalCopies;
	}
	public void setTotalCopies(int totalCopies) {
		TotalCopies = totalCopies;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
}
