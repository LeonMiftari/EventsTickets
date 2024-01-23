package com.example.events.service.impl;

import com.example.events.entity.Ticket;
import com.example.events.mappers.TicketMapper;
import com.example.events.models.TicketDto;
import com.example.events.repository.TicketRepository;
import com.example.events.service.TicketService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final TicketMapper ticketMapper;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository, TicketMapper ticketMapper) {
        this.ticketRepository = ticketRepository;
        this.ticketMapper = ticketMapper;
    }

    @Override
    public List<TicketDto> getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();
        return tickets.stream()
                .map(ticketMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TicketDto getTicketById(long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new EntityNotFoundException("Ticket not found with id: " + ticketId));
        return ticketMapper.toDto(ticket);
    }

    @Override
    public void saveTicket(TicketDto ticketDto) {
        Ticket ticket = ticketMapper.toEntity(ticketDto);
        ticketRepository.save(ticket);
    }

    @Override
    public void updateTicket(long ticketId, TicketDto updatedTicketDto) {
        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new EntityNotFoundException("Ticket not found with id: " + ticketId));

        // Update ticket fields with values from updatedTicketDto
        ticket.setEventName(updatedTicketDto.getEventName());
        ticket.setEvents(updatedTicketDto.getEvents());
        ticket.setTicketCategory(updatedTicketDto.getTicketCategory());
        ticket.setTicketPrice(updatedTicketDto.getTicketPrice());
        ticket.setSeatsAvailable(updatedTicketDto.isSeatsAvailable());

        ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicket(long ticketId) {
        if (ticketRepository.existsById(ticketId)) {
            ticketRepository.deleteById(ticketId);
        } else {
            throw new EntityNotFoundException("Ticket not found with id: " + ticketId);
        }
    }
}
