package com.example.events.models;

import com.example.events.entity.Client;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private long transaction_id;

    private LocalDateTime transactionDateTime;
    private String transactionType;
    private double amount;
    private String description;
    private Client clients;
}
