package com.xworkz.exception.service;


public class DateRangeException extends Throwable {
    
    public DateRangeException(String message) {
        System.out.println("Date range exception: " + message);
    }
}

