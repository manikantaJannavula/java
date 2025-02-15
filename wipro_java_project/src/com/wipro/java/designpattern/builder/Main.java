package com.wipro.java.designpattern.builder;

import com.wipro.java.designpattern.builder.cars.Car;
import com.wipro.java.designpattern.builder.cars.CarType;
import com.wipro.java.designpattern.builder.cars.Transmission;
import com.wipro.java.designpattern.builder.director.Director;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();

        // Taking user input for car type
        System.out.println("Enter Car Type (SEDAN, SUV, SPORTS_CAR, TRUCK): ");
        String carTypeInput = scanner.next().toUpperCase();
        CarType carType;

        try {
            carType = CarType.valueOf(carTypeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Car Type! Defaulting to SPORTS_CAR.");
            carType = CarType.SPORTS_CAR;
        }

        // Taking user input for transmission type
        System.out.println("Enter Transmission Type (MANUAL, AUTOMATIC, SEMI_AUTOMATIC): ");
        String transmissionInput = scanner.next().toUpperCase();
        Transmission transmission;

        try {
            transmission = Transmission.valueOf(transmissionInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Transmission! Defaulting to SEMI_AUTOMATIC.");
            transmission = Transmission.SEMI_AUTOMATIC;
        }

        // Build the car dynamically based on user input
        CarBuilder carBuilder = new CarBuilder();
        director.constructCar(carType, transmission, carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("\nCar built: " + car.getCarType());

        // Build the car manual dynamically based on user input
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructCar(carType, transmission, manualBuilder);
        String carManual = manualBuilder.getResult();
        System.out.println("\nCar built: " + car.getCarType());
        System.out.println("\n" + carManual); // ✅ No extra "Manual:" added

        scanner.close();
    }
}
