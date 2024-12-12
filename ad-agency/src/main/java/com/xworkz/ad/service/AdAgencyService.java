package com.xworkz.ad.service;

import java.util.List;

import com.xworkz.ad.dto.AdAgencyDto;

public interface AdAgencyService {

	String saveAndValidate(AdAgencyDto dto);

	List<AdAgencyDto> findAll();

	boolean authenticate(String email, int password);
}
