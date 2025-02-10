package com.wipro.java.usecase2;

import java.util.*;
import java.util.stream.Collectors;

// Abstract class representing a Car
abstract class Car {
	protected String carId;
	protected String model;
	protected double rentalPrice;
	protected boolean isAvailable;

	// Constructor to initialize car properties
	public Car(String carId, String model, double rentalPrice, boolean isAvailable) {
		this.carId = carId;
		this.model = model;
		this.rentalPrice = rentalPrice;
		this.isAvailable = isAvailable;
	}

	// Abstract method to get the type of car
	public abstract String getType();

	// Getter methods for car properties
	public String getCarId() {
		return carId;
	}

	public String getModel() {
		return model;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	// Method to update availability status
	public void setAvailable(boolean available) {
		this.isAvailable = available;
	}

	// Method to display car details
	public void displayDetails() {
		System.out.println("Car ID: " + carId + ", Model: " + model + ", Type: " + getType() + ", Price: " + rentalPrice
				+ ", Available: " + isAvailable);
	}
}

// Sedan class extending Car
class Sedan extends Car {
	public Sedan(String carId, String model, double rentalPrice, boolean isAvailable) {
		super(carId, model, rentalPrice, isAvailable);
	}

	@Override
	public String getType() {
		return "Sedan";
	}
}

// SUV class extending Car
class SUV extends Car {
	public SUV(String carId, String model, double rentalPrice, boolean isAvailable) {
		super(carId, model, rentalPrice, isAvailable);
	}

	@Override
	public String getType() {
		return "SUV";
	}
}

// Main class to handle the car rental system
public class CarRentalSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();

		// Prompt user for the number of cars to add
		System.out.print("Enter number of cars to add: ");
		int numCars = scanner.nextInt();
		scanner.nextLine(); // Consume newline character

		// Loop to add car details
		for (int i = 0; i < numCars; i++) {
			System.out.println("Enter Car ID, Model, Type (Sedan/SUV), Rental Price, Availability (true/false):");
			String input = scanner.nextLine();
			String[] carDetails = input.split("\\s+"); // Splitting input by spaces

			// Check if input format is valid
			if (carDetails.length != 5) {
				System.out.println("Invalid input format. Please try again.");
				i--; // Retry current iteration
				continue;
			}

			try {
				// Extract car details
				String carId = carDetails[0];
				String model = carDetails[1];
				String type = carDetails[2];
				double rentalPrice = Double.parseDouble(carDetails[3]);
				boolean isAvailable = Boolean.parseBoolean(carDetails[4]);

				// Create an instance of Sedan or SUV based on user input
				Car car = type.equalsIgnoreCase("Sedan") ? new Sedan(carId, model, rentalPrice, isAvailable)
						: new SUV(carId, model, rentalPrice, isAvailable);
				cars.add(car);
			} catch (Exception e) {
				System.out.println("Invalid price or availability format. Try again.");
				i--; // Retry input
			}
		}

		// Display available cars
		System.out.println("\nAvailable Cars:");
		cars.stream().filter(Car::isAvailable).forEach(Car::displayDetails);

		// Creating a map of cars using carId as key for easy lookup
		Map<String, Car> carMap = cars.stream().collect(Collectors.toMap(Car::getCarId, car -> car));
		String rentCarId;

		// Loop to validate Car ID before proceeding with rental
		while (true) {
			System.out.print("\nEnter Car ID to rent: ");
			rentCarId = scanner.next();

			// Check if the entered Car ID exists and is available for rent
			if (carMap.containsKey(rentCarId) && carMap.get(rentCarId).isAvailable()) {
				carMap.get(rentCarId).setAvailable(false); // Update car status to rented
				System.out.println("Car rented successfully!");
				carMap.get(rentCarId).displayDetails(); // Show rented car details
				break;
			} else {
				System.out.println("Invalid Car ID or Car not available. Please enter a valid Car ID.");
			}
		}

		// Display updated available cars after renting
		System.out.println("\nUpdated Available Cars:");
		cars.stream().filter(Car::isAvailable).forEach(Car::displayDetails);

		scanner.close();
	}
}
