package com.wipro.java.designpattern.factory;

public class DatabaseFactory extends AbsractFactory {

	@Override
	public Database getDatabase(String dbType) {
		// TODO Auto-generated method stub
		if(dbType.equalsIgnoreCase("MYSQL")) {
			return new MySQLDatabase("jdbc:mysql://localhost:3306/mysqlDatabase");
		}else if(dbType.equalsIgnoreCase("POSTGRESQL")){
			return new PostgreSQLDatabase("jdbc:postgresql://localhost:5432/testdb");
		}
		return new OracleDatabase("jdbc:oracle:thin:@localhost:1521:orcl");
		
	}

	

}
