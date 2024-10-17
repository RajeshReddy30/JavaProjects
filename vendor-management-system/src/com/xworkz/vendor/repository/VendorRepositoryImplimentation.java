package com.xworkz.vendor.repository;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.vendor.dto.VendorDto;

public class VendorRepositoryImplimentation implements VendorRepository {
	LinkedList<VendorDto> list = new LinkedList<VendorDto>();

	@Override
	public boolean save(VendorDto vendorDto) {
		System.out.println("save method");
		return list.add(vendorDto);
	}

	@Override
	public List<VendorDto> getAll() {

		return list;
	}

	@Override
	public boolean updateById(int vendorId, VendorDto vendorDto) {
		System.out.println("update method");
		if (!list.isEmpty()) {
			for (int index = 0; index < list.size(); index++) {
				if (list.get(index).getVendorId() == vendorId) {
					list.set(index, vendorDto);
				}
			}
			return true;

		} else {
			System.out.println("list is empty");
		}
		return false;
	}

	@Override
	public boolean deleteById(int vendorId, VendorDto vendorDto) {
		System.out.println("delete method");
		if (!list.isEmpty()) {
			for (int index = 0; index < list.size(); index++) {
				if (list.get(index).getVendorId() == vendorId) {
					list.remove(index);
				}
			}
			return true;

		} else {
			System.out.println("list is empty");
		}
		return false;

	}

}
