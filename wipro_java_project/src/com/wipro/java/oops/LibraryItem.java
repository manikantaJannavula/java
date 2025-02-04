package com.wipro.java.oops;

public abstract class LibraryItem {
	private String title;
	private String author;
	

	public LibraryItem(String title,String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
        this.author = author;
	}
	 // Abstract method to display details of the item
    public abstract void displayDetails();
    
 // Getters and Setters for encapsulation
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
