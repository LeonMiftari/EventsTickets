package com.example.events.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //@Column(name = "username", nullable = false, unique = true)
    private String username;
    private String password;
    private String email;
    private LocalDate birthdate;
    private LocalDateTime registrationDate;
    private boolean active = true;
    private LocalDateTime createdAt;
    private String createdBy;

}
