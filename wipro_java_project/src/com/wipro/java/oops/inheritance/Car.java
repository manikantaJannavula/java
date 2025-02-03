package com.wipro.java.oops.inheritance;

/**
 * Parent Class Car
 * 
 */
public class Car {
	// Private properties
    private String brand;
    private String model;
    private int year;
    
    //Getters and Setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	 // Method to be overridden
    public void showCarDetails() {
        System.out.println("Car Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
    
	

}
