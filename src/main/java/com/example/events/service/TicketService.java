package com.example.events.service;

import com.example.events.models.TicketDto;

import java.util.List;

// TicketService.java
public interface TicketService {
    List<TicketDto> getAllTickets();

    TicketDto getTicketById(long ticketId);

    void saveTicket(TicketDto ticketDto);

    void updateTicket(long ticketId, TicketDto updatedTicketDto);

    void deleteTicket(long ticketId);
}

