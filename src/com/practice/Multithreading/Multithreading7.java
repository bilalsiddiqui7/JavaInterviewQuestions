//SYNCHRONIZED KEYWORD, WE CAN ALSO USE SYNCHRONIZED BLOCK
package com.practice.Multithreading;

class Counter {
	int count;

	public synchronized void countIncrement() {
		count++;
	}
}

public class Multithreading7 {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 15000; i++) {
					c.countIncrement();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 15000; i++) {
					c.countIncrement();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("The number of counts are " + c.count);
	}
}
