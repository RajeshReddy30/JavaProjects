package com.xworkz.task2.runner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BusTicketDto {
	private String from;
    private String destination;
    private double price;

    public BusTicketDto(String from,String destination, double price) {
        this.destination = destination;
        this.price = price;
        this.from=from;
    }

}

