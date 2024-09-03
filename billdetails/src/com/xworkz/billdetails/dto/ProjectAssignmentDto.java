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
public class ProjectAssignmentDto {
    private String projectId;
    private String projectName;
    private String assignedEmployeeId;
    private LocalDate assignmentDate;
    private String projectRole;
}
