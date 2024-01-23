package com.example.events.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ticket_id;

    private String eventName;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event events;
    private String ticketCategory;
    private double ticketPrice;
    private boolean seatsAvailable = true;

}

