package com.wipro.java.collection;

import java.util.Comparator;

public class AnimalComparator {
    private String name;
    private int age;

    // Constructor
    public AnimalComparator(String name, int age) {
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

    // Comparator for sorting by age (low to high)
    public static Comparator<AnimalComparator> AgeComparator = new Comparator<AnimalComparator>() {
        @Override
        public int compare(AnimalComparator a1, AnimalComparator a2) {
            return Integer.compare(a1.getAge(), a2.getAge()); // Ascending order of age
        }
    };

    // Comparator for sorting by name (alphabetical order)
    public static Comparator<AnimalComparator> NameComparator = new Comparator<AnimalComparator>() {
        @Override
        public int compare(AnimalComparator a1, AnimalComparator a2) {
            return a1.getName().compareTo(a2.getName()); // Sorting by name (alphabetical order)
        }
    };
}
