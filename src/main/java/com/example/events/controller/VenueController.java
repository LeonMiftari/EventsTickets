package com.example.events.controller;

import com.example.events.models.VenueDto;
import com.example.events.service.VenueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/venues")
@CrossOrigin(origins = "*")
public class VenueController {

    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @GetMapping
    public List<VenueDto> getAllVenues() {
        return venueService.getAllVenues();
    }

    @GetMapping("/{venueId}")
    public VenueDto getVenueById(@PathVariable long venueId) {
        return venueService.getVenueById(venueId);
    }

    @PostMapping
    public void addVenue(@RequestBody VenueDto venueDto) {
        venueService.saveVenue(venueDto);
    }

    @PutMapping("/{venueId}")
    public void updateVenue(@PathVariable long venueId, @RequestBody VenueDto updatedVenueDto) {
        venueService.updateVenue(venueId, updatedVenueDto);
    }

    @DeleteMapping("/{venueId}")
    public void deleteVenueById(@PathVariable long venueId) {
        venueService.deleteVenue(venueId);
    }
}
