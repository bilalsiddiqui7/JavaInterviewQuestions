package com.practice.FactoryDesignPattern;
//WHENEVER I NEED TO MAKE OBJECT OF IOS, WINDOWS OR ANDROID. FactoryOperatingSystem IS A
//CLASS WHICH IS HAVING A METHOD factoryOS IN WHICH I HAVE TO PASS THE NAME OF THE CLASS 
//WHOSE OBJECT I NEED AS A STRING SO IT WILL RETURN ME WHAT OBJECT I NEED RESPECTIVELY

//Definition-The factory design pattern is used when we have a superclass with multiple 
//sub-classes and based on input, we need to return one of the sub-class. 
public class MainClass {
	public static void main(String[] args) {
		FactoryOperatingSystem fos = new FactoryOperatingSystem();
		OperatingSystem obj = fos.factoryOS("Windows");
		obj.specifications();
	}
}
