package com.practice.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee(1, "Ravi");
		
		//Saving of object in a file
		FileOutputStream f = new FileOutputStream("outputFile.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		//Method for serialization of object
		o.writeObject(emp1);
		o.flush();
		System.out.println("SUCCESS");
	}
}
