package com.practice.SingletonDesignPattern;

class Singleton3 {
	static Singleton3 obj;

	private Singleton3() {
		System.out.println("object created !");
	}

	public static synchronized Singleton3 getInstance() {  // If we make this method
//		synchronized only one thread can access this method at a Time. but this also 
//		have a disadvantage ie. it will take lot of time if we are calling the method
//		multiple times so we can overcome this by using concept of double checked locking
		if (obj == null)
			return obj = new Singleton3();
		return obj;
	}
}

public class MainClass3_Synchronized {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton3 s1 = Singleton3.getInstance();
				
			}
			
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton3 s2 = Singleton3.getInstance();
				
			}
			
		});
		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton3 s3 = Singleton3.getInstance();
				
			}
			
		});
		t1.start();
		t2.start();
		t3.start();
	}

}
