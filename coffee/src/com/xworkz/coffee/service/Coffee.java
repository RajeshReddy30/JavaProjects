package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.util.CoffeeUtil;

public class Coffee {
    CoffeeDto listOfCoffee[] = new CoffeeDto[3];
    int index = 0;

    public String onSave(CoffeeDto coffeedto) {
        System.out.println("coffee details:" + coffeedto);
        if (CoffeeUtil.validateCoffeePrice(coffeedto) && CoffeeUtil.validateCaffeineContent(coffeedto)
                && CoffeeUtil.validateManufactureDate(coffeedto) && !CoffeeUtil.checkDuplicate(listOfCoffee, coffeedto)) {
            if (coffeedto != null && coffeedto.getCoffeeShop().length() > 3 && !coffeedto.getCoffeeShop().isBlank()
                    && !coffeedto.getCoffeeShop().isEmpty()) {
                if (this.index < listOfCoffee.length) {
                    listOfCoffee[index] = coffeedto;
                    index++;
                    return "saved successfully";
                } else {
                    return "Array is full, cannot save more coffee details.";
                }
            }
        }
        return "not saved successfully";
    }
}

