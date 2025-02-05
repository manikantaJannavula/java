package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {

	public static void main(String[] args) {
		// Creating the first list
		List<Integer> l1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// Getting the number of elements for the first list
		System.out.println("Enter the maximum number of elements you want to enter in List 1:");
		int n = sc.nextInt();

		// Adding elements to the first list
		System.out.println("Enter elements for ArrayList 1:");
		for (int i = 0; i < n; i++) { // Fixed loop condition
			l1.add(i, sc.nextInt());
		}
		System.out.println("List 1: " + l1);

		System.out.println("\n-------------\n");

		// Creating the second list
		System.out.println("Enter the maximum number of elements you want to enter in List 2:");
		List<Integer> l2 = new ArrayList<>();
		int m = sc.nextInt();

		// Adding elements to the second list
		System.out.println("Enter elements for ArrayList 2:");
		for (int j = 0; j < m; j++) { // Fixed loop condition
			l2.add(j, sc.nextInt());
		}
		System.out.println("List 2: " + l2);

		// Adding all elements of List 2 into List 1 at index 1
		l1.addAll(1, l2);
		System.out.println("List 1 after adding List 2 at index 1: " + l1);

		// Removing element at index 1
		l1.remove(1);
		System.out.println("List 1 after removing the element at index 1: " + l1);

		// Updating the first element to 5
		l1.set(0, 5);
		System.out.println("List 1 after setting first element to 5: " + l1);

		// Closing the scanner
		sc.close();
	}
}
