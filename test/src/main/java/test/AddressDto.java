package test;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class AddressDto {
	private int id;
	private int doorNo;
	private String area;
	private String city;
	private String state;
	private int pincode;

}
