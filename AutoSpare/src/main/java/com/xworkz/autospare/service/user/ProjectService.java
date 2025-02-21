package com.xworkz.autospare.service.user;

import com.xworkz.autospare.dto.user.ProjectDto;
import com.xworkz.autospare.entity.user.SignUpEntity;

public interface ProjectService {

	boolean signUpSave(ProjectDto dto);

	boolean getEmail(String email);

	boolean findByEmailAndPassword(String email, String password);
	boolean getAadharNumber(long aadharNumber);
	boolean getContactNumber(long contactNumber);
	 ProjectDto findByEmail(String email);
	 boolean updateByEmail(ProjectDto dto);
	 boolean deleteByEmail(ProjectDto dto);
	 ProjectDto getInActiveEmail(String email);
	 SignUpEntity increament(ProjectDto dto);

	boolean verifyOTP(int otp, String email);

	boolean updatePasswordByEmail(String password, String email);
	boolean sendOtp(String email);


}