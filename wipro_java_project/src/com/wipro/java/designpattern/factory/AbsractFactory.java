package com.wipro.java.designpattern.factory;

/**
 * The AbsractFactory class is an abstract class that defines the blueprint
 * for creating different types of database objects.
 * This class follows the Factory Design Pattern.
 */
public abstract class AbsractFactory {

    /**
     * Abstract method to be implemented by subclasses for returning a Database object.
     * Based on the input database type, it will return the corresponding database instance.
     *
     * @param dbType The type of database to create (e.g., "MYSQL", "POSTGRESQL", "ORACLE").
     * @return An instance of a class implementing the Database interface.
     */
    public abstract Database getDatabase(String dbType);
}
