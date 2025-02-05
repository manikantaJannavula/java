package com.wipro.java.collection;

import java.util.Scanner; // Importing Scanner class for user input

/**
 * This program demonstrates the use of arrays in Java. 
 * It takes user input for the array size, stores elements in the array, and then prints the elements.
 */
public class Array {

	public static void main(String[] args) {
		// Creating a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter the maximum range (size) of the array
		System.out.println("Enter Max Range of an Array:");
		int n = sc.nextInt(); // Reading the size of the array

		// Declaring an integer array with the given size
		int a[] = new int[n];

		// Prompting the user to enter elements into the array
		System.out.println("Enter Elements to an Array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // Storing user-input values in the array
		}

		// Displaying the entered elements
		System.out.println("Array Elements:");
		for (int num : a) {
			System.out.print(num + " "); // Printing each element with a space
		}

		// Closing the Scanner object to free resources
		sc.close();
	}
}
