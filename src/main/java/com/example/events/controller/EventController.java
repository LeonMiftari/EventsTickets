package com.example.events.controller;

import com.example.events.models.EventChangeStatusDto;
import com.example.events.models.EventDto;
import com.example.events.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/events")
@CrossOrigin(origins = "*")
public class EventController {

    private final EventService eventService;

    public EventController(EventService service){this.eventService = service;}


    @GetMapping
    public List<EventDto> getAllEvents(){
        return eventService.getAll();
    }

    @GetMapping("/{event_id}")
    public EventDto getEventById(@PathVariable long event_id) {
        return eventService.getById(event_id);
    }

    @PostMapping
    public void addEvent(@RequestBody EventDto eventDto) {

        eventService.add(eventDto);
    }

    @PutMapping("/{event_id}")
    public void updateEvent(@PathVariable long event_id, @RequestBody EventDto eventDto) {
        eventService.update(event_id, eventDto);

    }

    @PatchMapping("/{event_id}")
    public void updateEventStatus(@PathVariable long event_id, @RequestBody EventChangeStatusDto eventDto) {
        eventService.changeStatus(event_id, eventDto);

    }

    @DeleteMapping("/{event_id}")
    public void deleteById(@PathVariable long event_id) {
        eventService.deleteById(event_id);
    }

}
