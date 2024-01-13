package com.example.events.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueChangeStatusDto {
    private long venue_id;
    private boolean active = true;
}
