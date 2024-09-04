package com.xworkz.oops.service;

import java.util.Arrays;

import com.xworkz.oops.dto.CoffeeMakerDto;
import com.xworkz.oops.util.CoffeeMakerUtil;

public class CoffeeMakerService {
    private CoffeeMakerDto[] coffeeMakers;
    private int index = 0;

    public CoffeeMakerService(int size) {
        this.coffeeMakers = new CoffeeMakerDto[size];
    }

    public String saveCoffeeMaker(CoffeeMakerDto dto) {
        if (dto != null && !CoffeeMakerUtil.validateFields(dto) && !CoffeeMakerUtil.checkDuplicate(coffeeMakers, dto)) {
            if (index < coffeeMakers.length) {
                coffeeMakers[index] = dto;
                index++;
                return "Coffee Maker saved successfully";
            } else {
                return "Array is full cannot save ";
            }
        }
        return "Failed to save as duplicate exists.";
    }

    public String updateBrandName(int productCode, String newBrandName) {
        for (int i = 0; i < index; i++) {
            if (coffeeMakers[i].getProductCode() == productCode) {
                coffeeMakers[i].setBrandName(newBrandName);
                return "Brand name updated successfully!";
            }
        }
        return "Product code not found";
    }

    public CoffeeMakerDto searchByBrandName(String brandName) {
        for (int i = 0; i < index; i++) {
            if (coffeeMakers[i].getBrandName().equalsIgnoreCase(brandName)) {
                return coffeeMakers[i];
            }
        }
        return null;
    }

    public CoffeeMakerDto searchByProductCode(int productCode) {
        for (int i = 0; i < index; i++) {
            if (coffeeMakers[i].getProductCode() == productCode) {
                return coffeeMakers[i];
            }
        }
        return null;
    }

    public boolean delete(int productCode) {
        if (productCode != 0) {
            for (int i = 0, j = 0; i < index; i++) {
                if (coffeeMakers[i].getProductCode() != productCode) {
                    coffeeMakers[j++] = coffeeMakers[i];
                }
                coffeeMakers = Arrays.copyOf(coffeeMakers, j);
            }
            return true;
        }
        return false;
    }

    public int getArrayLength() {
        return coffeeMakers.length;
    }
}

