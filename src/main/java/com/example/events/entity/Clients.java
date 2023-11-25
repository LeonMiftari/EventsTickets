package com.example.events.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Clients{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String clientName;
    private String email;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private String createdBy;
}
