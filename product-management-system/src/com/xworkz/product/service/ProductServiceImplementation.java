package com.xworkz.product.service;

import java.util.List;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductServiceImplementation implements ProductService {
	private ProductRepository repo;

	@Override
	public String validate(ProductDto productDto) {
		System.out.println("validate method");
		if (productDto != null) {
			if (repo.save(productDto)) {
				return "saved successfully";
			}
		}
		return "not saved ";
	}

	@Override
	public List<ProductDto> getAll() {

		return repo.getAll();
	}

	@Override
	public String updateById(int productId, ProductDto productDto) {
		System.out.println("update method");
		if (productId > 0) {
			if (repo.updateById(productId, productDto)) {
				return "updated successfully";
			}
		}
		return "not updated";
	}

	@Override
	public String deleteById(int productId, ProductDto productDto) {
		System.out.println("delete method");
		if (productId > 0 && repo.deleteById(productId, productDto)) {
			return "deleted successfully";
		}

		return "not deleted";
	}

}
