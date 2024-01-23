package com.example.events.service;

import com.example.events.models.EventOrganizerChangeStatusDto;
import com.example.events.models.EventOrganizerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventOrganizerService {
    boolean add(EventOrganizerDto eventOrganizerDto);

//    List<EventOrganizerDto> getAll();

    EventOrganizerDto getById(long eventOrganizerId);

    boolean update(long eventOrganizerId, EventOrganizerDto updatedEventOrganizerDto);

    boolean deleteById(long eventOrganizerId);

    boolean changeStatus(long eventOrganizerId, EventOrganizerChangeStatusDto dto);

}
