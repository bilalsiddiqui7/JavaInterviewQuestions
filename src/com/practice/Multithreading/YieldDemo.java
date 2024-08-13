package com.practice.Multithreading;

//the Thread.yield() method is a static method of the Thread class that causes the currently executing thread to temporarily 
//pause and allow other threads of the same priority to execute. This is a hint to the thread scheduler that the current thread
//is willing to yield its current use of the CPU. However, it's important to note that Thread.yield() does not guarantee that 
//the current thread will stop executing and that other threads will get a chance to execute.

public class YieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");
        
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            // Yield the CPU to give other threads a chance to run
            Thread.yield();
        }
    }
}

