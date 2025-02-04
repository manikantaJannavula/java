package com.wipro.java.oops.polymorphism;

public class Calculator {

// Method Overloading: Multiple methods with the same name but different parameters

	// Method 1: Adds two numbers
	public int calculate(int a, int b) {
		return a + b;
	}

	// Method 2: Adds three numbers (Overloaded method)
	public int calculate(int a, int b, int c) {
		return a + b + c;
	}

	// Method 3: Adds two double numbers (Overloaded method)
	public double calculate(double a, double b) {
		return a + b;
	}

	// Method Overriding: This method will be overridden by the child class
	public void show() {
		System.out.println("This is the Calculator class");
	}

}
