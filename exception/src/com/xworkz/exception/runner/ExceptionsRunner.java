package com.xworkz.exception.runner;

import com.xworkz.exception.service.*;

public class ExceptionsRunner {

    public static void main(String[] args) throws DateRangeException, NullFieldException{
        throw new DateRangeException("The given date is out of valid range.");
        throw new NullFieldException("username");
        
    }
}

