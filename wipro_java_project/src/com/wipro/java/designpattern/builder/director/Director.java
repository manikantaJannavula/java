package com.wipro.java.designpattern.builder.director;

import com.wipro.java.designpattern.builder.Builder;
import com.wipro.java.designpattern.builder.cars.CarType;
import com.wipro.java.designpattern.builder.cars.Engine;
import com.wipro.java.designpattern.builder.cars.GPSNavigator;
import com.wipro.java.designpattern.builder.cars.Transmission;

public class Director {

    // Method to construct any car based on user input
    public void constructCar(CarType carType, Transmission transmission, Builder builder) {
        switch (carType) {
            case SPORTS_CAR:
                builder.setCarType(CarType.SPORTS_CAR);
                builder.setSeats(2);
                builder.setEngine(new Engine(3.0, 0));
                builder.setTransmission(transmission); // ✅ Ensures transmission is set correctly
                builder.setGPSNavigator(new GPSNavigator());
                break;
            case SUV:
                builder.setCarType(CarType.SUV);
                builder.setSeats(4);
                builder.setEngine(new Engine(2.5, 10000));
                builder.setTransmission(transmission); // ✅ Fixes issue for SUV
                builder.setGPSNavigator(new GPSNavigator("Mountain Route"));
                break;
            case SEDAN:
                builder.setCarType(CarType.SEDAN);
                builder.setSeats(5);
                builder.setEngine(new Engine(1.8, 5000));
                builder.setTransmission(transmission); // ✅ Fixes issue for SEDAN
                builder.setGPSNavigator(new GPSNavigator("City Roads"));
                break;
            case TRUCK:
                builder.setCarType(CarType.TRUCK);
                builder.setSeats(2);
                builder.setEngine(new Engine(5.0, 20000));
                builder.setTransmission(transmission); // ✅ Fixes issue for TRUCK
                builder.setGPSNavigator(new GPSNavigator("Highway Routes"));
                break;
        }
    }
}
