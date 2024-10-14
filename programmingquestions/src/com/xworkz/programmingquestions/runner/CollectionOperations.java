package com.xworkz.programmingquestions.runner;

import java.util.Collection;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperations {
    public static void main(String[] args) {
    	ArrayList<String> collegeNames = new ArrayList<>();
        

        collegeNames.add("Indian Institute of Science");
        collegeNames.add("Bangalore Institute of Technology");
        collegeNames.add("RV College of Engineering");
        collegeNames.add("PES University");
        collegeNames.add("Cambridge Institute of Technology");
        System.out.println("College Names: " + collegeNames);
        Collection<String> companyNames = new ArrayList<>();
        companyNames.add("Infosys");
        companyNames.add("Wipro");
        companyNames.add("Flipkart");
        System.out.println("Company Names: " + companyNames);

        companyNames.addAll(collegeNames);
        System.out.println("Company Names after addAll: " + companyNames);

        companyNames.remove("PES University");
        System.out.println("Company Names after remove: " + companyNames);


        companyNames.removeAll(collegeNames);
        System.out.println("Company Names after removeAll: " + companyNames);

        companyNames.clear();
        System.out.println("Company Names after clear: " + companyNames);

        System.out.println("Size of collegeNames: " + collegeNames.size());
        System.out.println("Does collegeNames contain RV College of Engineering " + collegeNames.contains("RV College of Engineering"));

        Collection<String> anotherCollegeList = new ArrayList<>();
        anotherCollegeList.add("Indian Institute of Science (IISc)");
        anotherCollegeList.add("Bangalore Institute of Technology (BIT)");
        anotherCollegeList.add("RV College of Engineering");
        anotherCollegeList.add("Cambridge Institute of Technology");

        System.out.println("Does anotherCollegeList contain all collegeNames" + anotherCollegeList.containsAll(collegeNames));

    }
}
