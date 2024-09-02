package com.xworkz.app.Util;

import com.xworkz.app.Dto.PubDto;

public class PubUtil {
    public static boolean checkDuplicates(PubDto[] pubDtoArray, PubDto dto) {
        System.out.println("Checking for duplicates...");
        for (PubDto pubdto : pubDtoArray) {
            // Compare the individual objects, not the array reference
            if (pubdto != null && pubdto.equals(dto)) {
                return true;
            }
        }
        return false;
    }
}

