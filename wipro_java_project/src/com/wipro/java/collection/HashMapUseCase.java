package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapUseCase {
    public static void main(String[] args) {
        // Creating a HashMap to store student IDs and names
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding key-value pairs (student ID -> student name)
        studentMap.put(101, "Manikanta");
        studentMap.put(102, "Mounica");
        studentMap.put(103, "Preeti");
        studentMap.put(104, "Rahul");
        studentMap.put(105, "Pratik");

        // Display the HashMap
        System.out.println("Student Map: " + studentMap+"\n");

        // Retrieving a value using key
        int searchKey = 103;
        if (studentMap.containsKey(searchKey)) {
            System.out.println("Student with ID " + searchKey + ": " + studentMap.get(searchKey)+"\n");
        } else {
            System.out.println("Student ID not found!\n");
        }

        // Updating a value
        studentMap.put(102, "Mounica Reddy");  // Updating name for ID 102
        System.out.println("Updated Student Map: " + studentMap+"\n");

        // Removing a key-value pair
        studentMap.remove(104);
        System.out.println("After Removing ID 104: " + studentMap+"\n");

        // Iterating through the HashMap (Key-Value pairs)
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue()+"\n");
        }

        // Checking the size of the HashMap
        System.out.println("Total Students: " + studentMap.size()+"\n");
    }
}
