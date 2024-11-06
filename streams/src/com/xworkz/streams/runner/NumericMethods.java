package com.xworkz.streams.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumericMethods {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(9);
		numbers.add(46);
		numbers.add(89);
		numbers.add(23);
		numbers.add(82);
		numbers.add(28);
		numbers.add(45);
		numbers.add(74);
		numbers.add(4);
		numbers.add(0);

		// even numbers
		System.out.println("Even Numbers");
		List<Integer> even = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		even.forEach(a -> System.out.println(a));

		// square of numbers
		System.out.println("Square of Numbers");
		List<Integer> squares = numbers.stream().map(s -> s * s).collect(Collectors.toList());
		squares.forEach(a -> System.out.println(a));

		// partition
		Map<Boolean, List<Integer>> partition = numbers.stream().collect(Collectors.partitioningBy(p -> p % 2 == 0));

		System.out.println("Even Numbers :" + partition.get(true));
		System.out.println("Odd Numbers :" + partition.get(false));
		List<String> names = new ArrayList<String>();
		names.add("Aadya");
		names.add("Nthin");
		names.add("Anand");
		names.add("Axar");
		names.add("Aadya");
		names.add("Ganesh");
		names.add("Ashok");

		// starts with
		System.out.println("===== Names Start with 'A' ====");
		List<String> startsWith = names.stream().filter(f -> f.startsWith("A") || f.startsWith("a"))
				.collect(Collectors.toList());
		startsWith.forEach(s -> System.out.println(s));

		// Filtering and upperCase
		System.out.println("===== Names length > 4 toUpperCase ======");
		List<String> length = names.stream().filter(s -> s.length() > 4).map(String::toUpperCase)
				.collect(Collectors.toList());
		length.forEach(l -> System.out.println(l));

		// word frequency
		System.out.println("==== Names frequency count =====");
		Map<Object, Long> frequency = names.stream()
				.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		System.out.println(frequency);
	}

}
