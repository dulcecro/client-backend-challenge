package com.project.clientbackendchallenge.impl;

import com.project.clientbackendchallenge.DTO.ClientDTO;
import com.project.clientbackendchallenge.mapper.ClientMapper;
import com.project.clientbackendchallenge.repository.ClientRepository;
import com.project.clientbackendchallenge.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientRepository repository;
    private ClientMapper mapper;

    public ClientServiceImpl(ClientRepository repository, ClientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ClientDTO getClientByUniqueCode(String uniqueCodeEncript) {
        return repository.findByUniqueCode(uniqueCodeEncript)
                .map(mapper::entityToDTO)
                .orElseThrow(() -> new RuntimeException("The client with code: " + uniqueCodeEncript + " doesn't exist"));
    }
}
