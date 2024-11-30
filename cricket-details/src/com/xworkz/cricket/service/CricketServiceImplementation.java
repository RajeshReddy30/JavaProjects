package com.xworkz.cricket.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.repository.CricketRepository;
import com.xworkz.cricket.repository.CricketRepositoryImplementation;
import com.xworkz.cricket.util.CricketUtil;

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

	@Override
	public List<CricketDto> read() {

		return repo.read();
	}

	@Override
	public CricketDto searchById(int id) {
		
		return repo.searchById(id);
		
	}

	@Override
	public String delete(int id) {
		if(repo.delete(id)) {
			return "deleted successfully";
		}
		
		return "not deleted";
	}

}
