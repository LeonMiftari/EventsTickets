package com.example.events.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventChangeStatusDto {
    private long event_id;
    private boolean active;
}
