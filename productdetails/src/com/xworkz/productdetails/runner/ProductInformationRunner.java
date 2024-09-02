package com.xworkz.productdetails.runner;

import java.time.LocalDate;

import com.xworkz.productdetails.constant.BrandNamesConstant;
import com.xworkz.productdetails.dto.ProductInformationDto;
import com.xworkz.productdetails.service.ProductInformation;

public class ProductInformationRunner {

    public static void main(String[] args) {
        // Creating a ProductInformationDto object
        ProductInformationDto productInformationDto = new ProductInformationDto("laptop",
        		BrandNamesConstant.APPLE,678,9768L,LocalDate.now());
        ProductInformationDto productInformationDt = new ProductInformationDto("book",
        		BrandNamesConstant.APPLE,678,9768L,LocalDate.now());
        ProductInformationDto productInformationDo = new ProductInformationDto("buds",
        		BrandNamesConstant.APPLE,678,9768L,LocalDate.now());
        
        
        // Setting properties for the ProductInformationDto
        productInformationDto.setProductName("mobile");
        productInformationDto.setBrandNames(BrandNamesConstant.VIVO);
        productInformationDto.setProductId(567);
        productInformationDto.setPrice(538);
         productInformationDto.setManfactureDate(LocalDate.now());
         productInformationDto.setExpiryDate(LocalDate.of(2024, 8, 31));
        
        // Creating a ProductInformation object
        ProductInformation productInformation = new ProductInformation();

        // Saving the product information
        String info = productInformation.onSave(productInformationDto);
        System.out.println(info);

        System.out.println("................");

        // Searching for the product by name
        boolean search = productInformation.searchByProductName(productInformationDto);
        System.out.println("Product found: " + search);
        System.out.println("................");
        System.out.println(productInformation.read(productInformationDto));
        System.out.println("................");
        System.out.println(productInformation.update(productInformationDto, productInformationDto));
        System.out.println("................");
        System.out.println(productInformation.delete(info));
        
    }
}

