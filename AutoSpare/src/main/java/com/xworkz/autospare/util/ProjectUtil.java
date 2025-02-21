package com.xworkz.autospare.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import com.xworkz.autospare.dto.user.ProjectDto;
import com.xworkz.autospare.entity.user.SignInEntity;
import com.xworkz.autospare.entity.user.SignUpEntity;



public class ProjectUtil {

	public static Set<ConstraintViolation<ProjectDto>> validation(ProjectDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valid = factory.getValidator();
		Set<ConstraintViolation<ProjectDto>> violations = valid.validate(dto);
		return violations;
	}

	@Bean
	public static SignInEntity convertDtoToLoginEntity(ProjectDto dto) {
		SignInEntity entity = new SignInEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	@Bean
	public static ProjectDto convertLoginEntityToDto(SignInEntity entity) {
		ProjectDto dto = new ProjectDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	
	@Bean
	public static SignUpEntity convertDtoToRegisterEntity(ProjectDto dto) {
		SignUpEntity entity = new SignUpEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
	
	@Bean
	public static ProjectDto convertRegisterEntityToDto(SignUpEntity entity) {
		if(entity==null) {
			return null;
		}
		ProjectDto dto = new ProjectDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
