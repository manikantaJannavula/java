package com.wipro.java.designpattern.builder;

import com.wipro.java.designpattern.builder.cars.CarType;
import com.wipro.java.designpattern.builder.cars.Engine;
import com.wipro.java.designpattern.builder.cars.GPSNavigator;
import com.wipro.java.designpattern.builder.cars.Transmission;

/**
 * Concrete builder class to construct a car manual.
 */
public class CarManualBuilder implements Builder {
    private StringBuilder manual = new StringBuilder(); // Using StringBuilder for efficiency
    private CarType carType;  // Store car type
    private Transmission transmission; // Store transmission

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        manual.append("Number of seats: ").append(seats).append("\n");
    }

    @Override
    public void setEngine(Engine engine) {
        manual.append("Engine Volume: ").append(engine.getVolume()).append("L, Mileage: ")
              .append(engine.getMileage()).append(" km\n");
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;  // Store transmission
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        manual.append("GPS Navigator: ").append(gpsNavigator.getRoute()).append("\n");
    }

    /**
     * Returns the constructed Car Manual as a String.
     */
    public String getResult() {
        // Dynamically generate the correct header
        String header;
        
        if (transmission == Transmission.AUTOMATIC) {
            header = carType + " (AUTOMATIC):";
        } else if (transmission == Transmission.SEMI_AUTOMATIC) {
            header = carType + " (SEMI_AUTOMATIC):";
        } else {
            header = carType + " (MANUAL):";
        }

        return header + "\n" + manual.toString() + "Transmission: " + transmission + "\n";
    }
}
