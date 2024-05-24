package com.practice.Multithreading;

class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread 1 running");
	}
}

class Thread2 implements Runnable {
	public void run() {
		System.out.println("Thread 2 running");
	}
}

public class Multithreadig1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Runnable t2Run = new Thread2();
		Thread t2 = new Thread(t2Run);
		t1.run();
		t2.run();
	}
}
