package com.example.events.service.impl;

import com.example.events.mappers.EventMapper;
import com.example.events.models.EventChangeStatusDto;
import com.example.events.models.EventDto;
import com.example.events.repository.EventRepository;
import com.example.events.service.EventService;
import jakarta.persistence.EntityNotFoundException;


import java.util.List;

public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    private final EventMapper mapper;

    public EventServiceImpl(EventRepository repository, EventMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }
    @Override
    public boolean add(EventDto eventDto) {
        var entity = mapper.toEntity(eventDto);
        repository.save(entity);
        return true;
    }

    @Override
    public List<EventDto> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public EventDto getById(long event_id) {
      var optionalEntity = repository.findById(event_id);
      if (optionalEntity.isEmpty())
          throw new EntityNotFoundException("Event not found!");
      var entity = optionalEntity.get();
      var dto = mapper.toDto(entity);
      return dto;
    }

    @Override
    public boolean update(long event_id, EventDto updatedEventDto) {
        var optionalEvent = repository.findById(event_id);
        if (optionalEvent.isEmpty())
            throw new EntityNotFoundException("Event not found with id " + event_id);

        var entity = optionalEvent.get();
        entity.setEventName(updatedEventDto.getEventName());
        entity.setEventType(updatedEventDto.getEventType());
        entity.setOrganizers(updatedEventDto.getOrganizers());
        entity.setActive(updatedEventDto.isActive());


        repository.save(entity);
        return true;
    }

    @Override
    public boolean deleteById(long event_id) {
        repository.deleteById(event_id);
        return true;
    }

    @Override
    public boolean changeStatus(long event_id, EventChangeStatusDto dto) {
        var optionalEvent = repository.findById(event_id);
        if (optionalEvent.isEmpty())
            throw new EntityNotFoundException("Event not found");
        var entity = optionalEvent.get();
        entity.setActive(dto.isActive());
        repository.save(entity);
        return true;
    }
}