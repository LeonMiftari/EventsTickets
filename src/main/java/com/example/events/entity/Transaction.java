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
<<<<<<< HEAD
    private long transaction_id;
=======
    private long id;
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695

    private LocalDateTime transactionDateTime;
    private String transactionType;
    private double amount;
    private String description;
<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clients;

}
=======
    private long userId; // Assuming a relationship with a UserEntity

    private LocalDateTime createdAt;
    private String createdBy;
}
>>>>>>> 18641aa8193cf1d53e3dbf5d0c758978fbdb2695
