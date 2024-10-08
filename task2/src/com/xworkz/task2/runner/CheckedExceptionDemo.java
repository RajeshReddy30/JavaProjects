package com.xworkz.task2.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void throwException() throws FileNotFoundException, IOException {
        throw new FileNotFoundException("File not found ");
    }
}


