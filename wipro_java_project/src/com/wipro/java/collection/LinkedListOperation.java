package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListOperation {

	public static void main(String[] args) {

		// Creating the first linked list
		List<Integer> l1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		// Getting the number of elements for the linked list
		System.out.println("Enter the maximum number of elements you want to enter in LinkedList:");
		int n = sc.nextInt();

		// Adding elements to the linked list
		System.out.println("Enter elements for LinkedList:");
		for (int i = 0; i < n; i++) {
			l1.add(i, sc.nextInt());
		}

		// Printing the initial linked list
		System.out.println("LinkedList before deletion: " + l1);

		// Removing element at index 3 if it exists
		if (n > 3) {
			l1.remove(3); // index
			System.out.println("LinkedList after removing element at index 3: " + l1);
		} else {
			System.out.println("Skipping deletion: LinkedList has less than 4 elements.");
		}

		// Printing elements one by one
		System.out.print("Elements in LinkedList: ");
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
		System.out.println();

		// Closing the scanner
		sc.close();
	}
}
