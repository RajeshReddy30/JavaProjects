package com.xworkz.billdetails.util;

import com.xworkz.billdetails.dto.BillDetailsDto;

public class BillDetailsUtil {
    public static boolean checkDuplicates(BillDetailsDto[] listofBillDetails, BillDetailsDto dto) {
        System.out.println("Checking for duplicates...");
        for (BillDetailsDto bill : listofBillDetails) {
            if (bill != null && bill.equals(dto)) {
                return true;
            }
        }
        return false;
    }
}

