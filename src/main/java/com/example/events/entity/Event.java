package com.example.events.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "events")
<<<<<<< HEAD
public class Event  implements  Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_id;
    private String eventName;
    private String eventType;
    @ManyToMany
    @JoinTable(
            name = "event_organizer_mapping",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "event_organizer_id")
    )
    private List<EventOrganizer> organizers;
    private boolean active = true;
    private LocalDateTime createdAt;
    private String createdBy;
=======
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
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
}
