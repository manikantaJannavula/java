package com.wipro.java.designpattern.factory;

/**
 * The Database interface defines a contract for different database implementations.
 * Any class that implements this interface must provide its own implementation 
 * of the connect() method.
 *
 * This interface is part of the Factory Design Pattern, allowing different database 
 * connections to be created dynamically at runtime.
 */
public interface Database {
    
    /**
     * Establishes a connection to the specific database.
     * Each implementing class should provide its own logic to connect to the database.
     */
    void connect();
}
