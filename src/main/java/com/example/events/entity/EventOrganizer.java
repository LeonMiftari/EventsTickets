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
    private long event_organizer_id;
    private long eventOrganizerID;
    private String organizerName;

    @ManyToMany(mappedBy = "organizers")
    private List<Event> events;
    private String email;
    private String phoneNumber;
    private boolean active = true;
    private LocalDateTime createdAt;
    public String createdBy;

}
