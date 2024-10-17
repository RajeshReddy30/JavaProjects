package com.xworkz.product.repository;

import java.util.List;

import com.xworkz.product.dto.ProductDto;

public interface ProductRepository {
	boolean save(ProductDto productDto);

	List<ProductDto> getAll();

	boolean updateById(int productId, ProductDto productDto);

	boolean deleteById(int productId, ProductDto productDto);

}
