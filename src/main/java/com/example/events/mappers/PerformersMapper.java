package com.example.events.mappers;

import com.example.events.entity.Performers;
import com.example.events.models.PerformersDto;
import org.springframework.stereotype.Component;

@Component
public class PerformersMapper {

    public Performers toEntity(PerformersDto from){
        var to = new Performers();
        to.setPerformer_id(from.getPerformer_id());
        to.setPerformerName(from.getPerformerName());
        to.setMainPerformer(from.isMainPerformer());
        to.setDescription(from.getDescription());
        to.setEventOrganizer(from.getEventOrganizer());
        to.setVenues(from.getVenues());
        to.setCreatedAt(from.getCreatedAt());
        return to;
    }

    public PerformersDto toDto (Performers from){
        var to = new PerformersDto();
        to.setPerformer_id(from.getPerformer_id());
        to.setPerformerName(from.getPerformerName());
        to.setMainPerformer(from.isMainPerformer());
        to.setDescription(from.getDescription());
        to.setEventOrganizer(from.getEventOrganizer());
        to.setVenues(from.getVenues());
        to.setCreatedAt(from.getCreatedAt());
        return to;
    }
}

