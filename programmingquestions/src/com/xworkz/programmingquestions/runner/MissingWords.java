package com.xworkz.programmingquestions.runner;
import java.util.ArrayList;
import java.util.Arrays;

public class MissingWords {
    public static void main(String[] args) {
        String s1 = "hello good morning";
        String s2 = "morning";

        ArrayList<String> missingWords = findMissingWords(s1, s2);
        System.out.println("Missing words: " + missingWords);
    }

    public static ArrayList<String> findMissingWords(String s1, String s2) {
        // Split the strings into arrays of words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        // Convert words2 to an ArrayList for easier iteration
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(words2));
        
        // Find missing words
        ArrayList<String> missingWords = new ArrayList<>();
        for (String word : words1) {
            if (!list2.contains(word)) {
                missingWords.add(word);
            }
        }
        
        return missingWords;
    }
}

