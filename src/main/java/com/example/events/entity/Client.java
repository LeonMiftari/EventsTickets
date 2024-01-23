package com.example.events.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long client_id;

    @Column(name = "username", nullable = false, unique = true)
    private String companyName;
    private String email;
    private LocalDateTime registrationDate;
    private boolean active = true;
    private LocalDateTime createdAt;
    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<Ticket> tickets;

}