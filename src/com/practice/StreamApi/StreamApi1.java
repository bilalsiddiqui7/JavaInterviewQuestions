package com.practice.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi1 {
	public static void main(String args[]) {
		// WHEN WE USE asList METHOD WE CANNOT ADD ANY NEW VALUES IN THAT ARRAY
		// FILTERING EVEN NUMBERS AND ADDING IN A NEW LIST
		List<Integer> numbers = Arrays.asList(23, 65, 45, 22, 78);
		System.out.println("Numbers-> " + numbers);
		ArrayList<Integer> evenNos = new ArrayList<>();
		for (int i : numbers) {
			if (i % 2 == 0) {
				evenNos.add(i);
			}
		}
		System.out.println("evenNos-> " + evenNos);

		// FILTERING USING STREAM API
		List<Integer> numbers2 = Arrays.asList(23, 65, 45, 22, 78);
		System.out.println("Numbers2-> " + numbers);
		Stream<Integer> stream = numbers2.stream();
		List<Integer> evenNos2 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("evenNos2-> " + evenNos);

		// FILTERING THE NUMBERS GREATER THAN 50
		Stream<Integer> stream2 = numbers2.stream();
		List<Integer> nosGreaterThan50 = stream2.filter(i -> i > 50).collect(Collectors.toList());
		System.out.println("nosGreaterThan50-> " + nosGreaterThan50);
	}
}
