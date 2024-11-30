package com.xworkz.car.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="car_rental")
public class CarRentalEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
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
