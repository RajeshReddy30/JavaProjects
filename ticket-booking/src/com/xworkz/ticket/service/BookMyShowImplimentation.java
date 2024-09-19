package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.BookMyShowDto;
import com.xworkz.ticket.repository.BookMyShowRepository;
import com.xworkz.ticket.repository.BookMyShowRepositoryImplimentation;

public class BookMyShowImplimentation implements BookMyShow {
    BookMyShowRepository repo = new BookMyShowRepositoryImplimentation();

    @Override
    public boolean setArraySize(int arraySize) {
        if (arraySize > 0) {
            System.out.println("Entered array size is proper");
            repo.setArraySize(arraySize);
            return true;
        } else {
            System.out.println("Entered array size is not proper, array size should be greater than 0");
        }
        return false;
    }

    @Override
    public String validateAndSave(BookMyShowDto bookMyShowDto) {
        System.out.println("Validate and save method is running");
        if (bookMyShowDto != null) {
            System.out.println("BookMyShowDto is not null");
            if (!bookMyShowDto.getUserName().isBlank() && !bookMyShowDto.getUserName().isEmpty() && bookMyShowDto.getUserName().length() > 3
                && !bookMyShowDto.getPassword().isEmpty() && !bookMyShowDto.getPassword().isBlank() && bookMyShowDto.getPassword().length() > 5
                && bookMyShowDto.getPassword().length() < 16) {
                if (!repo.duplicateCheck(bookMyShowDto)) {
                    repo.onSave(bookMyShowDto);
                    return "Saved successfully";
                }
            } else {
                System.out.println("Validation failed. Enter proper username (length > 3) and password (length > 5 and < 16)");
            }
        }
        return "Not saved";
    }

    @Override
    public void read() {
        BookMyShowDto[] shows = repo.read();
        for (BookMyShowDto dto : shows) {
            if (dto != null) {
                System.out.println("User Details: " + dto);
            }
        }
    }
}

