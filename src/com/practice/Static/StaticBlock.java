package com.practice.Static;

class Alien
{
	Alien()
	{
		System.out.println("Alien object created");
	}

	static
	{
		System.out.println("Static block executed");
	}
}

public class StaticBlock
{
	public static void main(String[] args)
	{
		Alien a1 = new Alien();
		Alien a2 = new Alien();
		Alien a3 = new Alien();
	}
}
