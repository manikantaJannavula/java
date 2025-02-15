package com.wipro.java.designpattern.builder.cars;

/**
 * Represents a car engine with volume and mileage.
 */
public class Engine {
    private final double volume;
    private double mileage;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
