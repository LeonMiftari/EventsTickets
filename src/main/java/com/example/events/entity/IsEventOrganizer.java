package com.example.events.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "ievent_organizer_mappng")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(EventOrganizer.class)
public class IsEventOrganizer  implements  Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "event_organizer_id")
    private EventOrganizer organizer;
}
