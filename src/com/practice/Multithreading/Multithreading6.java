//JOIN, ISALIVE, GETNAME, SETNAME, GETPRIORITY, SETPRIORITY METHODS
//IN THE BELOW JAVA CODE MY INTENTION IS TO PRINT BYE AT THE END
package com.practice.Multithreading;

class PrintHi6 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi World !");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class PrintHello6 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello World !");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Multithreading6 {
	public static void main(String[] args) throws InterruptedException {
		Runnable t1Run = new PrintHi6();
		Runnable t2Run = new PrintHello6();
		Thread t1 = new Thread(t1Run);
		Thread t2 = new Thread(t2Run);
		t1.setName("Hi thread");
		t2.setName("Hello thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		System.out.println("Check whether t1 thread is alive or not - " + t1.isAlive());
		t1.join();
		System.out.println("Check whether t1 thread is alive or not " + t1.isAlive());
		System.out.println("Check whether t2 thread is alive or not " + t2.isAlive());
		System.out.println("Bye");
		System.out.println("The name of t1 is " + t1.getName());
		System.out.println("The name of t2 is " + t2.getName());
		System.out.println("The priority of t1 thread is " + t1.getPriority());
		System.out.println("The priority of t2 thread is " + t2.getPriority());

	}
}
