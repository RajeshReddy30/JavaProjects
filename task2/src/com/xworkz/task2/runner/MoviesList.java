package com.xworkz.task2.runner;

import java.util.ArrayList;
import java.util.Collections;

public class MoviesList {
	public static void main(String[] args) {
		ArrayList<String> movies = new ArrayList<>();

		movies.add("Baahubali 1");
		movies.add("Baahubali 2");
		movies.add("Magadheera");
		movies.add("Eega");
		movies.add("Arjun Reddy");
		movies.add("Pelli Sandadi");
		movies.add("Ala Vaikunthapurramuloo");
		movies.add("Sye");
		movies.add("Malliswari");
		movies.add("Kshana Kshanam");
		movies.add("Geetha Govindam");
		movies.add("Fidaa");
		movies.add("Dookudu");
		movies.add("Pushpa: The Rise");
		movies.add("Sri Ramadasu");
		movies.add("Ninne Pelladatha");
		movies.add("Srimanthudu");
		movies.add("Naa Peru Surya");
		movies.add("Bharat Ane Nenu");
		movies.add("Jersey");
		Collections.sort(movies);
		System.out.println(movies);

	}
}
