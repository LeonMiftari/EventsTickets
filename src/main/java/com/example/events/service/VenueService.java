package com.example.events.service;

import com.example.events.models.VenueDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VenueService {
    List<VenueDto> getAllVenues();

    VenueDto getVenueById(long venueId);

    void saveVenue(VenueDto venueDto);

    void updateVenue(long venueId, VenueDto updatedVenueDto);

    void deleteVenue(long venueId);
}
