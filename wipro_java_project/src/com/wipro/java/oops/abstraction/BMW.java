package com.wipro.java.oops.abstraction;

public class BMW extends Car {

	@Override
	public void mileage() {
		System.out.println("BMW X5 has a mileage of 12 km/l");
	}

	@Override
	public void speed() {
		System.out.println("BMW X5 has a top speed of 250 km/h");
	}

	public static void main(String[] args) {
		// Creating BMW object
		Car bmwCar = new BMW();
		bmwCar.mileage();
		bmwCar.speed();
	}

}
