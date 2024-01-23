package com.example.events.mappers;

import com.example.events.entity.Client;
import com.example.events.models.ClientChangeStatusDto;
import com.example.events.models.ClientDto;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public Client toEntity(ClientDto from){
        var to = new Client();
        to.setClient_id(from.getClient_id());
        to.setCompanyName(from.getCompanyName());
        to.setEmail(from.getEmail());
        to.setRegistrationDate(from.getRegistrationDate());
        to.setTickets(from.getTickets());
        to.setActive(from.isActive());
        return to;
    }

    public ClientDto toDto (Client from){
        var to = new ClientDto();
        to.setClient_id(from.getClient_id());
        to.setCompanyName(from.getCompanyName());
        to.setEmail(from.getEmail());
        to.setRegistrationDate(from.getRegistrationDate());
        to.setTickets(from.getTickets());
        to.setActive(from.isActive());
        return to;
    }

    public ClientChangeStatusDto clientChangeStatusDto(Client from){
        var to = new ClientChangeStatusDto();
        to.setClient_id(from.getClient_id());
        to.setActive(from.isActive());
        return to;
    }
}
