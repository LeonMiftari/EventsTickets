package com.example.events.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String eventName;

    @Column(nullable = false)
    private String eventType;

    @Column(nullable = false)
    private int seats;

    private String performer;

    @Column(nullable = false)
    private LocalDateTime dateAndTime;

    // Add validation if needed
    public Event(long id, String eventName, String eventType, int seats, String performer, LocalDateTime dateAndTime) {
        this.id = id;
        this.eventName = eventName;
        this.eventType = eventType;
        this.seats = seats;
        this.performer = performer;
        this.dateAndTime = dateAndTime;
    }
}
