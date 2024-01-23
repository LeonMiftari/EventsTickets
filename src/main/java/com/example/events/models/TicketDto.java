package com.example.events.models;

import com.example.events.entity.Event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    private long ticket_id;
    private String eventName;
    private Event events;
    private String ticketCategory;
    private double ticketPrice;
    private boolean seatsAvailable = true;

}
