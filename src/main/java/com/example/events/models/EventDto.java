package com.example.events.models;
import com.example.events.entity.EventOrganizer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private long eventId;
    private String eventName;
    private String eventType;
    private boolean active = true;
    private List<EventOrganizer> organizers;
    private LocalDateTime dateAndTime;
    private LocalDateTime createdAt;
    public String createdBy;
}
