package com.xworkz.task2.runner;

import java.io.IOException;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed .");
        }
    }

    public static void throwException() throws IOException {
        throw new IOException("Checked exception occurred ");
    }
}

