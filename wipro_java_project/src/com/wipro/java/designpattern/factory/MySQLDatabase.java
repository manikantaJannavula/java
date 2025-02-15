package com.wipro.java.designpattern.factory;

public class MySQLDatabase implements Database {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to MySQL Database");

	}

	// Explicit constructor
	public MySQLDatabase(String connectionString) {
		System.out.println("MySQLDatabase object is created with connection:"+connectionString);
	}

}
