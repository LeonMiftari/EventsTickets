package com.example.events.mappers;

import com.example.events.entity.Venue;
import com.example.events.models.VenueChangeStatusDto;
import com.example.events.models.VenueDto;
import org.springframework.stereotype.Component;

@Component
public class VenueMapper {
    public Venue toEntity(VenueDto from){
        var to = new Venue();
        to.setVenue_id(from.getVenue_id());
        to.setPerformers(from.getPerformers());
        to.setCapacity(from.getCapacity());
        to.setDescription(from.getDescription());
        to.setVenueName(from.getVenueName());
        to.setVenueLocation(from.getVenueLocation());
        to.setCreatedAt(from.getCreatedAt());
        to.setActive(from.isActive());
        return to;
    }
    public VenueDto toDto(Venue from){
        var to = new VenueDto();
        to.setVenue_id(from.getVenue_id());
        to.setPerformers(from.getPerformers());
        to.setCapacity(from.getCapacity());
        to.setDescription(from.getDescription());
        to.setVenueName(from.getVenueName());
        to.setVenueLocation(from.getVenueLocation());
        to.setCreatedAt(from.getCreatedAt());
        to.setActive(from.isActive());
        return to;
    }

    public VenueChangeStatusDto venueChangeStatusDto(Venue from){
        var to = new VenueChangeStatusDto();
        to.setVenue_id(from.getVenue_id());
        to.setActive(from.isActive());
        return to;
    }
}
