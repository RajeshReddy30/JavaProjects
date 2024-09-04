package com.xworkz.sandwhichmaker.dto;



import java.time.LocalDate;

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
public class SandwichMakerDto {
    private String sandwichType;
    private String breadType;
    private String fillingType;
    private boolean isToasted;
    private boolean hasCheese;
    private boolean hasSauce;
    private int sandwichSize; 
    private int calories;
    private String sandwichMakerName;
    private String sandwichShopName;
    private double price;
    private LocalDate manufactureDate;
    private boolean isVegetarian;
    private String packagingType;
    private int shelfLife; 
}

