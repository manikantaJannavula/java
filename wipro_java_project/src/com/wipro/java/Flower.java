package com.wipro.java;

public class Flower {

	// Properties (Instance Variables)
	String name;
	String color;
	String fragrance;

	// Constructor to initialize flower details
	Flower(String name, String color, String fragrance) {
		this.name = name;
		this.color = color;
		this.fragrance = fragrance;
	}

	// Method to display flower details
	void displayFlowerDetails() {
		System.out.println("Flower Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Fragrance: " + fragrance);
	}

	public static void main(String[] args) {
		// Creating Objects of Flower class
		Flower rose = new Flower("Rose", "Red", "Sweet");
		Flower lily = new Flower("Lily", "White", "Mild");

		// Calling method to display details
		rose.displayFlowerDetails();
		lily.displayFlowerDetails();
	}

}
