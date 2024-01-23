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
@Table(name = "events")
public class Event  implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_id;
    private String eventName;
    private String eventType;
    @ManyToMany
    @JoinTable(
            name = "event_organizer_mapping",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "event_organizer_id")
    )
    private List<EventOrganizer> organizers;
    private boolean active = true;
    private LocalDateTime createdAt;
    private String createdBy;
}
