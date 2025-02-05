package com.wipro.java.exception;

import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		File file = new File("Output File");
		FileReader fr=null;
	try {
		
		fr = new FileReader(file);
	} catch (FileNotFoundException e) {
		System.out.println("File not Found at Given Path");
	}finally {
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}
	}
}
