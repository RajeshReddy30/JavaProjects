package com.xworkz.oops.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CoffeeMakerDto {
    private String brandName;
    private String model;
    private int productCode;
    private double price;
    private int capacity; 
    private boolean isAutomatic;
}

