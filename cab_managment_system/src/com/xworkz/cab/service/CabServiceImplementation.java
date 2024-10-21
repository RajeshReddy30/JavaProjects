package com.xworkz.cab.service;

import java.util.Set;

import com.xworkz.cab.dto.CabDto;
import com.xworkz.cab.repository.CabRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CabServiceImplementation implements CabService  {
private CabRepository repo;
	@Override
	public String validate(CabDto cabDto) {
		System.out.println("validate method is running");
		if(cabDto!=null && repo.save(cabDto)) {
			return "saved successfully";
		}
		return "not saved" ;
	}
	@Override
	public Set<CabDto> getAll() {
		
		return repo.getAll();
	}

}
