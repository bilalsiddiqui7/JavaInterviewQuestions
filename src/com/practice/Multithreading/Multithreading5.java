//RUNNABLE IS A FUNCTIONAL INTERFACE SO WE CAN USE LAMBDA EXPRESSION
package com.practice.Multithreading;

public class Multithreading5 {
	public static void main(String[] args) {
		Runnable t1Run = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi World");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable t2Run = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello World");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(t1Run);
		Thread t2 = new Thread(t2Run);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
