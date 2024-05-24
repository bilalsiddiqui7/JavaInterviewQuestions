package com.practice.deSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee(1, "Ravi");
		FileOutputStream f = new FileOutputStream("outputFile2.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(emp1);
		o.flush();
		System.out.println("SUCCESS");
	}
}
