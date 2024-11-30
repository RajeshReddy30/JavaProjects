package com.xworkz.gadget.service;

import java.util.List;

import com.xworkz.gadget.dto.GadgetDto;
import com.xworkz.gadget.repo.GadgetRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class GadgetServiceImplementation implements GadgetService {
public  GadgetRepo repo;
	@Override
	public String save(GadgetDto dto) {
		System.out.println("save method");
		if(dto!=null) {
			repo.save(dto);
			return "saved successfully";
		}
		return "not saved";
	}
	@Override
	public List<GadgetDto> read() {
		System.out.println("read method");
		return repo.read();
	}
	@Override
	public String deleteById(int id) {
		
		System.out.println("delete method");
		if(repo.deleteById(id)) {
			return "Deleted successfully";
		}
		
		return "not deleted";
	}
	@Override
	public GadgetDto searchById(int id) {
		System.out.println("search method");
		
		return repo.searchById(id);
	}
	@Override
	public String updateById(int id, GadgetDto dto) {
		System.out.println("update method");
		if(repo.updateById(id, dto)) {
		return "updated successfully";
		}else
			return "not updated";
	}
	

}
