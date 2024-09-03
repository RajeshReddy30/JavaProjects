package com.xworkz.billdetails.runner;

import java.time.LocalDate;
import java.util.Scanner;

import com.xworkz.billdetails.dto.ProjectAssignmentDto;
import com.xworkz.billdetails.service.ProjectAssignmentService;

public class ProjectAssignmentRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of project assignments to store: ");
		int arraySize = scanner.nextInt();

		ProjectAssignmentService projectService = new ProjectAssignmentService(arraySize);

		for (int i = 0; i < arraySize; i++) {
			ProjectAssignmentDto assignment = new ProjectAssignmentDto();

			System.out.print("Enter Project ID: ");
			assignment.setProjectId(scanner.next());

			System.out.print("Enter Project Name: ");
			assignment.setProjectName(scanner.next());

			System.out.print("Enter Assigned Employee ID: ");
			assignment.setAssignedEmployeeId(scanner.next());

			System.out.print("Enter Assignment Date (yyyy-mm-dd): ");
			assignment.setAssignmentDate(LocalDate.parse(scanner.next()));

			System.out.print("Enter Project Role: ");

			assignment.setProjectRole(scanner.next());

			String result = projectService.onSave(assignment);
			System.out.println(result);
		}

		scanner.close();
	}
}
