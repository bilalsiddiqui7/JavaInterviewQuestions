package com.practice.Reflection;

public class Cat
{
	private final String name;
	private int age;

	public Cat(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public void meow()
	{
		System.out.println("Meow");
	}

	private void privateMethod()
	{
		System.out.println("Private method called");
	}

	public static void publicStaticMethod()
	{
		System.out.println("Public Static method called");
	}

	private static void privateStaticMethod()
	{
		System.out.println("Private Static method called");
	}
}
