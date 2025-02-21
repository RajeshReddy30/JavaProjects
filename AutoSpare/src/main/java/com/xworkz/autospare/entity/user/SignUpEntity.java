package com.xworkz.autospare.entity.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;




import lombok.Data;

@Data
@Entity
@NamedQuery(name = "authentication", query = "SELECT e FROM SignUpEntity e WHERE e.email = :email AND e.password = :password AND e.isActive=true")
@NamedQuery(name = "findByEmail", query = "SELECT e FROM SignUpEntity e WHERE e.email = :email AND e.isActive=true")
@NamedQuery(name = "findByAadhar", query = "SELECT e FROM SignUpEntity e WHERE e.aadharNumber = :aadharNumber AND e.isActive=true")
@NamedQuery(name = "findByContact", query = "SELECT e FROM SignUpEntity e WHERE e.contactNumber = :contactNumber AND e.isActive=true")
@NamedQuery(name = "findActive", query = "SELECT e FROM SignUpEntity e WHERE  e.isActive=true")
@NamedQuery(name = "findInActive", query = "SELECT e FROM SignUpEntity e WHERE  e.isActive=false")
@NamedQuery(name = "checkInActiveEmail", query = "SELECT e FROM SignUpEntity e WHERE e.email = :email AND e.isActive=false")

public class SignUpEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "signUp_id")
	private int id;
	private String userName;
	private String email;
	private String password;
	private long aadharNumber;
	@Column(name = "cNumber")
	private long contactNumber;
	@Column(name = "dob")
	private String dateOfBirth;
	private String country;
	private String state;
	private String city;
	private int pincode;
	private String address;
	
	private String createdBy;
	
	private LocalDateTime createdOn;
	
	private String updatedBy;
	
	private String updatedOn;
	private boolean isActive;
	private int failedAttempt;
	private boolean islocked;
	private LocalDateTime otpGeneratedTime;
	private int otp;


}
