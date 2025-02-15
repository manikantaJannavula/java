package com.wipro.java.designpattern.builder;

import com.wipro.java.designpattern.builder.cars.CarType;
import com.wipro.java.designpattern.builder.cars.Engine;
import com.wipro.java.designpattern.builder.cars.GPSNavigator;
import com.wipro.java.designpattern.builder.cars.Transmission;

/**
 * Builder interface for constructing car objects.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
