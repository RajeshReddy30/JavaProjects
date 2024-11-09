package com.xworkz.streams.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		Random random = new Random();

		// generating random numbers 1-100
		Stream.generate(() -> random.nextInt(100) + 1).limit(20).forEach(System.out::println);
		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(4);

		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(5);
		numbers2.add(6);
		numbers2.add(7);
		numbers2.add(8);

		List<Integer> numbers3 = new ArrayList<Integer>();
		numbers3.add(9);
		numbers3.add(10);
		numbers3.add(11);
		numbers3.add(12);

		List<List<Integer>> listOfNumbers = new ArrayList<List<Integer>>();
		listOfNumbers.add(numbers1);
		listOfNumbers.add(numbers2);
		listOfNumbers.add(numbers3);

		// flattening lists
		List<Integer> flattenList = listOfNumbers.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(flattenList);
		List<String> flowers = new ArrayList<String>();
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Lotus");
		flowers.add("Lily");
		flowers.add("Marygold");

		// Mapping String length
		Map<String, Integer> lengthCheck = flowers.stream().collect(Collectors.toMap(f -> f, String::length));

		System.out.println("Length of Strings :");
		System.out.println(lengthCheck);

	}

}
