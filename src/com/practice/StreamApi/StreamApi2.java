package com.practice.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi2 {
	public static void main(String Args[]) {
//		HOW TO CREATE THE OBJECT OF STREAM
		Stream<Object> s1 = Stream.empty();

		String[] arr = { "One", "Two", "Three", "Four", "Five" };
		Stream<String> s2 = Stream.of(arr);
		s2.forEach(a -> {
			System.out.println(a);
		});
		System.out.println();

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream s3 = list.stream();
		s3.forEach(a -> {
			System.out.println(a);
		});
		System.out.println();
		
		Stream<Object> s4 = Stream.builder().build();

		int[] integerArray = { 1, 7, 5, 9, 2 };
		IntStream s5 = Arrays.stream(integerArray);
		s5.forEach(a -> {
			System.out.println(a);
		});
	}
}
