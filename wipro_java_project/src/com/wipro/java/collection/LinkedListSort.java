package com.wipro.java.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

// Person class
class Person {
	String name;
	int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// toString method for display
	@Override
	public String toString() {
		return name + " - " + age;
	}
}

// Comparator for sorting by age
class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.age, p2.age);
	}
}

// Main class
public class LinkedListSort {
	public static void main(String[] args) {
		// Create a LinkedList of Person objects
		LinkedList<Person> people = new LinkedList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		people.add(new Person("David", 28));

		//before sorting LinkedList
		for(Person p:people) {
			System.out.println(p);
		}
		System.out.println("\n---------------------\n");
		// Sort using Collections.sort with a custom comparator
		Collections.sort(people,new AgeComparator());

		// Display sorted LinkedList
		System.out.println("Sorted LinkedList:");
		for (Person p : people) {
			System.out.println(p);
		}
	}
}
