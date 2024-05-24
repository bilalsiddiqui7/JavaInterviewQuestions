package com.practice.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bilal", "Harshal", "Pratik", "Abhishek", "Aditya");
		names.stream().filter(i -> i.startsWith("A")).forEach(a -> System.out.println(a));
		System.out.println();

		List<Integer> numbers = Arrays.asList(23, 65, 42, 12, 32, 54, 67);
		List<Integer> doubleNumbers = numbers.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("doubleNumbers " + doubleNumbers);
		System.out.println();

		List<Integer> numbers2 = Arrays.asList(23, 65, 42, 12, 32, 54, 67);
		numbers2.stream().sorted().forEach(a -> System.out.println(a));
		System.out.println();

		List<Integer> numbers3 = Arrays.asList(23, 65, 42, 12, 32, 54, 67);
		int minNo = numbers3.stream().min((a, b) -> a - b).get();
		System.out.println("minNo " + minNo);
		System.out.println();

		List<Integer> numbers4 = Arrays.asList(23, 65, 42, 12, 32, 54, 67);
		int maxNo = numbers4.stream().max((a, b) -> a.compareTo(b)).get();
		System.out.println("maxNo " + maxNo);
	}
}
