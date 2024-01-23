package com.example.events.mappers;


import com.example.events.entity.Transaction;
import com.example.events.models.TransactionDto;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapper {

    public Transaction toEntity (TransactionDto from){
        var to = new Transaction();
        to.setTransaction_id(from.getTransaction_id());
        to.setAmount(from.getAmount());
        to.setClients(from.getClients());
        to.setTransactionType(from.getTransactionType());
        to.setTransactionDateTime(from.getTransactionDateTime());
        return to;
    }

    public TransactionDto toDto (Transaction from){
        var to = new TransactionDto();
        to.setTransaction_id(from.getTransaction_id());
        to.setAmount(from.getAmount());
        to.setClients(from.getClients());
        to.setTransactionType(from.getTransactionType());
        to.setTransactionDateTime(from.getTransactionDateTime());
        return to;
    }

}
