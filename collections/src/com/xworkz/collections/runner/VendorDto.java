package com.xworkz.collections.runner;



import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import lombok.Data;

@Data
public class VendorDto {
	private int vendorId;
	private String vendorName;
	private String typeOfProducts;
	private String email;
	private long contact;
	public static void main(String[] args) {
		VendorDto vendor=new VendorDto();
		vendor.setVendorId(879);
		vendor.setVendorName("rajesh");
		vendor.setEmail("sdkjkjh@gmail.com");
		vendor.setTypeOfProducts("rods");
		List<VendorDto> dto=new ArrayList<VendorDto>();
		dto.add(vendor);
		Comparator<VendorDto> comparator=(VendorDto d1,VendorDto d2)->d2.c
		
		
	}
	

}
