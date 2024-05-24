package com.practice.SingletonDesignPattern;

class Singleton4 {
	static Singleton4 obj;

	private Singleton4() {
		System.out.println("object created !");
	}

	public static Singleton4 getInstance() {
		if (obj == null) {
			synchronized (Singleton4.class) {
				if (obj == null)
					return obj = new Singleton4(); // Double checked locking - it means we'll
//				check if the object is null two times. This second check is necessary because another
//				thread might have created the instance while the current thread was waiting to acquire 
//				the lock.
			}
		}
		return obj;
	}
}

public class MainClass4_DoubleCheckedLocking {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton4 s1 = Singleton4.getInstance();

			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton4 s2 = Singleton4.getInstance();

			}

		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton4 s3 = Singleton4.getInstance();

			}

		});
		t1.start();
		t2.start();
		t3.start();
	}

}
