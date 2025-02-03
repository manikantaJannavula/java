package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inheritance.Car;

public class BMW extends Car{

	 @Override
	    public void showCarDetails() {
	        System.out.println("This is a BMW: " + getBrand() + " " + getModel() + " from year " + getYear());
	    }
	 public static void main(String[] args) {
		// Creating BMW object
	        Car bmwCar = new BMW();
	        bmwCar.setBrand("BMW");
	        bmwCar.setModel("X5");
	        bmwCar.setYear(2022);
	        bmwCar.showCarDetails();
	}

}
