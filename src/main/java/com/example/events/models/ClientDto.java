package com.example.events.models;

import com.example.events.entity.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private long client_id;
    private String companyName;
    private String email;
    private LocalDate birthdate;
    private LocalDateTime registrationDate;
    private boolean active = true;
    private LocalDateTime createdAt;
    private List<Ticket> tickets;
}
