package com.xworkz.oops.util;

import com.xworkz.oops.dto.CoffeeMakerDto;

public class CoffeeMakerUtil {
	public static boolean validateFields(CoffeeMakerDto dto) {
		if(dto != null && dto.getBrandName() != null && !dto.getBrandName().isEmpty() &&

				dto.getPrice() > 0)
			return true;
		return false;
	}

	public static boolean checkDuplicate(CoffeeMakerDto[] listOfCoffeeMakers, CoffeeMakerDto dto) {
		for (CoffeeMakerDto coffeeMaker : listOfCoffeeMakers) {
			if (coffeeMaker != null && coffeeMaker.equals(dto)) {
				return true;
			}
		}
		return false;
	}
}
