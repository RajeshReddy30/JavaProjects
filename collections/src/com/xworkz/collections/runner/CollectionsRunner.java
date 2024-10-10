package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsRunner {

	public static void main(String[] args) {
		Collection<String> collectionOfStateNames = new ArrayList<String>();
		collectionOfStateNames.add("Karnataka");
		collectionOfStateNames.add("Maharashtra");
		collectionOfStateNames.add("Tamil Nadu");
		collectionOfStateNames.add("Kerala");
		collectionOfStateNames.add("Andhra Pradesh");
		collectionOfStateNames.add("Telangana");
		collectionOfStateNames.add("Gujarat");
		collectionOfStateNames.add("Rajasthan");
		collectionOfStateNames.add("Uttar Pradesh");
		collectionOfStateNames.add("Madhya Pradesh");
		collectionOfStateNames.add("West Bengal");
		collectionOfStateNames.add("Punjab");
		collectionOfStateNames.add("Bihar");
		collectionOfStateNames.add("Odisha");
		collectionOfStateNames.add("Assam");
		System.out.println("state names:"+collectionOfStateNames);
		Collection<Integer> collectionOfNumbers = new ArrayList<Integer>();
		collectionOfNumbers.add(5);
		collectionOfNumbers.add(12);
		collectionOfNumbers.add(23);
		collectionOfNumbers.add(34);
		collectionOfNumbers.add(45);
		collectionOfNumbers.add(56);
		collectionOfNumbers.add(67);
		collectionOfNumbers.add(78);
		collectionOfNumbers.add(89);
		collectionOfNumbers.add(90);
		collectionOfNumbers.add(101);
		collectionOfNumbers.add(112);
		collectionOfNumbers.add(123);
		collectionOfNumbers.add(134);
		collectionOfNumbers.add(145);
		System.out.println("numbers:"+collectionOfNumbers);
		Collection<Float> collectionOfFloatNumbers = new ArrayList<Float>();

		collectionOfFloatNumbers.add(5.1f);
		collectionOfFloatNumbers.add(12.2f);
		collectionOfFloatNumbers.add(23.3f);
		collectionOfFloatNumbers.add(34.4f);
		collectionOfFloatNumbers.add(45.5f);
		collectionOfFloatNumbers.add(56.6f);
		collectionOfFloatNumbers.add(67.7f);
		collectionOfFloatNumbers.add(78.8f);
		collectionOfFloatNumbers.add(89.9f);
		collectionOfFloatNumbers.add(90.0f);
		collectionOfFloatNumbers.add(101.1f);
		collectionOfFloatNumbers.add(112.2f);
		collectionOfFloatNumbers.add(123.3f);
		collectionOfFloatNumbers.add(134.4f);
		collectionOfFloatNumbers.add(145.5f);
		System.out.println("float number:"+collectionOfFloatNumbers);
		Collection<Long> collectionOfLongNumbers = new ArrayList<>();

		collectionOfLongNumbers.add(123456789012345L);
		collectionOfLongNumbers.add(234567890123456L);
		collectionOfLongNumbers.add(345678901234567L);
		collectionOfLongNumbers.add(456789012345678L);
		collectionOfLongNumbers.add(567890123456789L);
		collectionOfLongNumbers.add(678901234567890L);
		collectionOfLongNumbers.add(789012345678901L);
		collectionOfLongNumbers.add(890123456789012L);
		collectionOfLongNumbers.add(901234567890123L);
		collectionOfLongNumbers.add(112345678901234L);
		collectionOfLongNumbers.add(223456789012345L);
		collectionOfLongNumbers.add(334567890123456L);
		collectionOfLongNumbers.add(445678901234567L);
		collectionOfLongNumbers.add(556789012345678L);
		collectionOfLongNumbers.add(667890123456789L);
		System.out.println("long numbers:"+collectionOfLongNumbers);
		Collection<Double> collectionOfRates = new ArrayList<>();

		collectionOfRates.add(110.05);
		collectionOfRates.add(4340.03);
		collectionOfRates.add(430.07);
		collectionOfRates.add(66770.02);
		collectionOfRates.add(0.0876984);
		collectionOfRates.add(0.0796);
		collectionOfRates.add(8780.08);
		collectionOfRates.add(0.09);
		collectionOfRates.add(08989.08098);
		collectionOfRates.add(0.1);

		System.out.println(collectionOfRates);
		Collection<Character> collectionOfChars = new ArrayList<>();

		collectionOfChars.add('A');
		collectionOfChars.add('B');
		collectionOfChars.add('C');
		collectionOfChars.add('D');
		collectionOfChars.add('E');
		collectionOfChars.add('F');
		collectionOfChars.add('G');
		collectionOfChars.add('H');
		collectionOfChars.add('I');
		collectionOfChars.add('J');

		System.out.println(collectionOfChars);

	}

}
