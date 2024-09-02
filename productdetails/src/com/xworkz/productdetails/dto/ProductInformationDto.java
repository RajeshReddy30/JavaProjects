package com.xworkz.productdetails.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.productdetails.constant.BrandNamesConstant;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString


public class ProductInformationDto {
	public ProductInformationDto(String string, BrandNamesConstant apple, int i, long l, LocalDate now) {
		// TODO Auto-generated constructor stub
	}
	private BrandNamesConstant brandNames;
	private String productName;
	private int productId;
	private long price;
	private LocalDate manfactureDate;
	private LocalDate expiryDate;

}
