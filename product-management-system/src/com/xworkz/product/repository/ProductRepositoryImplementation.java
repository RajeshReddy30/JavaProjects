package com.xworkz.product.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.product.dto.ProductDto;

public class ProductRepositoryImplementation implements ProductRepository {
	ArrayList<ProductDto> list = new ArrayList<ProductDto>();

	@Override
	public boolean save(ProductDto productDto) {
		System.out.println("save method");

		return list.add(productDto);
	}

	@Override
	public List<ProductDto> getAll() {

		return list;
	}

	@Override
	public boolean updateById(int productId, ProductDto productDto) {
		if (!list.isEmpty()) {
			for (int index = 0; index < list.size(); index++) {
				if (list.get(index).getProductId() == productId) {
					list.set(index, productDto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int productId, ProductDto productDto) {
		if (!list.isEmpty()) {
			for (int index = 0; index < list.size(); index++) {
				if (list.get(index).getProductId() == productId) {
					list.remove(productDto);
					return true;
				}
			}

		}
		return false;
	}

}
