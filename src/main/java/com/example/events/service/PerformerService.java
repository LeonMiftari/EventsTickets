package com.example.events.service;

import com.example.events.models.PerformersDto;

import java.util.List;

// PerformerService.java
public interface PerformerService {
    List<PerformersDto> getAllPerformers();

    PerformersDto getPerformerById(long performerId);

    void savePerformer(PerformersDto performerDto);

    void updatePerformer(long performerId, PerformersDto updatedPerformerDto);

    void deletePerformer(long performerId);
}
