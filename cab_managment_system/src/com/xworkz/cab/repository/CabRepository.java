package com.xworkz.cab.repository;

import java.util.Set;

import com.xworkz.cab.dto.CabDto;

public interface CabRepository {
	boolean save(CabDto cabDto);
	Set<CabDto> getAll();

}
