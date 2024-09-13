package com.xworkz.programmingquestions.runner;

import java.util.Arrays;
import java.util.Scanner;

public class ReplacingWord {
	public void replaceWord(String sentence) {
		String word = "ouy";
		String updateSentence="";
		String result[] = sentence.split(" ");
		System.out.println(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			if (result[i].equalsIgnoreCase(word))
				result[i] = "you";

		}
		System.out.println(Arrays.toString(result));
		for(int i=0;i<result.length;i++) {
			updateSentence+=result[i]+" ";	
		}
		System.out.println("updated sentence is:"+updateSentence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplacingWord replace=new ReplacingWord();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the sentence:");
		replace.replaceWord(scanner.nextLine());

	}

}
