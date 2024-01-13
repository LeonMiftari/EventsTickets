package com.example.events.models;

import com.example.events.entity.EventOrganizer;
import com.example.events.entity.Venue;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class PerformersDto {
    private long performer_id;
    private String performerName;
    private List<Venue> venues;
    private EventOrganizer eventOrganizer;
    private boolean mainPerformer;
    private String description;
    private LocalDateTime createdAt;

}

