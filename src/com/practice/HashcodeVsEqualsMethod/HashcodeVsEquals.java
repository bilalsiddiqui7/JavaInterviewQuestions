//EQUALS AND HASHCODE CONTRACT
//IT SAYS THAT
//1) IF TWO OBJECTS ARE EQUAL ACCORDING TO THE Equals(Object o) METHOD THEN THE HASHCODE FOR BOTH THE OBJECTS WILL BE SAME(hashcode is nothing 
//but an integer value).
//2) IT IS NOT NECESSARY THAT IF YOU HAVE SAME HASHCODE FOR 2 OBJECTS MEANS THOSE TWO OBJECTS ARE EQUAL. THIS IS COLLISION. BETTER HASH FUNCTIONS 
//PREVENTS THIS.
//3) WHENEVER HASHCODE FUNCTION IS INVOKED ON THE SAME OBJECT MORE THAN ONCE DURING EXECUTION OF A JAVA PROGRAM, THE HASHCODE METHOD MUST 
//CONSISTENTLY RETURN THE SAME INTEGER 

//IN SIMPLE TERMS
//1)HOW TO MAKE TWO OBJECTS LOGICALLY EQUAL IS BY OVERRIDING THE EQUALS METHOD.
//2)BY OVERRIDING THE HASHCODE FUNCTION THE HASHCODE MUST CONSISTENTLY RETURN THE SAME VALUE. SO THAT LOGICALLY SAME OBJECTS DO NOT LAND UP IN
//DIFFERENT BUCKETS

package com.practice.HashcodeVsEqualsMethod;

class Employee
{
	private int id;
	private String name;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	// How to make two objects logically equal is by overiding the equals method
	// This is how you implement the equals method in 3 steps
	public boolean equals(Object o)
	{
		// 1)If it is null or it is not of the same class
		if (o == null || this.getClass() != o.getClass())
			return false;
		// 2)If they are pointing to the same memory location
		if (o == this)
			return true;
		// 3)Create a type casted object of the Employee class and then return
		// if the id's are same or not
		Employee e = (Employee) o;
		return (this.getId() == e.getId());
	}

	public int hashcode()
	{
		return this.getId();
	}

}

public class HashcodeVsEquals
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("John");
		// If I make e2=e1 then I will get true for shallow copy as both e1 and
		// e2 will point to
		// the same memory, also deep copy will be true because if the objects
		// are same physically
		// then they will be same logically as well
//		Employee e2=e1;
		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("John");
		System.out.println("shallow copy " + (e1 == e2));
		//by overriding the equals method we got true for deep copy
		System.out.println("deep copy " + e1.equals(e2));
	}
}
