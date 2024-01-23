package com.example.events.controller;

import com.example.events.models.ClientDto;
//import com.example.events.models.ClientChangeStatusDto;
import com.example.events.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clients")
@CrossOrigin(origins = "*")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientDto> getAllClients() {
        return clientService.getAllClients();
    }

//    @GetMapping("/{client_id}")
//    public ClientDto getClientById(@PathVariable long client_id) {
//        ClientDto clientById = clientService.getClientById();
//    }



    @PutMapping("/{client_id}")
    public void updateClient(@PathVariable long client_id, @RequestBody ClientDto clientDto) {
        clientService.updateClient(client_id, clientDto);
    }



    @DeleteMapping("/{client_id}")
    public void deleteClient(@PathVariable long client_id) {
        clientService.deleteClient(client_id);
    }
}
