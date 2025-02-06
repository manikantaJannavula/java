package com.wipro.java.java8;


/**
 * Functional Interface defining the shape-related operations
 */
@FunctionalInterface
interface ShapeOperations {

	// Abstract method for calculating area
	public void calculateArea();

	// Default method to display the shape information
	default void displayShapeDetails() {
		System.out.println("This is a shape.");
	}

	// Default method to calculate and print the area of a square
	default void printSquareArea(double sideLength) {
		double area = sideLength * sideLength;
		System.out.println("Area of Square (side: " + sideLength + "): " + area);
	}

	// Static method to calculate the area of a rectangle
	public static double calculateRectangleArea(double length, double width) {
		double area = length * width;
		System.out.println("Calculating area of rectangle (length: " + length + ", width: " + width + "): " + area);
		return area;
	}

	// Static method to display a general message about shapes
	public static void displayGeneralMessage() {
		System.out.println("Shapes are fundamental in geometry and design.");
	}
}

//Main class implementing the ShapeOperations interface
public class Shape implements ShapeOperations {

	// Implementing the abstract method
	@Override
	public void calculateArea() {
		System.out.println("Calculating area (abstract method).");
	}

	// Main method to execute and test shape operations
	public static void main(String[] args) {

		Shape shape = new Shape();
		// Calling abstract Method.
		shape.calculateArea();
		// Display shape information using default method
		shape.displayShapeDetails();

		// Print square area by calling the default method
		shape.printSquareArea(4);

		// Calling static method from the interface to calculate and display the rectangle area
		double rectangleArea = ShapeOperations.calculateRectangleArea(5, 3);
		System.out.println("Final Rectangle Area: " + rectangleArea);

		// Calling the static method to display a general message
		ShapeOperations.displayGeneralMessage();
	}
}
