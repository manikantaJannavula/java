package com.wipro.java;

import com.wipro.java.oops.LibraryItem;

public class Book extends LibraryItem {
	private int pages;

	// Constructor to initialize Book specific properties
	public Book(String title, String author, int pages) {
		super(title, author); // Calling the parent class constructor
		this.pages = pages;
	}

	// Implementing the abstract method displayDetails (Polymorphism)
	@Override
	public void displayDetails() {
		System.out.println("Book Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Pages: " + pages);
	}

	// Getter and Setter for pages (Encapsulation)
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
