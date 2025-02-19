package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args) {
        // Creating a HashMap where:
        // - Key: Roll Number (Integer) [Unique]
        // - Value: List of Student Names (List<String>) [Duplicate names allowed]
        Map<Integer, List<String>> studentMap = new HashMap<>();

        // Array containing student names (One name is misspelled with an extra comma)
        String[] studentNames = {
            "Manikanta", "Mounica", "Preeti", "Pratik", "Rahul",
            "Ram Prakash", "HemaMaduri", "Bhagavan", "Vyshu", "Vennela","Manikanta","Mounica","Preeti" // Typo: Extra comma
        };

        // Loop to add students to the HashMap
        for (int i = 0; i < studentNames.length; i++) {
            // Assigning roll numbers starting from 101
            addStudent(studentMap, 101 + i, studentNames[i]);
        }

        // Displaying the HashMap contents
        System.out.println("Student Records (Duplicate Names Allowed):");
        for (Map.Entry<Integer, List<String>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Names: " + entry.getValue());
        }
    }

    /**
     * Method to add a student to the HashMap.
     * If a roll number already exists, the name is added to the existing list.
     * If the roll number does not exist, a new list is created.
     *
     * @param map        The HashMap storing student data
     * @param rollNumber The unique roll number of the student
     * @param name       The student's name
     */
    private static void addStudent(Map<Integer, List<String>> map, int rollNumber, String name) {
        // If the roll number is not in the map, initialize a new list
        map.putIfAbsent(rollNumber, new ArrayList<>());

        // Add the student name to the existing or newly created list
        map.get(rollNumber).add(name);
    }
}
