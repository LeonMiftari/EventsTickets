package com.example.events.models;
import com.example.events.entity.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventOrganizerDto {
    private long event_organizer_id;
    private String organizerName;
    private List<Event> events;
    private String email;
    private String phoneNumber;
    private boolean active = true;
    private LocalDateTime createdAt;
    public String createdBy;

}
