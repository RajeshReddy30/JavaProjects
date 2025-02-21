package com.xworkz.autospare.dto.seller;

import lombok.Data;

@Data
public class SparePartDTO {
private String partNumber;
private String name;
private String description;
private String category;
private Double price;
private Integer quantityInStock;
private String manufacturer;
private String imageUrl;
}
