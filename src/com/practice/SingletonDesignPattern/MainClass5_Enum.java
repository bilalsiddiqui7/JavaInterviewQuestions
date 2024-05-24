package com.practice.SingletonDesignPattern;

enum Singleton5 {
	instance;

	int i;

	public void show() {
		System.out.println("Value of i is " + i);
	}
}

public class MainClass5_Enum {
	public static void main(String[] args) {
		Singleton5 obj1 = Singleton5.instance;
		obj1.i = 1;
		obj1.show();
		Singleton5 obj2 = Singleton5.instance;
		obj2.i = 2;
		obj1.show();
	}

}
