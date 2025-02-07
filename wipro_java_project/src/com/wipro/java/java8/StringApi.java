package com.wipro.java.java8;

public class StringApi {

	public StringApi() {
		// Default constructor
	}

	public static void main(String[] args) {
		// Initializing a string
		String str = "Name Manikanta";

		// Performing string operations
		// Printing the length of the string
		System.out.println("Length of the string: " + str.length());

		// Printing the character at index 2
		System.out.println("Character at index 2: " + str.charAt(2));

		// Extracting a substring from index 1 to 3
		System.out.println("Substring from index 1 to 3: " + str.substring(1, 3));

		// Checking if the string contains the letter 'M'
		System.out.println("Contains 'M': " + str.contains("M"));

		// Splitting the string based on spaces
		String[] a = str.split(" ");

		// Printing each part of the split string
		for (String str1 : a) {
			System.out.println(str1);
		}
	}
}
