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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode


public class ProjectManagementDto {

    private String projectName;
    private String clientName;
    private int projectDurationInMonths;
    private double projectBudget;
    private int teamSize;
    private String projectManager;
    private LocalDate projectStartDate;
    private LocalDate projectEndDate;
    private boolean isProjectCompleted;
    private String projectStatus;
}
