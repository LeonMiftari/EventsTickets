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
@Table(name = "venues")
<<<<<<< HEAD
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
=======
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
    private String venueName;
    private String venueLocation;
    private int capacity;
    private String description;
<<<<<<< HEAD
    private boolean active = true;
    private LocalDateTime createdAt;

}
=======
    private LocalDateTime createdAt;
    private String createdBy;
}
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
