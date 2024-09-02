package com.xworkz.productdetails.util;

import com.xworkz.productdetails.dto.ProductInformationDto;

public abstract class AbstractProductInformationUtil {
	public abstract boolean checkDuplicate(ProductInformationDto productInformationDto[],ProductInformationDto dto);
	public abstract boolean brandNameCheck(ProductInformationDto brandNameDto);
	public abstract boolean productIdCheck(ProductInformationDto idDto);
	public abstract boolean checkPrice(ProductInformationDto priceDto);
	public abstract boolean checkManufactureDate(ProductInformationDto manufactureDateDto);
	public abstract boolean checkExpiryDate(ProductInformationDto expiryDateDto);
}
