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
    private long eventId;
    private String eventName;
    private String eventType;
    @ManyToOne
    @JoinColumn(name = "performerId")
    private Performer Performer;
    private LocalDateTime dateAndTime;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn (name = "clientId")
    private Client createdBy;
}

