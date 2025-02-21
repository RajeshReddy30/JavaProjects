package com.xworkz.autospare.dto.seller;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SellerDto {
	private int id;
	private String name;
	private String email;
	private long contactNumber;
	private String address;
	private String gstNumber;
	private String companyType;
	private String country;
	private String state;
	private String city;
	private int pincode;
	private String createdBy;

	private LocalDateTime createdOn;

	private String updatedBy;

	private LocalDateTime updatedOn;
	private boolean isActive;
	private LocalDateTime getOtpGeneratedTime;
	private int otp;
	

}
