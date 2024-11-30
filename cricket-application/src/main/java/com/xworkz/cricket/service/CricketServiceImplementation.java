package com.xworkz.cricket.service;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.repo.CricketRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CricketServiceImplementation implements CricketService {
	private CricketRepository repo;

	@Override
	public String validateAndSave(CricketDto dto) {
		if (dto != null) {
			if (repo.save(dto)) {
				return "saved successfully";
			}
		}
		return "not Saved";
	}

}
