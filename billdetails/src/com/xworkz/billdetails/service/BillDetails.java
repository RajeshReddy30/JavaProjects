package com.xworkz.billdetails.service;

import com.xworkz.billdetails.dto.BillDetailsDto;
import com.xworkz.billdetails.util.BillDetailsUtil;

public class BillDetails {
    private int index = 0;
    private BillDetailsDto[] listofBillDetails;

    public BillDetails(int arraySize) {
        System.out.println("Initializing array with size: " + arraySize);
        this.listofBillDetails = new BillDetailsDto[arraySize];
    }

    public int arraylength() {
        return listofBillDetails.length;
    }

    public String onSave(BillDetailsDto dto) {
        if (dto != null && !BillDetailsUtil.checkDuplicates(listofBillDetails, dto)) {
            if (this.index < listofBillDetails.length) {
                listofBillDetails[index] = dto;
                index++;
                return "Saved successfully";
            } else {
                return "Array is full, cannot save more bill details.";
            }
        }
        return "Not saved";
    }
}

