package com.xworkz.vendor.runner;

import com.xworkz.vendor.dto.VendorDto;
import com.xworkz.vendor.repository.VendorRepository;
import com.xworkz.vendor.repository.VendorRepositoryImplimentation;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImplimentation;

public class VendorRunner {
	public static void main(String[] args) {
		VendorDto vendorDto = new VendorDto();
		vendorDto.setVendorId(76678);
		vendorDto.setVendorName("Ganesh");
		vendorDto.setTypeOfProducts("Rods and steels");
		vendorDto.setEmail("ganesh@gmail.com");
		vendorDto.setContact(9487892988L);
		VendorService vendorservice = new VendorServiceImplimentation(new VendorRepositoryImplimentation());
		String result = vendorservice.validate(vendorDto);
		System.out.println(result);
		System.out.println(vendorservice.getAll());
		VendorDto newvendorDto = new VendorDto();
		newvendorDto.setVendorId(76678);
		newvendorDto.setVendorName("Ganesh sai");
		newvendorDto.setTypeOfProducts("Rods");
		newvendorDto.setEmail("ganesh@gmail.com");
		newvendorDto.setContact(9487892988L);

		System.out.println(vendorservice.updateById(76678, newvendorDto));
		System.out.println(vendorservice.getAll());
		System.out.println(vendorservice.deleteById(76678, newvendorDto));
		System.out.println(vendorservice.getAll());

	}

}
