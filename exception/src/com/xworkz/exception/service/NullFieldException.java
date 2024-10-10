package com.xworkz.exception.service;

public class NullFieldException extends Throwable {
    
    public NullFieldException(String fieldName) {
        System.out.println("Null field constructor exception:"+ fieldName);
    }
}

