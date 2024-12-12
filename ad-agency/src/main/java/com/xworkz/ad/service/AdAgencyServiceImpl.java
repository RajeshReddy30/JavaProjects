package com.xworkz.ad.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.ad.dto.AdAgencyDto;
import com.xworkz.ad.entity.AdAgencyEntity;
import com.xworkz.ad.repo.AdAgencyRepo;
import com.xworkz.ad.util.AdAgencyUtil;

public class AdAgencyServiceImpl implements AdAgencyService {

	private AdAgencyRepo repo;

	

	public AdAgencyServiceImpl(AdAgencyRepo repo2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String saveAndValidate(AdAgencyDto dto) {

		AdAgencyEntity entity = AdAgencyUtil.mapDtoToEntity(dto);

		repo.save(entity);

		return "successfully saved in database";
	}

	@Override
	public List<AdAgencyDto> findAll() {

		List<AdAgencyEntity> entity = repo.findAll();

		return entity.stream().map(AdAgencyUtil::mapEntityToDto).collect(Collectors.toList());
	}

	@Override
	public boolean authenticate(String email, int password) {
		AdAgencyEntity entity = repo.authenticateUser(email, password);
		return entity!= null;
       
	}

}
