package com.wipro.java;

import com.wipro.java.oops.LibraryItem;

public class Oops {

	public static void main(String[] args) {
        // Creating a Book object (Polymorphism: Book class implements displayDetails())
        LibraryItem book = new Book("Java Programming", "James Gosling", 450);
        book.displayDetails(); // Calling the overridden method
        System.out.println("-----------------");
        LibraryItem book1 = new Book("Angular", "Arghya Sengupta", 250);
        book1.displayDetails(); // Calling the overridden method

	}

}
