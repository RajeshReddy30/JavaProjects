package com.xworkz.busticket.service;

import com.xworkz.busticket.dto.BusTicketDto;

public interface BusTicketService {
    boolean setArraySize(int arraySize);
    String validateAndSave(BusTicketDto busTicketDto);
    void read();
    String updateByTicketId(int ticketId, BusTicketDto busTicketDto);
    String deleteByTicketId(int ticketId);
}
 
