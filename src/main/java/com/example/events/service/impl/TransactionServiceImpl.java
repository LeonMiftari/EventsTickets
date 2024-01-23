package com.example.events.service.impl;

import com.example.events.entity.Transaction;
import com.example.events.mappers.TransactionMapper;
import com.example.events.models.TransactionDto;
import com.example.events.repository.TransactionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl {

    private final TransactionRepository transactionRepository;

    private final TransactionMapper transactionMapper;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, TransactionMapper transactionMapper) {
        this.transactionRepository = transactionRepository;
        this.transactionMapper = transactionMapper;
    }

    public List<TransactionDto> getAllTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream()
                .map(transactionMapper::toDto)
                .collect(Collectors.toList());
    }

    public TransactionDto getTransactionById(long transactionId) {
        Transaction transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new EntityNotFoundException("Transaction not found with id: " + transactionId));
        return transactionMapper.toDto(transaction);
    }

    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = transactionMapper.toEntity(transactionDto);
        transactionRepository.save(transaction);
    }

    public void updateTransaction(long transactionId, TransactionDto updatedTransactionDto) {
        Transaction transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new EntityNotFoundException("Transaction not found with id: " + transactionId));

        // Update transaction fields with values from updatedTransactionDto
        transaction.setTransactionDateTime(updatedTransactionDto.getTransactionDateTime());
        transaction.setTransactionType(updatedTransactionDto.getTransactionType());
        transaction.setAmount(updatedTransactionDto.getAmount());
        transaction.setDescription(updatedTransactionDto.getDescription());

        transactionRepository.save(transaction);
    }

    public void deleteTransaction(long transactionId) {
        if (transactionRepository.existsById(transactionId)) {
            transactionRepository.deleteById(transactionId);
        } else {
            throw new EntityNotFoundException("Transaction not found with id: " + transactionId);
        }
    }
}
