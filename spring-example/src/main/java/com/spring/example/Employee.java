package com.spring.example; // Package declaration

// Employee class representing an employee entity
public class Employee {

    // Private fields to store employee details
    private int id;         // Employee ID
    private String name;    // Employee Name
    private String city;    // Employee City

    // Getter method for Employee ID
    public int getId() {
        return id;
    }

    // Setter method for Employee ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for Employee Name
    public String getName() {
        return name;
    }

    // Setter method for Employee Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for Employee City
    public String getCity() {
        return city;
    }

    // Setter method for Employee City
    public void setCity(String city) {
        this.city = city;
    }

    // Method to display Employee details
    void display() {
        System.out.println(id + " " + name + " " + city);
    }
}
