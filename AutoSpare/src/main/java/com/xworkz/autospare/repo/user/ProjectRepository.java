package com.xworkz.autospare.repo.user;

import com.xworkz.autospare.entity.user.SignInEntity;
import com.xworkz.autospare.entity.user.SignUpEntity;

public interface ProjectRepository {
	
	 boolean signUpSave(SignUpEntity signUpEntity);
	
	 boolean signInSave(SignInEntity signInEntity);
	
	 SignUpEntity findByEmailAndPassword(String email, String password);
	SignUpEntity getEmail(String email);
	boolean getAadharNumber(long aadharNumber);
	boolean getContactNumber(long contactNumber);
	 boolean updateByEmail(SignUpEntity entity);
	 boolean deleteByEmail(SignUpEntity entity);
	SignUpEntity getInActiveEmail(String email);
	SignUpEntity findById(int id);

}

