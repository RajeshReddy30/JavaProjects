package com.xworkz.streams.runner;


import java.util.LinkedList;
import java.util.List;

public class streamsExample {

	public static void main(String[] args) {

		List<Double> ratings = new LinkedList<Double>();
		ratings.add(4.2);
		ratings.add(2.9);
		ratings.add(4.7);
		ratings.add(1.2);
		ratings.add(5.3);
		ratings.add(6.4);

		System.out.println("==== minimum value ====");
		Double min = ratings.stream().reduce(Double.MAX_VALUE, Double::min);
		System.out.println("min :" + min);

		System.out.println("==== maxaimum value ====");
		Double max = ratings.stream().reduce(Double.MIN_VALUE, Double::max);
		System.out.println("max :" + max);

		System.out.println("==== sum ====");
		Double sum = ratings.stream().reduce(0.0, Double::sum);
		System.out.println("sum :" + sum);
	}
}
