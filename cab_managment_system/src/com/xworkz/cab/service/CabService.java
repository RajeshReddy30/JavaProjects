package com.xworkz.cab.service;

import java.util.Set;

import com.xworkz.cab.dto.CabDto;

public interface CabService {
	String validate(CabDto cabDto);
	Set<CabDto> getAll();
}
