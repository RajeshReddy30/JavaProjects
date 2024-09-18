package com.xworkz.programmingquestions.runner;

import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class ArrayReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the choice");
        int choice=scanner.nextInt();

        switch(choice) {
        case 1:
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

       
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] % num == 0) {
                array[i] = num;
            }
        }

        System.out.println("Modified array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
        break;
        case 2:
        Month currentMonth = LocalDate.now().getMonth();
        System.out.println("Current month: " + currentMonth);
        break;
        case 3:
        DayOfWeek currentDay=LocalDate.now().getDayOfWeek();
        System.out.println("current day:"+currentDay);
        break;
        case 4:
        System.out.println("enter the day name :");
        scanner.nextLine();
        String dayName=scanner.nextLine();
        DayOfWeek curentDay=LocalDate.now().getDayOfWeek();
        if(curentDay.name().equalsIgnoreCase(dayName)) {
        	System.out.println("entered day matches current day:"+curentDay);
        }else
        	System.out.println("entered day don't matches with current day");
    break;
    default:System.out.println("enter choce less than ");
        }}
    
    }


