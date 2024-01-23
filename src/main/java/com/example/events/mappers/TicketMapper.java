package com.example.events.mappers;

import com.example.events.entity.Ticket;
import com.example.events.models.TicketDto;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {
    public Ticket toEntity(TicketDto from){
        var to = new Ticket();
        to.setTicket_id(from.getTicket_id());
        to.setTicketPrice(from.getTicketPrice());
        to.setTicketCategory(from.getTicketCategory());
        to.setEvents(from.getEvents());
        to.setEventName(from.getEventName());
        to.setSeatsAvailable(from.isSeatsAvailable());
        return to;
    }

    public TicketDto toDto (Ticket from){
        var to = new TicketDto();
        to.setTicket_id(from.getTicket_id());
        to.setTicketPrice(from.getTicketPrice());
        to.setTicketCategory(from.getTicketCategory());
        to.setEvents(from.getEvents());
        to.setEventName(from.getEventName());
        to.setSeatsAvailable(from.isSeatsAvailable());
        return to;
    }

}
