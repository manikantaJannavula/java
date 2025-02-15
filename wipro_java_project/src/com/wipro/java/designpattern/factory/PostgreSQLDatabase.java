package com.wipro.java.designpattern.factory;

public class PostgreSQLDatabase implements Database {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to ProstgreSQL Database");
	}
	public PostgreSQLDatabase(String connection) {
		System.out.println("PostgreSQLdatabase object is created with connection:"+connection);
	}

}
