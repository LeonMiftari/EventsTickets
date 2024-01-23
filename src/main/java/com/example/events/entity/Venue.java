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
@Table(name = "venues")

public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long venue_id;
    @ManyToMany
    @JoinTable(
            name = "is_performing",
            joinColumns = @JoinColumn(name = "venue_id"),
            inverseJoinColumns = @JoinColumn(name = "performer_id")
    )
    private List<Performers> performers;
    private String venueName;
    private String venueLocation;
    private int capacity;
    private String description;
    private boolean active = true;
    private LocalDateTime createdAt;
    }