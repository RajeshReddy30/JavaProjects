package com.xworkz.streams.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamRunner {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("rajesh", "rajesh", "naresh", "rohanth", "ganesh");
		stream.sorted().skip(2).limit(4).distinct().forEach(s -> System.out.println(s));
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(20);
		list.add(45);
		list.add(30);
		list.add(20);

		System.out.println("=============");
		Comparator<Integer> comparator = (Integer s1, Integer s2) -> s1.compareTo(s2);
		list.stream().sorted(comparator).skip(3).distinct().limit(5).forEach(s -> System.out.println(s));

		List<String> lists = new ArrayList<>();
		lists.add("apple");
		lists.add("banana");
		lists.add("apple");
		lists.add("orange");
		lists.add("banana");
		lists.add("grape");

		System.out.println("============ Sorted Ascending ============");
		list.stream().sorted().forEach(s -> System.out.println(s));

		System.out.println("============ Sorted Descending ============");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

		System.out.println("============ Distinct Values ============");
		list.stream().distinct().forEach(s -> System.out.println(s));

		System.out.println("============ Skip and Limit ============");
		list.stream().sorted().distinct().skip(1).limit(3).forEach(s -> System.out.println(s));

		

		System.out.println("============ Find Any ============");
		Optional<String> anyElement = lists.stream().findAny();
		anyElement.ifPresent(s -> System.out.println("Found any: " + s));

		System.out.println("============ Find First ============");
		Optional<String> firstElement = lists.stream().findFirst();
		firstElement.ifPresent(s -> System.out.println("Found first: " + s));
	}

}
