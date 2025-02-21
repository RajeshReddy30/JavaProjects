package com.xworkz.autospare.entity.seller;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;

@Data
@Entity
@NamedQuery(name = "findEmail", query = "SELECT e FROM SellerEntity e WHERE e.email = :email AND e.isActive=true")

public class SellerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
