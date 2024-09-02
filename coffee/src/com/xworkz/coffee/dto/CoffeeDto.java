package com.xworkz.coffee.dto;

import java.time.LocalDate;

import com.xworkz.coffee.constant.CoffeeTypeConstant;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CoffeeDto {
	public CoffeeDto(String string, CoffeeTypeConstant blackcoffee, int i, boolean b, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	private String coffeeShop;
	private CoffeeTypeConstant coffeeType;
	private double coffeeprice;
	private boolean ishot;
	private int caffeineContent;
	private LocalDate coffeeManufactureDate;

}
