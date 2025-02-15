package com.wipro.java.designpattern.builder.cars;

/**
 * Represents a GPS navigator with a predefined route.
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Default Route";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
