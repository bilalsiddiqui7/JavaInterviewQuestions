package com.practice.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student
{
	private String name;

	public Student(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

public class ConstructorReference
{
	public static void main(String[] args)
	{
		List<String> Students = Arrays.asList("Ashu", "Hitesh", "Harsh");

		List<Student> StudentObjects = Students.stream().map(i -> new Student(
			i)).collect(Collectors.toList());

		StudentObjects.forEach(i -> System.out.println(i.getName()));

		// THE ABOVE CODE CAN BE DONE USING CONSTRUCTOR REFERENCE AS GIVEN BELOW

		List<Student> StudentObjectsUsingConstructorRererence = Students
			.stream().map(Student::new).collect(Collectors.toList());
		
		System.out.println("---");
		StudentObjectsUsingConstructorRererence.forEach(i -> System.out.println(i.getName()));

	}
}
