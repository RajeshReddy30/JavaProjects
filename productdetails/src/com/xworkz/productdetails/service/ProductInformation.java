package com.xworkz.productdetails.service;

import java.util.Arrays;

import com.xworkz.productdetails.dto.ProductInformationDto;
import com.xworkz.productdetails.util.ProductInformationUtil;

public class ProductInformation extends AbstractProductInformation {
    
    // Array to hold product information DTOs
    private ProductInformationDto[] listOfProductInformationDto = new ProductInformationDto[4];
    private int index = 0;
    private ProductInformationUtil util = new ProductInformationUtil();

    @Override
    public String onSave(ProductInformationDto productInformationDto) {
        System.out.println("onSave method is running...");
        System.out.println("Product information dto: " + productInformationDto);
        
        if (productInformationDto == null) {
            return "DTO is null, not saved.";
        }

        // Perform all necessary validations
        if (util.brandNameCheck(productInformationDto) && util.productIdCheck(productInformationDto)
                && util.checkPrice(productInformationDto) && util.checkManufactureDate(productInformationDto)
                && util.checkExpiryDate(productInformationDto)) {
            
            if (productInformationDto.getProductName() != null 
                    && productInformationDto.getProductName().length() >= 3
                    && !productInformationDto.getProductName().isBlank()) {
                
                System.out.println("Validation verified");

                // Check for duplicates before saving
                boolean isDuplicate = util.checkDuplicate(listOfProductInformationDto, productInformationDto);
                System.out.println("Duplicate check result: " + isDuplicate);

                if (!isDuplicate && index < listOfProductInformationDto.length) {
                    listOfProductInformationDto[index] = productInformationDto;
                    index++;
                    return "Saved successfully";
                } else {
                    return "Duplicate found, not saved.";
                }
            } else {
                System.out.println("Product name validation failed.");
                return "Product name validation failed, not saved.";
            }
        } else {
            System.out.println("One or more validations failed.");
            return "Validations failed, not saved.";
        }
    }

    @Override
    public boolean searchByProductName(ProductInformationDto productNameDto) {
        for (ProductInformationDto name : listOfProductInformationDto) {
            if (name != null && name.getProductName().equalsIgnoreCase(productNameDto.getProductName())) {
                return true;
            }
        }
        return false;
    }
    public ProductInformationDto read(ProductInformationDto dto) {
    	System.out.println("read method is running");
    	for(ProductInformationDto data:listOfProductInformationDto) {
    		return data;
    	}
    	return null;
    }
    public String  update(ProductInformationDto productDto,ProductInformationDto Dto) {
    	System.out.println("update method is running");
    	int index=0;
    	for(int i=0;i<listOfProductInformationDto.length;i++) {
    		if(listOfProductInformationDto[index]==productDto) {
    			listOfProductInformationDto[index]=Dto;
    			index++;
    			return "update successfull";
    		}
    	}
    	
    	return "not updated";
    }
    public boolean delete(String productId) {
		if (productId != null) {
			for (int i = 0, j = 0; i < listOfProductInformationDto.length; i++) {
				if (listOfProductInformationDto[i] != null && listOfProductInformationDto[i].equals(productId)) {
					listOfProductInformationDto[j++] = listOfProductInformationDto[i];
					return true;
				}

				listOfProductInformationDto = Arrays.copyOf(listOfProductInformationDto, j);
				System.out.println("Deleted successfully.");

			}
		}

		return false;
	}
}

