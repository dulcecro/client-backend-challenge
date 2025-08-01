package com.project.clientbackendchallenge.mapper;

import com.project.clientbackendchallenge.DTO.ClientDTO;
import com.project.clientbackendchallenge.model.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO entityToDTO(Client client);
}
