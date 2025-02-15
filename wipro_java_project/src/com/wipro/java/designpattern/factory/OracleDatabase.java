package com.wipro.java.designpattern.factory;

/**
 * The OracleDatabase class implements the Database interface.
 * It provides an implementation for connecting to an Oracle database.
 */
public class OracleDatabase implements Database {

    /**
     * Parameterized constructor for OracleDatabase.
     * It initializes the database connection with a given connection string.
     *
     * @param connection The connection string to establish an Oracle database connection.
     */
    public OracleDatabase(String connection) {
        System.out.println("OracleDatabase object is created with Connection: " + connection);
    }

    /**
     * Implements the connect method from the Database interface.
     * This method prints a message indicating a successful connection to Oracle.
     */
    @Override
    public void connect() {
        System.out.println("Connected to Oracle Database");
    }
}
