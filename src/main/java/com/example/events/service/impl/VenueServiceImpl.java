package com.example.events.service.impl;

import com.example.events.entity.Venue;
import com.example.events.mappers.VenueMapper;
import com.example.events.models.VenueDto;
import com.example.events.repository.VenueRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VenueServiceImpl {

    private final VenueRepository venueRepository;

    private final VenueMapper venueMapper;

    @Autowired
    public VenueServiceImpl(VenueRepository venueRepository, VenueMapper venueMapper) {
        this.venueRepository = venueRepository;
        this.venueMapper = venueMapper;
    }

    public List<VenueDto> getAllVenues() {
        List<Venue> venues = venueRepository.findAll();
        return venues.stream()
                .map(venueMapper::toDto)
                .collect(Collectors.toList());
    }

    public VenueDto getVenueById(long venueId) {
        Venue venue = venueRepository.findById(venueId)
                .orElseThrow(() -> new EntityNotFoundException("Venue not found with id: " + venueId));
        return venueMapper.toDto(venue);
    }

    public void saveVenue(VenueDto venueDto) {
        Venue venue = venueMapper.toEntity(venueDto);
        venueRepository.save(venue);
    }

    public void updateVenue(long venueId, VenueDto updatedVenueDto) {
        Venue venue = venueRepository.findById(venueId)
                .orElseThrow(() -> new EntityNotFoundException("Venue not found with id: " + venueId));

        // Update venue fields with values from updatedVenueDto
        venue.setVenueName(updatedVenueDto.getVenueName());
        venue.setCapacity(updatedVenueDto.getCapacity());
        venue.setDescription(updatedVenueDto.getDescription());

        venueRepository.save(venue);
    }

    public void deleteVenue(long venueId) {
        if (venueRepository.existsById(venueId)) {
            venueRepository.deleteById(venueId);
        } else {
            throw new EntityNotFoundException("Venue not found with id: " + venueId);
        }
    }
}
