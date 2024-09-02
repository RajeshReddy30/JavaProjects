package com.xworkz.productdetails.service;

import com.xworkz.productdetails.dto.ProductInformationDto;

public abstract class AbstractProductInformation {
	public abstract String onSave(ProductInformationDto productInformationDto);
	public abstract boolean searchByProductName(ProductInformationDto productName);

}
