package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalComparable implements Comparable<AnimalComparable> {
    private String name;
    private int age;

    // Constructor
    public AnimalComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for printing
    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }

    // Implementing compareTo for sorting by age (low to high)
    @Override
    public int compareTo(AnimalComparable other) {
        return Integer.compare(this.age, other.age); // Sorting by age
    }

   
}
