package com.project.clientbackendchallenge.controller;

import com.project.clientbackendchallenge.DTO.ClientDTO;
import com.project.clientbackendchallenge.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/{uniqueCode}")
    public ClientDTO listClientByCodigo(@PathVariable String uniqueCode){
        return clientService.getClientByUniqueCode(uniqueCode);
    }
}
