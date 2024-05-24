package com.practice.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
