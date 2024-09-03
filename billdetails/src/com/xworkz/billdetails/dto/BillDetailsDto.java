package com.xworkz.billdetails.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
public class BillDetailsDto {
    private boolean isBillGenerated;
    private LocalDateTime dateTime;
    private String name;
    private String billType;
    private int amount;
    private String gstType;
    private double gstPercentage;
    private LocalDate payDate;
}

