package com.wipro.java.designpattern.singleton;

/**
 * Singleton class ensuring only one instance exists.
 */
public final class Singleton {

    // Static instance variable to hold the single instance of Singleton
    private static Singleton instance;
    
    // Public instance variable to hold the assigned value
    public String value;

    /**
     * Private constructor prevents direct instantiation from outside the class.
     * Simulates a slow initialization process using Thread.sleep().
     *
     * @param value The value to assign to the Singleton instance.
     */
    private Singleton(String value) {
        try {
            // Simulating time-consuming initialization
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    /**
     * Public method to provide access to the single instance of the class.
     * Ensures only one instance is created.
     *
     * @param value The value to assign if creating a new instance.
     * @return The Singleton instance.
     */
    public static Singleton getInstance(String value) {
        if (instance == null) {
            // If no instance exists, create a new one
            instance = new Singleton(value);
        }
        return instance; // Return the single instance
    }
}
