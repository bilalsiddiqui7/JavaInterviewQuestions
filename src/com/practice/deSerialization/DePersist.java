package com.practice.deSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DePersist {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Reading the object from a file
		FileInputStream f = new FileInputStream("outputFile2.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		
		// Method for deserialization of object
		Employee e = (Employee) o.readObject();
		System.out.println(e.toString());

	}
}
