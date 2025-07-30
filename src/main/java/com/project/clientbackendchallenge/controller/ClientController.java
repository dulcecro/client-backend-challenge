package com.project.clientbackendchallenge.controller;

import com.project.clientbackendchallenge.model.Client;
import com.project.clientbackendchallenge.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/challenge")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/client")
    public List<Client> listClients(){
        return clientService.listClients();
    }

    @GetMapping("/client/{uniqueCode}")
    public ResponseEntity<Client> listClientByCodigo(@PathVariable String uniqueCode){
        return ResponseEntity.ok(clientService.listClientsByCode(uniqueCode));
    }
}
