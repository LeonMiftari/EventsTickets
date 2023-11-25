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
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime transactionDateTime;
    private String transactionType;
    private double amount;
    private String description;
    private long userId; // Assuming a relationship with a UserEntity

    private LocalDateTime createdAt;
    private String createdBy;
}
