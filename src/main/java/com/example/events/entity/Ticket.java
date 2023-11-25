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
    private long id;

    private String eventName;
    private String eventLocation;
    private LocalDateTime eventDateTime;
    private String ticketCategory;
    private double ticketPrice;
    private boolean available = true;
    private LocalDateTime createdAt;
    private String createdBy;
}
