package com.xworkz.productdetails.util;

import java.time.LocalDate;

import com.xworkz.productdetails.dto.ProductInformationDto;

public class ProductInformationUtil extends AbstractProductInformationUtil {

    @Override
    public boolean checkDuplicate(ProductInformationDto[] productInformationDtoArray, ProductInformationDto dto) {
        for (ProductInformationDto existingDto : productInformationDtoArray) {
            if (existingDto != null && existingDto.equals(dto)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicate found
    }

    @Override
    public boolean brandNameCheck(ProductInformationDto brandNameDto) {
        if (brandNameDto != null && brandNameDto.getBrandNames() != null) {
            String brandName = brandNameDto.getBrandNames().toString();
            if (brandName.length() > 3 && !brandName.isBlank()) {
                return true;
            } else {
                System.out.println("Enter a valid brand name.");
            }
        }
        return false;
    }

    @Override
    public boolean productIdCheck(ProductInformationDto idDto) {
        if (idDto != null && String.valueOf(idDto.getProductId()).length() <= 5) {
            return true;
        } else {
            System.out.println("Enter a valid ID: the ID length should not be greater than 5.");
            return false;
        }
    }

    @Override
    public boolean checkPrice(ProductInformationDto priceDto) {
        if (priceDto != null && priceDto.getPrice() > 0) {
            return true;
        } else {
            System.out.println("Enter a valid price.");
            return false;
        }
    }

    @Override
    public boolean checkManufactureDate(ProductInformationDto manufactureDateDto) {
        if (manufactureDateDto != null && manufactureDateDto.getManfactureDate() != null) {
            if (!manufactureDateDto.getManfactureDate().isAfter(LocalDate.now())) {
                return true;
            } else {
                System.out.println("Manufacture date cannot be in the future.");
            }
        } else {
            System.out.println("Enter a valid manufacture date.");
        }
        return false;
    }

    @Override
    public boolean checkExpiryDate(ProductInformationDto expiryDateDto) {
        if (expiryDateDto != null && expiryDateDto.getExpiryDate() != null 
                && expiryDateDto.getManfactureDate() != null) {
            if (expiryDateDto.getExpiryDate().isAfter(expiryDateDto.getManfactureDate())) {
                return true;
            } else {
                System.out.println("Expiry date must be after the manufacture date.");
            }
        } else {
            System.out.println("Enter a valid expiry date.");
        }
        return false;
    }
}

