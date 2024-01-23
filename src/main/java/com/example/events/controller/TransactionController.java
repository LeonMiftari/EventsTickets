package com.example.events.controller;

import com.example.events.models.TransactionDto;
import com.example.events.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/transactions")
@CrossOrigin(origins = "*")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<TransactionDto> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{transactionId}")
    public TransactionDto getTransactionById(@PathVariable long transactionId) {
        return transactionService.getTransactionById(transactionId);
    }

    @PostMapping
    public void addTransaction(@RequestBody TransactionDto transactionDto) {
        transactionService.saveTransaction(transactionDto);
    }

    @PutMapping("/{transactionId}")
    public void updateTransaction(@PathVariable long transactionId, @RequestBody TransactionDto updatedTransactionDto) {
        transactionService.updateTransaction(transactionId, updatedTransactionDto);
    }

    @DeleteMapping("/{transactionId}")
    public void deleteTransactionById(@PathVariable long transactionId) {
        transactionService.deleteTransaction(transactionId);
    }

    @PatchMapping("/{transactionId}/approve")
    public void approveTransaction(@PathVariable long transactionId) {
        transactionService.approveTransaction(transactionId);
    }
}
