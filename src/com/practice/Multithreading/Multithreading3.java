package com.practice.Multithreading;

class PrintHi2 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi World");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class PrintHello2 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello World");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Multithreading3 {
	public static void main(String[] args) {
		Runnable t1Run = new PrintHi2();
		Runnable t2Run = new PrintHello2();
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
