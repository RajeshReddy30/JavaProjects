package com.xworkz.project.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;


import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.SignInEntity;
import com.xworkz.project.entity.SignUpEntity;

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
		ProjectDto dto = new ProjectDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
