package com.wipro.java.oops.polymorphism;

public class ScientificCalculator extends Calculator {

	@Override
	public void show() {
		System.out.println("This is the ScientificCalculator class");
	}

	public static void main(String[] args) {
		// Demonstrating Method Overloading
		Calculator calc = new Calculator();
		System.out.println("Sum of 2 integers: " + calc.calculate(5, 10));
		System.out.println("Sum of 3 integers: " + calc.calculate(5, 10, 15));
		System.out.println("Sum of 2 doubles: " + calc.calculate(5.5, 10.5));

		// Demonstrating Method Overriding
		calc.show(); // Calls the parent class method

		Calculator calc1 = new ScientificCalculator();
		calc1.show();
	}
}







