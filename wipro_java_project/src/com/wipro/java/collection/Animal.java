package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animal {

    public static void main(String[] args) {
        // Using AnimalComparable (Comparable interface)
        List<AnimalComparable> comparableAnimals = new ArrayList<>();
        comparableAnimals.add(new AnimalComparable("Elephant", 25));
        comparableAnimals.add(new AnimalComparable("Tiger", 15));
        comparableAnimals.add(new AnimalComparable("Lion", 10));
        comparableAnimals.add(new AnimalComparable("Giraffe", 8));

        // Sorting by Age using Comparable
        System.out.println("Animals sorted by Age (using Comparable):");
        Collections.sort(comparableAnimals);
        for (AnimalComparable animal : comparableAnimals) {
            System.out.println(animal);
        } 
        
        System.out.println("\nAnimals sorted by Name (using Comparable):");
     // Sorting by name alphabetically
        Collections.sort(comparableAnimals, (a1, a2) -> a1.getName().compareTo(a2.getName()));
        for (AnimalComparable animal : comparableAnimals) {
            System.out.println(animal);
        }
        System.out.println("\n--------------------\n");
        // Using AnimalComparator (Comparator interface)
        List<AnimalComparator> comparatorAnimals = new ArrayList<>();
        comparatorAnimals.add(new AnimalComparator("Elephant", 25));
        comparatorAnimals.add(new AnimalComparator("Tiger", 15));
        comparatorAnimals.add(new AnimalComparator("Lion", 10));
        comparatorAnimals.add(new AnimalComparator("Giraffe", 8));

        // Sorting by Age using Comparator
        System.out.println("\nAnimals sorted by Age (using Comparator):");
        Collections.sort(comparatorAnimals, AnimalComparator.AgeComparator);
        for (AnimalComparator animal : comparatorAnimals) {
            System.out.println(animal);
        }

        // Sorting by Name using Comparator
        System.out.println("\nAnimals sorted by Name (using Comparator):");
        Collections.sort(comparatorAnimals, AnimalComparator.NameComparator);
        for (AnimalComparator animal : comparatorAnimals) {
            System.out.println(animal);
        }
    }
}
