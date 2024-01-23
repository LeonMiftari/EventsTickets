package com.example.events.controller;

import com.example.events.models.PerformersDto;
import com.example.events.service.PerformerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/performers")
@CrossOrigin(origins = "*")
public class PerformersController {

    private final PerformerService performerService;

    public PerformersController(PerformerService performerService) {
        this.performerService = performerService;
    }

    @GetMapping
    public List<PerformersDto> getAllPerformers() {
        return performerService.getAllPerformers();
    }

    @GetMapping("/{performerId}")
    public PerformersDto getPerformerById(@PathVariable long performerId) {
        return performerService.getPerformerById(performerId);
    }

    @PostMapping
    public void addPerformer(@RequestBody PerformersDto performerDto) {
        performerService.savePerformer(performerDto);
    }

    @PutMapping("/{performerId}")
    public void updatePerformer(@PathVariable long performerId, @RequestBody PerformersDto updatedPerformerDto) {
        performerService.updatePerformer(performerId, updatedPerformerDto);
    }

    @DeleteMapping("/{performerId}")
    public void deletePerformerById(@PathVariable long performerId) {
        performerService.deletePerformer(performerId);
    }
}
