package com.practice.BuilderDesignPattern;

public class PhoneBuilder {
	private String brand;
	private int ram;
	private int price;
	private String colour;

	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		System.out.println("This is the this-> " + this);
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}

	public PhoneBuilder setColour(String colour) {
		this.colour = colour;
		return this;
	}

	@Override
	public String toString() {
		return "PhoneBuilder [brand=" + brand + ", ram=" + ram + ", price=" + price + ", colour=" + colour + "]";
	}

	public Phone getPhone() {
		return new Phone(brand, ram, price, colour);
	}
}
