package com.xworkz.task2.runner;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } finally {
            System.out.println("Finally block executed ");
        }
    }
}
