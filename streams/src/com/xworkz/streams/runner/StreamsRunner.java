package com.xworkz.streams.runner;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsRunner {
	public static void main(String[] args) {
		Stream<String>stream = Stream.of("rajesh","rajesh","naresh","rohanth","ganesh");
		stream.distinct().forEach(s->System.out.println(s));
		List<Integer>list = new ArrayList<>();
		list.add(45);
		list.add(20);
		list.add(45);
		list.add(30);
		list.add(20);
		
		System.out.println("=============");
		Comparator<Integer> comparator=(Integer s1,Integer s2)->s1.compareTo(s2);
		list.stream().sorted(comparator).skip(3).distinct().limit(5).forEach(s->System.out.println(s));
		
		
		
				
	}

}
