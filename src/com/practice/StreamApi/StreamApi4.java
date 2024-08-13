package com.practice.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Mobile
{
	String name;
	int price;

	public Mobile(String name, int price)
	{
		super();
		this.name = name;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public int getPrice()
	{
		return price;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Mobile [name=" + name + ", price=" + price + "]";
	}
}

// List<Employee> highestPaidEmps =
// empList.stream().collect(Collectors.groupingBy(Employee::getSalary,
// TreeMap::new, Collectors.toList()))
// .lastEntry().getValue();
// highestPaidEmps.forEach(System.out::println);

public class StreamApi4
{
	public static void main(String[] args)
	{
		List<Mobile> products = new ArrayList();
		products.add(new Mobile(
			"Samsung",
			20000));
		products.add(new Mobile(
			"Apple",
			50000));
		products.add(new Mobile(
			"Realme",
			15000));
		products.add(new Mobile(
			"Motorola",
			12000));
		products.add(new Mobile(
			"Oppo",
			14000));
		products.add(new Mobile(
			"Apple2",
			50000));
		System.out.println(products);
		// Question: FIND RECORDS WHOSE PRICE IS GREATER THAN 18000 USING
		// STREAMS
		List<Mobile> filteredProducts = products.stream()
			.filter(a -> a.getPrice() > 18000).collect(Collectors.toList());
		System.out.println(filteredProducts);
		System.out.println();

		// Question: FIND THE MOBILE WITH HIGHEST PRICE
		Optional<Mobile> costliestMobile=products.stream().max((a,b)->a.getPrice()-b.getPrice());
		System.out.println("The costliest mobile is "+costliestMobile.get().getName());
		System.out.println();
		
		//IF MULTIPLE MOBILES HAVE THE SAME PRICE
		Optional<Integer> maxPrice = products.stream().map(e->e.getPrice()).max((a,b)->a.compareTo(b));
		System.out.println("Max Price -> "+maxPrice);
		if(maxPrice.isPresent()) {
			List<Mobile> costliestMobiles= (List<Mobile>) products.stream().filter(i->i.getPrice()==maxPrice.get()).collect(Collectors.toList());
			costliestMobiles.forEach(System.out::println);
		}
		
		String[] stringArr = {"abhi", "harsh", "aakash", "kiran"};
		// CONVERT EACH STRING INTO AN UPPERCASE STRING
		Stream.of(stringArr).map(i -> i.toUpperCase())
			.forEach(i -> System.out.println(i));
		System.out.println();

		// RETURN THE STRING THAT STARTS WITH A
		Stream.of(stringArr).filter(i -> i.startsWith("a"))
			.forEach(i -> System.out.println(i));

		// RETURN THE STRING THAT STARTS WITH A AND CONVERT EACH STRING INTO AN
		// UPPERCASE STRING
		Stream.of(stringArr).filter(i -> i.startsWith("a"))
			.map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));
		System.out.println();

		// LONGEST STRING
		List<String> words = Arrays.asList("apple", "banana", "nut", "date");
		Optional<String> longestString = words.stream().reduce(
			(word1, word2) -> word1.length() > word2.length() ? word1 : word2);

		longestString.ifPresent(System.out::println); // Output: "banana"

		// The reduction process will compare the strings by length and return
		// the longest one.
		// "apple" vs "banana": "banana" is longer.
		// "banana" vs "nut": "banana" is longer.
		// "banana" vs "date": "banana" is longer.

	}
}
