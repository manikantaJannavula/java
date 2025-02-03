package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inheritance.Car;

public class RollsRoyce extends Car {

	@Override
	public void showCarDetails() {
		System.out.println("This is a Rolls-Royce: " + getBrand() + " " + getModel() + " from year " + getYear());
	}

	public static void main(String[] args) {
		// Creating RollsRoyce object
		Car rollsRoyceCar = new RollsRoyce();
		rollsRoyceCar.setBrand("Rolls-Royce");
		rollsRoyceCar.setModel("Phantom");
		rollsRoyceCar.setYear(2023);
		rollsRoyceCar.showCarDetails();
	}

}
