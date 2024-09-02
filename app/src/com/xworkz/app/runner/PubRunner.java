package com.xworkz.app.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.app.Dto.PubDto;
import com.xworkz.app.constant.PubNameConstant;
import com.xworkz.app.services.Pub;

public class PubRunner {
    public static void main(String args[]) {
        PubDto pubdto = new PubDto(PubNameConstant.TheRedLion.toString(), "Btm", "Rajesh", 4.1, 432,
                LocalDate.of(2018, 2, 3), LocalDateTime.of(2020, 3, 2, 4, 34, 7));
        PubDto pubs = new PubDto(PubNameConstant.TheRedLion.toString(), "Btm", "Rajesh", 4.1, 432,
                LocalDate.of(2018, 2, 3), LocalDateTime.of(2020, 3, 2, 4, 34, 7));

        Pub pub = new Pub();
        System.out.println(pub.onSave(pubdto));  
        System.out.println(pub.onSave(pubs));
        
    }
}

