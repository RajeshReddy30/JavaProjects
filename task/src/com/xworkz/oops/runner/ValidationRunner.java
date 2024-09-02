package com.xworkz.oops.runner;

public class ValidationRunner {

    public static void main(String[] args) {
        ValidationRunner.validation("kdalnlkjnkjn dasma aml123");
    }

    public static void validation(String str) {
        int count = 0;
        boolean containsDigit = false;

        char[] ch = str.toCharArray();
        System.out.println("The number of characters in the sentence is: " + ch.length);

        for (char cha : ch) {
            if (Character.isWhitespace(cha)) {
                count++;
            }
            if (Character.isDigit(cha)) {
                containsDigit = true;
            }
        }

        System.out.println("Count of whitespaces is: " + count);
        System.out.println("Sentence in uppercase: " + str.toUpperCase());
        System.out.println("Sentence in lowercase: " + str.toLowerCase());

        if (containsDigit) {
            System.out.println("Sentence contains a digit.");
        } else {
            System.out.println("Sentence doesn't contain a digit.");
        }
    }
}



