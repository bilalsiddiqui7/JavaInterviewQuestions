package com.practice.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalPractice
{
	public static Optional<String> getString()
	{
//		String str = "Random Text";
		 String str = null;
//		WHEN YOU ARE SURE THE VALUE IS NOT NULL YOU SHOULD USE of OTHERWISE YOU CAN USE ofNullable
//		return Optional.of(str);
		return Optional.ofNullable(str);
//		return Optional.empty();
	}
	public static void main(String[] args)
	{
		String upperString = null;
////		IF THE upperString IS NULL WE WILL GET AN EXCEPTION FOR THE BELOW LINE WE CAN HANGLE THIS BY CHECKING
////		THE VALUE IS PRERENT USING isPresent
//		upperString = OptionalPractice.getString().get().toUpperCase();

////		isPresent WILL RETURN TRUE IF THE VALUE IS PRESENT OTHERWISE IT WILL RETURN FALSE
//		 if (OptionalPractice.getString().isPresent())
//		//get WILL GEIVE YOU THE VALUE IF IT IS PRESENT
//		 upperString = OptionalPractice.getString().get();
//		 System.out.println(upperString);

////		ifPresent ACCEPTS A CONSUMER
//		OptionalPractice.getString().ifPresent(i -> System.out.println(i));
////		// SINCE WE ARE PASSING LAMBDA EXPRESSION SO WE CAN USE METHOD REFERENCE
//		OptionalPractice.getString().ifPresent(System.out::println);
		
//		orElse GETS EXECUTED WHEN THE VALUE IS NOT PRESENT
		System.out.println(OptionalPractice.getString().orElse("NA"));
//		THE METHOD orElseGet accepts a supplier, IF OUR LOGIC IS TOO BIG WE CAN USE orElseGet OTHERWISE WE CAN 
//		USE orElse
		System.out.println(OptionalPractice.getString().orElseGet(()->"NA"));
		//THE METHOD orElseThrow accepts a Supplier, IF WE NEED TO THROW ANY EXCEPTION WE CAN USE orElseThrow
		Optional<String> optionalString= OptionalPractice.getString();
		optionalString.orElseThrow(()->new NoSuchElementException());
		
	}
}
