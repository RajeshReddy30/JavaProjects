package com.xworkz.car.dto;

import java.sql.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
public class CarRentalDto {
	private int rentalId;
	private String customerName;
	private String customerEmail;
	private String carModel;
	private String carLicensePlate;
	private Date rentalStartDate;
	private Date rentalEndDate;
	private double rentalCost;
	//private boolean isAvailable;

}
