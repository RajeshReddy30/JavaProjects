package com.xworkz.exception.runner;

import java.time.LocalDateTime;
import com.xworkz.exception.service.LocalDateTimeException;

public class LocalDateTimeExceptionRunner {

    public static void main(String[] args) throws LocalDateTimeException {
       
        LocalDateTime dateTime = LocalDateTime.now();
        
        throw new LocalDateTimeException(dateTime);
    }
}

