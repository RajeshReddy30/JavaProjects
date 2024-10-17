package com.xworkz.product.service;

import java.util.List;

import com.xworkz.product.dto.ProductDto;

public interface ProductService {
	String validate(ProductDto productDto);

	List<ProductDto> getAll();

	String updateById(int productId, ProductDto productDto);

	String deleteById(int productId, ProductDto productDto);

}
