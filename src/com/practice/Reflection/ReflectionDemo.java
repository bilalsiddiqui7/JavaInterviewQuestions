package com.practice.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo
{
	public static void main(String[] args) throws IllegalArgumentException,
		IllegalAccessException, InvocationTargetException
	{
		Cat obj = new Cat(
			"Pussy",
			5);

		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println("---");

		// PRINTING ALL THE FIELDS IN THE CAT CLASS
		Field[] catFields = obj.getClass().getDeclaredFields();
		for (Field f : catFields)
		{
			System.out.println(f.getName());
		}
		System.out.println("---");

		// CHANGING THE FINAL FIELD USING REFLECTION
		Field[] catFields2 = obj.getClass().getDeclaredFields();
		for (Field f : catFields2)
		{
			if (f.getName().equals("name"))
			{
				f.setAccessible(true);
				f.set(obj, "New Pussy");
			}
		}
		System.out.println(obj.getName());
		System.out.println("---");

		// INVOKNG A PRIVATE METHOD USING REFLECTION
		Method[] catMethods = obj.getClass().getDeclaredMethods();

		for (Method m : catMethods)
		{
			if (m.getName().equals("privateStaticMethod"))
			{
				m.setAccessible(true);
				// WE CAN ALSO PASS NULL IF THE METHOD IS PRIVATE STATIC
				m.invoke(obj);
			}
		}

	}
}
