package com.example.events.models;

import com.example.events.entity.Performers;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueDto {
    private long venue_id;
    private List<Performers> performers;
    private String venueName;
    private String venueLocation;
    private int capacity;
    private String description;
    private boolean active = true;
    private LocalDateTime createdAt;

}
