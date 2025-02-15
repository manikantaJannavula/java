package com.wipro.java.designpattern.factory;

public class OracleDatabase implements  Database{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to Oracle Database");
	}
	public OracleDatabase(String connection) {
		System.out.println("OracleDatabase object is created with Connection:"+connection);
	}

	
}
