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
<<<<<<< HEAD
    private long ticket_id;

    private String eventName;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event events;
    private String ticketCategory;
    private double ticketPrice;
    private boolean seatsAvailable = true;

}
=======
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
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
