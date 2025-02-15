package com.wipro.java.designpattern.factory;

/**
 * The MySQLDatabase class implements the Database interface.
 * It provides an implementation for connecting to a MySQL database.
 */
public class MySQLDatabase implements Database {

    /**
     * Default constructor is not explicitly defined,
     * but Java provides a no-argument constructor if none is specified.
     */

    /**
     * Parameterized constructor for MySQLDatabase.
     * It initializes the database connection with a given connection string.
     *
     * @param connectionString The connection string to establish a MySQL database connection.
     */
    public MySQLDatabase(String connectionString) {
        System.out.println("MySQLDatabase object is created with connection: " + connectionString);
    }

    /**
     * Implements the connect method from the Database interface.
     * This method prints a message indicating a successful connection to MySQL.
     */
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
