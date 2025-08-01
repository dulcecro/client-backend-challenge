package com.project.clientbackendchallenge.service;

import com.project.clientbackendchallenge.DTO.ClientDTO;

public interface ClientService {
    ClientDTO getClientByUniqueCode(String uniqueCodeEncript);
}
