package com.practice.BuilderDesignPattern;
//IF WE WANT THE OBJECT OF PHONE CLASS WE NEED TO PASS ALL THE PAREMETERS THAT IS BRAND NAME
//PRICE COLOUR IN SEQUENCE. BUT IF WE USE THE PHONEBUILDER CLASS WE CAN HAVE THE OBJECT OF PHONE 
//BY JUST PASSING ANY NUMBER OF PARAMETER WE WANT IN ANY SEQUENCE BECAUSE PHONEBUILDER 
//CLASS HAVE A METHOD GETPHONE WHICH RETURNS US THE OBJECT OF PHONE

//Definition-The Builder design patterns is a creational design pattern that lets you construct
//complex objects step by step.
public class MainClass {
	public static void main(String[] args) {
		PhoneBuilder pb = new PhoneBuilder();
		//NOTE : IF YOU MAKE THE RETURN TYPE OF THE SETTERS OF PhoneBuilder AS VOID YOU WILL GET THIS
		//ERROR (Cannot invoke getPhone() on the primitive type void)
		Phone p = pb.setBrand("Samsung").getPhone();
		System.out.println(p);
	}
}
