package com.xworkz.busticket.service;

import com.xworkz.busticket.dto.BusTicketDto;
import com.xworkz.busticket.repository.BusTicketRepository;
import com.xworkz.busticket.repository.BusTicketRepositoryImpl;

public class BusTicketServiceImpl implements BusTicketService {
    BusTicketRepository repo = new BusTicketRepositoryImpl();

    @Override
    public boolean setArraySize(int arraySize) {
        if (arraySize > 0) {
            repo.setArraySize(arraySize);
            return true;
        }
        return false;
    }

    @Override
    public String validateAndSave(BusTicketDto busTicketDto) {
        if (busTicketDto != null && !busTicketDto.getPassengerName().isBlank() 
                && !busTicketDto.getBusNumber().isBlank()) {
            if (!repo.duplicateCheck(busTicketDto)) {
                repo.onSave(busTicketDto);
                return "Ticket booked successfully";
            }
        }
        return "Ticket booking failed!";
    }

    @Override
    public void read() {
        BusTicketDto[] tickets = repo.read();
        for (BusTicketDto ticket : tickets) {
            if (ticket != null) {
                System.out.println(ticket);
            }
        }
    }

    @Override
    public String updateByTicketId(int ticketId, BusTicketDto busTicketDto) {
        if (ticketId > 0) {
            if (repo.updateByTicketId(ticketId, busTicketDto)) {
                return "Ticket updated successfully";
            }
        }
        return "Ticket update failed";
    }

    @Override
    public String deleteByTicketId(int ticketId) {
        if (ticketId > 0) {
            if (repo.deleteByTicketId(ticketId)) {
                return "Ticket deleted successfully";
            }
        }
        return "Ticket deletion failed";
    }
}

