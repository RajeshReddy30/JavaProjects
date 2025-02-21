package com.xworkz.autospare.entity.seller;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class SparePartEntity {

	private String partNumber;
	private String name;
	private String description;
	private String category;
	private Double price;
	private Integer quantityInStock;
	private String manufacturer;
	private String imageUrl;

}
