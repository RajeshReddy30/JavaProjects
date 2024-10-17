package com.xworkz.task2.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;

public class SetsRunner {

	public static void main(String[] args) {
		Set<String> laptops = new HashSet<>();

		laptops.add("Dell XPS 13");
		laptops.add("MacBook Pro");
		laptops.add("HP Spectre x360");
		laptops.add("Lenovo ThinkPad");
		laptops.add("Asus ZenBook");

		boolean result1 = laptops.contains("HP Spectre x360");
		System.out.println("Is 'HP Spectre x360' present: " + result1);

		Set<String> otherSet = new HashSet<>();
		otherSet.add("Dell XPS 13");
		otherSet.add("MacBook Pro");
		boolean result2 = laptops.equals(otherSet);
		System.out.println("Is laptops equal to otherSet: " + result2);

		boolean result3 = laptops.isEmpty();
		System.out.println("Is laptops empty: " + result3);

		int result4 = laptops.hashCode();
		System.out.println("Hash code: " + result4);

		boolean result5 = laptops.remove("Asus ZenBook");
		System.out.println("Removed 'Asus ZenBook': " + result5);

		int result6 = laptops.size();
		System.out.println("Size after removal: " + result6);

		laptops.clear();
		System.out.println("After clear, is laptops empty: " + laptops.isEmpty());
		Set<String> bags = new LinkedHashSet<>();

		bags.add("Backpack");
		bags.add("Tote Bag");
		bags.add("Duffel Bag");
		bags.add("Messenger Bag");
		bags.add("Handbag");

		boolean results = bags.contains("Duffel Bag");
		System.out.println("Is 'Duffel Bag' present: " + results);

		Set<String> otherSets = new LinkedHashSet<>();
		otherSets.add("Backpack");
		otherSets.add("Tote Bag");
		boolean results2 = bags.equals(otherSets);
		System.out.println("Is bags equal to otherSet: " + results2);

		boolean results3 = bags.isEmpty();
		System.out.println("Is bags empty: " + results3);

		int results4 = bags.hashCode();
		System.out.println("Hash code: " + results4);

		boolean results5 = bags.remove("Handbag");
		System.out.println("Removed 'Handbag': " + results5);

		int results6 = bags.size();
		System.out.println("Size after removal: " + results6);

		bags.clear();
		System.out.println("After clear, is bags empty: " + bags.isEmpty());

	}
}
