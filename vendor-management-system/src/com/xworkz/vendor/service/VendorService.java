package com.xworkz.vendor.service;

import java.util.List;

import com.xworkz.vendor.dto.VendorDto;

public interface VendorService {
	String validate(VendorDto vendorDto);

	List<VendorDto> getAll();

	String updateById(int vendorId, VendorDto vendorDto);

	String deleteById(int vendorId, VendorDto vendorDto);

}
