package com.xworkz.exception.service;

import java.time.LocalDateTime;

public class LocalDateTimeException extends Throwable {
    
    public LocalDateTimeException(LocalDateTime dateTime) {
        System.out.println("LocalDateTimeException constructor is running: " + dateTime);
    }
}

