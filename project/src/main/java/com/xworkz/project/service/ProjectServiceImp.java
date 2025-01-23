package com.xworkz.project.service;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.SignInEntity;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.repo.ProjectRepositoryImp;
import com.xworkz.project.util.ProjectUtil;

@Component
@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectRepositoryImp repo;

	SignUpEntity signupEntity = new SignUpEntity();

	@Override
	public boolean signUpSave(ProjectDto dto) {
		if (dto != null) {
			BeanUtils.copyProperties(dto, signupEntity);
			
			signupEntity.setCreatedBy(dto.getUserName());
			signupEntity.setCreatedOn(LocalDateTime.now());
			signupEntity.setUpdatedBy("NA");
			signupEntity.setUpdatedOn("NA");
			signupEntity.setActive(true);
			
			repo.signUpSave(signupEntity);
			System.out.println("Saved");
			return true;
		}
		System.out.println("Not Saved");
		return false;
	}

	
	@Override
	public boolean findByEmailAndPassword(String email, String password) {
		SignUpEntity entity = repo.findByEmailAndPassword(email, password);
		SignInEntity signinEntity = new SignInEntity();
         System.err.println(entity);
		if (entity != null) {
			signinEntity.setUserId(entity.getId());
			signinEntity.setSignInTime(LocalDateTime.now());
			
			repo.signInSave(signinEntity);
			return true;
		} else {
			return false;
		}
		
	}
	@Override
	public boolean getEmail(String email) {

		if (email != null) {
			SignUpEntity mail = repo.getEmail(email);
			if (mail != null) {
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean getAadharNumber(long aadharNumber) {
		if(aadharNumber!=0) {
			boolean adhar=repo.getAadharNumber(aadharNumber);
			System.out.println("aadhar"+adhar);
			if(adhar) {
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean getContactNumber(long contactNumber) {
		if(contactNumber!=0) {
			boolean adhar=repo.getContactNumber(contactNumber);
			System.out.println("contact"+adhar);
			if(adhar) {
				return true;
			}
		}		return false;
	}


	@Override
	public ProjectDto findByEmail(String email) {
		if(email != null) {
			SignUpEntity entity = repo.getEmail(email);		
			return ProjectUtil.convertRegisterEntityToDto(entity);
		}
		return null;

	}


	@Override
	public boolean updateByEmail(ProjectDto dto) {
		SignUpEntity entity = new SignUpEntity();
		BeanUtils.copyProperties(dto, entity);
		
		entity.setCreatedBy(null);
		entity.setCreatedOn(null);
		entity.setUpdatedBy(dto.getUserName());
		entity.setUpdatedOn(null);
		repo.updateByEmail(entity);
		return true;
		
	}


	@Override
	public boolean deleteByEmail(ProjectDto dto) {
		if(dto!=null) {
		SignUpEntity entity = new SignUpEntity();
		BeanUtils.copyProperties(dto, entity);
		entity.setActive(false);
		
		entity.setUpdatedBy(dto.getUserName());
		entity.setUpdatedOn(null);
		repo.deleteByEmail(entity);
		return true;
		
	}
		return false;
	}
	}

	



