package com.practice.ComparatorAndComparable;
//Comparable is used for default sorting order while Comparator is used for customized 
//sorting order
//Comparable interface is having method compareTo() while Comparator interface is having 
//method compare()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparable is meant for objects with natural ordering which means the object itself 
//must know how it is to be ordered. For example Roll Numbers of students. Whereas,
//Comparator interface sorting is done through a separate class.
//
//Logically, Comparable interface compares “this” reference with the object specified 
//and Comparator in Java compares two different class objects provided.
//
//If any class implements Comparable interface in Java then collection of that object
//either List or Array can be sorted automatically by using Collections.sort() or 
//Arrays.sort() method and objects will be sorted based on there natural order defined by
//CompareTo method.
//
//A basic differentiating feature is that using comparable we can use only one comparison.
//Whereas, we can write more than one custom comparators as you want for a given type,
//all using different interpretations of what sorting means.

//According to definition of functional interface - A functional interface is an interface
//that contains only one abstract method. But Comparator<T> has two abstract methods:
//The equals is an abstract method overriding one of the public methods of java.lang.Object,
//this doesn’t count as an abstract method..A functional interface is an interface that
//has just one abstract method (aside from the methods of Object)



class Employee implements Comparable<Employee> {
	int id;
	String name;
	long salary;

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}

class IdSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}

class NameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

class NameLengthCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getName().length() > o2.getName().length()) {
			return 1;
		} else if (o1.getName().length() < o2.getName().length()) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class ComparableComparator {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(4, "Harshal Choudhary", 120000));
		employees.add(new Employee(1, "Rudra Sahu", 90000));
		employees.add(new Employee(3, "Shrey Wadhwan", 100000));
		employees.add(new Employee(2, "Kiran Amalgonde", 95000));
		employees.add(new Employee(5, "John", 95000));

		System.out.println("Before sorting-> " + employees);
		
//		Collections.sort(employees);
//		System.out.println("After sorting using Comparable-> " + employees);

//		IdSort idSortObj = new IdSort();
//		Collections.sort(employees, idSortObj);
//		System.out.println("After sorting using Comparator-> " + employees);

//		NameCompare nameCompareObj = new NameCompare();
//		Collections.sort(employees, nameCompareObj);
//		System.out.println("After sorting using Comparator-> " + employees);

		NameLengthCompare nameLengthCompareObj=new NameLengthCompare();
		Collections.sort(employees, nameLengthCompareObj);
		System.out.println("After sorting using Comparator-> " + employees);
	}
}
