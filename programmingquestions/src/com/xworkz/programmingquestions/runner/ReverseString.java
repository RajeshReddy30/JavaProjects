package com.xworkz.programmingquestions.runner;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
	public void reverseString(String originalValue) {
		if (originalValue != null) {
			for (int i = originalValue.length() - 1; i >= 0; i--) {
				System.out.print(originalValue.charAt(i));
			}
		} else {
			System.out.println("enter proper values");
		}
	}

	public void withoutLength(String originalValue) {
		char ch[] = originalValue.toCharArray();
		String reversedValue = "";
		for (char c : ch) {
			reversedValue = c + reversedValue;
		}
		System.out.print("reversed value is:" + reversedValue);
	}

	public void palindrom(String originalValue) {
		char ch[] = originalValue.toCharArray();
		String reversedValue = "";
		for (char c : ch) {
			reversedValue = c + reversedValue;
		}
		System.out.println("reversed value is:" + reversedValue);
		System.out.println("originalValue is:" + originalValue);
		if (originalValue.equals(reversedValue)) {
			System.out.println("given string is palindrom");
		} else {
			System.out.println("given strin is not palindrom");
		}
	}

	// split method
	public void splitString(String sentence) {
		int count = 0;
		String result[] = sentence.split(" ");
		System.out.println(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			count++;

		}
		System.out.println("words in given sentence is:" + count);
	}

	public void searchByYou(String sentence) {
		int count = 0;
		String word = "you";
		String result[] = sentence.split(" ");
		System.out.println(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			if (result[i].equalsIgnoreCase(word))
				result[i]="i";

				

		}
		System.out.println(Arrays.toString(result));
		//System.out.println("occurence of you in given sentence is:" + count);
	}
	 public String deleteByYou(String sentence) {
	        if (sentence != null && !sentence.isEmpty()) {
	            String word = "you";
	            String[] result = sentence.split(" ");
	            String[] updatedResult = new String[result.length];
	            int j = 0;

	            for (int i = 0; i < result.length; i++) {
	                if (!result[i].equalsIgnoreCase(word)) {
	                    updatedResult[j++] = result[i]; 
	                }
	            }

	            updatedResult = Arrays.copyOf(updatedResult, j);
	            String finalSentence = String.join(" ", updatedResult);
	            return finalSentence;
	        }
	        return sentence;
	    }

	public static void main(String[] args) {
		ReverseString reverse = new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string value:");
		reverse.searchByYou(scanner.nextLine());
		scanner.nextLine();
		System.out.println("enter the string value:");
		reverse.deleteByYou(scanner.nextLine());
		System.out.println("enter the string value:");
		reverse.reverseString(scanner.nextLine());
		scanner.nextLine();
		System.out.println("enter the string value:");
		reverse.withoutLength(scanner.nextLine());
		scanner.nextLine();
		System.out.println("enter the string value:");
		reverse.palindrom(scanner.nextLine());
		scanner.nextLine();
		System.out.println("enter the string value:");
		reverse.splitString(scanner.nextLine());
		scanner.nextLine();
		
		

	}
}
