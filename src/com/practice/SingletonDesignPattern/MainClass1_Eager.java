package com.practice.SingletonDesignPattern;

//Following 3 steps we can achieve singleton class
//1)creating the static object inside the same class
//2)making the constructor as private
//3)creating a static method and returning the static object of the same class. 
//We are creating the static method because we dont have to create the object of the class
class Singleton {
	static Singleton obj = new Singleton(); // Eager - There is a disadvantage
//	here that this obj is a static object so it will be created 
//	and be in memory when the class is loaded. So we have to make it lazy.

	private Singleton() {
		System.out.println("Object created");
	}

	public static Singleton getInstance() {
		return obj;
	}
}

public class MainClass1_Eager {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
	}
}
