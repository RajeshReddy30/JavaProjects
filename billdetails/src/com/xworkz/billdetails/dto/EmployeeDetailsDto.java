package com.xworkz.billdetails.dto;

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
public class EmployeeDetailsDto {
    private String employeeId;
    private String employeeName;
    private String department;
    private double salary;
    private LocalDate joiningDate;
}
