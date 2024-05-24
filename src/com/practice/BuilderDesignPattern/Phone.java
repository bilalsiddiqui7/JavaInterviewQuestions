package com.practice.BuilderDesignPattern;

public class Phone {
	private String brand;
	private int ram;
	private int price;
	private String colour;

	public Phone(String brand, int ram, int price, String colour) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", ram=" + ram + ", price=" + price + ", colour=" + colour + "]";
	}

}
