package com.project.clientbackendchallenge.service;

import com.project.clientbackendchallenge.model.Client;
import com.project.clientbackendchallenge.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> listClients() {
        return clientRepository.findAll();
    }

    public Client listClientsByCode(String uniqueCode) {
        return clientRepository.findByUniqueCode(uniqueCode).
                orElseThrow(() -> new RuntimeException("The client with code: " + uniqueCode + " doesn't exist"));
    }
}
