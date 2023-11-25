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
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String eventName;
    private String eventType;
    private int seats;
    @ManyToOne
    @JoinColumn(name = "performer_id")
    private Performer performer;
    private LocalDateTime dateAndTime;
    private int availableSeats;
    private LocalDateTime createdAt;
    private String createdBy;
}

