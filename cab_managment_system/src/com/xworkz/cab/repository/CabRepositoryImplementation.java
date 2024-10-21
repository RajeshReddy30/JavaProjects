package com.xworkz.cab.repository;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.cab.dto.CabDto;

public class CabRepositoryImplementation implements CabRepository {
	Set<CabDto> sets=new HashSet<CabDto>();

	@Override
	public boolean save(CabDto cabDto) {
		System.out.println("save method is running");
		return sets.add(cabDto);
	}

	@Override
	public Set<CabDto> getAll() {
		
		return sets;
	}

}
