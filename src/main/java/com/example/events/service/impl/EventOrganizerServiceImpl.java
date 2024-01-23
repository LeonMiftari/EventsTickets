package com.example.events.service.impl;

import com.example.events.mappers.EventOrganizerMapper;
import com.example.events.models.EventOrganizerChangeStatusDto;
import com.example.events.repository.EventOrganizerRepository;
import com.example.events.models.EventOrganizerDto;
import com.example.events.service.EventOrganizerService;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public class EventOrganizerServiceImpl implements EventOrganizerService{

    private final EventOrganizerRepository repository;

    private final EventOrganizerMapper mapper;


    public EventOrganizerServiceImpl(EventOrganizerRepository repository, EventOrganizerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public boolean add(EventOrganizerDto eventOrganizerDto) {
       var entity = mapper.toEntity(eventOrganizerDto);
       repository.save(entity);
       return true;
    }
//
//    @Override
//    public List<EventOrganizerDto> getAll() {
//        return repository.findAll().stream().map(mapper::toDto).toList();
//    }

    @Override
    public EventOrganizerDto getById(long eventOrganizerId) {
        var optionalEntity = repository.findById(eventOrganizerId);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("EventOrganizer not found!");
        var entity = optionalEntity.get();
        var dto = mapper.toDto(entity);
        return dto;
    }

    @Override
    public boolean update(long eventOrganizerId, EventOrganizerDto updatedEventOrganizerDto) {
        var optionalEventOrganizer = repository.findById(eventOrganizerId);
        if (optionalEventOrganizer.isEmpty())
            throw new EntityNotFoundException("EventOrganizer not found with id " + eventOrganizerId);

        var entity = optionalEventOrganizer.get();
        entity.setOrganizerName(updatedEventOrganizerDto.getOrganizerName());
        entity.setEvents(updatedEventOrganizerDto.getEvents());
        entity.setEmail(updatedEventOrganizerDto.getEmail());
        entity.setPhoneNumber(updatedEventOrganizerDto.getPhoneNumber());
        entity.setActive(updatedEventOrganizerDto.isActive());

        repository.save(entity);
        return true;
    }

    @Override
    public boolean deleteById(long eventOrganizerId) {
        repository.deleteById(eventOrganizerId);
        return true;
    }

    @Override
    public boolean changeStatus(long eventOrganizerId, EventOrganizerChangeStatusDto dto) {
        var optionalEventOrganizer = repository.findById(eventOrganizerId);
        if (optionalEventOrganizer.isEmpty())
            throw new EntityNotFoundException("EventOrganizer not found");
        var entity = optionalEventOrganizer.get();
        entity.setActive(dto.isActive());
        repository.save(entity);
        return true;
    }

}
