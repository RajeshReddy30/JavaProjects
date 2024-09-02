package com.xworkz.coffee.util;

import java.time.LocalDate;

import com.xworkz.coffee.dto.CoffeeDto;

public class CoffeeUtil {
    public static boolean validateCoffeePrice(CoffeeDto coffeedto) {
        if (coffeedto != null && coffeedto.getCoffeeprice() > 10)
            return true;

        return false;
    }

    public static boolean validateCaffeineContent(CoffeeDto coffeedto) {
        if (coffeedto != null && coffeedto.getCaffeineContent() > 5)
            return true;
        return false;
    }

    public static boolean validateManufactureDate(CoffeeDto coffeedto) {
        if (coffeedto != null && coffeedto.getCoffeeManufactureDate().isBefore(LocalDate.now()))
            return true;
        return false;
    }

    public static boolean checkDuplicate(CoffeeDto coffeedtoList[], CoffeeDto dto) {
        for (CoffeeDto dtos : coffeedtoList) {
            if (dtos != null && dtos.equals(dto)) {
                return true;
            }
        }
        return false;
    }
}

