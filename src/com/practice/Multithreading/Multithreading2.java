package com.practice.Multithreading;

class PrintHi extends Thread {
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

class PrintHello extends Thread {
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

public class Multithreading2 {
	public static void main(String[] args) {
		PrintHi t1 = new PrintHi();
		PrintHello t2 = new PrintHello();
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
