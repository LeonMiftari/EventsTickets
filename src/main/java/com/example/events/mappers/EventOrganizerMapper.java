package com.example.events.mappers;

import com.example.events.entity.EventOrganizer;
import com.example.events.models.EventOrganizerChangeStatusDto;
import com.example.events.models.EventOrganizerDto;
import org.springframework.stereotype.Component;

@Component
public class EventOrganizerMapper {
    public EventOrganizer toEntity(EventOrganizerDto from){
        var to = new EventOrganizer();
        to.setEvent_organizer_id(from.getEvent_organizer_id());
        to.setOrganizerName(from.getOrganizerName());
        to.setEmail(from.getEmail());
        to.setPhoneNumber(from.getPhoneNumber());
        to.setEvents(from.getEvents());
        to.setCreatedAt(from.getCreatedAt());
        to.setCreatedBy(from.getCreatedBy());
        to.setActive(from.isActive());
        return to;
    }

    public EventOrganizerDto toDto(EventOrganizer from){
        var to = new EventOrganizerDto();
        to.setEvent_organizer_id(from.getEvent_organizer_id());
        to.setOrganizerName(from.getOrganizerName());
        to.setEmail(from.getEmail());
        to.setPhoneNumber(from.getPhoneNumber());
        to.setEvents(from.getEvents());
        to.setCreatedAt(from.getCreatedAt());
        to.setCreatedBy(from.getCreatedBy());
        to.setActive(from.isActive());
        return to;
    }

    public EventOrganizerChangeStatusDto toChangeStatusDto (EventOrganizer from){
        var to = new EventOrganizerChangeStatusDto();
        to.setEvent_organizer_id(from.getEvent_organizer_id());
        to.setActive(from.isActive());
        return to;
    }



}
