package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapImplementation {

	public static void main(String[] args) {

		// Creating a HashMap
		Map<Integer, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		// Adding elements to the HashMap
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "Date");

		System.out.println("Initial HashMap: " + map);

		// Getting an element from the HashMap
		System.out.println("Value for key 2: " + map.get(2));

		// Removing an element from the HashMap
		map.remove(3);
		System.out.println("HashMap after removing key 3: " + map);

		// Checking if a value exists and retrieving its key
		if (map.containsValue("Date")) {
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				if (entry.getValue().equals("Date")) {
					System.out.println("Key for 'Date': " + entry.getKey());
					break;
				}
			}
		}

		// Iterating through the HashMap
		System.out.println("Iterating through HashMap:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Closing the scanner
		sc.close();
	}
}
