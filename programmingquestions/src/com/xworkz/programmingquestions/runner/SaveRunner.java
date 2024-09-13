package com.xworkz.programmingquestions.runner;

import java.util.Scanner;

public class SaveRunner {
	int index = 0;
	String[] stringArray;

	public SaveRunner(int arraySize) {
		this.stringArray = new String[arraySize];
	}

	public String onSave(String sentence) {
		if (sentence != null && !sentence.isEmpty() && sentence.length() < 16 && sentence.length() > 3
				&& sentence.startsWith("s") && sentence.endsWith("a")) {
			System.out.println("Validation is done");
			if (index < stringArray.length) {
				stringArray[index] = sentence;
				index++;
				return "Saved successfully";
			} else {
				return "Array is full, cannot save";
			}
		}
		return "Not saved, validation failed";
	}

	public static void main(String[] args) {

		SaveRunner save = new SaveRunner(5);
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the sentence:");

		System.out.println(save.onSave(scanner.nextLine()));
		scanner.close();
	}
}
