package com.example.events.mappers;
import com.example.events.entity.Event;
import com.example.events.models.EventChangeStatusDto;
import com.example.events.models.EventDto;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public Event toEntity(EventDto from){
        var to = new Event();
        to.setEvent_id(from.getEventId());
        to.setEventName(from.getEventName());
        to.setEventType(from.getEventType());
        to.setOrganizers(from.getOrganizers());
        to.setCreatedAt(from.getCreatedAt());
        to.setCreatedBy(from.getCreatedBy());
        to.setActive(from.isActive());
        return to;
    }

    public EventDto toDto(Event from){
        var to = new EventDto();
        to.setEventId(from.getEvent_id());
        to.setEventName(from.getEventName());
        to.setEventType(from.getEventType());
        to.setOrganizers(from.getOrganizers());
        to.setCreatedAt(from.getCreatedAt());
        to.setCreatedBy(from.getCreatedBy());
        to.setActive(from.isActive());
        return to;
    }

    public EventChangeStatusDto toChangeStatusDto (Event from){
        var to = new EventChangeStatusDto();
        to.setEvent_id(from.getEvent_id());
        to.setActive(from.isActive());
        return to;
    }


}