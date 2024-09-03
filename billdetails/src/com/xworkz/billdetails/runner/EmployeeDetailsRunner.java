package com.xworkz.billdetails.runner;

import java.time.LocalDate;
import java.util.Scanner;

import com.xworkz.billdetails.dto.EmployeeDetailsDto;
import com.xworkz.billdetails.service.EmployeeService;

public class EmployeeDetailsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees to store: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); 

        EmployeeService employeeService = new EmployeeService(arraySize);

        for (int i = 0; i < arraySize; i++) {
            EmployeeDetailsDto employee = new EmployeeDetailsDto();

            System.out.print("Enter Employee ID: ");
            employee.setEmployeeId(scanner.nextLine());

            System.out.print("Enter Employee Name: ");
            employee.setEmployeeName(scanner.nextLine());

            System.out.print("Enter Department: ");
            employee.setDepartment(scanner.nextLine());

            System.out.print("Enter Salary: ");
            employee.setSalary(scanner.nextDouble());

            System.out.print("Enter Joining Date : ");
            employee.setJoiningDate(LocalDate.parse(scanner.next()));

            scanner.nextLine(); 

            String result = employeeService.onSave(employee);
            System.out.println(result);
        }

        scanner.close();
    }
}
