package com.spring.example; // Package declaration

// Employee1 class demonstrating constructor overloading and encapsulation
public class Employee1 {

    // Private fields to store employee details
    private int id;        // Employee ID
    private String name;   // Employee Name

    // Default constructor
    public Employee1() {
        System.out.println("def cons"); // Prints when default constructor is called
    }

    // Constructor with only ID parameter
    public Employee1(int id) {
        this.id = id; // Assigns the passed ID to the class variable
    }

    // Constructor with only Name parameter
    public Employee1(String name) {
        this.name = name; // Assigns the passed Name to the class variable
    }

    // Constructor with both ID and Name (Encapsulation)
    public Employee1(int id, String name) {
        this.id = id;     // Assigns the passed ID
        this.name = name; // Assigns the passed Name
    }

    // Method to display Employee details
    void show() {
        System.out.println(name + " " + id); // Prints employee name and ID
    }
}
