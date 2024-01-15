package com.example.events.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class EventOrganizer implements  Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private long event_organizer_id;
=======
    private long eventOrganizerID;
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
    private String organizerName;

    @ManyToMany(mappedBy = "organizers")
    private List<Event> events;
<<<<<<< HEAD
    private String email;
    private String phoneNumber;
    private boolean active = true;
    private LocalDateTime createdAt;
    public String createdBy;

}
=======
    private String clientName;
    private String email;
    private String phoneNumber;
    private LocalDateTime createdAt;

}
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
