package com.xworkz.billdetails.util;

import com.xworkz.billdetails.dto.ProjectAssignmentDto;

public class ProjectAssignmentUtil {
    public static boolean checkDuplicates(ProjectAssignmentDto[] listOfAssignments, ProjectAssignmentDto dto) {
        System.out.println("Checking for duplicates...");
        for (ProjectAssignmentDto assignment : listOfAssignments) {
            if (assignment != null && assignment.equals(dto)) {
                return true;
            }
        }
        return false;
    }
}
