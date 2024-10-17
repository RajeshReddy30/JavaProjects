package com.xworkz.complaints.dto;


import java.util.Scanner;

public class ComplaintRunner {

    public static void main(String[] args) {
        ComplaintService service = new ComplaintServiceImplimentation(new ComplaintRepoImplimentation());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Create Complaint");
            System.out.println("2. Read All Complaints");
            System.out.println("3. Update Complaint");
            System.out.println("4. Delete Complaint");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create operation
                    ComplaintDto dto = new ComplaintDto();
                    System.out.println("Enter Complaint ID:");
                    dto.setId(scanner.nextInt());
                    System.out.println("Enter User ID:");
                    dto.setUserid(scanner.nextInt());
                    System.out.println("Enter Complaint Category:");
                    dto.setCategory(scanner.next());
                    System.out.println("Enter Priority Level:");
                    dto.setPrioritylevel(scanner.next());
                    System.out.println("Assigned To:");
                    dto.setAssignedto(scanner.next());
                    System.out.println("Resolution Date:");
                    dto.setResolutionDate(scanner.next());

                    String result = service.validate(dto);
                    System.out.println(result);
                    break;

                case 2:
                    // Read operation
                    System.out.println("List of All Complaints:");
                    System.out.println(service.getAll());
                    break;

                case 3:
                    // Update operation
                    System.out.println("Enter the Complaint ID to update:");
                    int idToUpdate = scanner.nextInt();
                    ComplaintDto newDto = new ComplaintDto();

                    System.out.println("Enter New User ID:");
                    newDto.setUserid(scanner.nextInt());
                    System.out.println("Enter New Complaint Category:");
                    newDto.setCategory(scanner.next());
                    System.out.println("Enter New Priority Level:");
                    newDto.setPrioritylevel(scanner.next());
                    System.out.println("Assigned To:");
                    newDto.setAssignedto(scanner.next());
                    System.out.println("New Resolution Date:");
                    newDto.setResolutionDate(scanner.next());

                    String update = service.updateById(idToUpdate, newDto);
                    System.out.println(update);
                    break;

                case 4:
                    // Delete operation
                    System.out.println("Enter the Complaint ID to delete:");
                    int idToDelete = scanner.nextInt();

                    String delete = service.deleteById(idToDelete, new ComplaintDto()); // You may need to adjust this based on your delete method's requirements
                    System.out.println(delete);
                    break;



                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("\n");
        }
    }
}