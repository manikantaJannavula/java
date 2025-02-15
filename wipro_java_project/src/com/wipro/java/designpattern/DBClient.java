package com.wipro.java.designpattern;

import java.util.Scanner;

import com.wipro.java.designpattern.factory.AbsractFactory;
import com.wipro.java.designpattern.factory.Database;
import com.wipro.java.designpattern.factory.DatabaseFactory;

public class DBClient {

	public static void main(String[] args) {
		AbsractFactory factory=new DatabaseFactory();
		System.out.println("Which database i need to connect:");
		Scanner sc=new Scanner(System.in);
		String db = sc.nextLine();
		
		switch (db) {
		case "MYSQL":
			Database db1 = factory.getDatabase(db);
			db1.connect();
			break;
		case "OracleDatabase":
			Database db2 = factory.getDatabase(db);
			db2.connect();
			break;
		case "POSTGRESQL":
			Database db3 = factory.getDatabase(db);
			
			db3.connect();
			break;
		default:
			System.out.println("please choose correct database....");
		}
		sc.close();
	}
}
