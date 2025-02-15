package com.wipro.java.designpattern.factory;

/**
 * The PostgreSQLDatabase class implements the Database interface.
 * It provides an implementation for connecting to a PostgreSQL database.
 */
public class PostgreSQLDatabase implements Database {

    /**
     * Parameterized constructor for PostgreSQLDatabase.
     * It initializes the database connection with a given connection string.
     *
     * @param connection The connection string to establish a PostgreSQL database connection.
     */
    public PostgreSQLDatabase(String connection) {
        System.out.println("PostgreSQLDatabase object is created with connection: " + connection);
    }

    /**
     * Implements the connect method from the Database interface.
     * This method prints a message indicating a successful connection to PostgreSQL.
     */
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}
