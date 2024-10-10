package com.xworkz.task2.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CountryList {
	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<>();

		countries.add("Japan");
		countries.add("India");
		countries.add("China");
		countries.add("South Korea");
		countries.add("Thailand");
		countries.add("Vietnam");
		countries.add("Indonesia");
		countries.add("Malaysia");
		countries.add("Philippines");
		countries.add("Singapore");
		countries.add("Germany");
		countries.add("France");
		countries.add("Brazil");
		countries.add("Canada");
		countries.add("Nigeria");
		countries.add("Egypt");
		countries.add("Australia");
		countries.add("Mexico");
		countries.add("Russia");
		countries.add("United Kingdom");
		countries.add("United States");
		Collections.sort(countries);

		System.out.println(countries);
		ArrayList<String> collectionOfStateNames = new ArrayList<String>();
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
		Collections.sort(collectionOfStateNames);
		System.out.println("state names:" + collectionOfStateNames);

	}
}
