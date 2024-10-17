package com.xworkz.product.runner;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepositoryImplementation;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImplementation;

public class ProductRunner {
	public static void main(String[] args) {
		ProductDto productDto = new ProductDto();
		productDto.setProductId(879);
		productDto.setProductName("watch");
		productDto.setProductType("electronics");
		ProductService service = new ProductServiceImplementation(new ProductRepositoryImplementation());
		System.out.println(service.validate(productDto));
		System.out.println(service.getAll());
		ProductDto newproductDto = new ProductDto();
		newproductDto.setProductId(879);
		newproductDto.setProductName("smartwatch");
		newproductDto.setProductType("electronics");
		System.out.println(service.updateById(879, newproductDto));
		System.out.println(service.getAll());
		System.out.println(service.deleteById(879, newproductDto));
		System.out.println(service.getAll());
	}

}
