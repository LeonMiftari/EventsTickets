package com.example.events.service;

import com.example.events.models.ClientDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    List<ClientDto> getAllClients();

    ClientDto getClientById(long clientId);

    void saveClient(ClientDto clientDto);

    void updateClient(long clientId, ClientDto updatedClientDto);

    void deleteClient(long clientId);

    void changeClientStatus(long clientId, boolean isActive);



}
