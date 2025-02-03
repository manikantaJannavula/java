package com.wipro.java.oops.abstraction;

public class RollsRoyce extends Car {

	@Override
	public void mileage() {
		System.out.println("Rolls-Royce Phantom has a mileage of 9 km/l");
	}

	@Override
	public void speed() {
		System.out.println("Rolls-Royce Phantom has a top speed of 240 km/h");
	}

	public static void main(String[] args) {
		// Creating RollsRoyce object
		Car rollsRoyceCar = new RollsRoyce();
		rollsRoyceCar.mileage();
		rollsRoyceCar.speed();
	}

}
