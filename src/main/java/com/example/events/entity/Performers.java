package com.example.events.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
=======
import java.time.LocalDateTime;
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "performers")
<<<<<<< HEAD
public class Performers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long performer_id;
    private String performerName;
    @ManyToMany(mappedBy = "performers")
    private List<Venue> venues;
    @ManyToOne
    @JoinColumn(name = "event_organizer_id")
    private EventOrganizer eventOrganizer;
    private boolean mainPerformer;
    private String description;
    private LocalDateTime createdAt;



}
=======
public class Performers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String performerName;
    private String description;
    private LocalDateTime createdAt;
    private String createdBy;
}
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
