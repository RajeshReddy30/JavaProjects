package com.xworkz.project.repo;

import com.xworkz.project.entity.SignInEntity;
import com.xworkz.project.entity.SignUpEntity;

public interface ProjectRepository {
	
	 boolean signUpSave(SignUpEntity signUpEntity);
	
	 boolean signInSave(SignInEntity signInEntity);
	
	 SignUpEntity findByEmailAndPassword(String email, String password);
	SignUpEntity getEmail(String email);
	boolean getAadharNumber(long aadharNumber);
	boolean getContactNumber(long contactNumber);
	 boolean updateByEmail(SignUpEntity entity);
	 boolean deleteByEmail(SignUpEntity entity);
	
}

