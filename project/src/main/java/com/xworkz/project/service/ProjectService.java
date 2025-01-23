package com.xworkz.project.service;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.SignUpEntity;

public interface ProjectService {

	boolean signUpSave(ProjectDto dto);

	boolean getEmail(String email);

	boolean findByEmailAndPassword(String email, String password);
	boolean getAadharNumber(long aadharNumber);
	boolean getContactNumber(long contactNumber);
	 ProjectDto findByEmail(String email);
	 boolean updateByEmail(ProjectDto dto);
	 boolean deleteByEmail(ProjectDto dto);


}