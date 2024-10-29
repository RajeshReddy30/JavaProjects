package com.xworkz.streams.runner;

import java.util.List;
import java.util.ArrayList;
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
		Stream<Integer>stream1 = list.stream();
		Long count = list.stream().count();
		System.out.println("Count is:"+count);
		int sum = IntStream.of(20,23,43,54,36).sum();
		
		stream1.distinct().forEach(e->System.out.println(e));
		System.out.println("Sum Operation");
		System.out.println(sum);
		
				
	}

}
