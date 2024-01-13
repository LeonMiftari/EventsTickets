package com.example.events.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventOrganizerChangeStatusDto {
    private long event_organizer_id;
    private boolean active;
}
