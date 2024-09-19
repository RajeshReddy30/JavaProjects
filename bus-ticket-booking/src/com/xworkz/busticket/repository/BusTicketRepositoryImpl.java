package com.xworkz.busticket.repository;

import com.xworkz.busticket.dto.BusTicketDto;
import java.util.Arrays;

public class BusTicketRepositoryImpl implements BusTicketRepository {
    private int index = 0;
    private BusTicketDto[] ticketArray;

    @Override
    public boolean setArraySize(int arraySize) {
        ticketArray = new BusTicketDto[arraySize];
        if (arraySize == ticketArray.length) {
            System.out.println("Array initialized successfully.");
            return true;
        }
        return false;
    }

    @Override
    public boolean onSave(BusTicketDto busTicketDto) {
        if (ticketArray != null && index < ticketArray.length) {
            ticketArray[index] = busTicketDto;
            index++;
            return true;
        }
        return false;
    }

    @Override
    public BusTicketDto[] read() {
        return ticketArray;
    }

    @Override
    public boolean duplicateCheck(BusTicketDto busTicketDto) {
        if (busTicketDto != null) {
            for (BusTicketDto ticket : ticketArray) {
                if (ticket != null && ticket.equals(busTicketDto)) {
                    System.out.println("Duplicate booking found: " + ticket);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean updateByTicketId(int ticketId, BusTicketDto busTicketDto) {
        if (ticketId != 0) {
            for (int i = 0; i < ticketArray.length; i++) {
                if (ticketArray[i] != null && ticketArray[i].getTicketId() == ticketId) {
                    ticketArray[i].setPassengerName(busTicketDto.getPassengerName());
                    ticketArray[i].setFromLocation(busTicketDto.getFromLocation());
                    ticketArray[i].setToLocation(busTicketDto.getToLocation());
                    ticketArray[i].setTravelDate(busTicketDto.getTravelDate());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean deleteByTicketId(int ticketId) {
        for (int i = 0; i < ticketArray.length; i++) {
            if (ticketArray[i] != null && ticketArray[i].getTicketId() == ticketId) {
                ticketArray[i] = null;
                return true;
            }
        }
        return false;
    }
}

