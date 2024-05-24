package com.practice.SingletonDesignPattern;
class Singleton2 {
	static Singleton2 obj;

	private Singleton2() {
		System.out.println("object created");
	}

	public static Singleton2 getInstance() {
		if (obj == null)
			return obj = new Singleton2(); //Lazy - we are creating the instance at the 
//		calling of getInstance so we are making it as lazy. The disadvantage here is what
//		if we are having multiple threads and multiple threads are calling the getInstance
//		at the same time
		return obj;
	}
}

public class MainClass2_Lazy {
	public static void main(String[] args) {
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		Singleton2 s3 = Singleton2.getInstance();
	}

}
