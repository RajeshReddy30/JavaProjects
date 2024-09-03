package com.xworkz.billdetails.util;

import com.xworkz.billdetails.dto.EmployeeDetailsDto;

public class EmployeeDetailsUtil {
    public static boolean checkDuplicates(EmployeeDetailsDto[] listOfEmployees, EmployeeDetailsDto dto) {
        System.out.println("Checking for duplicates...");
        for (EmployeeDetailsDto employee : listOfEmployees) {
            if (employee != null && employee.equals(dto)) {
                return true;
            }
        }
        return false;
    }
}
