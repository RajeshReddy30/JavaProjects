package com.xworkz.vendor.service;

import java.util.List;

import com.xworkz.vendor.dto.VendorDto;
import com.xworkz.vendor.repository.VendorRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VendorServiceImplimentation implements VendorService {
	private VendorRepository repo;

	@Override
	public String validate(VendorDto vendorDto) {
		System.out.println("validate method");
		if (vendorDto != null) {
			if (repo.save(vendorDto)) {
				return "saved successfully";
			}
		}

		return "not saved successfully";
	}

	@Override
	public List<VendorDto> getAll() {

		return repo.getAll();
	}

	@Override
	public String updateById(int vendorId, VendorDto vendorDto) {
		if (vendorId > 0) {
			if (repo.updateById(vendorId, vendorDto)) {
				return "updated successfully";
			}
		} else {
			System.out.println("vendor id should be >0");
		}

		return "not updated successfully";
	}

	@Override
	public String deleteById(int vendorId, VendorDto vendorDto) {
		if (vendorId > 0) {
			if (repo.deleteById(vendorId, vendorDto)) {
				return "deleted successfully";
			}
		} else {
			System.out.println("vendor id should be >0");
		}

		return "not deleted";
	}

}
