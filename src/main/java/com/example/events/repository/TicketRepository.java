package com.example.events.repository;

import com.example.events.entity.Ticket
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TicketRepository extends  JpaRepository<Ticket, Long>  {
}

