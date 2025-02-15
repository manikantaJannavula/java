package com.wipro.java.designpattern.builder;

import com.wipro.java.designpattern.builder.cars.Car;
import com.wipro.java.designpattern.builder.cars.CarType;
import com.wipro.java.designpattern.builder.cars.Engine;
import com.wipro.java.designpattern.builder.cars.GPSNavigator;
import com.wipro.java.designpattern.builder.cars.Transmission;

/**
 * Concrete builder class to construct Car objects.
 */
public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    /**
     * Returns the constructed Car object.
     */
    public Car getResult() {
        return new Car(carType, seats, engine, transmission, gpsNavigator);
    }
}
