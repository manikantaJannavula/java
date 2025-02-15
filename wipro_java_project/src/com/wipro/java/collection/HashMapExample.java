package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
	public static void main(String[] args) {
		// Creating a HashMap to store key-value pairs
		HashMap<Integer, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		// Prompting the user for the number of key-value pairs to be entered
		System.out.print("Enter the number of values to enter: ");
		int n = sc.nextInt();
		sc.nextLine(); // Consuming the newline character to avoid input issues

		// Taking user input for key-value pairs
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter value for key " + i + ": ");
			String value = sc.nextLine();
			map.put(i, value);
		}
		// Displaying the stored key-value pairs using forLoop
		for (Map.Entry<Integer, String> languages : map.entrySet()) {
			System.out.println("Key:" + languages.getKey() + ",Value:" + languages.getValue());
		}

		// Displaying the stored key-value pairs
		System.out.println("\nHashMap Contents: " + map);

		// Retrieving and displaying all keys present in the HashMap
		System.out.println("Keys in HashMap: " + map.keySet());

		// Retrieving and displaying all values present in the HashMap
		System.out.println("Values in HashMap: " + map.values());

		// Retrieving and displaying all key-value pairs as a set of entries
		System.out.println("Key-Value Pairs in HashMap: " + map.entrySet());

		// Checking if a specific key (1) exists in the HashMap
		System.out.println("Does key 1 exist? " + map.containsKey(1));

		// Checking if a specific value ("Java") exists in the HashMap
		System.out.println("Does value 'Java' exist? " + map.containsValue("Java"));

		// Modifying the value associated with a specific key (2)
		map.replace(1, "C Program");
		System.out.println("HashMap after replacing value for key 2: " + map);

		// Removing an element by key (2) and displaying the removed value
		String removedValue = map.remove(2);
		System.out.println("Removed value for key 2: " + removedValue);

		// Removing a key-value pair (3, "C++") and checking if removal was successful
		boolean isRemoved = map.remove(3, "C++");
		System.out.println("Was the key-value pair (3, 'C++') removed? " + isRemoved);

		// Clearing all elements from the HashMap
		map.clear();
		System.out.println("HashMap after clearing all elements: " + map);

		// Getting the number of elements in the HashMap
		System.out.println("Size of the HashMap: " + map.size());

		// Checking if the HashMap is empty
		System.out.println("Is the HashMap empty? " + map.isEmpty());

		sc.close(); // Closing the scanner
	}
}
