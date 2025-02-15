package com.wipro.java.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

import com.wipro.java.designpattern.prototype.shapes.Circle;
import com.wipro.java.designpattern.prototype.shapes.Rectangle;
import com.wipro.java.designpattern.prototype.shapes.Shape;

/**
 * The Main class demonstrates the Prototype Design Pattern by creating and
 * cloning shapes.
 */
public class Main {
	public static void main(String[] args) {
		// List to hold original shapes
		List<Shape> shapes = new ArrayList<>();

		// List to hold cloned shapes
		List<Shape> shapesCopy = new ArrayList<>();

		// Creating and adding a Circle to the list
		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);

		// Cloning the Circle and adding it to the list
		Circle anotherCircle = (Circle) circle.clone();
		shapes.add(anotherCircle);

		// Creating and adding a Rectangle to the list
		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "blue";
		shapes.add(rectangle);

		// Cloning and comparing objects
		cloneAndCompare(shapes, shapesCopy);
	}

	/**
	 * Clones each shape in the original list and compares them to the originals.
	 * 
	 * @param shapes     The list of original shape objects.
	 * @param shapesCopy The list where cloned shapes will be stored.
	 */
	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		// Cloning each shape and adding to shapesCopy list
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		// Comparing original shapes with their cloned copies
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Shapes are different objects (yay!)");

				// Check if the cloned object has identical properties
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": And they are identical (yay!)");
				} else {
					System.out.println(i + ": But they are not identical (booo!)");
				}
			} else {
				System.out.println(i + ": Shape objects are the same (booo!)");
			}
		}
	}
}
