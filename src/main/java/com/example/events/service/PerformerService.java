package com.example.events.service;

import com.example.events.models.PerformersDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PerformerService {
    List<PerformersDto> getAllPerformers();

    PerformersDto getPerformerById(long performerId);

    void savePerformer(PerformersDto performerDto);

    void updatePerformer(long performerId, PerformersDto updatedPerformerDto);

    void deletePerformer(long performerId);
}
