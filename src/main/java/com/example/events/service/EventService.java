package com.example.events.service;

import com.example.events.models.EventChangeStatusDto;
import com.example.events.models.EventDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {

    boolean add(EventDto eventDto);

    List<EventDto> getAll();

    EventDto getById(long event_id);

    boolean update(long event_id, EventDto updatedEventDto);

    boolean deleteById(long event_id);

    boolean changeStatus(long event_id, EventChangeStatusDto dto);
}
