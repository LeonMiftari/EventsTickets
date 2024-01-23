package com.example.events.service.impl;

import com.example.events.entity.Client;
import com.example.events.mappers.ClientMapper;
import com.example.events.models.ClientDto;
import com.example.events.repository.ClientRepository;
import com.example.events.service.ClientService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// ClientServiceImpl.java
@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    @Override
    public List<ClientDto> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .map(clientMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ClientDto getClientById(long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + clientId));
        return clientMapper.toDto(client);
    }

    @Override
    public void saveClient(ClientDto clientDto) {
        Client client = clientMapper.toEntity(clientDto);
        clientRepository.save(client);
    }

    @Override
    public void updateClient(long clientId, ClientDto updatedClientDto) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + clientId));

        // Update client fields with values from updatedClientDto
        client.setCompanyName(updatedClientDto.getCompanyName());
        client.setEmail(updatedClientDto.getEmail());
        client.setRegistrationDate(updatedClientDto.getRegistrationDate());
        client.setActive(updatedClientDto.isActive());
        client.setCreatedAt(updatedClientDto.getCreatedAt());
        client.setTickets(updatedClientDto.getTickets());

        clientRepository.save(client);
    }

    @Override
    public void deleteClient(long clientId) {
        if (clientRepository.existsById(clientId)) {
            clientRepository.deleteById(clientId);
        } else {
            throw new EntityNotFoundException("Client not found with id: " + clientId);
        }
    }

    @Override
    public void changeClientStatus(long clientId, boolean isActive) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + clientId));
        client.setActive(isActive);
        clientRepository.save(client);
    }
}
