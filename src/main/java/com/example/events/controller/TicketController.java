package com.example.events.controller;

import com.example.events.models.TicketDto;
import com.example.events.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tickets")
@CrossOrigin(origins = "*")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<TicketDto> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/{ticketId}")
    public TicketDto getTicketById(@PathVariable long ticketId) {
        return ticketService.getTicketById(ticketId);
    }

    @PostMapping
    public void addTicket(@RequestBody TicketDto ticketDto) {
        ticketService.saveTicket(ticketDto);
    }

    @PutMapping("/{ticketId}")
    public void updateTicket(@PathVariable long ticketId, @RequestBody TicketDto updatedTicketDto) {
        ticketService.updateTicket(ticketId, updatedTicketDto);
    }

    @DeleteMapping("/{ticketId}")
    public void deleteTicketById(@PathVariable long ticketId) {
        ticketService.deleteTicket(ticketId);
    }
}
