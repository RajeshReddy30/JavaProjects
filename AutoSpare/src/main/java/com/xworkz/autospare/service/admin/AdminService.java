package com.xworkz.autospare.service.admin;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.autospare.dto.user.ProjectDto;
import com.xworkz.autospare.entity.user.SignInEntity;
import com.xworkz.autospare.entity.user.SignUpEntity;
import com.xworkz.autospare.repository.admin.AdminRepo;

@Component
@Service
public class AdminService {
	@Autowired
	private AdminRepo repo;

	public boolean findByEmailAndPassword(String email, String password) {
		if (email != null && password != null) {
			if (repo.findByEmailAndPassword(email, password) != null) {
				return true;
			}

		}

		return false;

	}
	
	public List<ProjectDto> findActive() {
		List<SignUpEntity> list = repo.findactive();
		return list.stream().map(AdminService::convertLoginEntityToDto).collect(Collectors.toList());
	}
	
	
	public List<ProjectDto> findInActive() {
		List<SignUpEntity> list = repo.findInactive();
		return list.stream().map(AdminService::convertLoginEntityToDto).collect(Collectors.toList());	
	}
	public static ProjectDto convertLoginEntityToDto(SignUpEntity entity) {
		ProjectDto dto = new ProjectDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	public static SignInEntity convertDtoToLoginEntity(ProjectDto dto) {
		SignInEntity entity = new SignInEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	
	
	


}
