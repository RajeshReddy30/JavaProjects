package com.xworkz.billdetails.service;

import com.xworkz.billdetails.dto.ProjectAssignmentDto;
import com.xworkz.billdetails.util.ProjectAssignmentUtil;

public class ProjectAssignmentService {
    private int index = 0;
    private ProjectAssignmentDto[] listOfAssignments;

    public ProjectAssignmentService(int arraySize) {
        System.out.println("Initializing array with size: " + arraySize);
        this.listOfAssignments = new ProjectAssignmentDto[arraySize];
    }

    public int arrayLength() {
        return listOfAssignments.length;
    }

    public String onSave(ProjectAssignmentDto dto) {
        if (dto != null && !ProjectAssignmentUtil.checkDuplicates(listOfAssignments, dto)) {
            if (this.index < listOfAssignments.length) {
                listOfAssignments[index] = dto;
                index++;
                return "Saved successfully";
            } else {
                return "Array is full, cannot save more project assignments.";
            }
        }
        return "Not saved";
    }
}