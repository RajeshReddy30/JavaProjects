package com.xworkz.task2.runner;


import java.io.IOException;

public class MultiCatchExceptionDemo {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (NullPointerException | IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void throwException() throws NullPointerException, IOException {
        throw new IOException("IO Exception occurred.");
    }
}

