package com.wipro.java.designpattern;

import java.util.Scanner;

import com.wipro.java.designpattern.factory.AbsractFactory;
import com.wipro.java.designpattern.factory.Database;
import com.wipro.java.designpattern.factory.DatabaseFactory;

/**
 * The DBClient class acts as the entry point for the application.
 * It takes user input to determine which database to connect to
 * and utilizes the Factory Design Pattern to create the appropriate database instance.
 */
public class DBClient {

    public static void main(String[] args) {
        // Creating a factory instance to generate database objects
        AbsractFactory factory = new DatabaseFactory();

        // Prompting the user for database selection
        System.out.println("Which database do you need to connect to?");
        Scanner sc = new Scanner(System.in);
        String db = sc.nextLine().toUpperCase(); // Convert input to uppercase for case-insensitive comparison

        // Using a switch statement to determine which database to instantiate and connect to
        switch (db) {
            case "MYSQL":
                Database db1 = factory.getDatabase(db);
                db1.connect();
                break;
            case "ORACLE":
                Database db2 = factory.getDatabase(db);
                db2.connect();
                break;
            case "POSTGRESQL":
                Database db3 = factory.getDatabase(db);
                db3.connect();
                break;
            default:
                System.out.println("Please choose a correct database (MYSQL, ORACLE, POSTGRESQL).");
        }

        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
