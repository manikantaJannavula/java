package com.wipro.java.designpattern.factory;

/**
 * The DatabaseFactory class extends the AbsractFactory class and provides
 * implementations for creating different database instances based on the provided type.
 * This class follows the Factory Design Pattern.
 */
public class DatabaseFactory extends AbsractFactory {

    /**
     * This method returns an instance of a specific database implementation based on the dbType parameter.
     * It checks the provided database type and creates an appropriate Database object.
     *
     * @param dbType The type of database to create (e.g., "MYSQL", "POSTGRESQL", "ORACLE").
     * @return A concrete implementation of the Database interface.
     */
    @Override
    public Database getDatabase(String dbType) {
        // Check the database type and return the corresponding instance
        if (dbType.equalsIgnoreCase("MYSQL")) {
            return new MySQLDatabase("jdbc:mysql://localhost:3306/mysqlDatabase");
        } else if (dbType.equalsIgnoreCase("POSTGRESQL")) {
            return new PostgreSQLDatabase("jdbc:postgresql://localhost:5432/testdb");
        }
        // Default case: Return Oracle database instance
        return new OracleDatabase("jdbc:oracle:thin:@localhost:1521:orcl");
    }
}
