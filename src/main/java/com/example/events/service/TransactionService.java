package com.example.events.service;

import com.example.events.models.TransactionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {

    List<TransactionDto> getAllTransactions();

    TransactionDto getTransactionById(long transaction_id);

    void saveTransaction(TransactionDto transactionDto);

    void updateTransaction(long transaction_id, TransactionDto updatedTransactionDto);

    void deleteTransaction(long transaction_id);

    void approveTransaction(long transaction_id);
}
