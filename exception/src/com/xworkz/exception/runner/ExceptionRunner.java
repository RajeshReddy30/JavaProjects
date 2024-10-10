package com.xworkz.exception.runner;

import com.xworkz.exception.service.LengthCheckException;
import com.xworkz.exception.service.NullCheckException;

public class ExceptionRunner {

    public static void main(String[] args) throws NullCheckException {
        try {
            
            throw new LengthCheckException("Rajesh");
        } catch (LengthCheckException exception) {
            System.out.println("Caught LengthCheckException: " + exception.getMessage());
            
            throw new NullCheckException("Null value found");
        }
    }
}