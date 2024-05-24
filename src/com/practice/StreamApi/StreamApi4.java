package com.practice.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Mobile {
	String name;
	int price;

	public Mobile(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + "]";
	}
}

public class StreamApi4 {
	public static void main(String[] args) {
//		List<Mobile> products = new ArrayList();
//		products.add(new Mobile("Samsung", 20000));
//		products.add(new Mobile("Apple", 50000));
//		products.add(new Mobile("Realme", 15000));
//		products.add(new Mobile("Motorola", 12000));
//		products.add(new Mobile("Oppo", 14000));
//		System.out.println(products);
////		Question: FIND RECORDS WHOSE PRICE IS GREATER THAN 18000 USING STREAMS
//		List<Mobile> filteredProducts = products.stream().filter(a -> a.getPrice() > 18000)
//				.collect(Collectors.toList());
//		System.out.println(filteredProducts);

		String[] stringArr = { "abhi", "harsh", "aakash", "kiran" };
//		CONVERT EACH STRING INTO AN UPPERCASE STRING
		Stream.of(stringArr).map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));
		System.out.println();
		
//		RETURN THE STRING THAT STARTS WITH A
		Stream.of(stringArr).filter(i -> i.startsWith("a")).forEach(i -> System.out.println(i));
		
//		RETURN THE STRING THAT STARTS WITH A AND CONVERT EACH STRING INTO AN UPPERCASE STRING
		Stream.of(stringArr).filter(i -> i.startsWith("a")).map(i -> i.toUpperCase())
				.forEach(i -> System.out.println(i));
		
		// creating a list of Strings 
        List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                                           "GeeksQuiz", "GeeksforGeeks"); 
        // The lambda expression passed to 
        // reduce() method takes two Strings 
        // and returns the longer String. 
        // The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty. 
        Optional<String> longestString = words.stream() 
                                   .reduce((word1, word2) 
                             -> word1.length() > word2.length() 
                                           ? word1 : word2); 
  
        // Displaying the longest String 
        longestString.ifPresent(System.out::println); 
	}
}
