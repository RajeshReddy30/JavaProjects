package com.xworkz.app.services;

import com.xworkz.app.Dto.PubDto;
import com.xworkz.app.Util.PubUtil;

public class Pub {
    public PubDto pubdto[] = new PubDto[4];
    public int index;

    public String onSave(PubDto dto) {
        System.out.println("Save method is running...");
        System.out.println("dto: " + dto);
        if (dto == null) {
            System.out.println("PubDto is null");
            return "Not saved";
        } else {
            boolean duplicate = PubUtil.checkDuplicates(pubdto, dto);
            System.out.println("Duplicate result: " + duplicate);
            if (!duplicate) {
                if (this.index < pubdto.length) {
                    pubdto[index] = dto;
                    index++;
                    return "Saved Successfully";
                }
            }
        }
        return "Not saved";
    }
   
    }


