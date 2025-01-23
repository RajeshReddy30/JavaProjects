package test;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class ProductDto {
	private int id;
	private String productName;
	private BrandDto brand;
	private ProductTypeEnum productType;
	private int quantity;

}
