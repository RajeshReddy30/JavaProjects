package test;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class BrandDto {
	private int id;
	private int price;
	private String brandName;
	private AddressDto address;
	
	

}
