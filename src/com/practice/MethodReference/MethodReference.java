//METHOD REFERENCE ALLOW US TO REFER TO A METHOD WITHOUT INVOKING IT, MAKING OUR CODE MORE CLEANER
//AND READABLE. THEY CAN BE USED IN THE PLACE OF A LAMBDA EXPRESSION WHEN THE LAMBDA EXPRESSION
//ONLY CALLS AN EXISTING METHOD.

package com.practice.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReference
{
	public static void print(String s)
	{
		System.out.println(s);
	}

	public void print2(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args)
	{
		List<String> Students = Arrays.asList("Ashu", "Hitesh", "Harsh");

		// THIS IS HOW WE INVOKE A METHOD
		Students.forEach(i -> print(i));

		System.out.println("---");
		Students.forEach(i -> System.out.println(i));

		// THE ABOVE LINE CAN BE DONE USING METHOD REFERENCE AS GIVEN BELOW, AS WE ARE PASSING LAMBDA
		// EXPRESSION IN THE ARGUMENT
		System.out.println("---");
		Students.forEach(MethodReference::print);

		// IF THE METHOD IS NOT STATIC YOU CAN CREATE THE OBJECT OF THE CLASS
		// AND REFER THE METHOD
		System.out.println("---");
		MethodReference methodReference = new MethodReference();
		Students.forEach(methodReference::print2);

	}
}
