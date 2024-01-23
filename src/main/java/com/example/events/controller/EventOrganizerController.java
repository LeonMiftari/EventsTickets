package com.example.events.controller;

import com.example.events.models.EventOrganizerChangeStatusDto;
import com.example.events.models.EventOrganizerDto;
import com.example.events.service.EventOrganizerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/event-organizers")
@CrossOrigin(origins = "*")
public class EventOrganizerController {

    private final EventOrganizerService eventOrganizerService;

    public EventOrganizerController(EventOrganizerService service) {
        this.eventOrganizerService = service;
    }

//    @GetMapping
//    public List<EventOrganizerDto> getAllEventOrganizers() {
//        return eventOrganizerService.getAll();
//    }

    @GetMapping("/{event_organizer_id}")
    public EventOrganizerDto getEventOrganizerById(@PathVariable long event_organizer_id) {
        return eventOrganizerService.getById(event_organizer_id);
    }

    @PostMapping
    public void addEventOrganizer(@RequestBody EventOrganizerDto eventOrganizerDto) {
        eventOrganizerService.add(eventOrganizerDto);
    }

    @PutMapping("/{event_organizer_id}")
    public void updateEventOrganizer(@PathVariable long event_organizer_id, @RequestBody EventOrganizerDto updatedEventOrganizerDto) {
        eventOrganizerService.update(event_organizer_id, updatedEventOrganizerDto);
    }

    @PatchMapping("/{event_organizer_id}")
    public void updateEventOrganizerStatus(@PathVariable long event_organizer_id, @RequestBody EventOrganizerChangeStatusDto eventOrganizerDto) {
        eventOrganizerService.changeStatus(event_organizer_id, eventOrganizerDto);
    }

    @DeleteMapping("/{event_organizer_id}")
    public void deleteEventOrganizerById(@PathVariable long event_organizer_id) {
        eventOrganizerService.deleteById(event_organizer_id);
    }
}
