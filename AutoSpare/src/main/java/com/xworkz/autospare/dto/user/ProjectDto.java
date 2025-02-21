package com.xworkz.autospare.dto.user;

import javax.validation.constraints.Email;

import io.smallrye.common.constraint.NotNull;
import lombok.Data;

@Data
public class ProjectDto {

	private int id;
	@NotNull
	private String userName;
	@Email
	private String email;
	private String password;
	private long aadharNumber;

	private long contactNumber;

	private String dateOfBirth;
	private String country;
	private String state;
	private String city;
	private int pincode;
	private String address;

	private String createdBy;

	private String createdOn;

	private String updatedBy;

	private String updatedOn;
	private boolean isActive;
	private int failedAttempt;
	private boolean islocked;

}
