package com.xworkz.busticket.repository;



import com.xworkz.busticket.dto.BusTicketDto;

public interface BusTicketRepository {
    boolean setArraySize(int arraySize);
    boolean onSave(BusTicketDto busTicketDto);
    BusTicketDto[] read();
    boolean duplicateCheck(BusTicketDto busTicketDto);
    boolean updateByTicketId(int ticketId, BusTicketDto busTicketDto);
    boolean deleteByTicketId(int ticketId);
}

