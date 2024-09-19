package com.xworkz.busticket.runner;

import java.time.LocalDateTime;

import com.xworkz.busticket.dto.BusTicketDto;
import com.xworkz.busticket.service.BusTicketService;
import com.xworkz.busticket.service.BusTicketServiceImpl;

public class BusTicketRunner {
    public static void main(String[] args) {
        BusTicketService busTicketService = new BusTicketServiceImpl();
        busTicketService.setArraySize(5);

        BusTicketDto ticket1 = new BusTicketDto(101, "Vishal", "KA-01-AB-1234", "Bangalore", "Mysore", 
                                                LocalDateTime.now(), LocalDateTime.of(2024, 10, 1, 10, 30));
        BusTicketDto ticket2 = new BusTicketDto(102, "Rohan", "KA-02-CD-5678", "Bangalore", "Chennai", 
                                                LocalDateTime.now(), LocalDateTime.of(2024, 10, 5, 9, 0));
        BusTicketDto ticket= new BusTicketDto(102, "Rohan", "KA-02-CD-5678", "Bangalore", "Chennai", 
                LocalDateTime.now(), LocalDateTime.of(2024, 10, 5, 9, 0));

        System.out.println(busTicketService.validateAndSave(ticket1));
        System.out.println(busTicketService.validateAndSave(ticket2));
        System.out.println(busTicketService.validateAndSave(ticket));

        busTicketService.read();

        ticket1.setFromLocation("Hubli");
        System.out.println(busTicketService.updateByTicketId(101, ticket1));
        busTicketService.read();

        System.out.println(busTicketService.deleteByTicketId(102));
        busTicketService.read();
    }
}

