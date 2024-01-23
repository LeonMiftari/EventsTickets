package com.example.events.service.impl;

import com.example.events.entity.Performers;
import com.example.events.mappers.PerformersMapper;
import com.example.events.models.PerformersDto;
import com.example.events.repository.PerformerRepository;
import com.example.events.service.PerformerService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// PerformerServiceImpl.java
@Service
public class PerformerServiceImpl implements PerformerService {
    private final PerformerRepository performerRepository;
    private final PerformersMapper performerMapper;

    @Autowired
    public PerformerServiceImpl(PerformerRepository performerRepository, PerformersMapper performerMapper) {
        this.performerRepository = performerRepository;
        this.performerMapper = performerMapper;
    }

    @Override
    public List<PerformersDto> getAllPerformers() {
        List<Performers> performers = performerRepository.findAll();
        return performers.stream()
                .map(performerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PerformersDto getPerformerById(long performerId) {
        Performers performer = performerRepository.findById(performerId)
                .orElseThrow(() -> new EntityNotFoundException("Performer not found with id: " + performerId));
        return performerMapper.toDto(performer);
    }

    @Override
    public void savePerformer(PerformersDto performerDto) {
        Performers performer = performerMapper.toEntity(performerDto);
        performerRepository.save(performer);
    }

    @Override
    public void updatePerformer(long performerId, PerformersDto updatedPerformerDto) {
        Performers performer = performerRepository.findById(performerId)
                .orElseThrow(() -> new EntityNotFoundException("Performer not found with id: " + performerId));

        // Update performer fields with values from updatedPerformerDto
        performer.setPerformerName(updatedPerformerDto.getPerformerName());
        performer.setVenues(updatedPerformerDto.getVenues());
        performer.setEventOrganizer(updatedPerformerDto.getEventOrganizer());
        performer.setMainPerformer(updatedPerformerDto.isMainPerformer());
        performer.setDescription(updatedPerformerDto.getDescription());
        performer.setCreatedAt(updatedPerformerDto.getCreatedAt());

        performerRepository.save(performer);
    }

    @Override
    public void deletePerformer(long performerId) {
        if (performerRepository.existsById(performerId)) {
            performerRepository.deleteById(performerId);
        } else {
            throw new EntityNotFoundException("Performer not found with id: " + performerId);
        }
    }
}
