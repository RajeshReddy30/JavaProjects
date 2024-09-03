package com.xworkz.billdetails.service;

import com.xworkz.billdetails.dto.EmployeeDetailsDto;
import com.xworkz.billdetails.util.EmployeeDetailsUtil;

public class EmployeeService {
    private int index = 0;
    private EmployeeDetailsDto[] listOfEmployees;

    public EmployeeService(int arraySize) {
        System.out.println("Initializing array with size: " + arraySize);
        this.listOfEmployees = new EmployeeDetailsDto[arraySize];
    }

    public int arrayLength() {
        return listOfEmployees.length;
    }

    public String onSave(EmployeeDetailsDto dto) {
        if (dto != null && !EmployeeDetailsUtil.checkDuplicates(listOfEmployees, dto)) {
            if (this.index < listOfEmployees.length) {
                listOfEmployees[index] = dto;
                index++;
                return "Saved successfully";
            } else {
                return "Array is full, cannot save more employee details.";
            }
        }
        return "Not saved";
    }
}
