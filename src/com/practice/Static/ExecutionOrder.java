package com.practice.Static;

public class ExecutionOrder {

    // Static block
    static {
        System.out.println("Static block executed");
    }

    // Instance block
    {
        System.out.println("Instance block executed");
    }

    // Constructor
    public ExecutionOrder() {
        System.out.println("Constructor executed");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method executed");

        // Creating an instance of the class
        ExecutionOrder obj = new ExecutionOrder();
    }
}
