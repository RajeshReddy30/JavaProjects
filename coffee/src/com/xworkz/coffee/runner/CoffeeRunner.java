package com.xworkz.coffee.runner;

import java.time.LocalDate;

import com.xworkz.coffee.constant.CoffeeTypeConstant;
import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.service.Coffee;

public class CoffeeRunner {

    public static void main(String[] args) {
        CoffeeDto coffee1 = new CoffeeDto("Chai Venue", CoffeeTypeConstant.BLACKCOFFEE, 465, true, 23, LocalDate.of(2024, 8, 7));
        CoffeeDto coffee2 = new CoffeeDto("Chai Venue", CoffeeTypeConstant.BLACKCOFFEE, 465, true, 23, LocalDate.of(2024, 8, 7));
        CoffeeDto coffee3 = new CoffeeDto("Chai Venue", CoffeeTypeConstant.BLACKCOFFEE, 465, true, 23, LocalDate.of(2024, 8, 7));

        Coffee cafe = new Coffee();

        System.out.println(cafe.onSave(coffee1)); 
        System.out.println(cafe.onSave(coffee2)); 
        System.out.println(cafe.onSave(coffee3)); 
    }
}

