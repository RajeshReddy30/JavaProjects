package com.xworkz.busticket.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class BusTicketDto {
    private int ticketId;
    private String passengerName;
    private String busNumber;
    private String fromLocation;
    private String toLocation;
    private LocalDateTime bookingDate;
    private LocalDateTime travelDate;
}

